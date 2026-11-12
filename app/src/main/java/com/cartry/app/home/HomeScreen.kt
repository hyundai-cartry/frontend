package com.cartry.app.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.cartry.app.lesson.Lesson
import com.cartry.app.lesson.Lessons
import com.cartry.app.lesson.ProgressPlaceholder
import com.cartry.designsystem.component.BuddyMood
import com.cartry.designsystem.component.CartryAppHeader
import com.cartry.designsystem.component.CartryBuddy
import com.cartry.designsystem.component.CartryButton
import com.cartry.designsystem.component.CartryButtonStyle
import com.cartry.designsystem.component.CartryCard
import com.cartry.designsystem.component.CartryTag
import com.cartry.designsystem.component.CartryText
import com.cartry.designsystem.icon.CartryIcons
import com.cartry.designsystem.theme.CartryTheme

/**
 * 홈. 오늘의 추천(3개 중 무작위) 카드와 날씨 카드.
 * 검색·로드맵·설정·날씨·「비 오는 날 실습」은 이번 범위가 아니라 버튼만 있고 눌러도 아무 일도 없다.
 */
@Composable
fun HomeScreen(onStartLesson: (Lesson) -> Unit, viewModel: HomeViewModel = viewModel()) {
    HomeContent(lesson = viewModel.lesson, onStart = { onStartLesson(viewModel.lesson) }, onShowAnother = viewModel::showAnother)
}

@Composable
fun HomeContent(lesson: Lesson, onStart: () -> Unit, onShowAnother: () -> Unit) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    Column(Modifier.fillMaxSize().background(c.background)) {
        CartryAppHeader(section = "홈 · 초보 코스", actions = { HomeHeaderActions() })
        Column(
            Modifier.weight(1f).fillMaxWidth().padding(horizontal = s.screenHorizontal, vertical = s.s24),
            verticalArrangement = Arrangement.spacedBy(s.s16),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(s.s14)) {
                CartryBuddy(BuddyMood.Idle, Modifier.size(s.s56, s.s44))
                CartryTag("카트리")
            }
            CartryText(lesson.homeHeadline, t.talkTitle.copy(color = c.textPrimary))
            Row(
                Modifier.weight(1f).fillMaxWidth().padding(top = s.s16),
                horizontalArrangement = Arrangement.spacedBy(s.s24),
            ) {
                RecommendCard(lesson, onStart, onShowAnother, Modifier.weight(1f).fillMaxHeight())
                WeatherCard(Modifier.weight(1f).fillMaxHeight())
            }
        }
    }
}

/** 헤더 오른쪽: 진행률 · 검색창 · 로드맵 · 설정. 모두 버튼 모양만 있다. */
@Composable
private fun RowScope.HomeHeaderActions() {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    Row(
        Modifier.height(s.minTouch).background(c.surface, CartryTheme.shapes.pill).padding(horizontal = s.s28),
        horizontalArrangement = Arrangement.spacedBy(s.s10),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        BasicText(ProgressPlaceholder.LEVEL_NAME, style = t.label.copy(color = c.textPrimary))
        BasicText("${ProgressPlaceholder.LEVEL_PERCENT}%", style = t.label.copy(color = c.goalLabel))
    }
    Row(
        Modifier.height(s.minTouch).width(s.s56 * 6).background(c.surface, CartryTheme.shapes.pill)
            .padding(start = s.s28, end = s.s8),
        horizontalArrangement = Arrangement.spacedBy(s.s14),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(CartryIcons.LineSearch, null, Modifier.size(s.s32), colorFilter = ColorFilter.tint(c.textSecondary))
        BasicText("말하거나 입력해 주세요", Modifier.weight(1f), style = t.bodySmall.copy(color = c.textTertiary), maxLines = 1)
        Box(Modifier.size(s.s56).background(c.goal, CartryTheme.shapes.circle), contentAlignment = Alignment.Center) {
            Image(CartryIcons.LineMic, null, Modifier.size(s.s28), colorFilter = ColorFilter.tint(c.textPrimary))
        }
    }
    CartryButton("로드맵", onClick = {}, style = CartryButtonStyle.Secondary, icon = CartryIcons.LineBook)
    CartryButton("설정", onClick = {}, style = CartryButtonStyle.Secondary)
}

@Composable
private fun RecommendCard(lesson: Lesson, onStart: () -> Unit, onShowAnother: () -> Unit, modifier: Modifier) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    CartryCard(modifier, contentPadding = PaddingValues(s.s40)) {
        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
            Column(verticalArrangement = Arrangement.spacedBy(s.s12)) {
                CartryTag("오늘의 추천 · 기본 기능")
                BasicText(lesson.homeTitle, style = t.tileTitle.copy(color = c.textPrimary))
                CartryText(lesson.homeSubtitle, t.rowBody.copy(color = c.textSecondary))
            }
            Row(horizontalArrangement = Arrangement.spacedBy(s.s16)) {
                CartryButton("실습 시작", onStart, icon = CartryIcons.LineArrow)
                CartryButton("다른 기능 보기", onShowAnother, style = CartryButtonStyle.Secondary)
            }
        }
    }
}

/** 날씨 카드. 날씨 기능은 이번 범위가 아니라 시안 문구를 그대로 보여주고, 버튼은 눌러도 반응하지 않는다. */
@Composable
private fun WeatherCard(modifier: Modifier) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    CartryCard(modifier, contentPadding = PaddingValues(s.s40)) {
        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
            Column(verticalArrangement = Arrangement.spacedBy(s.s16)) {
                BasicText("오늘 날씨 · 서울 강남 · 14°", style = t.bodySmall.copy(color = c.textSecondary), maxLines = 1)
                Row(horizontalArrangement = Arrangement.spacedBy(s.s10)) {
                    listOf("지금 비", "15시 비", "18시 강수 80%").forEach { WeatherChip(it) }
                }
                CartryText("비 오는 날엔\n와이퍼 AUTO", t.tileTitle.copy(color = c.textPrimary))
                CartryText("약 2분 · 와이퍼 레버를 AUTO에 맞춰요", t.rowBody.copy(color = c.textSecondary))
            }
            CartryButton("비 오는 날 실습", onClick = {}, style = CartryButtonStyle.Secondary, icon = CartryIcons.LineArrow)
        }
    }
}

@Composable
private fun WeatherChip(text: String) {
    val c = CartryTheme.colors
    val s = CartryTheme.space
    BasicText(
        text,
        Modifier.background(c.surfaceSelected, CartryTheme.shapes.pill).padding(horizontal = s.s14, vertical = s.s6),
        style = CartryTheme.type.caption.copy(color = c.textPrimary),
        maxLines = 1,
    )
}

@Preview(widthDp = 1700, heightDp = 1184)
@Composable
private fun HomePreview() = CartryTheme { HomeContent(Lessons.Defrost, {}, {}) }
