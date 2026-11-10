package com.cartry.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

/**
 * CARTRY 글자 스타일. 시안 49화면에서 실제로 쓰인 크기·굵기·줄 높이를 역할별로 이름 붙였다.
 * 글꼴은 Pretendard 이다. 안드로이드 앱에서는 res/font 의 Pretendard 로 FontFamily 를 만들어 CartryTheme 에 넘긴다.
 * 시안의 px 는 Pleos 17인치(160dpi, 1dp = 1px) 기준이라 sp 로 그대로 옮겼다.
 *
 * 줄바꿈: 시안 CSS 는 제목에 `text-wrap: balance` + `word-break: keep-all`(어절 중간에서 끊지 않음), 본문에 keep-all 을 쓴다.
 * 그래서 제목은 LineBreak.Heading(줄 길이를 고르게 + 어절 단위), 본문은 LineBreak.Paragraph 를 쓴다.
 * 안드로이드에서 본문도 어절 단위로 끊으려면 LineBreak(Strategy.HighQuality, Strictness.Strict, WordBreak.Phrase) 로 바꾼다
 * (이 세 값은 안드로이드 전용 API 라 공용 코드에는 두지 않았다). 실제 차 화면에서 한 번 확인해야 한다.
 */
@Immutable
data class CartryTypography(
    /** 큰 숫자(완료 수, 등급) 120/800 */
    val display: TextStyle,
    /** 카트리 말풍선 제목, 넓은 말풍선 60/700/74 */
    val talkTitle: TextStyle,
    /** 카트리 말풍선 제목, 왼쪽 좁은 열 56/700/68 */
    val talkTitleCompact: TextStyle,
    /** 모달 제목 48/700/60 */
    val dialogTitle: TextStyle,
    /** 튜토리얼 타일 이름 46/700/56 */
    val tileTitle: TextStyle,
    /** 카드 제목(홈 카드, 카테고리 타일) 44/700/54 */
    val cardTitle: TextStyle,
    /** 목록 행 제목 42/600 */
    val rowTitle: TextStyle,
    /** 상태 막대 이름 40/700 */
    val barTitle: TextStyle,
    /** 진행 표시 단계 이름 40/600 */
    val progressTitle: TextStyle,
    /** 진행 표시 「1/4」 40/800 */
    val progressCounter: TextStyle,
    /** 설정 카드 제목, 모달 소제목 36/700/46 */
    val sectionTitle: TextStyle,
    /** 말풍선 설명 36/400/48 */
    val lead: TextStyle,
    /** 본문 34/400/48 (모달 설명, 상태 막대 상태) */
    val body: TextStyle,
    /** 버튼 32/600 */
    val button: TextStyle,
    /** 앱 이름 「CARTRY」 32/700 */
    val appName: TextStyle,
    /** 타일 설명 32/400/44 */
    val tileBody: TextStyle,
    /** 목록 행 설명 30/400 */
    val rowBody: TextStyle,
    /** 파란 꼬리표 30/700 */
    val tag: TextStyle,
    /** 작은 본문 28/400 (헤더 화면 이름, 카드 설명) */
    val bodySmall: TextStyle,
    /** 작은 라벨 28/700 (배지, 좁은 말풍선의 「카트리」) */
    val label: TextStyle,
    /** 캡션 24/700 (넓은 말풍선의 「카트리」) */
    val caption: TextStyle,
    /** 완료 알약 22/600 — 시안 값 그대로. 글자 24 이상 규칙에 못 미친다(README 참고) */
    val pill: TextStyle,
) {
    companion object {
        fun create(fontFamily: FontFamily = FontFamily.Default): CartryTypography {
            fun s(size: Int, weight: Int, lineHeight: Int? = null, letterSpacing: TextUnit = TextUnit.Unspecified, heading: Boolean = false) = TextStyle(
                fontFamily = fontFamily,
                fontSize = size.sp,
                fontWeight = FontWeight(weight),
                lineHeight = lineHeight?.sp ?: TextUnit.Unspecified,
                letterSpacing = letterSpacing,
                lineBreak = if (heading) LineBreak.Heading else LineBreak.Paragraph,
                // CSS 처럼 줄 높이의 남는 공간을 글자 위아래에 반씩 두고, 첫 줄 위·마지막 줄 아래도 잘라 내지 않는다
                lineHeightStyle = LineHeightStyle(LineHeightStyle.Alignment.Center, LineHeightStyle.Trim.None),
            )
            return CartryTypography(
                display = s(120, 800, 120, (-0.05).em, heading = true),
                talkTitle = s(60, 700, 74, (-0.015).em, heading = true),
                talkTitleCompact = s(56, 700, 68, (-0.015).em, heading = true),
                dialogTitle = s(48, 700, 60, heading = true),
                tileTitle = s(46, 700, 56, heading = true),
                cardTitle = s(44, 700, 54, heading = true),
                rowTitle = s(42, 600),
                barTitle = s(40, 700),
                progressTitle = s(40, 600),
                progressCounter = s(40, 800),
                sectionTitle = s(36, 700, 46, heading = true),
                lead = s(36, 400, 48),
                body = s(34, 400, 48),
                button = s(32, 600),
                appName = s(32, 700, letterSpacing = 0.01.em),
                tileBody = s(32, 400, 44),
                rowBody = s(30, 400),
                tag = s(30, 700, letterSpacing = 0.02.em),
                bodySmall = s(28, 400),
                label = s(28, 700, letterSpacing = 0.02.em),
                caption = s(24, 700, letterSpacing = 0.02.em),
                pill = s(22, 600),
            )
        }
    }
}
