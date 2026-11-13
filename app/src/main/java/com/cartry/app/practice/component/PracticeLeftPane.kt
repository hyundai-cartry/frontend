package com.cartry.app.practice.component

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import com.cartry.app.lesson.Lesson
import com.cartry.app.lesson.LessonControl
import com.cartry.app.lesson.LessonHint
import com.cartry.app.practice.PracticeStep
import com.cartry.designsystem.component.BuddyMood
import com.cartry.designsystem.component.CartryBuddy
import com.cartry.designsystem.component.CartryButton
import com.cartry.designsystem.component.CartryButtonStyle
import com.cartry.designsystem.component.CartryStatusBar
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
            BasicText("오늘의 추천", style = t.progressTitle.copy(color = c.goal, fontWeight = FontWeight.ExtraBold), maxLines = 1)
            BasicText(lesson.category, style = t.progressTitle.copy(color = c.textSecondary), maxLines = 1)
        }

        // 제목·설명. 시안: 제목 52/800, 설명 27/500(말풍선 설명 색)
        val title = t.talkTitleCompact.copy(color = c.textPrimary)
        val lead = t.lead.copy(color = c.lead)
        Column(verticalArrangement = Arrangement.spacedBy(s.s10)) {
            when (step) {
                PracticeStep.Mission -> {
                    CartryText(lesson.missionTitle, title)
                    // 다시 해 보기를 눌렀는데 정답 기능이 이미 켜져 있으면, 껐다가 다시 켜야 완료된다
                    val body = if (targetOn == true) "지금은 켜져 있어요. 차에서 끈 다음 다시 켜 보세요." else lesson.missionBody
                    CartryText(body, lead)
                }
                PracticeStep.Wrong -> {
                    CartryText(lesson.wrongTitle, title)
                    CartryText(lesson.wrongBody, lead)
                }
                is PracticeStep.Hint -> CartryText(lesson.missionTitle, title)
                PracticeStep.Success -> {
                    BasicText("잘했어요!", style = title.copy(color = c.success))
                    CartryText(lesson.successTitle, title)
                }
            }
        }
        if (step == PracticeStep.Success) RememberMemo(lesson.remember)

        // 기능 목록 또는 힌트
        when (step) {
            is PracticeStep.Hint -> HintList(lesson, step.level, onOpenNext = onNextHint)
            PracticeStep.Success -> ControlBar(lesson.target, on = true, StatusBarState.Success)
            else -> Column(verticalArrangement = Arrangement.spacedBy(s.s16)) {
                ControlBar(lesson.target, on = targetOn == true, StatusBarState.Target)
                ControlBar(lesson.decoy, on = decoyOn == true, if (decoyOn == true) StatusBarState.Error else StatusBarState.Idle)
            }
        }

        // 버튼. 시안은 목록과 버튼 사이를 조금 더 띄운다
        Row(Modifier.padding(top = s.s20), horizontalArrangement = Arrangement.spacedBy(s.s16)) {
            when (step) {
                PracticeStep.Mission, PracticeStep.Wrong ->
                    CartryButton("힌트 보기", onShowHint, icon = CartryIcons.LineBulb)
                // 다음 힌트는 이 버튼이나 힌트 줄을 눌러서 연다
                // 힌트를 다 열었으면 「실습 계속하기」가 주 버튼이 된다(시안 49 l3)
                is PracticeStep.Hint -> if (step.level < lesson.hints.size) {
                    CartryButton("힌트 ${step.level + 1} 보기", onNextHint, icon = CartryIcons.LineBulb)
                    CartryButton("실습 계속하기", onContinue, style = CartryButtonStyle.Secondary)
                } else {
                    CartryButton("실습 계속하기", onContinue, icon = CartryIcons.LinePlay)
                }
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
 * 힌트 목록. 세 개를 처음부터 다 보여주되, 내용은 연 것만 보인다. 시안: 1700 판 41·45·49 화면.
 * - 지나간 힌트: 접힌 줄. 초록 번호 · 제목 · 한 줄 내용 · 오른쪽 체크
 * - 지금 힌트(마지막으로 연 것): 파란 바탕 + 왼쪽 파란 줄. 2번(비슷한 기능 비교)은 「목표」·「비슷한 기능」 카드 두 장으로 보여준다
 * - 아직 안 연 힌트: 번호 · 제목 · 자물쇠. 바로 다음 차례인 것만 눌러서 열 수 있다(1 → 2 → 3 순서).
 */
@Composable
private fun HintList(lesson: Lesson, level: Int, onOpenNext: () -> Unit) {
    val s = CartryTheme.space
    Column(Modifier.fillMaxWidth().animateContentSize(), verticalArrangement = Arrangement.spacedBy(s.s16)) {
        lesson.hints.forEachIndexed { i, hint ->
            when {
                i < level - 1 -> DoneHint(i + 1, hint)
                i == level - 1 -> CurrentHint(i + 1, hint) {
                    if (i == COMPARE_HINT_INDEX) CompareCards(lesson) else CartryText(hint.body, CartryTheme.type.lead.copy(color = CartryTheme.colors.textPrimary, fontWeight = FontWeight.Normal))
                }
                else -> LockedHint(i + 1, hint.title, onOpen = if (i == level) onOpenNext else null)
            }
        }
    }
}

/** 힌트 2번(0부터 세면 1)은 「비슷한 기능 비교」 카드로 그린다. */
private const val COMPARE_HINT_INDEX = 1

@Composable
private fun CurrentHint(number: Int, hint: LessonHint, body: @Composable () -> Unit) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    val bar = c.goal
    val barWidth = s.s6
    Column(
        Modifier.fillMaxWidth().clip(CartryTheme.shapes.card)
            .background(c.goalSoft)
            .drawBehind { drawRect(bar, size = Size(barWidth.toPx(), size.height)) }
            .padding(horizontal = s.s28, vertical = s.s24),
        verticalArrangement = Arrangement.spacedBy(s.s16),
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(s.s16), verticalAlignment = Alignment.CenterVertically) {
            HintNumber(number, HintNumberStyle.Current)
            BasicText(hint.title, style = t.progressTitle.copy(color = c.textPrimary, fontWeight = FontWeight.Bold))
        }
        body()
    }
}

