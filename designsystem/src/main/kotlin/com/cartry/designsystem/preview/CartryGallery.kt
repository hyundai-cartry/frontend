package com.cartry.designsystem.preview

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.cartry.designsystem.component.BadgeTone
import com.cartry.designsystem.component.BuddyMood
import com.cartry.designsystem.component.CartryAppHeader
import com.cartry.designsystem.component.CartryBadge
import com.cartry.designsystem.component.CartryBuddy
import com.cartry.designsystem.component.CartryButton
import com.cartry.designsystem.component.CartryButtonStyle
import com.cartry.designsystem.component.CartryCategoryTile
import com.cartry.designsystem.component.CartryDialog
import com.cartry.designsystem.component.CartryListRow
import com.cartry.designsystem.component.CartryPageDots
import com.cartry.designsystem.component.CartryStatusBar
import com.cartry.designsystem.component.CartryStepProgress
import com.cartry.designsystem.component.CartryStepTile
import com.cartry.designsystem.component.CartrySwitch
import com.cartry.designsystem.component.CartryTag
import com.cartry.designsystem.component.CartryTalk
import com.cartry.designsystem.component.StatusBarState
import com.cartry.designsystem.icon.CartryIcons
import com.cartry.designsystem.theme.CartryTheme

/**
 * 공통 컴포넌트 모음 화면. 폭 2560, 높이 약 3200. 문구는 UI 시안 6.39~6.40 에서 그대로 가져왔다.
 * 안드로이드에서는 @Preview(widthDp = 2560, heightDp = 3200) 로 감싸 Android Studio 미리보기 창에서 본다(에뮬레이터 필요 없음).
 */
@Composable
fun CartryComponentGallery() {
    val c = CartryTheme.colors
    Column(Modifier.width(2560.dp).background(c.background).padding(bottom = 96.dp)) {
        CartryAppHeader("공통 컴포넌트 모음", onBack = {}, onMore = {})
        Column(Modifier.padding(horizontal = 96.dp), verticalArrangement = Arrangement.spacedBy(56.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(48.dp)) {
                Column(Modifier.width(936.dp), verticalArrangement = Arrangement.spacedBy(28.dp)) {
                    Item("CartryStepProgress") { CartryStepProgress(current = 1, total = 4, title = "엑셀/브레이크") }
                    Item("CartryTalk · compact · Idle") {
                        CartryTalk(
                            "브레이크를 끝까지 밟고, 다음에 엑셀을 살짝 밟아보세요.", compact = true,
                            body = "두 페달 모두 오른발로 밟아요. 기어가 P라 엑셀을 밟아도 차는 움직이지 않아요.",
                        )
                    }
                    Item("CartryStatusBar · Target / Waiting") {
                        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                            CartryStatusBar(CartryIcons.LineBrake, "① 브레이크 페달", "먼저 · 안 밟음", Modifier.fillMaxWidth(), StatusBarState.Target)
                            CartryStatusBar(CartryIcons.LineAccel, "② 엑셀 페달", "다음 · 대기", Modifier.fillMaxWidth(), StatusBarState.Waiting)
                        }
                    }
                    Item("CartryButton · Primary / Secondary") {
                        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                            CartryButton("힌트 보기", {}, icon = CartryIcons.LineBulb)
                            CartryButton("실습 종료", {}, style = CartryButtonStyle.Secondary)
                        }
                    }
                }
                Column(Modifier.width(936.dp), verticalArrangement = Arrangement.spacedBy(28.dp)) {
                    Item("CartryStatusBar · Success / Error / Idle") {
                        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                            CartryStatusBar(CartryIcons.LineBrake, "① 브레이크 페달", "끝까지 밟음 · 완료", Modifier.fillMaxWidth(), StatusBarState.Success)
                            CartryStatusBar(CartryIcons.LineAccel, "② 엑셀 페달", "먼저 밟음", Modifier.fillMaxWidth(), StatusBarState.Error)
                            CartryStatusBar(CartryIcons.LineGearN, "기어", "P", Modifier.fillMaxWidth(), StatusBarState.Idle)
                        }
                    }
                    Item("CartryListRow") {
                        CartryListRow("이럴 땐 어떻게?", "시야 확보 · 실내 환경 · 동승자 편의 · 차량 설정", CartryIcons.I3Search, Modifier.height(237.dp), onClick = {})
                    }
                }
                Column(verticalArrangement = Arrangement.spacedBy(28.dp)) {
                    Item("CartryBuddy") {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            for (pair in BuddyMood.entries.chunked(2)) {
                                Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                                    for (m in pair) {
                                        Column(Modifier.width(160.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                                            CartryBuddy(m, Modifier.size(width = 160.dp, height = 120.dp))
                                            Caption(m.name)
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Item("CartryBadge · solid / soft") {
                        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                            CartryBadge("완료", solid = true, icon = CartryIcons.LineCheck)
                            CartryBadge("힌트 없이 성공 · 배지")
                            CartryBadge("다음 · 초보 탈출", tone = BadgeTone.Goal)
                        }
                    }
                    Item("CartryTag") { CartryTag("초보 코스") }
                    Item("CartrySwitch · on / off") {
                        Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                            CartrySwitch(true, {})
                            CartrySwitch(false, {})
                        }
                    }
                    Item("CartryPageDots") { CartryPageDots(count = 3, current = 0) }
                }
            }
            Item("CartryTalk · wide · Cheer") {
                CartryTalk("오늘은 후진 연동 사이드미러. 주차선이 잘 보여요.", Modifier.width(1428.dp), mood = BuddyMood.Cheer)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                Item("CartryStepTile · selected") {
                    CartryStepTile(1, "엑셀/브레이크", "왼쪽은 멈춤, 오른쪽은 가속", CartryIcons.I3Brake, Modifier.size(574.dp, 600.dp), selected = true)
                }
                Item("CartryStepTile") {
                    CartryStepTile(2, "기어 P·N", "브레이크를 밟고 기어를 바꿔요", CartryIcons.I3Shift, Modifier.size(574.dp, 600.dp))
                }
                Item("CartryCategoryTile · selected / 기본") {
                    Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {
                        CartryCategoryTile("시야 확보", "앞유리 김서림 제거 · 와이퍼 AUTO 외", 2, 4, CartryIcons.I3Wiper, Modifier.width(704.dp), selected = true)
                        CartryCategoryTile("실내 환경", "내기 순환 · 앞유리 열선 외", 0, 4, CartryIcons.I3Climate, Modifier.width(704.dp))
                    }
                }
            }
            Item("CartryDialog (CartryModal 위)") {
                Box(Modifier.size(width = 2368.dp, height = 760.dp).clip(CartryTheme.shapes.card).background(c.backgroundDeep)) {
                    CartryDialog(
                        title = "이번엔 힌트 없이 도전해볼까요?",
                        body = "지난번엔 힌트를 3단계까지 봤어요. 이번엔 힌트 없이 성공하고 배지를 받아보세요. 막히면 언제든 힌트를 켤 수 있어요.",
                        primaryText = "힌트 없이 도전", onPrimary = {},
                        secondaryText = "힌트 켜고 도전",
                        onDismissRequest = {},
                        icon = CartryIcons.I3Nohint,
                    )
                }
            }
        }
    }
}

