package com.cartry.designsystem.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.cartry.designsystem.theme.CartryTheme
import com.cartry.designsystem.theme.innerShadows
import com.cartry.designsystem.theme.outerShadows

enum class CartryButtonStyle {
    /** 주 버튼: 파란 그라데이션 + 파란 그림자. 화면마다 하나 */
    Primary,

    /** 보조 버튼: 카드색 바탕 */
    Secondary,
}

/**
 * 알약 모양 버튼. 높이 92, 좌우 여백 44, 글자 32/600, 아이콘 30.
 * 누르는 동안 95% 로 줄어든다(시안의 :active).
 */
@Composable
fun CartryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: CartryButtonStyle = CartryButtonStyle.Primary,
    icon: ImageVector? = null,
    enabled: Boolean = true,
) {
    val c = CartryTheme.colors
    val shape = CartryTheme.shapes.pill
    val source = remember { MutableInteractionSource() }
    val pressed by source.collectIsPressedAsState()
    var m = modifier.scale(if (pressed) 0.95f else 1f)
    m = when (style) {
        CartryButtonStyle.Primary -> m.outerShadows(CartryTheme.elevation.primaryButton, shape).clip(shape).background(c.primaryFill)
            .innerShadows(CartryTheme.elevation.primaryButton, shape)
        CartryButtonStyle.Secondary -> m.clip(shape).background(c.surface)
    }
    Row(
        modifier = m
            .alpha(if (enabled) 1f else 0.4f)
            .clickable(interactionSource = source, indication = null, enabled = enabled, role = Role.Button, onClick = onClick)
            .height(92.dp)
            .padding(horizontal = 44.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (icon != null) Image(icon, null, Modifier.size(30.dp), colorFilter = ColorFilter.tint(c.textPrimary))
        BasicText(text, style = CartryTheme.type.button.copy(color = c.textPrimary), maxLines = 1)
    }
}
