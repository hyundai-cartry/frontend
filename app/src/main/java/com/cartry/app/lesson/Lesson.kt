package com.cartry.app.lesson

import androidx.compose.ui.graphics.vector.ImageVector
import com.cartry.app.vehicle.CarControl

/** 실습 하나의 내용. 화면 코드는 하나이고, 기능마다 다른 것은 전부 여기에 데이터로 둔다. */
data class Lesson(
    val id: String,
    /** 헤더 아래 위치 표시: 「기본 기능 · 앞유리 김서림」 */
    val category: String,

    // ── 홈 추천 카드 ──
    /** 카트리 한마디(홈 큰 제목) */
    val homeHeadline: String,
    val homeTitle: String,
    val homeSubtitle: String,

    // ── 1. 미션 ──
    val missionTitle: String,
    val missionBody: String,

    /** 정답 기능: 이걸 켜면 완료 */
    val target: LessonControl,
    /** 헷갈리는 기능: 이걸 켜면 오작동 */
    val decoy: LessonControl,

    // ── 2. 오작동 ──
    val wrongTitle: String,
    val wrongBody: String,

    // ── 3. 힌트 (1 기능 설명 → 2 비슷한 기능 비교 → 3 위치) ──
    val hintTitle: String,
    val hints: List<LessonHint>,

    // ── 4. 완료 ──
    /** 차에서 정답 입력이 들어왔을 때 위쪽 알림 띠: 「차에서 ○○ 」 */
    val carToast: String,
    val successTitle: String,
    /** 「기억해요」 칩 문구 */
    val remember: String,

    /** 오른쪽 차 화면 그림의 종류 */
    val panel: PanelKind,
)

/** 왼쪽 목록 한 줄이자 차 기능 하나. */
data class LessonControl(
    val control: CarControl,
    val label: String,
    val icon: ImageVector,
    val offText: String = "꺼짐",
    val onText: String = "켜짐",
)

data class LessonHint(val title: String, val body: String)

/** 오른쪽에 그릴 차 화면 흉내. 보여주기만 하고 누르지 않는다(입력은 차·Virtual Console 에서). */
enum class PanelKind { Climate, Wiper, Window }