/** 아이콘 전체 목록 화면. 3D 아이콘은 120, 선 아이콘은 64 로 그리고 이름을 단다. */
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CartryIconGallery() {
    val c = CartryTheme.colors
    Column(Modifier.width(2560.dp).background(c.background).padding(96.dp), verticalArrangement = Arrangement.spacedBy(40.dp)) {
        BasicText("아이콘 ${CartryIcons.all.size}개 — I3* 3D 아이콘 / Line* 선 아이콘(tint 로 색을 입힌다)", style = CartryTheme.type.barTitle.copy(color = c.textPrimary))
        FlowRow(horizontalArrangement = Arrangement.spacedBy(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
            for ((id, v) in CartryIcons.all) {
                val line = id.startsWith("p-") || id.startsWith("ic-")
                Column(
                    Modifier.width(168.dp).height(196.dp).clip(CartryTheme.shapes.card).background(c.surface).padding(12.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Box(Modifier.size(132.dp), contentAlignment = Alignment.Center) {
                        if (line) Image(v, null, Modifier.size(64.dp), colorFilter = ColorFilter.tint(c.textPrimary))
                        else Image(v, null, Modifier.size(120.dp))
                    }
                    Caption(id)
                }
            }
        }
    }
}

@Composable
private fun Item(label: String, content: @Composable ColumnScope.() -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Caption(label)
        content()
    }
}

@Composable
private fun Caption(text: String) {
    BasicText(
        text, style = CartryTheme.type.caption.copy(color = CartryTheme.colors.textTertiary, textAlign = TextAlign.Center),
        maxLines = 1, overflow = TextOverflow.Ellipsis,
    )
}
