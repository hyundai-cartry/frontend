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
 * CartryTheme(fontFamily = pretendard) { 화면() }
 * ```
 * 화면 코드에서는 `CartryTheme.colors.goal`, `CartryTheme.type.button` 처럼 꺼내 쓴다.
 */
@Composable
fun CartryTheme(fontFamily: FontFamily = FontFamily.Default, content: @Composable () -> Unit) {
    val type = remember(fontFamily) { CartryTypography.create(fontFamily) }
    CompositionLocalProvider(LocalTypography provides type, content = content)
}

object CartryTheme {
    val colors: CartryColors @Composable @ReadOnlyComposable get() = LocalColors.current
    val type: CartryTypography @Composable @ReadOnlyComposable get() = LocalTypography.current
    val shapes: CartryShapes @Composable @ReadOnlyComposable get() = LocalShapes.current
    val space: CartrySpacing @Composable @ReadOnlyComposable get() = LocalSpacing.current
    val elevation: CartryElevations @Composable @ReadOnlyComposable get() = LocalElevations.current
}
