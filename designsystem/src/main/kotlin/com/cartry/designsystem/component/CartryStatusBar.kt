package com.cartry.designsystem.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Size
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
 * 높이 112, 모서리 19, 좌우 29, 아이콘 51, 이름 34/700, 상태 29 + 점 11.
 * 목표와 달성은 연한 바탕 + 왼쪽 6 짜리 색 줄, 나머지는 카드색 바탕이다(그림자 없음).
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
    val t = CartryTheme.type
    data class Look(val bg: Color, val stripe: Color?, val icon: Color, val status: Color, val dot: Color)
    val look = when (state) {
        StatusBarState.Idle -> Look(c.surface, null, c.textSecondary, c.textTertiary, c.textDisabled)
        StatusBarState.Waiting -> Look(c.surface, null, c.textTertiary, c.textTertiary, c.textDisabled)
        StatusBarState.Target -> Look(c.action.copy(alpha = 0.14f), c.action, c.goalBright, c.textPrimary, c.goal)
        StatusBarState.Success -> Look(c.success.copy(alpha = 0.12f), c.success, c.success, c.textPrimary, c.success)
        StatusBarState.Error -> Look(c.surface, null, c.textSecondary, c.danger, c.danger)
    }
    val stripe = look.stripe
    Row(
        modifier.fillMaxWidth().height(112.dp).clip(RoundedCornerShape(19.dp)).background(look.bg)
            .then(if (stripe != null) Modifier.drawBehind { drawRect(stripe, size = Size(6.dp.toPx(), size.height)) } else Modifier)
            .padding(horizontal = 29.dp),
        horizontalArrangement = Arrangement.spacedBy(19.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(icon, null, Modifier.size(51.dp), colorFilter = ColorFilter.tint(look.icon))
        BasicText(title, style = t.barTitle.copy(color = c.textPrimary), maxLines = 1)
        Spacer(Modifier.weight(1f))
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp), verticalAlignment = Alignment.CenterVertically) {
            Box(Modifier.size(11.dp).background(look.dot, CartryTheme.shapes.circle))
            BasicText(status, style = t.barStatus.copy(color = look.status), maxLines = 1)
        }
    }
}
