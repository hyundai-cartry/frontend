package com.cartry.app.vehicle

/**
 * 실습에서 지켜보는 차 기능. 값은 모두 「켜짐(true) / 꺼짐(false)」 하나로 줄여서 다룬다.
 * Virtual Console 에서 바꿀 수 있는 항목과 1:1 로 맞춘다.
 */
enum class CarControl {
    /** 앞유리 김서림 제거 (HVAC 디프로스터, FRONT_WINDSHIELD) */
    FrontDefrost,

    /** 뒷유리 열선 (HVAC 디프로스터, REAR_WINDSHIELD) */
    RearDefrost,

    /** 앞 와이퍼 레버가 AUTO 인가 (WiperSwitch == AUTO) */
    WiperAuto,

    /** 방향지시등이 켜졌는가 (LEFT 또는 RIGHT) */
    TurnSignal,

    /** 뒷좌석 창문 잠금 (ROW_2_LEFT·ROW_2_RIGHT 둘 다 잠김, 또는 4개 전체 영역 잠김) */
    RearWindowLock,

    /** 뒷좌석 창문 중 하나라도 열렸는가 (위치 값이 최솟값보다 큼) */
    RearWindowOpen,
}

/**
 * 차 상태 한 장. 아직 차가 값을 알려주지 않은 기능은 맵에 없다(= 모름).
 * 「모름 → 켜짐」은 처음 값을 받은 것일 뿐이라 사용자가 눌렀다고 보지 않는다.
 */
typealias CarState = Map<CarControl, Boolean>
