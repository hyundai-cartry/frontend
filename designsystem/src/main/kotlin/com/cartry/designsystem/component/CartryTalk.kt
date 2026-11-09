package com.cartry.designsystem.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
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
import androidx.compose.ui.unit.em
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
 * 카트리 말풍선(시안의 talk). 앱이 사용자에게 하는 말은 전부 이 말풍선으로 나온다.
 *
 * - compact = false: 넓은 말풍선. 제목 60, 카트리는 말풍선 안 오른쪽 아래(170×129).
 * - compact = true : 왼쪽 좁은 열(미션 화면). 제목 56, 카트리는 「카트리」 이름 왼쪽(84×64).
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
    // 카트리는 말풍선 안쪽 여백 바깥(말풍선 테두리 기준)에 놓는다. 여백 안에 두면 높이가 눌려 작아진다.
    if (compact) {
        CartrySurface(modifier.fillMaxWidth(), c.surface, sheen = false, elevation = CartryTheme.elevation.bubble) {
            CartryBuddy(mood, Modifier.padding(start = 22.dp, top = 14.dp).size(84.dp, 64.dp))
            Column(Modifier.padding(start = 32.dp, end = 32.dp, top = 30.dp, bottom = 38.dp)) {
                Box(Modifier.padding(start = 96.dp).height(60.dp), contentAlignment = Alignment.CenterStart) {
                    BasicText(speaker, style = t.label.copy(color = c.textTertiary))
                }
                Spacer(Modifier.height(7.dp))
                CartryText(title, style = t.talkTitleCompact.copy(color = c.textPrimary), balance = true)
                if (body != null) {
                    Spacer(Modifier.height(16.dp))
                    CartryText(body, style = t.lead.copy(color = c.textSecondary))
                }
            }
        }
    } else {
        CartrySurface(modifier.fillMaxWidth().heightIn(min = 150.dp), c.surface, sheen = false, elevation = CartryTheme.elevation.bubble) {
            Column(Modifier.padding(start = 44.dp, end = 220.dp, top = 44.dp, bottom = 38.dp)) {
                BasicText(speaker, style = t.caption.copy(color = c.textTertiary))
                Spacer(Modifier.height(8.dp))
                CartryText(title, style = t.talkTitle.copy(color = c.textPrimary), balance = true)
                if (body != null) {
                    Spacer(Modifier.height(16.dp))
                    CartryText(body, style = t.lead.copy(color = c.textSecondary, lineHeight = 1.55.em))
                }
            }
            CartryBuddy(mood, Modifier.align(Alignment.BottomEnd).padding(end = 24.dp, bottom = 8.dp).size(170.dp, 129.dp))
        }
    }
}
