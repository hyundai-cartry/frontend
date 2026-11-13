package com.cartry.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * 간격. 시안에서 실제로 쓰인 값만 둔다(49화면 전수 집계). 이름의 숫자가 곧 dp 값이다.
 * 화면 단위 값(screenHorizontal 등)은 이름으로 쓴다.
 */
@Immutable
data class CartrySpacing(
    val s6: Dp = 6.dp,
    val s8: Dp = 8.dp,
    val s10: Dp = 10.dp,
    val s12: Dp = 12.dp,
    val s14: Dp = 14.dp,
    val s16: Dp = 16.dp,
    val s20: Dp = 20.dp,
    val s24: Dp = 24.dp,
    val s28: Dp = 28.dp,
    val s32: Dp = 32.dp,
    val s36: Dp = 36.dp,
    val s40: Dp = 40.dp,
    val s44: Dp = 44.dp,
    val s48: Dp = 48.dp,
    val s56: Dp = 56.dp,
    /** 앱 창(가로 1700) 좌우 여백. 2560 전체 화면 시절에는 96 이었다 */
    val screenHorizontal: Dp = 56.dp,
    /** 앱 헤더 높이 */
    val headerHeight: Dp = 112.dp,
    /** 홈 헤더 검색창 너비 */
    val headerSearchWidth: Dp = 540.dp,
    /** 누르는 영역 최소 크기 */
    val minTouch: Dp = 76.dp,
)
