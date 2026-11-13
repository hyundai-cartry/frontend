package com.cartry.app.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.cartry.app.R
import com.cartry.app.lesson.Lesson
import com.cartry.app.lesson.Lessons
import com.cartry.app.lesson.ProgressPlaceholder
import com.cartry.designsystem.component.BuddyMood
import com.cartry.designsystem.component.CartryAppHeader
import com.cartry.designsystem.component.CartryBuddy
import com.cartry.designsystem.component.CartryButton
import com.cartry.designsystem.component.CartryButtonStyle
import com.cartry.designsystem.component.CartryCard
import com.cartry.designsystem.component.CartryText
import com.cartry.designsystem.icon.CartryIcons
import com.cartry.designsystem.theme.CartryTheme

/**
 * 홈. 오늘의 추천(3개 중 무작위) 카드와 날씨 카드. 시안: 1700 판 「38 home1 · 초보 홈(랜덤 추천)」.
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
    Box(Modifier.fillMaxSize().background(c.background)) {
        AppBackdrop()
        Column(Modifier.fillMaxSize()) {
            CartryAppHeader(section = "홈 · 초보 코스", actions = { HomeHeaderActions() })
            Column(Modifier.weight(1f).fillMaxWidth().padding(start = s.screenHorizontal, end = s.screenHorizontal, bottom = s.s44)) {
                // 카트리 + 이름. 마스코트는 96×72 로 크게 둔다
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(s.s14)) {
                    CartryBuddy(BuddyMood.Idle, Modifier.size(s.s48 * 2, s.s36 * 2))
                    BasicText("카트리", style = t.caption.copy(color = c.goal))
                }
                CartryText(lesson.homeHeadline, t.talkTitle.copy(color = c.textPrimary))
                Spacer(Modifier.height(s.s24))
                Row(Modifier.weight(1f).fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(s.s24)) {
                    RecommendCard(lesson, onStart, onShowAnother, Modifier.weight(1f).fillMaxHeight())
                    WeatherCard(Modifier.weight(1f).fillMaxHeight())
                }
            }
        }
    }
}

/** 앱 바탕 오른쪽 위의 옅은 동심원 무늬(시안의 app 바탕 이미지). */
@Composable
internal fun BoxScope.AppBackdrop() {
    Image(painterResource(R.drawable.bg_app), null, Modifier.matchParentSize(), contentScale = ContentScale.Crop)
}

/** 헤더 오른쪽: 진행률 · 검색창 · 로드맵 · 설정. 모두 버튼 모양만 있다. */
@Composable
private fun RowScope.HomeHeaderActions() {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    HeaderPill(contentPadding = s.s14) {
        LevelRing(ProgressPlaceholder.LEVEL_PERCENT)
        BasicText(ProgressPlaceholder.LEVEL_NAME, style = t.label.copy(color = c.textPrimary, fontWeight = FontWeight.Black))
        BasicText("${ProgressPlaceholder.LEVEL_PERCENT}%", style = t.label.copy(color = c.textSecondary, fontWeight = FontWeight.SemiBold))
    }
    Row(
        Modifier.height(s.minTouch).width(s.headerSearchWidth).clip(CartryTheme.shapes.pill).background(c.surfaceSelected)
            .padding(start = s.s28, end = s.s10),
        horizontalArrangement = Arrangement.spacedBy(s.s14),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(CartryIcons.LineSearch, null, Modifier.size(s.s32), colorFilter = ColorFilter.tint(c.textPrimary))
        BasicText("말하거나 입력해 주세요", Modifier.weight(1f), style = t.label.copy(color = c.textSecondary, fontWeight = FontWeight.Medium), maxLines = 1)
        Box(Modifier.size(s.s56).background(c.action, CartryTheme.shapes.circle), contentAlignment = Alignment.Center) {
            Image(CartryIcons.LineMic, null, Modifier.size(s.s28), colorFilter = ColorFilter.tint(c.textPrimary))
        }
    }
    HeaderPill(onClick = {}, onClickLabel = "로드맵") {
        Image(CartryIcons.LineMap, null, Modifier.size(s.s32), colorFilter = ColorFilter.tint(c.textPrimary))
        BasicText("로드맵", style = t.label.copy(color = c.textPrimary))
    }
    Box(
        Modifier.size(s.minTouch).clip(CartryTheme.shapes.circle).background(c.surfaceSelected)
            .clickable(role = Role.Button, onClickLabel = "설정", onClick = {}),
        contentAlignment = Alignment.Center,
    ) {
        Image(CartryIcons.LineSettings, null, Modifier.size(s.s32), colorFilter = ColorFilter.tint(c.textPrimary))
    }
}

