package com.cartry.designsystem.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cartry.designsystem.icon.buddyVector
import com.cartry.designsystem.theme.CartryTheme

/** 카트리 표정. 차 앞 빛줄 색과 머리 위 표시가 같이 바뀐다. */
enum class BuddyMood {
    /** 평상시: 파란 빛줄 */
    Idle,

    /** 당황(오작동): 빨간 빛줄 + 느낌표 */
    Oops,

    /** 생각(힌트): 파란 빛줄 + 물음표 */
    Think,

    /** 축하(달성): 초록 빛줄 + 반짝이 */
    Cheer,
}

/** 카트리 마스코트. 원본 비율 300×224. 비 오는 날 화면이면 rain = true 로 물방울을 띄운다. */
@Composable
fun CartryBuddy(mood: BuddyMood, modifier: Modifier = Modifier, rain: Boolean = false) {
    val c = CartryTheme.colors
    val vector = remember(mood, rain, c) {
        buddyVector(
            bar = when (mood) {
                BuddyMood.Idle -> c.buddyBar
                BuddyMood.Oops -> c.danger
                BuddyMood.Think -> c.goal
                BuddyMood.Cheer -> c.success
            },
            eyesIdle = if (mood == BuddyMood.Idle) 1f else 0f,
            eyesOops = if (mood == BuddyMood.Oops) 1f else 0f,
            eyesThink = if (mood == BuddyMood.Think) 1f else 0f,
            eyesHappy = if (mood == BuddyMood.Cheer) 1f else 0f,
            markOops = if (mood == BuddyMood.Oops) 1f else 0f,
            markThink = if (mood == BuddyMood.Think) 1f else 0f,
            markCheer = if (mood == BuddyMood.Cheer) 1f else 0f,
            markRain = if (rain) 1f else 0f,
            red = c.danger, blue = c.goal, green = c.success,
        )
    }
    Image(rememberVectorPainter(vector), contentDescription = "카트리", modifier = modifier)
}

/**
 * 카트리가 하는 말(시안의 talk). 화면 맨 위 제목과 설명이다. 시안 6.93 부터 말풍선 카드 없이 글자만 놓는다.
 *
 * - compact = true : 왼쪽 글 칸(실습 화면). 제목 52 + 11 아래 설명 27. 카트리와 이름은 그리지 않는다(mood, speaker 무시).
 * - compact = false: 넓은 화면(홈 등). 왼쪽 위에 카트리(96×72), 그 오른쪽에 파란 이름 「카트리」(26), 12 아래 제목 52.
 *   카트리는 이름 줄보다 22 위로 올라가 그려진다(시안과 같다). 위에 22 이상 빈 곳을 둔다.
 */
@Composable
fun CartryTalk(
    title: String,
    modifier: Modifier = Modifier,
    body: String? = null,
    mood: BuddyMood = BuddyMood.Idle,
    compact: Boolean = false,
    speaker: String = "카트리",
) {
    val c = CartryTheme.colors
    val t = CartryTheme.type
    if (compact) {
        Column(modifier.fillMaxWidth()) {
            CartryText(title, style = t.talkTitleCompact.copy(color = c.textPrimary), balance = true)
            if (body != null) {
                Spacer(Modifier.height(11.dp))
                CartryText(body, style = t.lead.copy(color = c.lead))
            }
        }
    } else {
        Box(modifier.fillMaxWidth()) {
            CartryBuddy(mood, Modifier.offset(y = (-22).dp).size(96.dp, 72.dp))
            Column {
                Box(Modifier.padding(start = 110.dp).height(40.dp), contentAlignment = Alignment.CenterStart) {
                    BasicText(speaker, style = t.caption.copy(color = c.goal), maxLines = 1)
                }
                Spacer(Modifier.height(12.dp))
                CartryText(title, style = t.talkTitle.copy(color = c.textPrimary), balance = true)
                if (body != null) {
                    Spacer(Modifier.height(14.dp))
                    CartryText(body, style = t.lead.copy(fontSize = 34.sp, lineHeight = 50.sp, color = c.lead))
                }
            }
        }
    }
}
