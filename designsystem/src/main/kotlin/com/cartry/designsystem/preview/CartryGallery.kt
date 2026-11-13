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
 * 공통 컴포넌트 모음 화면. 앱 창과 같은 폭 1700, 높이 약 3320. 문구는 UI 시안 6.93(가로 1700 판)에서 가져왔다.
 * 왼쪽 733 칸은 실습 화면의 글 칸과 같은 폭이다.
 * 안드로이드에서는 @Preview(widthDp = 1700, heightDp = 3320) 로 감싸 Android Studio 미리보기 창에서 본다(에뮬레이터 필요 없음).
 */
@Composable
fun CartryComponentGallery() {
    val c = CartryTheme.colors
    Column(Modifier.width(1700.dp).background(c.background).padding(bottom = 56.dp)) {
        CartryAppHeader("공통 컴포넌트 모음", onBack = {}, onMore = {})
        Column(Modifier.padding(start = 56.dp, end = 56.dp, top = 24.dp), verticalArrangement = Arrangement.spacedBy(56.dp)) {
            Item("CartryTalk · wide · Cheer") {
                Box(Modifier.padding(top = 22.dp)) {
                    CartryTalk("오늘은 손이 따뜻해지는 기능을 골랐어요.", mood = BuddyMood.Cheer)
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(48.dp)) {
                Column(Modifier.width(733.dp), verticalArrangement = Arrangement.spacedBy(28.dp)) {
                    Item("CartryStepProgress") { CartryStepProgress(current = 1, total = 4, title = "엑셀/브레이크") }
                    Item("CartryTalk · compact") {
                        CartryTalk(
                            "브레이크를 끝까지 밟은 다음, 엑셀을 살짝 밟아 보세요.", compact = true,
                            body = "두 페달 모두 오른발로 밟아요. 기어가 P라 엑셀을 밟아도 차는 움직이지 않아요.",
                        )
                    }
                    Item("CartryStatusBar · Target / Waiting / Success / Error / Idle") {
                        Column(verticalArrangement = Arrangement.spacedBy(13.dp)) {
                            CartryStatusBar(CartryIcons.LineBrake, "① 브레이크 페달", "진행 중", Modifier.fillMaxWidth(), StatusBarState.Target)
                            CartryStatusBar(CartryIcons.LineAccel, "② 엑셀 페달", "대기", Modifier.fillMaxWidth(), StatusBarState.Waiting)
                            CartryStatusBar(CartryIcons.LineBrake, "① 브레이크 페달", "완료", Modifier.fillMaxWidth(), StatusBarState.Success)
                            CartryStatusBar(CartryIcons.LineAccel, "② 엑셀 페달", "순서 틀림", Modifier.fillMaxWidth(), StatusBarState.Error)
                            CartryStatusBar(CartryIcons.LineGearN, "기어", "P", Modifier.fillMaxWidth(), StatusBarState.Idle)
                        }
                    }
                    Item("CartryButton · Primary / Secondary") {
                        Row(horizontalArrangement = Arrangement.spacedBy(13.dp)) {
                            CartryButton("힌트 보기", {}, icon = CartryIcons.LineBulb)
                            CartryButton("실습 계속하기", {}, style = CartryButtonStyle.Secondary)
                        }
                    }
                }
                Column(verticalArrangement = Arrangement.spacedBy(28.dp)) {
                    Item("CartryBuddy") {
                        Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                            for (m in BuddyMood.entries) {
                                Column(Modifier.width(150.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                                    CartryBuddy(m, Modifier.size(width = 128.dp, height = 96.dp))
                                    Caption(m.name)
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
                    Item("CartryTag") { CartryTag("오늘의 추천") }
                    Item("CartrySwitch · on / off") {
                        Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                            CartrySwitch(true, {})
                            CartrySwitch(false, {})
                        }
                    }
                    Item("CartryPageDots") { CartryPageDots(count = 3, current = 0) }
                    Item("CartryListRow (시안 6.93 에 없음)") {
                        CartryListRow("이럴 땐 어떻게?", "시야 확보 · 실내 환경 · 동승자 편의 · 차량 설정", CartryIcons.I3Search, Modifier.width(807.dp).height(237.dp), onClick = {})
                    }
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                Item("CartryStepTile · selected") {
                    CartryStepTile(1, "엑셀/브레이크", "왼쪽은 멈추고, 오른쪽은 나가요", CartryIcons.I3Brake, Modifier.size(379.dp, 540.dp), selected = true)
                }
                Item("CartryStepTile") {
                    CartryStepTile(2, "기어", "브레이크를 밟고 기어를 바꿔요", CartryIcons.I3Shift, Modifier.size(379.dp, 540.dp))
                }
                Item("CartryCategoryTile (시안 6.93 에 없음)") {
                    Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {
                        CartryCategoryTile("시야 확보", "앞유리 김서림 제거 · 와이퍼 AUTO 외", 2, 4, CartryIcons.I3Wiper, Modifier.width(782.dp), selected = true)
                        CartryCategoryTile("실내 환경", "내기 순환 · 앞유리 열선 외", 0, 4, CartryIcons.I3Climate, Modifier.width(782.dp))
                    }
                }
            }
            Item("CartryDialog (CartryModal 위)") {
                Box(Modifier.size(width = 1588.dp, height = 720.dp).clip(CartryTheme.shapes.card).background(c.backgroundDeep)) {
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
    Column(Modifier.width(1700.dp).background(c.background).padding(56.dp), verticalArrangement = Arrangement.spacedBy(40.dp)) {
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
