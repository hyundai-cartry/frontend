package com.cartry.app.vehicle

import ai.pleos.playground.vehicle.Vehicle
import ai.pleos.playground.vehicle.api.model.area.WindowArea
import ai.pleos.playground.vehicle.api.model.capability.AreaBounds
import ai.pleos.playground.vehicle.api.model.capability.CapabilityConfig
import ai.pleos.playground.vehicle.constant.area.TurnSignalValue
import ai.pleos.playground.vehicle.constant.area.WindowValue
import ai.pleos.playground.vehicle.constant.control.WiperState
import ai.pleos.playground.vehicle.constant.control.WiperSwitch
import ai.pleos.playground.vehicle.listener.HvacDefrosterStateListener
import ai.pleos.playground.vehicle.listener.TurnSignalStateListener
import ai.pleos.playground.vehicle.listener.WindowLockStateListener
import ai.pleos.playground.vehicle.listener.WindowPositionListener
import ai.pleos.playground.vehicle.listener.WiperStateListener
import android.content.Context
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

/**
 * Pleos Vehicle SDK 로 차 상태를 받아 [state] 로 내보낸다.
 * 개발 중에는 Pleos Connect Virtual Console 에서 값을 바꾸면 여기로 들어온다.
 *
 * SDK 사용법은 SDK 테스트 앱(hyundai_cartry)의 Defrost·Wiper·TurnSignal·WindowLock 화면과 같다.
 * 리스너(listener, 값이 바뀔 때마다 SDK 가 불러 주는 함수)는 SDK 쪽 스레드에서 불리지만
 * MutableStateFlow.update 는 여러 스레드에서 불러도 안전해서 runOnUiThread 가 필요 없다.
 *
 * 화면을 떠날 때 [close] 로 리스너를 꼭 풀어야 한다(PracticeViewModel.onCleared 에서 부른다).
 */