/**
 * 헤더의 알약(진행률·로드맵). 시안은 높이 68 이지만 누르는 영역 76 규칙에 맞춰 76 으로 둔다.
 * 바탕은 카드보다 한 단계 밝은 surfaceSelected(#44464E).
 */
@Composable
private fun HeaderPill(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    onClickLabel: String? = null,
    contentPadding: Dp = CartryTheme.space.s24,
    content: @Composable RowScope.() -> Unit,
) {
    val s = CartryTheme.space
    var m = modifier.height(s.minTouch).clip(CartryTheme.shapes.pill).background(CartryTheme.colors.surfaceSelected)
    if (onClick != null) m = m.clickable(role = Role.Button, onClickLabel = onClickLabel, onClick = onClick)
    Row(
        m.padding(horizontal = contentPadding),
        horizontalArrangement = Arrangement.spacedBy(s.s10),
        verticalAlignment = Alignment.CenterVertically,
        content = content,
    )
}

/** 레벨 진행 고리. 빈 칸은 진행 막대 빈 칸 색, 채운 칸은 파랑. */
@Composable
private fun LevelRing(percent: Int) {
    val c = CartryTheme.colors
    val stroke = CartryTheme.space.s6
    Canvas(Modifier.size(CartryTheme.space.s44)) {
        val w = stroke.toPx()
        val arcSize = Size(size.width - w, size.height - w)
        val topLeft = Offset(w / 2, w / 2)
        drawArc(c.surfaceTrack, 0f, 360f, useCenter = false, topLeft = topLeft, size = arcSize, style = Stroke(w))
        drawArc(c.goal, -90f, 360f * percent / 100f, useCenter = false, topLeft = topLeft, size = arcSize, style = Stroke(w, cap = StrokeCap.Round))
    }
}

@Composable
private fun RecommendCard(lesson: Lesson, onStart: () -> Unit, onShowAnother: () -> Unit, modifier: Modifier) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    PhotoCard(R.drawable.home_hero_defrost, modifier, decoration = { FocusMark(lesson.target.label) }) {
        Column(verticalArrangement = Arrangement.spacedBy(s.s12)) {
            Row(horizontalArrangement = Arrangement.spacedBy(s.s10), verticalAlignment = Alignment.CenterVertically) {
                Image(lesson.target.icon, null, Modifier.size(s.s32), colorFilter = ColorFilter.tint(c.goal))
                BasicText("오늘의 추천 · 기본 기능", style = t.eyebrow.copy(color = c.goal), maxLines = 1)
            }
            BasicText(lesson.homeTitle, style = t.cardTitle.copy(color = c.textPrimary))
            CartryText(lesson.homeSubtitle, t.meta.copy(color = c.textSecondary))
        }
        Row(horizontalArrangement = Arrangement.spacedBy(s.s16)) {
            CartryButton("실습 시작", onStart, icon = CartryIcons.LineArrow)
            CartryButton("다른 기능 보기", onShowAnother, style = CartryButtonStyle.Secondary)
        }
    }
}

