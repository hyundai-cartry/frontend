package com.cartry.app.practice.component

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import com.cartry.app.lesson.Lesson
import com.cartry.app.lesson.LessonControl
import com.cartry.app.lesson.LessonHint
import com.cartry.app.practice.PracticeStep
import com.cartry.designsystem.component.BadgeTone
import com.cartry.designsystem.component.BuddyMood
import com.cartry.designsystem.component.CartryBadge
import com.cartry.designsystem.component.CartryBuddy
import com.cartry.designsystem.component.CartryButton
import com.cartry.designsystem.component.CartryButtonStyle
import com.cartry.designsystem.component.CartryStatusBar
import com.cartry.designsystem.component.CartryTag
import com.cartry.designsystem.component.CartryText
import com.cartry.designsystem.component.StatusBarState
import com.cartry.designsystem.icon.CartryIcons
import com.cartry.designsystem.theme.CartryTheme

/** 실습 화면 왼쪽: 위치 표시 → 제목·설명 → 기능 목록(또는 힌트) → 버튼. 단계마다 내용만 바뀐다. */
@Composable
fun PracticeLeftPane(
    lesson: Lesson,
    step: PracticeStep,
    targetOn: Boolean?,
    decoyOn: Boolean?,
    onShowHint: () -> Unit,
    onNextHint: () -> Unit,
    onContinue: () -> Unit,
    onHome: () -> Unit,
    onRetry: () -> Unit,
) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space

    Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(s.s28)) {
        // 위치 표시: [카트리] 오늘의 추천  기본 기능 · 앞유리 김서림
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(s.s14)) {
            CartryBuddy(step.mood(), Modifier.size(s.s56, s.s44))
            CartryTag("오늘의 추천")
            BasicText(lesson.category, style = t.bodySmall.copy(color = c.textSecondary), maxLines = 1)
        }

        // 제목·설명
        Column(verticalArrangement = Arrangement.spacedBy(s.s12)) {
            when (step) {
                PracticeStep.Mission -> {
                    CartryText(lesson.missionTitle, t.cardTitle.copy(color = c.textPrimary))
                    // 다시 해 보기를 눌렀는데 정답 기능이 이미 켜져 있으면, 껐다가 다시 켜야 완료된다
                    val body = if (targetOn == true) "지금은 켜져 있어요. 차에서 끈 다음 다시 켜 보세요." else lesson.missionBody
                    CartryText(body, t.body.copy(color = c.textSecondary))
                }
                PracticeStep.Wrong -> {
                    CartryText(lesson.wrongTitle, t.cardTitle.copy(color = c.textPrimary))
                    CartryText(lesson.wrongBody, t.body.copy(color = c.textSecondary))
                }
                is PracticeStep.Hint -> CartryText(lesson.hintTitle, t.cardTitle.copy(color = c.textPrimary))
                PracticeStep.Success -> {
                    BasicText("잘했어요!", style = t.cardTitle.copy(color = c.success))
                    CartryText(lesson.successTitle, t.cardTitle.copy(color = c.textPrimary))
                }
            }
        }
        if (step == PracticeStep.Success) {
            CartryBadge("기억해요  ${lesson.remember}", tone = BadgeTone.Goal, icon = CartryIcons.LineBulb)
        }

        // 기능 목록 또는 힌트
        when (step) {
            is PracticeStep.Hint -> HintList(lesson.hints, step.level, onOpenNext = onNextHint)
            PracticeStep.Success -> ControlBar(lesson.target, on = true, StatusBarState.Success)
            else -> Column(verticalArrangement = Arrangement.spacedBy(s.s16)) {
                ControlBar(lesson.target, on = targetOn == true, StatusBarState.Target)
                ControlBar(lesson.decoy, on = decoyOn == true, if (decoyOn == true) StatusBarState.Error else StatusBarState.Idle)
            }
        }

        // 버튼
        Row(horizontalArrangement = Arrangement.spacedBy(s.s16)) {
            when (step) {
                PracticeStep.Mission, PracticeStep.Wrong ->
                    CartryButton("힌트 보기", onShowHint, icon = CartryIcons.LineBulb)
                // 다음 힌트는 힌트 줄을 눌러서 연다
                is PracticeStep.Hint -> CartryButton("실습 계속하기", onContinue, style = CartryButtonStyle.Secondary)
                PracticeStep.Success -> {
                    CartryButton("홈으로", onHome, icon = CartryIcons.LineArrow)
                    CartryButton("다시 해 보기", onRetry, style = CartryButtonStyle.Secondary)
                }
            }
        }
    }
}

@Composable
private fun ControlBar(control: LessonControl, on: Boolean, state: StatusBarState) {
    CartryStatusBar(
        icon = control.icon,
        title = control.label,
        status = if (on) control.onText else control.offText,
        state = state,
        modifier = Modifier.fillMaxWidth(),
    )
}

