package com.cartry.designsystem.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.cartry.designsystem.theme.CartryTheme
import com.cartry.designsystem.theme.innerShadows
import com.cartry.designsystem.theme.outerShadows

/**
 * 모달 틀. 뒤 화면을 검정 55% 막으로 덮고 가운데에 패널을 띄운다. 막을 누르면 onDismissRequest.
 * 패널: 폭 1180, 위→아래 그라데이션, 모서리 24, 안쪽 여백 52/56/48/56, 줄 간격 20.
 * 이 컴포저블은 부모 영역을 가득 채운다. 화면 맨 위 층(Box 의 마지막 자식)에 둔다.
 */
@Composable
fun CartryModal(
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    width: Dp = 1180.dp,
    horizontalAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    content: @Composable ColumnScope.() -> Unit,
) {
    val c = CartryTheme.colors
    val shape = CartryTheme.shapes.card
    val e = CartryTheme.elevation.modal
    Box(
        modifier.fillMaxSize().background(c.scrim)
            .clickable(interactionSource = remember { MutableInteractionSource() }, indication = null, onClick = onDismissRequest),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            Modifier.width(width)
                .outerShadows(e, shape).clip(shape).background(c.modalFill).innerShadows(e, shape)
                .clickable(interactionSource = remember { MutableInteractionSource() }, indication = null) {}
                .padding(start = 56.dp, end = 56.dp, top = 52.dp, bottom = 48.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = horizontalAlignment,
            content = content,
        )
    }
}

/** 가운데 정렬 확인 모달: 3D 아이콘 → 제목 → 설명 → 버튼 두 개(재도전 모달과 같은 모양). */
@Composable
fun CartryDialog(
    title: String,
    body: String,
    primaryText: String,
    onPrimary: () -> Unit,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    secondaryText: String? = null,
    onSecondary: () -> Unit = onDismissRequest,
) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    CartryModal(onDismissRequest, modifier) {
        // 아이콘 칸은 140 그림 + 아래 4 (시안의 .mico 높이 144)
        if (icon != null) Image(icon, null, Modifier.padding(bottom = 4.dp).size(140.dp))
        CartryText(title, style = t.dialogTitle.copy(color = c.textPrimary, textAlign = TextAlign.Center))
        CartryText(body, style = t.body.copy(color = c.textSecondary, textAlign = TextAlign.Center), modifier = Modifier.width(760.dp))
        // 버튼 줄은 줄 간격 20 + 8 아래에 둔다(시안 28)
        Row(Modifier.padding(top = 8.dp), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            CartryButton(primaryText, onPrimary)
            if (secondaryText != null) CartryButton(secondaryText, onSecondary, style = CartryButtonStyle.Secondary)
        }
    }
}
