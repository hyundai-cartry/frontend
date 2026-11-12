package com.cartry.app.practice

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.cartry.app.lesson.Lessons
import com.cartry.app.lesson.ProgressPlaceholder
import com.cartry.app.practice.component.CarPanel
import com.cartry.app.practice.component.PracticeLeftPane
import com.cartry.designsystem.component.CartryAppHeader
import com.cartry.designsystem.component.CartryCard
import com.cartry.designsystem.theme.CartryTheme

/** 실습 화면. 미션·오작동·힌트·완료 4단계를 이 화면 하나가 [PracticeUiState.step] 에 따라 바꿔 그린다. */
@Composable
fun PracticeScreen(
    onBack: () -> Unit,
    onHome: () -> Unit,
    viewModel: PracticeViewModel = viewModel(),
) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    PracticeContent(
        state = state,
        onBack = onBack,
        onHome = onHome,
        onShowHint = viewModel::showHint,
        onNextHint = viewModel::nextHint,
        onContinue = viewModel::continuePractice,
        onRetry = viewModel::retry,
    )
}

/** ViewModel 없이 상태만 받아 그리는 부분. 미리보기 창에서 단계별로 확인할 수 있다. */
@Composable
fun PracticeContent(
    state: PracticeUiState,
    onBack: () -> Unit,
    onHome: () -> Unit,
    onShowHint: () -> Unit,
    onNextHint: () -> Unit,
    onContinue: () -> Unit,
    onRetry: () -> Unit,
) {
    val c = CartryTheme.colors
    val s = CartryTheme.space
    Box(Modifier.fillMaxSize().background(c.background)) {
        Column(Modifier.fillMaxSize()) {
            CartryAppHeader(section = "오늘의 추천", onBack = onBack, onMore = { /* 이번 범위 밖: 버튼만 둔다 */ })
            Row(
                Modifier.weight(1f).fillMaxWidth().padding(horizontal = s.screenHorizontal, vertical = s.s24),
                horizontalArrangement = Arrangement.spacedBy(s.s48),
            ) {
                // 단계가 바뀌면 왼쪽 전체를 크로스페이드(앞 화면이 사라지며 뒤 화면이 겹쳐 나타남)
                AnimatedContent(
                    targetState = state.step,
                    modifier = Modifier.weight(0.42f).fillMaxHeight(),
                    transitionSpec = { fadeIn(tween(400)) togetherWith fadeOut(tween(250)) },
                    // 힌트 1 → 2 → 3 은 같은 화면에서 내용만 펼친다(왼쪽 전체를 크로스페이드하지 않음)
                    contentKey = { if (it is PracticeStep.Hint) "hint" else it },
                    label = "practiceStep",
                ) { step ->
                    PracticeLeftPane(
                        lesson = state.lesson,
                        step = step,
                        targetOn = state.targetOn,
                        decoyOn = state.decoyOn,
                        onShowHint = onShowHint,
                        onNextHint = onNextHint,
                        onContinue = onContinue,
                        onHome = onHome,
                        onRetry = onRetry,
                    )
                }
                PracticeRightPane(state, Modifier.weight(0.58f).fillMaxHeight())
            }
        }
        CarToast(
            text = state.carToast,
            // 헤더 줄 오른쪽, 더보기 버튼 왼쪽에 띄운다. 가운데에 두면 좁은 창(1700)에서 「오늘의 추천」 글자와 겹친다.
            modifier = Modifier.align(Alignment.TopEnd).padding(top = s.s20, end = s.screenHorizontal + s.minTouch + s.s24),
        )
    }
}

/** 오른쪽: 차 화면 흉내 + 완료 때 초록 빛과 달성률 카드. */
@Composable
private fun PracticeRightPane(state: PracticeUiState, modifier: Modifier) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    val success = state.step == PracticeStep.Success
    val glow by animateFloatAsState(if (success) 1f else 0f, tween(700), label = "successGlow")

    Box(modifier) {
        // 완료 때 패널 뒤로 퍼지는 초록 빛
        Box(
            Modifier.fillMaxSize().alpha(glow)
                .background(Brush.radialGradient(listOf(c.successSoft, Color.Transparent)))
        )
        CarPanel(
            lesson = state.lesson,
            step = state.step,
            targetOn = state.targetOn,
            decoyOn = state.decoyOn,
            modifier = Modifier.align(Alignment.Center).fillMaxWidth(),
        )
        AnimatedVisibility(visible = success, enter = fadeIn(tween(500)), exit = fadeOut(), modifier = Modifier.align(Alignment.TopStart)) {
            CartryCard(contentPadding = PaddingValues(s.s24)) {
                Column(verticalArrangement = Arrangement.spacedBy(s.s8)) {
                    BasicText("내 차 기능 달성률", style = t.label.copy(color = c.textTertiary))
                    Row(verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.spacedBy(s.s8)) {
                        BasicText("${ProgressPlaceholder.ACHIEVEMENT_PERCENT}", style = t.display.copy(color = c.success))
                        BasicText("%", Modifier.padding(bottom = s.s20), style = t.sectionTitle.copy(color = c.textSecondary))
                    }
                }
            }
        }
    }
}

/** 위쪽 가운데 알림 띠: 「● 차에서 ○○을 눌렀어요」. 차에서 정답 입력이 들어오면 먼저 뜬다. */
@Composable
private fun CarToast(text: String?, modifier: Modifier = Modifier) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    // 사라지는 동안(text == null)에도 글자가 남아 있도록 마지막 문구를 기억한다
    var lastText by remember { mutableStateOf("") }
    LaunchedEffect(text) { if (text != null) lastText = text }
    AnimatedVisibility(
        visible = text != null,
        modifier = modifier,
        enter = fadeIn(tween(300)) + slideInVertically(tween(300)) { -it / 2 },
        exit = fadeOut(tween(200)),
    ) {
        Row(
            Modifier.background(c.surface, CartryTheme.shapes.pill).padding(horizontal = s.s28, vertical = s.s14),
            horizontalArrangement = Arrangement.spacedBy(s.s14),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(Modifier.size(s.s14).background(c.goal, CartryTheme.shapes.circle))
            BasicText("차에서", style = t.label.copy(color = c.goalLabel))
            BasicText(text ?: lastText, style = t.bodySmall.copy(color = c.textPrimary))
        }
    }
}

// ───── 미리보기: 단계별 모습. Pleos 가로 창(1700×1184) 기준 ─────

@Composable
private fun PreviewStep(step: PracticeStep, targetOn: Boolean, decoyOn: Boolean, toast: Boolean = false) = CartryTheme {
    val lesson = Lessons.Defrost
    PracticeContent(
        PracticeUiState(lesson, step, targetOn, decoyOn, if (toast) lesson.carToast else null),
        {}, {}, {}, {}, {}, {},
    )
}

@Preview(widthDp = 1700, heightDp = 1184) @Composable private fun PreviewMission() = PreviewStep(PracticeStep.Mission, false, false)
@Preview(widthDp = 1700, heightDp = 1184) @Composable private fun PreviewWrong() = PreviewStep(PracticeStep.Wrong, false, true)
@Preview(widthDp = 1700, heightDp = 1184) @Composable private fun PreviewHint() = PreviewStep(PracticeStep.Hint(2), false, false)
@Preview(widthDp = 1700, heightDp = 1184) @Composable private fun PreviewSuccess() = PreviewStep(PracticeStep.Success, true, false, toast = true)
