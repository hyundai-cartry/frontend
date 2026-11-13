package com.cartry.designsystem.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.font.FontFamily

private val LocalColors = staticCompositionLocalOf { CartryColors() }
private val LocalTypography = staticCompositionLocalOf { CartryTypography.create() }
private val LocalShapes = staticCompositionLocalOf { CartryShapes() }
private val LocalSpacing = staticCompositionLocalOf { CartrySpacing() }
private val LocalElevations = staticCompositionLocalOf { CartryElevations() }

/**
 * CARTRY 디자인 토큰을 화면에 내려준다. 앱의 가장 바깥 화면을 이걸로 감싼다.
 *
 * ```
 * val pretendard = FontFamily(Font(R.font.pretendard_regular, FontWeight.Normal), …)
 * val barlow = FontFamily(Font(R.font.barlow_semi_condensed_bold, FontWeight.Bold), …)
 * CartryTheme(fontFamily = pretendard, numberFontFamily = barlow) { 화면() }
 * ```
 * numberFontFamily 는 앱 이름 「CARTRY」, 진행 표시 「1/4」, 큰 숫자에 쓰는 좁은 글꼴(시안의 Barlow Semi Condensed)이다.
 * 넘기지 않으면 fontFamily 로 그린다.
 * 화면 코드에서는 `CartryTheme.colors.goal`, `CartryTheme.type.button` 처럼 꺼내 쓴다.
 */
@Composable
fun CartryTheme(fontFamily: FontFamily = FontFamily.Default, numberFontFamily: FontFamily = fontFamily, content: @Composable () -> Unit) {
    val type = remember(fontFamily, numberFontFamily) { CartryTypography.create(fontFamily, numberFontFamily) }
    CompositionLocalProvider(LocalTypography provides type, content = content)
}

object CartryTheme {
    val colors: CartryColors @Composable @ReadOnlyComposable get() = LocalColors.current
    val type: CartryTypography @Composable @ReadOnlyComposable get() = LocalTypography.current
    val shapes: CartryShapes @Composable @ReadOnlyComposable get() = LocalShapes.current
    val space: CartrySpacing @Composable @ReadOnlyComposable get() = LocalSpacing.current
    val elevation: CartryElevations @Composable @ReadOnlyComposable get() = LocalElevations.current
}
