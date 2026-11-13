package com.cartry.designsystem.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cartry.designsystem.icon.CartryIcons
import com.cartry.designsystem.theme.CartryTheme

/**
 * 앱 헤더. 왼쪽부터 [뒤로] 앱 아이콘 · CARTRY | 화면 이름, 오른쪽 끝 [···] 더보기.
 * 높이 112, 좌우 여백 56(뒤로 버튼이 있으면 44 에서 시작), 원형 버튼 76. 앱 창(가로 1700) 기준.
 * onBack 이 null 이면 뒤로 버튼을 그리지 않는다(홈 화면).
 * actions 에는 더보기 왼쪽에 놓을 것(홈의 진행률·검색창·로드맵·설정)을 넣는다.
 */
@Composable
fun CartryAppHeader(
    section: String,
    modifier: Modifier = Modifier,
    onBack: (() -> Unit)? = null,
    onMore: (() -> Unit)? = null,
    appName: String = "CARTRY",
    actions: @Composable RowScope.() -> Unit = {},
) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    Row(
        modifier.fillMaxWidth().height(112.dp).padding(start = if (onBack != null) 44.dp else 56.dp, end = 56.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (onBack != null) {
            CircleButton(onBack, "뒤로") {
                Image(CartryIcons.LineChevl, null, Modifier.size(32.dp), colorFilter = ColorFilter.tint(c.textPrimary))
            }
        }
        Box(Modifier.size(64.dp).clip(CartryTheme.shapes.appIcon).background(c.goal), contentAlignment = Alignment.Center) {
            Image(CartryIcons.AppApp, null, Modifier.size(40.dp), colorFilter = ColorFilter.tint(c.textPrimary))
        }
        BasicText(appName, style = t.appName.copy(color = c.textPrimary))
        Box(Modifier.padding(horizontal = 6.dp).width(1.dp).height(36.dp).background(c.divider))
        BasicText(section, Modifier.padding(horizontal = 8.dp), style = t.bodySmall.copy(color = c.textSecondary), maxLines = 1)
        Spacer(Modifier.weight(1f))
        actions()
        if (onMore != null) {
            CircleButton(onMore, "더보기") {
                BasicText("···", style = t.body.copy(fontSize = 34.sp, letterSpacing = 2.sp, color = c.textSecondary))
            }
        }
    }
}

/** 76 원형 버튼(뒤로·더보기). */
@Composable
internal fun CircleButton(onClick: () -> Unit, label: String, content: @Composable () -> Unit) {
    Box(
        Modifier.size(76.dp).clip(CartryTheme.shapes.circle).background(CartryTheme.colors.surface)
            .clickable(role = Role.Button, onClickLabel = label, onClick = onClick),
        contentAlignment = Alignment.Center,
    ) { content() }
}
