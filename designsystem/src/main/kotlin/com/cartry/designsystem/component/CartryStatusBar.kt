package com.cartry.designsystem.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.cartry.designsystem.theme.CartryTheme

/** 상태 막대가 보여주는 차 부위의 상태. 색의 뜻은 CartryColors 와 같다. */
enum class StatusBarState {
    /** 기본: 아직 해당 없음 */
    Idle,

    /** 다음 차례를 기다림(아이콘이 한 단계 흐림) */
    Waiting,

    /** 지금 조작할 목표: 파랑 */
    Target,

    /** 목표 달성: 초록 */
    Success,

    /** 오작동(순서가 틀림 등): 상태 글자가 빨강 */
    Error,
}

/**
 * 상태 막대(시안의 sbar). 차 부위 하나의 현재 상태를 한 줄로 보여준다. 미션 화면에서 차가 알려준 결과가 여기에 바로 반영된다.
 * 높이 150, 좌우 36, 아이콘 56, 이름 40/700, 상태 34 + 점 14.
 */
@Composable
fun CartryStatusBar(
    icon: ImageVector,
    title: String,
    status: String,
    modifier: Modifier = Modifier,
    state: StatusBarState = StatusBarState.Idle,
) {
    val c = CartryTheme.colors
    val shape = CartryTheme.shapes.card
    data class Look(val bg: Color?, val ring: Color?, val icon: Color, val status: Color, val dot: Color)
    val look = when (state) {
        StatusBarState.Idle -> Look(null, null, c.textSecondary, c.textTertiary, c.textDisabled)
        StatusBarState.Waiting -> Look(null, null, c.textTertiary, c.textTertiary, c.textDisabled)
        StatusBarState.Target -> Look(c.goalSoft, c.goal, c.goalBright, c.textPrimary, c.goal)
        StatusBarState.Success -> Look(c.successSoft, c.success, c.success, c.textPrimary, c.success)
        StatusBarState.Error -> Look(null, null, c.textSecondary, c.danger, c.danger)
    }
    val row: @Composable androidx.compose.foundation.layout.BoxScope.() -> Unit = {
        Row(
            Modifier.fillMaxWidth().height(150.dp),
            horizontalArrangement = Arrangement.spacedBy(24.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(icon, null, Modifier.size(56.dp), colorFilter = ColorFilter.tint(look.icon))
            BasicText(title, style = CartryTheme.type.barTitle.copy(color = c.textPrimary), maxLines = 1)
            Spacer(Modifier.weight(1f))
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp), verticalAlignment = Alignment.CenterVertically) {
                Box(Modifier.size(14.dp).background(look.dot, CartryTheme.shapes.circle))
                BasicText(status, style = CartryTheme.type.body.copy(color = look.status, lineHeight = CartryTheme.type.barTitle.lineHeight), maxLines = 1)
            }
        }
    }
    if (look.bg == null) {
        CartrySurface(modifier, c.surface, sheen = true, elevation = CartryTheme.elevation.bar, contentPadding = PaddingValues(horizontal = 36.dp), content = row)
    } else {
        CartrySurface(
            modifier.border(3.dp, look.ring!!, shape), look.bg, sheen = false, elevation = null,
            contentPadding = PaddingValues(horizontal = 36.dp), content = row,
        )
    }
}
