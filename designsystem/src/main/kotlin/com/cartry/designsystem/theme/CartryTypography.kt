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
 * CARTRY 글자 스타일. 역할마다 크기 하나를 정해 이름 붙였다.
 * 글꼴은 Pretendard 이다. 안드로이드 앱에서는 res/font 의 Pretendard 로 FontFamily 를 만들어 CartryTheme 에 넘긴다.
 * 시안의 px 는 Pleos 17인치(160dpi, 1dp = 1px) 기준이라 sp 로 그대로 옮겼다.
 *
 * 기준은 가로 1700 판(Figma 360:2, 앱 창 1700×1184)에서 화면에 보이는 크기다.
 * 1700 판은 왼쪽 글 칸을 화면 종류마다 다른 비율로 줄여 그렸다(실습 화면 80%, 힌트 화면 92%, 단계 상승 화면 90%).
 * 같은 부품이 화면마다 크기가 달라지지 않도록, 실습 화면에서 보이는 크기를 반올림한 값 하나로 정했다(2026-11-13 결정).
 * 글자는 24 보다 작게 두지 않는다(pill 은 시안 6.93 에 없어진 부품이라 예전 값 그대로).
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
    /** 화면 제목(카트리가 하는 말), 넓은 말 52/800/64 — 화면 제목은 어느 화면이든 52 */
    val talkTitle: TextStyle,
    /** 화면 제목, 왼쪽 글 칸(실습 화면). talkTitle 과 같은 52/800/64 */
    val talkTitleCompact: TextStyle,
    /** 모달 제목 48/700/60 */
    val dialogTitle: TextStyle,
    /** 튜토리얼 타일 이름 46/700/56 */
    val tileTitle: TextStyle,
    /** 카드 제목(홈 카드, 코스 카드) 46/700/56 */
    val cardTitle: TextStyle,
    /** 목록 행 제목 42/600 (시안 6.93 에 목록 행이 없어 예전 값) */
    val rowTitle: TextStyle,
    /** 상태 막대 이름 34/700 */
    val barTitle: TextStyle,
    /** 상태 막대 상태 글자 「진행 중」 29/400 */
    val barStatus: TextStyle,
    /** 진행 표시 단계 이름 32/600 */
    val progressTitle: TextStyle,
    /** 진행 표시 「1/4」 32/800 */
    val progressCounter: TextStyle,
    /** 설정 카드 제목, 모달 소제목 36/700/46 */
    val sectionTitle: TextStyle,
    /** 화면 제목 아래 설명 27/500/40 */
    val lead: TextStyle,
    /** 본문 34/400/48 (모달 설명) */
    val body: TextStyle,
    /** 버튼 30/600 */
    val button: TextStyle,
    /** 앱 이름 「CARTRY」 34/700, 자간 0.08em */
    val appName: TextStyle,
    /** 타일 설명 32/400/44 */
    val tileBody: TextStyle,
    /** 목록 행 설명 30/400 */
    val rowBody: TextStyle,
    /** 파란 꼬리표 30/700 */
    val tag: TextStyle,
    /** 작은 본문 28/400 (헤더 화면 이름, 카드 설명) */
    val bodySmall: TextStyle,
    /** 작은 라벨 28/700 (배지) */
    val label: TextStyle,
    /** 말하는 이 이름 「카트리」 26/800/40, 자간 0.08em */
    val caption: TextStyle,
    /** 완료 알약 22/600 — 시안 값 그대로. 글자 24 이상 규칙에 못 미친다(README 참고) */
    val pill: TextStyle,
    /** 사진 카드 맨 위 꼬리표 「오늘의 추천 · 기본 기능」 26/600 */
    val eyebrow: TextStyle,
    /** 사진 카드 제목 아래 한 줄 설명 「약 1분 · …」 26/400 */
    val meta: TextStyle,
    /** 사진 위 알약 글자(날씨 칩 「지금」), 「기억해요」 라벨 24/700 */
    val chip: TextStyle,
    /** 접힌 힌트 줄의 한 줄 설명 「빗물 양에 맞춰 속도를 알아서 바꿔요」 22/400 (시안 23). 제목(24/700)보다 한 단계 작게. 글자 24 이상 규칙에 못 미친다 */
    val hintNote: TextStyle,
    /** 비교 카드 꼬리표 「목표」·「비슷한 기능」 18/800 (시안 20). 글자 24 이상 규칙에 못 미친다(pill 과 같이 확인 필요) */
    val compareTag: TextStyle,
    /** 비교 카드 제목 「오른쪽 레버는 와이퍼」 24/800 (시안 26) */
    val compareTitle: TextStyle,
    /** 비교 카드 설명 「한 칸 내리면 AUTO」 20/400 (시안 22). 글자 24 이상 규칙에 못 미친다 */
    val compareBody: TextStyle,
) {
    companion object {
        /** @param numberFontFamily 앱 이름, 「1/4」, 큰 숫자용 좁은 글꼴(시안의 Barlow Semi Condensed). 없으면 fontFamily */
        fun create(fontFamily: FontFamily = FontFamily.Default, numberFontFamily: FontFamily = fontFamily): CartryTypography {
            fun s(size: Int, weight: Int, lineHeight: Int? = null, letterSpacing: TextUnit = TextUnit.Unspecified, heading: Boolean = false, number: Boolean = false) = TextStyle(
                fontFamily = if (number) numberFontFamily else fontFamily,
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
                talkTitle = s(52, 800, 64, (-0.025).em, heading = true),
                talkTitleCompact = s(52, 800, 64, (-0.025).em, heading = true),
                dialogTitle = s(48, 700, 60, heading = true),
                tileTitle = s(46, 700, 56, heading = true),
                cardTitle = s(46, 700, 56, heading = true),
                rowTitle = s(42, 600),
                barTitle = s(34, 700),
                barStatus = s(29, 400),
                progressTitle = s(32, 600),
                progressCounter = s(32, 800, number = true),
                sectionTitle = s(36, 700, 46, heading = true),
                lead = s(27, 500, 40),
                body = s(34, 400, 48),
                button = s(30, 600),
                appName = s(34, 700, letterSpacing = 0.08.em, number = true),
                tileBody = s(32, 400, 44),
                rowBody = s(30, 400),
                tag = s(30, 700, letterSpacing = 0.02.em),
                bodySmall = s(28, 400),
                label = s(28, 700, letterSpacing = 0.02.em),
                caption = s(26, 800, 40, letterSpacing = 0.08.em),
                pill = s(22, 600),
                eyebrow = s(26, 600),
                meta = s(26, 400),
                chip = s(24, 700),
                hintNote = s(22, 400, 30),
                // 시안은 20 · 26 · 22 지만, 지금 앱은 Pretendard 대신 기본 글꼴로 그려져 글자가 넓어서 카드 모양을 맞추려고 한 단계씩 줄였다
                compareTag = s(18, 800, 28),
                compareTitle = s(24, 800, 32),
                compareBody = s(20, 400, 28),
            )
        }
    }
}
