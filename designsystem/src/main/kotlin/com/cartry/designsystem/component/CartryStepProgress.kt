package com.cartry.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.cartry.designsystem.theme.CartryTheme

/**
 * 진행 표시(시안의 prog). 위 줄은 [카트리] 「1/4」 「엑셀/브레이크」, 아래는 칸 막대. 두 줄 사이 18.
 * 글자 32, 카트리 58×43. 칸 하나는 160×14 고정이고 칸 사이 8 이다(사용자 결정: 칸 폭은 화면 폭을 따라 늘어나지 않는다).
 *
 * @param current 지금 단계(1부터). 이 칸은 파랑.
 * @param done 끝낸 단계 수. 1..done 칸은 초록. 지금 단계를 끝낸 순간에는 done = current.
 * @param mood 맨 앞 카트리 표정. null 이면 카트리를 그리지 않는다.
 */
@Composable
fun CartryStepProgress(
    current: Int,
    total: Int,
    title: String,
    modifier: Modifier = Modifier,
    done: Int = current - 1,
    counter: String = "$current/$total",
    mood: BuddyMood? = BuddyMood.Idle,
) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    Column(modifier, verticalArrangement = Arrangement.spacedBy(18.dp)) {
        Row(Modifier.height(38.dp), horizontalArrangement = Arrangement.spacedBy(14.dp), verticalAlignment = Alignment.CenterVertically) {
            // 카트리(43)는 글자 줄(38)보다 커서 위아래로 조금 넘친다(시안도 같다)
            if (mood != null) CartryBuddy(mood, Modifier.wrapContentHeight(unbounded = true).size(58.dp, 43.dp))
            // 「1/4」 뒤는 칸 사이 14 에 13 을 더 띄운다(시안 b 의 margin-right)
            BasicText(counter, Modifier.padding(end = 13.dp), style = t.progressCounter.copy(color = c.goal), maxLines = 1)
            BasicText(title, style = t.progressTitle.copy(color = c.textSecondary), maxLines = 1, overflow = TextOverflow.Ellipsis)
        }
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            for (i in 1..total) {
                val color = when {
                    i <= done -> c.success
                    i == current -> c.goal
                    else -> c.surfaceTrack
                }
                Box(Modifier.size(width = 160.dp, height = 14.dp).background(color, CartryTheme.shapes.pill))
            }
        }
    }
}

/** 온보딩 쪽 넘김 점. 지금 쪽은 파란 긴 막대 96, 나머지는 48. */
@Composable
fun CartryPageDots(count: Int, current: Int, modifier: Modifier = Modifier) {
    val c = CartryTheme.colors
    Row(modifier, horizontalArrangement = Arrangement.spacedBy(12.dp)) {
        for (i in 0 until count) {
            val on = i == current
            Box(Modifier.size(width = if (on) 96.dp else 48.dp, height = 12.dp).background(if (on) c.goal else c.textDisabled, CartryTheme.shapes.pill))
        }
    }
}
