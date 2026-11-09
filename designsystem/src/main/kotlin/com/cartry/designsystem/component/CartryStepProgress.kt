package com.cartry.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.cartry.designsystem.theme.CartryTheme

/**
 * 진행 표시(시안의 prog). 위에 「1/4 브레이크」 캡션, 아래에 칸 막대.
 * 칸 하나는 150×14 고정이다(사용자 결정: 칸 폭은 화면 폭을 따라 늘어나지 않는다).
 *
 * @param current 지금 단계(1부터). 이 칸은 파랑.
 * @param done 끝낸 단계 수. 1..done 칸은 초록. 지금 단계를 끝낸 순간에는 done = current.
 */
@Composable
fun CartryStepProgress(
    current: Int,
    total: Int,
    title: String,
    modifier: Modifier = Modifier,
    done: Int = current - 1,
    counter: String = "$current/$total",
) {
    val c = CartryTheme.colors
    Column(modifier, verticalArrangement = Arrangement.spacedBy(14.dp)) {
        Row(verticalAlignment = Alignment.Bottom) {
            BasicText(counter, style = CartryTheme.type.progressCounter.copy(color = c.goal), maxLines = 1)
            Spacer(Modifier.width(16.dp))
            BasicText(title, style = CartryTheme.type.progressTitle.copy(color = c.textSecondary), maxLines = 1, overflow = TextOverflow.Ellipsis)
        }
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            for (i in 1..total) {
                val color = when {
                    i <= done -> c.success
                    i == current -> c.goal
                    else -> c.surfaceTrack
                }
                Box(Modifier.size(width = 150.dp, height = 14.dp).background(color, CartryTheme.shapes.pill))
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