/** 이미 본 힌트. 접어서 한 줄 내용만 보이고, 오른쪽에 초록 체크. */
@Composable
private fun DoneHint(number: Int, hint: LessonHint) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    Row(
        Modifier.fillMaxWidth().clip(CartryTheme.shapes.card).background(c.surface).padding(horizontal = s.s24, vertical = s.s20),
        horizontalArrangement = Arrangement.spacedBy(s.s16),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        HintNumber(number, HintNumberStyle.Done)
        Column(Modifier.weight(1f)) {
            BasicText(hint.title, style = t.chip.copy(color = c.textPrimary), maxLines = 1)
            BasicText(hint.body, style = t.hintNote.copy(color = c.textSecondary), maxLines = 1)
        }
        Image(CartryIcons.LineCheck, null, Modifier.size(s.s32), colorFilter = ColorFilter.tint(c.success))
    }
}

/**
 * 「비슷한 기능 비교」 카드 두 장. 왼쪽은 목표 기능(파랑 꼬리표 「목표」), 오른쪽은 헷갈리는 기능(회색 꼬리표 「비슷한 기능」).
 * 시안: 1700 판 「45 w3 · 와이퍼 힌트2」.
 */
@Composable
private fun CompareCards(lesson: Lesson) {
    val c = CartryTheme.colors
    val s = CartryTheme.space
    val compare = lesson.compare
    // 두 카드는 글 길이와 상관없이 같은 높이(시안 363×150 두 장)
    Row(Modifier.fillMaxWidth().height(IntrinsicSize.Min), horizontalArrangement = Arrangement.spacedBy(s.s16)) {
        CompareCard(
            icon = lesson.target.icon, tag = "목표", title = compare.targetTitle, body = compare.targetBody,
            background = c.action.copy(alpha = 0.14f), tagBackground = c.goal, tagText = c.textPrimary, iconTint = c.goalBright,
            modifier = Modifier.weight(1f).fillMaxHeight(),
        )
        CompareCard(
            icon = lesson.decoy.icon, tag = "비슷한 기능", title = compare.decoyTitle, body = compare.decoyBody,
            background = c.surfaceSelected, tagBackground = c.surfaceTrack, tagText = c.textSecondary, iconTint = c.textSecondary,
            modifier = Modifier.weight(1f).fillMaxHeight(),
        )
    }
}