/**
 * 힌트 목록. 세 개를 처음부터 다 보여주되, 내용은 연 것만 보인다.
 * - 연 힌트: 번호 · 제목 · 내용. 마지막으로 연 것은 파란 바탕 + 왼쪽 파란 줄(지금 볼 것)
 * - 아직 안 연 힌트: 번호 · 제목 · 자물쇠. 바로 다음 차례인 것만 눌러서 열 수 있다(1 → 2 → 3 순서).
 */
@Composable
private fun HintList(hints: List<LessonHint>, level: Int, onOpenNext: () -> Unit) {
    val s = CartryTheme.space
    Column(Modifier.fillMaxWidth().animateContentSize(), verticalArrangement = Arrangement.spacedBy(s.s8)) {
        hints.forEachIndexed { i, hint ->
            when {
                i < level -> OpenedHint(i + 1, hint, latest = i == level - 1)
                else -> LockedHint(i + 1, hint.title, onOpen = if (i == level) onOpenNext else null)
            }
        }
    }
}

@Composable
private fun OpenedHint(number: Int, hint: LessonHint, latest: Boolean) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    val shape = CartryTheme.shapes.card
    val bar = c.goal
    val barWidth = s.s6
    Column(
        Modifier.fillMaxWidth().clip(shape)
            .background(if (latest) c.goalSoft else c.surface)
            .drawBehind { if (latest) drawRect(bar, size = Size(barWidth.toPx(), size.height)) }
            .padding(horizontal = s.s28, vertical = s.s24),
        verticalArrangement = Arrangement.spacedBy(s.s16),
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(s.s16), verticalAlignment = Alignment.CenterVertically) {
            HintNumber(number, filled = latest)
            BasicText(hint.title, style = t.sectionTitle.copy(color = c.textPrimary))
        }
        CartryText(hint.body, t.rowBody.copy(color = c.textSecondary))
    }
}

/** 아직 안 연 힌트. onOpen 이 있으면(다음 차례) 눌러서 연다. 없으면 앞 힌트를 먼저 열어야 한다. */
@Composable
private fun LockedHint(number: Int, title: String, onOpen: (() -> Unit)?) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    var m = Modifier.fillMaxWidth().heightIn(min = s.minTouch + s.s20).clip(CartryTheme.shapes.card)
    if (onOpen != null) m = m.clickable(role = Role.Button, onClickLabel = "힌트 $number 보기", onClick = onOpen)
    Row(
        m.padding(horizontal = s.s28),
        horizontalArrangement = Arrangement.spacedBy(s.s16),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(Modifier.size(s.s44), contentAlignment = Alignment.Center) {
            BasicText("$number", style = t.label.copy(color = c.textTertiary))
        }
        BasicText(title, Modifier.weight(1f), style = t.sectionTitle.copy(color = if (onOpen != null) c.textSecondary else c.textTertiary))
        LockMark(c.textTertiary)
    }
}

@Composable
private fun HintNumber(number: Int, filled: Boolean) {
    val c = CartryTheme.colors
    Box(
        Modifier.size(CartryTheme.space.s44).background(if (filled) c.goal else c.surfaceTrack, CartryTheme.shapes.circle),
        contentAlignment = Alignment.Center,
    ) { BasicText("$number", style = CartryTheme.type.label.copy(color = c.textPrimary)) }
}

/**
 * 자물쇠 표시(시안의 힌트 잠금). 디자인 시스템 아이콘에 자물쇠가 없어서 시안 모양대로 직접 그렸다.
 * TODO: 디자인 시스템에 p-lock 아이콘으로 추가하면 CartryIcons 로 바꾼다.
 */
@Composable
private fun LockMark(color: Color) {
    val s = CartryTheme.space
    Canvas(Modifier.size(s.s28)) {
        val w = size.width
        val stroke = w * 0.1f
        // 고리
        drawArc(color, 180f, 180f, useCenter = false, topLeft = Offset(w * 0.28f, w * 0.1f), size = Size(w * 0.44f, w * 0.5f), style = Stroke(stroke))
        drawLine(color, Offset(w * 0.28f, w * 0.35f), Offset(w * 0.28f, w * 0.48f), stroke)
        drawLine(color, Offset(w * 0.72f, w * 0.35f), Offset(w * 0.72f, w * 0.48f), stroke)
        // 몸통
        drawRoundRect(color, topLeft = Offset(w * 0.18f, w * 0.46f), size = Size(w * 0.64f, w * 0.46f), cornerRadius = CornerRadius(w * 0.08f), style = Stroke(stroke))
    }
}

private fun PracticeStep.mood() = when (this) {
    PracticeStep.Mission -> BuddyMood.Idle
    PracticeStep.Wrong -> BuddyMood.Oops
    is PracticeStep.Hint -> BuddyMood.Think
    PracticeStep.Success -> BuddyMood.Cheer
}
