package com.cartry.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.Shape
import com.cartry.designsystem.theme.CartryElevation
import com.cartry.designsystem.theme.CartryTheme
import com.cartry.designsystem.theme.innerShadows
import com.cartry.designsystem.theme.outerShadows
import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.sin

/**
 * 카드 바탕. 카드·목록 행·타일이 모두 이 바탕을 쓴다: 바탕색 + 위→아래 광택 + 그림자 묶음 + 모서리 24.
 * selected = true 면 바탕이 한 단계 밝아진다(고른 카테고리, 펼친 힌트 줄).
 */
@Composable
fun CartryCard(
    modifier: Modifier = Modifier,
    selected: Boolean = false,
    contentPadding: PaddingValues = PaddingValues(),
    content: @Composable BoxScope.() -> Unit,
) {
    val c = CartryTheme.colors
    CartrySurface(
        modifier = modifier,
        color = if (selected) c.surfaceSelected else c.surface,
        sheen = true,
        elevation = CartryTheme.elevation.raised,
        contentPadding = contentPadding,
        content = content,
    )
}

/** 바탕 하나를 그리는 기본 틀. 컴포넌트 안에서 쓴다. */
@Composable
internal fun CartrySurface(
    modifier: Modifier = Modifier,
    color: Color,
    sheen: Boolean,
    elevation: CartryElevation?,
    shape: Shape = CartryTheme.shapes.card,
    contentPadding: PaddingValues = PaddingValues(),
    content: @Composable BoxScope.() -> Unit,
) {
    val c = CartryTheme.colors
    var m = modifier
    if (elevation != null) m = m.outerShadows(elevation, shape)
    m = m.clip(shape).background(color)
    if (sheen) m = m.background(c.cardSheen)
    if (elevation != null) m = m.innerShadows(elevation, shape)
    Box(m.padding(contentPadding), content = content)
}

/**
 * CSS 의 linear-gradient(각도, …) 와 같은 방향의 그라데이션. 각도 0 = 위쪽, 90 = 오른쪽, 180 = 아래쪽.
 * 크기에 맞춰 시작·끝 점을 계산한다(CSS 와 같은 규칙).
 */
internal class CssLinearGradient(private val angleDeg: Float, private val stops: List<Pair<Float, Color>>) : ShaderBrush() {
    override fun createShader(size: Size): Shader {
        val rad = Math.toRadians(angleDeg.toDouble())
        val dx = sin(rad).toFloat(); val dy = -cos(rad).toFloat()
        val half = (abs(size.width * dx) + abs(size.height * dy)) / 2f
        val center = Offset(size.width / 2f, size.height / 2f)
        return LinearGradientShader(
            from = Offset(center.x - dx * half, center.y - dy * half),
            to = Offset(center.x + dx * half, center.y + dy * half),
            colors = stops.map { it.second },
            colorStops = stops.map { it.first },
        )
    }

    override fun equals(other: Any?) = other is CssLinearGradient && other.angleDeg == angleDeg && other.stops == stops
    override fun hashCode() = angleDeg.hashCode() * 31 + stops.hashCode()
}
