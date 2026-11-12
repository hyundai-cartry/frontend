package com.cartry.app.practice.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import com.cartry.app.lesson.Lesson
import com.cartry.app.lesson.PanelKind
import com.cartry.app.practice.PracticeStep
import com.cartry.designsystem.icon.CartryIcons
import com.cartry.designsystem.theme.CartryTheme

/**
 * 오른쪽 차 화면 흉내(공조 바 · 핸들 레버 · 창문 스위치).
 * 누르는 곳이 아니라 차 상태를 비춰 주는 그림이다. 입력은 차(개발 중에는 Virtual Console)에서 들어온다.
 *
 * 지금은 뼈대라 아이콘을 한 줄로 늘어놓았다. 시안의 레버·스위치 모양은 기능별로 [panelGroups] 를 고쳐 다듬는다.
 */
@Composable
fun CarPanel(lesson: Lesson, step: PracticeStep, targetOn: Boolean?, decoyOn: Boolean?, modifier: Modifier = Modifier) {
    val c = CartryTheme.colors
    val s = CartryTheme.space
    Row(
        modifier.background(c.backgroundDeep, CartryTheme.shapes.card).padding(horizontal = s.s40, vertical = s.s28),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        panelGroups(lesson.panel).forEach { group ->
            val frame = when (group.role) {
                Role.Target -> when {
                    step == PracticeStep.Success -> c.success
                    step is PracticeStep.Hint && step.level >= 3 -> c.goal   // 힌트 3: 위치 알려주기
                    else -> c.textPrimary
                }
                Role.Decoy -> if (decoyOn == true && step != PracticeStep.Success) c.danger else null
                null -> null
            }
            val tint = when (group.role) {
                Role.Target -> if (targetOn == true) c.success else c.textPrimary
                Role.Decoy -> if (decoyOn == true) c.danger else c.textPrimary
                null -> c.textPrimary
            }
            PanelGroupView(group, frame, tint, filled = group.role == Role.Target && step == PracticeStep.Success)
        }
    }
}

private enum class Role { Target, Decoy }

private class PanelItem(val icon: ImageVector? = null, val text: String? = null, val caption: String? = null, val rotation: Float = 0f)

private class PanelGroup(val role: Role?, val items: List<PanelItem>)

private fun panelGroups(kind: PanelKind): List<PanelGroup> = when (kind) {
    PanelKind.Climate -> listOf(
        PanelGroup(null, listOf(PanelItem(text = "23.5°", caption = "A/C"))),
        PanelGroup(Role.Target, listOf(PanelItem(CartryIcons.LineFront, caption = "앞유리"))),
        PanelGroup(Role.Decoy, listOf(PanelItem(CartryIcons.LineRear, caption = "뒷유리"))),
    )
    PanelKind.Wiper -> listOf(
        PanelGroup(Role.Decoy, listOf(PanelItem(CartryIcons.LineTurnL, caption = "방향지시등"))),
        PanelGroup(null, listOf(PanelItem(text = "P", caption = "기어"))),
        PanelGroup(Role.Target, listOf(PanelItem(CartryIcons.LineWiperF, caption = "와이퍼"))),
    )
    PanelKind.Window -> listOf(
        PanelGroup(
            Role.Decoy,
            listOf("운전석", "조수석", "뒤 왼쪽", "뒤 오른쪽").map { PanelItem(CartryIcons.LineChev, caption = it, rotation = -90f) },
        ),
        PanelGroup(Role.Target, listOf(PanelItem(CartryIcons.LineWinlock, caption = "창문 잠금"))),
    )
}

/** 묶음 하나. frame 이 있으면 네 귀퉁이에 꺾쇠 틀을 그린다(시안의 [ ] 표시). */
@Composable
private fun PanelGroupView(group: PanelGroup, frame: Color?, tint: Color, filled: Boolean) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    val frameColor by animateColorAsState(frame ?: Color.Transparent, tween(400), label = "frame")
    val fill by animateColorAsState(if (filled) c.successSoft else Color.Transparent, tween(400), label = "fill")
    val tintColor by animateColorAsState(tint, tween(400), label = "tint")
    val stroke = s.s6
    Row(
        Modifier
            .background(fill)
            .drawWithContent {
                drawContent()
                val w = stroke.toPx()
                val len = size.minDimension * 0.22f
                val (r, b) = size.width to size.height
                listOf(
                    Offset(0f, 0f) to Offset(len, 0f), Offset(0f, 0f) to Offset(0f, len),
                    Offset(r, 0f) to Offset(r - len, 0f), Offset(r, 0f) to Offset(r, len),
                    Offset(0f, b) to Offset(len, b), Offset(0f, b) to Offset(0f, b - len),
                    Offset(r, b) to Offset(r - len, b), Offset(r, b) to Offset(r, b - len),
                ).forEach { (from, to) -> drawLine(frameColor, from, to, w) }
            }
            .padding(s.s20),
        horizontalArrangement = Arrangement.spacedBy(s.s24),
    ) {
        group.items.forEach { item ->
            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(s.s8)) {
                if (item.icon != null) {
                    Image(item.icon, null, Modifier.size(s.s56 + s.s20).rotate(item.rotation), colorFilter = ColorFilter.tint(tintColor))
                }
                if (item.text != null) BasicText(item.text, style = t.cardTitle.copy(color = c.textPrimary))
                if (item.caption != null) BasicText(item.caption, style = t.caption.copy(color = c.textTertiary))
            }
        }
    }
}
