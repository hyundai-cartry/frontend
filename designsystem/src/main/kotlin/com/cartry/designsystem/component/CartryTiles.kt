package com.cartry.designsystem.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.cartry.designsystem.icon.CartryIcons
import com.cartry.designsystem.theme.CartryTheme
import com.cartry.designsystem.theme.innerShadows
import com.cartry.designsystem.theme.outerShadows

/**
 * 단계 타일(튜토리얼 4칸). 번호 동그라미 + 3D 아이콘 + 이름 + 설명.
 * selected = true 면 지금 할 단계: 파란 그라데이션 바탕, 글자 흰색, 번호 동그라미 흰 바탕.
 */
@Composable
fun CartryStepTile(
    number: Int,
    title: String,
    subtitle: String,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    selected: Boolean = false,
    onClick: (() -> Unit)? = null,
) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    val shape = CartryTheme.shapes.card
    val m = modifier.let { if (onClick != null) it.clickable(onClick = onClick) else it }
    val body: @Composable androidx.compose.foundation.layout.BoxScope.() -> Unit = {
        Box(
            Modifier.offset(x = 4.dp, y = (-4).dp).size(52.dp).background(if (selected) Color.White else c.surfaceTrack, CartryTheme.shapes.circle),
            contentAlignment = Alignment.Center,
        ) { BasicText("$number", style = t.label.copy(fontSize = 28.sp, fontWeight = FontWeight(800), letterSpacing = 0.em, color = if (selected) c.goal else c.textPrimary)) }
        Image(icon, null, Modifier.align(Alignment.TopCenter).padding(top = 24.dp).size(260.dp))
        Column(Modifier.align(Alignment.BottomStart)) {
            CartryText(title, style = t.tileTitle.copy(color = c.textPrimary))
            Spacer(Modifier.height(10.dp))
            CartryText(subtitle, style = t.tileBody.copy(color = if (selected) Color.White else c.textTertiary))
        }
    }
    if (selected) {
        CartrySelectedSurface(m, shape, PaddingValues(40.dp), body)
    } else {
        CartryCard(m, contentPadding = PaddingValues(40.dp), content = body)
    }
}

@Composable
private fun CartrySelectedSurface(
    modifier: Modifier,
    shape: androidx.compose.ui.graphics.Shape,
    padding: PaddingValues,
    content: @Composable androidx.compose.foundation.layout.BoxScope.() -> Unit,
) {
    val e = CartryTheme.elevation.selectedTile
    Box(
        modifier
            .outerShadows(e, shape)
            .background(CssLinearGradient(160f, listOf(0f to Color(0xFF3DA2FF), 0.5f to Color(0xFF0082FF), 1f to Color(0xFF006BD9))), shape)
            .innerShadows(e, shape)
            .padding(padding),
        content = content,
    )
}

/**
 * 카테고리 타일(검색 4칸). 이름 + 설명 + 완료 수 + 오른쪽 아래 3D 아이콘. selected 면 바탕이 한 단계 밝다.
 */
@Composable
fun CartryCategoryTile(
    title: String,
    subtitle: String,
    count: Int,
    total: Int,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    selected: Boolean = false,
    onClick: (() -> Unit)? = null,
) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    CartryCard(
        modifier.heightIn(min = 324.dp).let { if (onClick != null) it.clickable(onClick = onClick) else it },
        selected = selected,
        contentPadding = PaddingValues(horizontal = 36.dp, vertical = 32.dp),
    ) {
        Image(icon, null, Modifier.align(Alignment.BottomEnd).offset(x = 16.dp, y = 16.dp).size(200.dp))
        // 높이 324 - 위아래 여백 64 = 260 안에서 제목 묶음은 위, 완료 수는 아래로 붙인다
        Column(Modifier.fillMaxWidth().heightIn(min = 260.dp), verticalArrangement = Arrangement.SpaceBetween) {
            Column {
                CartryText(title, style = t.cardTitle.copy(color = c.textPrimary))
                Spacer(Modifier.height(8.dp))
                CartryText(subtitle, style = t.bodySmall.copy(color = c.textTertiary))
            }
            BasicText(
                buildAnnotatedString {
                    append("$count")
                    withStyle(SpanStyle(fontSize = 28.sp, fontWeight = FontWeight(600), color = c.textTertiary)) { append(" / $total 완료") }
                },
                style = t.display.copy(fontSize = 56.sp, lineHeight = 56.sp, letterSpacing = (-0.03).em, color = c.textPrimary),
            )
        }
    }
}

/**
 * 목록 행(시안의 row). 3D 아이콘 150 + 제목 42 + 설명 30 + 오른쪽 꺾쇠. 누르면 다른 화면으로 간다.
 */
@Composable
fun CartryListRow(
    title: String,
    subtitle: String,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    CartryCard(
        modifier.fillMaxWidth().let { if (onClick != null) it.clickable(onClick = onClick) else it },
        contentPadding = PaddingValues(horizontal = 28.dp, vertical = 24.dp),
    ) {
        Row(Modifier.fillMaxWidth().align(Alignment.Center), verticalAlignment = Alignment.CenterVertically) {
            Image(icon, null, Modifier.size(150.dp))
            Spacer(Modifier.width(24.dp))
            Column(Modifier.weight(1f)) {
                BasicText(title, style = t.rowTitle.copy(color = c.textPrimary), maxLines = 1)
                Spacer(Modifier.height(8.dp))
                BasicText(subtitle, style = t.rowBody.copy(color = c.textTertiary), maxLines = 1)
            }
            Spacer(Modifier.width(24.dp))
            Image(CartryIcons.LineChev, null, Modifier.size(28.dp), colorFilter = ColorFilter.tint(c.textTertiary))
        }
    }
}