/** 날씨 카드. 날씨 기능은 이번 범위가 아니라 시안 문구를 그대로 보여주고, 버튼은 눌러도 반응하지 않는다. */
@Composable
private fun WeatherCard(modifier: Modifier) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    PhotoCard(R.drawable.home_hero_weather, modifier) {
        Column(verticalArrangement = Arrangement.spacedBy(s.s12)) {
            BasicText("오늘 날씨 · 서울 강남 · 14°", style = t.eyebrow.copy(color = c.textSecondary), maxLines = 1)
            Row(horizontalArrangement = Arrangement.spacedBy(s.s8)) {
                listOf("지금" to "비", "15시" to "비", "18시" to "강수 80%").forEach { (time, sky) -> WeatherChip(time, sky) }
            }
            CartryText("비 오는 날엔\n와이퍼 AUTO", t.cardTitle.copy(color = c.textPrimary))
            CartryText("약 2분 · 와이퍼 레버를 AUTO에 맞춰요", t.meta.copy(color = c.textSecondary))
        }
        CartryButton("비 오는 날 실습", onClick = {}, style = CartryButtonStyle.Secondary, icon = CartryIcons.LineArrow)
    }
}

/** 사진 위 알약: 「지금」(굵게) + 「비」(보통). */
@Composable
private fun WeatherChip(time: String, sky: String) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    val text = buildAnnotatedString {
        withStyle(SpanStyle(color = c.textPrimary)) { append(time) }
        append(" ")
        withStyle(SpanStyle(color = c.textSecondary, fontWeight = FontWeight.Medium)) { append(sky) }
    }
    BasicText(
        text,
        Modifier.background(c.chipOnPhoto, CartryTheme.shapes.pill).padding(horizontal = s.s16, vertical = s.s6),
        style = t.chip,
        maxLines = 1,
    )
}

/**
 * 사진 카드. 아래에서부터 사진 → 위아래 그늘 → 남색 틴트(COLOR 블렌드 30%) → decoration → 글자·버튼 순서로 쌓는다.
 * content 는 위(설명)와 아래(버튼) 두 덩어리를 넣으면 위아래 끝으로 벌려 놓는다.
 */
@Composable
private fun PhotoCard(
    @DrawableRes photo: Int,
    modifier: Modifier,
    decoration: @Composable BoxScope.() -> Unit = {},
    content: @Composable ColumnScope.() -> Unit,
) {
    val c = CartryTheme.colors
    CartryCard(modifier) {
        Image(painterResource(photo), null, Modifier.matchParentSize(), contentScale = ContentScale.Crop)
        Box(Modifier.matchParentSize().background(c.photoShade))
        Box(Modifier.matchParentSize().drawBehind { drawRect(c.photoTint, blendMode = BlendMode.Color) })
        decoration()
        Column(
            Modifier.fillMaxSize().padding(CartryTheme.space.s40),
            verticalArrangement = Arrangement.SpaceBetween,
            content = content,
        )
    }
}

/**
 * 추천 카드 사진 위 표시: 십자선 + 꺾쇠 + 기능 이름. 시안에서 꺾쇠는 사진 속 버튼 자리에 놓여 있어서,
 * 위치를 카드 크기에 대한 비율로 둔다(시안 782×864 카드 기준: 가운데 303,495 · 꺾쇠 132 · 이름 384,400).
 */
@Composable
private fun BoxScope.FocusMark(label: String) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val s = CartryTheme.space
    BoxWithConstraints(Modifier.matchParentSize()) {
        val cx = maxWidth * 0.3875f
        val cy = maxHeight * 0.573f
        val bracket = maxWidth * 0.169f
        Canvas(Modifier.fillMaxSize()) {
            val w = (s.s6 / 2).toPx()
            drawLine(c.photoGuide, Offset(0f, cy.toPx()), Offset(size.width, cy.toPx()), w)
            drawLine(c.photoGuide, Offset(cx.toPx(), 0f), Offset(cx.toPx(), size.height), w)
        }
        Image(
            painterResource(R.drawable.home_hero_focus), null,
            Modifier.offset(cx - bracket / 2, cy - bracket / 2).size(bracket),
        )
        BasicText(
            label,
            Modifier.offset(maxWidth * 0.491f, maxHeight * 0.463f),
            style = t.progressTitle.copy(color = c.textPrimary),
            maxLines = 1,
        )
    }
}

@Preview(widthDp = 1700, heightDp = 1184)
@Composable
private fun HomePreview() = CartryTheme { HomeContent(Lessons.Defrost, {}, {}) }
