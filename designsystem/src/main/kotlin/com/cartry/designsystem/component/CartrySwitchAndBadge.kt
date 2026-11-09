package com.cartry.designsystem.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.cartry.designsystem.theme.CartryTheme

/**
 * 켜고 끄는 스위치. 104×56, 손잡이 44.
 * 켜짐 = 파랑(시안 값). 꺼짐 색은 시안에 없어서 진행 막대 빈 칸 색(#686A72)으로 정했다.
 */
@Composable
fun CartrySwitch(checked: Boolean, onCheckedChange: (Boolean) -> Unit, modifier: Modifier = Modifier, enabled: Boolean = true) {
    val c = CartryTheme.colors
    val x by animateDpAsState(if (checked) 54.dp else 6.dp, label = "switch")
    Box(
        modifier.size(104.dp, 56.dp).clip(CartryTheme.shapes.pill).background(if (checked) c.goal else c.surfaceTrack)
            .toggleable(value = checked, enabled = enabled, role = Role.Switch, onValueChange = onCheckedChange),
    ) {
        Box(Modifier.offset(x = x, y = 6.dp).size(44.dp).background(Color.White, CartryTheme.shapes.circle))
    }
}

enum class BadgeTone { Success, Goal }

/**
 * 알약 배지. 높이 44.
 * - solid = true : 초록 바탕 + 진한 글자 22/600 (검색 결과의 「완료」). 글자 24 미만이라 README 의 확인 필요 항목이다.
 * - solid = false: 연한 바탕 + 색 글자 28/700 (「힌트 없이 성공 · 배지」).
 */
@Composable
fun CartryBadge(text: String, modifier: Modifier = Modifier, tone: BadgeTone = BadgeTone.Success, solid: Boolean = false, icon: ImageVector? = null) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val (bg, fg) = when {
        solid && tone == BadgeTone.Success -> c.success to c.onSuccess
        solid -> c.goal to c.textPrimary
        tone == BadgeTone.Success -> c.successSoft to c.success
        else -> c.goalSoft to c.goal
    }
    Row(
        modifier.height(44.dp).background(bg, CartryTheme.shapes.pill).padding(horizontal = if (solid) 18.dp else 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (icon != null) Image(icon, null, Modifier.size(22.dp), colorFilter = ColorFilter.tint(fg))
        BasicText(text, style = (if (solid) t.pill else t.label.copy(letterSpacing = t.pill.letterSpacing)).copy(color = fg), maxLines = 1)
    }
}

/** 파란 글자 꼬리표(코스 이름 등). 바탕 없음. */
@Composable
fun CartryTag(text: String, modifier: Modifier = Modifier) {
    BasicText(text, modifier, style = CartryTheme.type.tag.copy(color = CartryTheme.colors.goalLabel), maxLines = 1)
}
