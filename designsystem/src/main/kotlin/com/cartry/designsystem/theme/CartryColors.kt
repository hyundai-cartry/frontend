package com.cartry.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor

/**
 * CARTRY 다크 테마 색. 값은 UI 시안(6.93 가로 1700 판, 다크)을 브라우저로 렌더링해 실제 적용된 값을 잰 것이다.
 * 괄호 안은 시안 CSS 변수 이름이다.
 *
 * 색의 뜻은 고정이다: goal(파랑) = 힌트·목표·지금 할 일, success(초록) = 달성, danger(빨강) = 오작동.
 */
@Immutable
data class CartryColors(
    /** 앱 전체 바탕 (.app) */
    val background: Color = Color(0xFF1A1B1E),
    /** 가장 깊은 바탕, 로딩 화면 (--b00) */
    val backgroundDeep: Color = Color(0xFF131417),
    /** 카드·말풍선·보조 버튼·원형 버튼 바탕 (--b100) */
    val surface: Color = Color(0xFF313236),
    /** 고른 카드, 펼친 힌트 줄 바탕 (--b200) */
    val surfaceSelected: Color = Color(0xFF44464E),
    /** 진행 막대의 남은 칸, 번호 동그라미 (--b300) */
    val surfaceTrack: Color = Color(0xFF686A72),
    /** 모달 바탕 그라데이션 위·아래 */
    val modalTop: Color = Color(0xFF34353A),
    val modalBottom: Color = Color(0xFF26272B),
    /** 모달 뒤 화면을 어둡게 덮는 막 */
    val scrim: Color = Color(0x8C000000),

    /** 글자: 제목·본문 (--t1) */
    val textPrimary: Color = Color(0xFFFFFFFF),
    /** 글자: 설명 문장 (--t2, 흰색 84%) */
    val textSecondary: Color = Color(0xD6FFFFFF),
    /** 글자: 보조 설명·라벨 (--t3, 흰색 64%) */
    val textTertiary: Color = Color(0xA3FFFFFF),
    /** 글자·점: 비활성 (--t4, 흰색 32%). 글자에 쓰면 대비가 4.5:1 에 못 미친다 */
    val textDisabled: Color = Color(0x52FFFFFF),
    /** 밝은 바탕 위 글자 (--tinv) */
    val textInverse: Color = Color(0xFF131417),
    /** 앱 이름 옆 세로 구분선 */
    val divider: Color = Color(0x52FFFFFF),

    /** 파랑: 힌트·목표·지금 할 일 (--pos) */
    val goal: Color = Color(0xFF0082FF),
    /** 파랑 연한 바탕: 목표 상태 막대 (rgba(0,130,255,.16)) */
    val goalSoft: Color = Color(0x290082FF),
    /** 파랑 연한 바탕 위의 아이콘 */
    val goalBright: Color = Color(0xFF3DA2FF),
    /** 파랑 글자 라벨(코스 이름 같은 꼬리표) */
    val goalLabel: Color = Color(0xFF8CC8FF),
    /**
     * 주 버튼 바탕, 목표 상태 막대의 왼쪽 줄. 시안 6.93 부터 주 버튼은 그라데이션 없이 이 색 한 가지다.
     * goal(#0082FF)보다 조금 밝다. 시안 CSS 에 변수 없이 직접 적혀 있는 값이다.
     */
    val action: Color = Color(0xFF0A84FF),
    /** 예전 주 버튼 그라데이션 위·아래(6.40). 지금은 primaryFill 이 action 한 색이라 쓰지 않는다 */
    val primaryTop: Color = Color(0xFF1A90FF),
    val primaryBottom: Color = Color(0xFF0078F0),
    /** 말풍선 설명 글자 (rgba(247,250,255,.8)) */
    val lead: Color = Color(0xCCF7FAFF),

    /** 초록: 달성 (--act) */
    val success: Color = Color(0xFF00E074),
    /** 초록 연한 바탕 (--act-soft) */
    val successSoft: Color = Color(0x2900E074),
    /** 초록 바탕 위 글자 (--act-ink) */
    val onSuccess: Color = Color(0xFF06301A),

    /** 빨강: 오작동 (--neg) */
    val danger: Color = Color(0xFFFF4C28),
    /** 빨강 연한 바탕 (--neg-soft) */
    val dangerSoft: Color = Color(0x29FF4C28),

    /** 카트리 마스코트 평상시 빛줄 */
    val buddyBar: Color = Color(0xFF3D9BFF),
) {
    /** 카드 위에 덮는 위→아래 광택(위 흰색 7.5% → 45% 지점 투명 → 아래 검정 12%). 바탕색 위에 한 겹 더 그린다. */
    val cardSheen: Brush
        get() = Brush.verticalGradient(0f to Color(0x13FFFFFF), 0.45f to Color(0x00FFFFFF), 1f to Color(0x1F000000))

    /** 주 버튼 바탕(action 한 색) */
    val primaryFill: Brush
        get() = SolidColor(action)

    /** 모달 바탕 */
    val modalFill: Brush
        get() = Brush.verticalGradient(listOf(modalTop, modalBottom))
}
