package com.cartry.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.draw.innerShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp

/** 그림자 한 겹. inset = true 면 도형 안쪽에 그린다(윗변 하이라이트 같은 것). */
@Immutable
data class ShadowLayer(val y: Dp, val blur: Dp, val color: Color, val inset: Boolean = false)

/** 그림자 묶음. 시안 CSS box-shadow 를 겹 단위로 옮겼다. */
@Immutable
data class CartryElevation(val layers: List<ShadowLayer>)

@Immutable
data class CartryElevations(
    /** 카드·목록 행·타일: 윗변 하이라이트 + 아랫변 어둠 + 짧은 그림자 + 긴 그림자 */
    val raised: CartryElevation = CartryElevation(
        listOf(
            ShadowLayer(1.dp, 0.dp, Color(0x1AFFFFFF), inset = true),
            ShadowLayer((-1).dp, 0.dp, Color(0x4D000000), inset = true),
            ShadowLayer(2.dp, 4.dp, Color(0x4D000000)),
            ShadowLayer(16.dp, 40.dp, Color(0x6B000000)),
        ),
    ),
    /** 상태 막대(기본) */
    val bar: CartryElevation = CartryElevation(
        listOf(ShadowLayer(1.dp, 0.dp, Color(0x1AFFFFFF), inset = true), ShadowLayer(10.dp, 28.dp, Color(0x59000000))),
    ),
    /** 주 버튼: 파란 그림자 */
    val primaryButton: CartryElevation = CartryElevation(
        listOf(ShadowLayer(1.dp, 0.dp, Color(0x40FFFFFF), inset = true), ShadowLayer(10.dp, 24.dp, Color(0x590082FF))),
    ),
    /** 고른 튜토리얼 타일: 파란 그림자 */
    val selectedTile: CartryElevation = CartryElevation(
        listOf(ShadowLayer(1.dp, 0.dp, Color(0x59FFFFFF), inset = true), ShadowLayer(16.dp, 40.dp, Color(0x590082FF))),
    ),
    /** 말풍선: 아주 옅은 그림자 */
    val bubble: CartryElevation = CartryElevation(listOf(ShadowLayer(2.dp, 8.dp, Color(0x0F000000)))),
    /** 모달 */
    val modal: CartryElevation = CartryElevation(
        listOf(ShadowLayer(1.dp, 0.dp, Color(0x14FFFFFF), inset = true), ShadowLayer(32.dp, 96.dp, Color(0x99000000))),
    ),
)

/** 바깥 그림자만 그린다. 바탕(background)보다 앞에 둔다. */
fun Modifier.outerShadows(elevation: CartryElevation, shape: Shape): Modifier =
    elevation.layers.filter { !it.inset }.fold(this) { m, l ->
        m.dropShadow(shape, Shadow(radius = l.blur, color = l.color, offset = DpOffset(0.dp, l.y)))
    }

/** 안쪽 그림자만 그린다. 바탕(background)보다 뒤에 둔다. */
fun Modifier.innerShadows(elevation: CartryElevation, shape: Shape): Modifier =
    elevation.layers.filter { it.inset }.fold(this) { m, l ->
        m.innerShadow(shape, Shadow(radius = l.blur, color = l.color, offset = DpOffset(0.dp, l.y)))
    }