@Composable
private fun CompareCard(
    icon: ImageVector,
    tag: String,
    title: String,
    body: String,
    background: Color,
    tagBackground: Color,
    tagText: Color,
    iconTint: Color,
    modifier: Modifier,
) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    // 시안 모양(363×150): 좌우 여백 20 · 아이콘(그림 크기 40) · 아이콘과 글 사이 16, 꼬리표 → 제목 → 설명, 줄 사이 6
    Row(
        modifier.clip(CartryTheme.shapes.card).background(background).background(c.cardSheen).padding(horizontal = s.s20, vertical = s.s20),
        horizontalArrangement = Arrangement.spacedBy(s.s16),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(icon, null, Modifier.size(s.s40), colorFilter = ColorFilter.tint(iconTint))
        Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(s.s6)) {
            BasicText(
                tag,
                Modifier.background(tagBackground, CartryTheme.shapes.pill).padding(horizontal = s.s12),
                style = t.compareTag.copy(color = tagText),
                maxLines = 1,
            )
            BasicText(title, style = t.compareTitle.copy(color = c.textPrimary), maxLines = 2)
            BasicText(body, style = t.compareBody.copy(color = c.textSecondary), maxLines = 2)
        }
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
        BasicText(title, Modifier.weight(1f), style = t.progressTitle.copy(color = c.textTertiary, fontWeight = FontWeight.Bold))
        LockMark(c.textTertiary)
    }
}

private enum class HintNumberStyle { Current, Done }

/** 힌트 번호 동그라미. 지금 힌트 = 파랑 바탕 흰 숫자, 지나간 힌트 = 연한 초록 바탕 초록 숫자. */
@Composable
private fun HintNumber(number: Int, style: HintNumberStyle) {
    val c = CartryTheme.colors
    val (bg, fg) = when (style) {
        HintNumberStyle.Current -> c.goal to c.textPrimary
        HintNumberStyle.Done -> c.success.copy(alpha = 0.18f) to c.success
    }
    Box(
        Modifier.size(CartryTheme.space.s56).background(bg, CartryTheme.shapes.circle),
        contentAlignment = Alignment.Center,
    ) { BasicText("$number", style = CartryTheme.type.label.copy(color = fg, fontWeight = FontWeight.ExtraBold)) }
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

/** 완료 화면의 「💡 기억해요  부채꼴 버튼은 …」 한 줄. 연한 파랑 바탕. */
@Composable
private fun RememberMemo(text: String) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    Row(
        Modifier.clip(CartryTheme.shapes.card).background(c.goalSoft).padding(horizontal = s.s24, vertical = s.s14),
        horizontalArrangement = Arrangement.spacedBy(s.s10),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(CartryIcons.LineBulb, null, Modifier.size(s.s28), colorFilter = ColorFilter.tint(c.goalBright))
        BasicText("기억해요", style = t.chip.copy(color = c.goalBright), maxLines = 1)
        BasicText(text, Modifier.padding(start = s.s6), style = t.lead.copy(color = c.textPrimary), maxLines = 1)
    }
}

private fun PracticeStep.mood() = when (this) {
    PracticeStep.Mission -> BuddyMood.Idle
    PracticeStep.Wrong -> BuddyMood.Oops
    is PracticeStep.Hint -> BuddyMood.Think
    PracticeStep.Success -> BuddyMood.Cheer
}
