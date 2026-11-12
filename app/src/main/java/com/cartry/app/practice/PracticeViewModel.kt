package com.cartry.app.practice

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.cartry.app.lesson.Lesson
import com.cartry.app.lesson.Lessons
import com.cartry.app.vehicle.CarState
import com.cartry.app.vehicle.PleosCarStateSource
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

/** 실습이 지금 어느 단계인지. 화면 모습은 이 값 하나로 정해진다. */
sealed interface PracticeStep {
    /** 1. 미션 제시 */
    data object Mission : PracticeStep

    /** 2. 헷갈리는 기능을 켬(빨강) */
    data object Wrong : PracticeStep

    /** 3. 힌트 펼침. level = 지금까지 연 힌트 수(1~3) */
    data class Hint(val level: Int) : PracticeStep

    /** 4. 정답 기능을 켬(초록) */
    data object Success : PracticeStep
}

data class PracticeUiState(
    val lesson: Lesson,
    val step: PracticeStep = PracticeStep.Mission,
    /** 차가 알려준 정답 기능 상태. null = 아직 모름 */
    val targetOn: Boolean? = null,
    /** 차가 알려준 헷갈리는 기능 상태. null = 아직 모름 */
    val decoyOn: Boolean? = null,
    /** 위쪽 알림 띠 문구. null 이면 숨김 */
    val carToast: String? = null,
)

/**
 * 실습 단계 전환을 모두 여기서 한다. 화면은 [uiState] 를 그리기만 한다.
 *
 * 입력은 화면 터치가 아니라 차(개발 중에는 Virtual Console)에서 들어온다.
 * 「꺼짐 → 켜짐」으로 바뀌는 순간만 사용자가 누른 것으로 본다. 실습에 들어올 때 이미 켜져 있던 것은 세지 않는다.
 */
class PracticeViewModel(application: Application, savedState: SavedStateHandle) : AndroidViewModel(application) {

    private val lesson = Lessons.byId(checkNotNull(savedState.get<String>(ARG_LESSON_ID)))

    private val _uiState = MutableStateFlow(PracticeUiState(lesson))
    val uiState: StateFlow<PracticeUiState> = _uiState.asStateFlow()

    private val car = PleosCarStateSource(application, setOf(lesson.target.control, lesson.decoy.control), viewModelScope)

    /** 지금까지 연 힌트 수. 힌트를 닫았다 다시 열면 이어서 보여준다. */
    private var hintsOpened = 0
    private var successJob: Job? = null

    init {
        viewModelScope.launch {
            var previous: CarState = emptyMap()
            car.state.collect { now ->
                val target = lesson.target.control
                val decoy = lesson.decoy.control
                _uiState.update { it.copy(targetOn = now[target], decoyOn = now[decoy]) }
                if (previous[target] == false && now[target] == true) onTargetTurnedOn()
                if (previous[decoy] == false && now[decoy] == true) onDecoyTurnedOn()
                previous = now
            }
        }
    }

    private fun onTargetTurnedOn() {
        if (_uiState.value.step == PracticeStep.Success || successJob?.isActive == true) return
        // 영상처럼: 알림 띠를 먼저 보여주고, 읽을 틈을 둔 뒤 완료 화면으로 넘어간다.
        _uiState.update { it.copy(carToast = lesson.carToast) }
        successJob = viewModelScope.launch {
            delay(TOAST_TO_SUCCESS_MS)
            _uiState.update { it.copy(step = PracticeStep.Success) }
        }
    }

    private fun onDecoyTurnedOn() {
        if (_uiState.value.step == PracticeStep.Success || successJob?.isActive == true) return
        _uiState.update { it.copy(step = PracticeStep.Wrong) }
    }

    fun showHint() {
        hintsOpened = maxOf(hintsOpened, 1)
        _uiState.update { it.copy(step = PracticeStep.Hint(hintsOpened)) }
    }

    fun nextHint() {
        hintsOpened = (hintsOpened + 1).coerceAtMost(lesson.hints.size)
        _uiState.update { it.copy(step = PracticeStep.Hint(hintsOpened)) }
    }

    /** 힌트를 닫고 실습으로 돌아간다. 헷갈리는 기능이 아직 켜져 있으면 오작동 화면으로. */
    fun continuePractice() {
        _uiState.update { it.copy(step = if (it.decoyOn == true) PracticeStep.Wrong else PracticeStep.Mission) }
    }

    /** 다시 해 보기. 정답 기능은 차에서 껐다가 다시 켜야 완료된다. */
    fun retry() {
        successJob?.cancel()
        hintsOpened = 0
        _uiState.update { it.copy(step = PracticeStep.Mission, carToast = null) }
    }

    override fun onCleared() {
        car.close()
    }

    companion object {
        const val ARG_LESSON_ID = "lessonId"
        /** 알림 띠가 뜨고 완료 화면으로 바뀌기까지(시연 영상 기준 약 0.7~0.9초) */
        private const val TOAST_TO_SUCCESS_MS = 800L
    }
}