class PleosCarStateSource(
    context: Context,
    private val controls: Set<CarControl>,
    /** 와이퍼 레버 위치를 주기적으로 읽을 때 쓴다. 화면이 닫히면 같이 멈춘다 */
    private val scope: CoroutineScope,
) {

    private val _state = MutableStateFlow<CarState>(emptyMap())
    val state: StateFlow<CarState> = _state.asStateFlow()

    private val vehicle = Vehicle(context.applicationContext).also { it.initialize() }

    /** close() 에서 실행할 리스너 해제 작업 모음 */
    private val cleanups = mutableListOf<() -> Unit>()

    init {
        if (CarControl.FrontDefrost in controls || CarControl.RearDefrost in controls) watchDefrost()
        if (CarControl.WiperAuto in controls) watchWiper()
        if (CarControl.TurnSignal in controls) watchTurnSignal()
        if (CarControl.RearWindowLock in controls) watchRearLock()
        if (CarControl.RearWindowOpen in controls) watchRearPosition()
    }

    fun close() {
        cleanups.forEach { runCatching(it) }
        cleanups.clear()
    }

    private fun set(control: CarControl, value: Boolean?) {
        if (_state.value[control] != value) Log.d(TAG, "$control → $value")   // 와이퍼는 0.5초마다 읽으므로 바뀔 때만 남긴다
        _state.update { if (value == null) it - control else it + (control to value) }
    }

    // ───── 김서림·열선 ─────
    private fun watchDefrost() {
        val hvac = vehicle.getHVAC()
        hvac.checkHvacDefrosterCapabilities(
            onComplete = { _: CapabilityConfig, areas: List<WindowArea> ->
                areas.forEach { area ->
                    val control = when {
                        WindowValue.FRONT_WINDSHIELD in area.values -> CarControl.FrontDefrost
                        WindowValue.REAR_WINDSHIELD in area.values -> CarControl.RearDefrost
                        else -> return@forEach
                    }
                    if (control !in controls) return@forEach
                    hvac.getHvacDefrosterState(area, onComplete = { set(control, it) }, onFailed = { logFail(control, it) })
                    val listener = object : HvacDefrosterStateListener {
                        override fun onHvacDefrosterStateUpdated(state: Boolean?) = set(control, state)
                        override fun onFailed(e: Exception) = logFail(control, e)
                    }
                    hvac.registerHvacDefrosterState(area, listener)
                    cleanups += { hvac.unregisterHvacDefrosterState(area, listener) }
                }
            },
            onFailed = { logFail(CarControl.FrontDefrost, it) },
        )
    }

    // ───── 와이퍼 ─────
    // AUTO 는 와이퍼 「상태(WiperState: OFF·ON…)」가 아니라 「레버 위치(WiperSwitch)」 값이다.
    // SDK 에 레버 위치 리스너가 없어서, 상태 리스너가 불릴 때 레버 위치를 다시 읽고
    // 상태가 안 바뀌는 경우(비가 안 와서 AUTO 인데 멈춰 있음)를 위해 짧은 간격으로도 읽는다.
    private fun watchWiper() {
        val wiper = vehicle.getWiper()
        val front = WindowArea(WindowValue.FRONT_WINDSHIELD)
        fun readSwitch() = wiper.getCurrentWiperSwitch(
            front,
            onComplete = { sw -> set(CarControl.WiperAuto, sw?.let { it == WiperSwitch.AUTO }) },
            onFailed = { logFail(CarControl.WiperAuto, it) },
        )
        readSwitch()
        val listener = object : WiperStateListener {
            override fun onWiperStateUpdated(state: WiperState?) = readSwitch()
            override fun onFailed(e: Exception) = logFail(CarControl.WiperAuto, e)
        }
        wiper.registerWiperState(front, listener)
        val poll = scope.launch {
            while (isActive) {
                delay(WIPER_POLL_MS)
                readSwitch()
            }
        }
        cleanups += { poll.cancel(); wiper.unregisterWiperState(front, listener) }
    }

    // ───── 방향지시등 ─────
    private fun watchTurnSignal() {
        val turnSignal = vehicle.getTurnSignal()
        fun isOn(v: TurnSignalValue?): Boolean? = v?.let { it != TurnSignalValue.OFF }
        turnSignal.checkTurnSignalStateCapabilities(
            onComplete = { _: CapabilityConfig ->
                turnSignal.getCurrentTurnSignalState(onComplete = { set(CarControl.TurnSignal, isOn(it)) }, onFailed = { logFail(CarControl.TurnSignal, it) })
                val listener = object : TurnSignalStateListener {
                    override fun onTurnSignalStateUpdated(state: TurnSignalValue?) = set(CarControl.TurnSignal, isOn(state))
                    override fun onFailed(e: Exception) = logFail(CarControl.TurnSignal, e)
                }
                turnSignal.registerTurnSignalState(listener)
                cleanups += { turnSignal.unregisterTurnSignalState(listener) }
            },
            onFailed = { logFail(CarControl.TurnSignal, it) },
        )
    }

    // ───── 뒷좌석 창문 잠금 ─────
    // 차는 영역(4개 전체 / 뒷좌석 왼쪽 / 뒷좌석 오른쪽)마다 따로 알려준다. 테스트 앱과 같은 규칙으로 하나로 합친다.
    private val lockValues = mutableMapOf<String, Boolean>()

    private fun watchRearLock() {
        val window = vehicle.getWindow()
        window.checkWindowLockCapabilities(
            onComplete = { _: CapabilityConfig, areas: List<WindowArea> ->
                val rearAreas = areas.filter { a -> a.values.any { it in REAR_WINDOWS } }
                fun update(area: WindowArea, value: Boolean?) {
                    val merged = synchronized(lockValues) {
                        if (value == null) lockValues.remove(area.key) else lockValues[area.key] = value
                        if (lockValues.isEmpty()) null
                        else rearAreas.filter { it.values.size > 1 }.any { lockValues[it.key] == true } ||
                            (lockValues[WindowValue.ROW_2_LEFT.name] == true && lockValues[WindowValue.ROW_2_RIGHT.name] == true)
                    }
                    set(CarControl.RearWindowLock, merged)
                }
                rearAreas.forEach { area ->
                    window.getCurrentWindowLockState(area, onComplete = { update(area, it) }, onFailed = { logFail(CarControl.RearWindowLock, it) })
                    val listener = object : WindowLockStateListener {
                        override fun onWindowLockStateUpdated(state: Boolean?) = update(area, state)
                        override fun onFailed(e: Exception) = logFail(CarControl.RearWindowLock, e)
                    }
                    window.registerWindowLockState(area, listener)
                    cleanups += { window.unregisterWindowLockState(area, listener) }
                }
            },
            onFailed = { logFail(CarControl.RearWindowLock, it) },
        )
    }

    // ───── 뒷좌석 창문 열림 ─────
    private val positionOpen = mutableMapOf<String, Boolean>()

    private fun watchRearPosition() {
        val window = vehicle.getWindow()
        window.checkWindowPositionCapabilities(
            onComplete = { _: CapabilityConfig, bounds: Map<WindowArea, AreaBounds<Int>> ->
                val rear = bounds.filterKeys { a -> a.values.any { it in REAR_WINDOWS } }
                fun update(area: WindowArea, raw: Int?) {
                    val anyOpen = synchronized(positionOpen) {
                        if (raw == null) positionOpen.remove(area.key) else positionOpen[area.key] = raw > rear.getValue(area).minValue
                        if (positionOpen.isEmpty()) null else positionOpen.values.any { it }
                    }
                    set(CarControl.RearWindowOpen, anyOpen)
                }
                rear.keys.forEach { area ->
                    window.getCurrentWindowPosition(area, onComplete = { update(area, it) }, onFailed = { logFail(CarControl.RearWindowOpen, it) })
                    val listener = object : WindowPositionListener {
                        override fun onWindowPositionUpdated(position: Int?) = update(area, position)
                        override fun onFailed(e: Exception) = logFail(CarControl.RearWindowOpen, e)
                    }
                    window.registerWindowPosition(area, listener)
                    cleanups += { window.unregisterWindowPosition(area, listener) }
                }
            },
            onFailed = { logFail(CarControl.RearWindowOpen, it) },
        )
    }

    private fun logFail(control: CarControl, e: Exception) {
        Log.e(TAG, "$control 조회·감시 실패", e)
    }

    private val WindowArea.key get() = values.joinToString("+") { it.name }

    private companion object {
        const val TAG = "CarState"
        const val WIPER_POLL_MS = 500L
        val REAR_WINDOWS = setOf(WindowValue.ROW_2_LEFT, WindowValue.ROW_2_RIGHT)
    }
}
