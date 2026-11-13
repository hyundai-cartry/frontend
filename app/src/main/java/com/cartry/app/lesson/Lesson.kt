package com.cartry.app.lesson

import androidx.annotation.DrawableRes
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
    /** 힌트 2 에서 보여줄 목표·비슷한 기능 비교 카드 */
    val compare: LessonCompare,

    // ── 4. 완료 ──
    /** 차에서 정답 입력이 들어왔을 때 위쪽 알림 띠: 「차에서 ○○ 」 */
    val carToast: String,
    val successTitle: String,
    /** 「기억해요」 칩 문구 */
    val remember: String,

    /** 오른쪽 차 화면 사진(단계마다 하나) */
    val photos: LessonPhotos,
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

/**
 * 힌트 2 「비슷한 기능 비교」 카드 두 장의 글. 아이콘은 [Lesson.target]·[Lesson.decoy] 의 아이콘을 쓴다.
 * 예(와이퍼): 목표 「오른쪽 레버는 와이퍼 / 한 칸 내리면 AUTO」, 비슷한 기능 「왼쪽 레버는 방향지시등 / 내리면 왼쪽, 올리면 오른쪽」
 */
data class LessonCompare(
    val targetTitle: String,
    val targetBody: String,
    val decoyTitle: String,
    val decoyBody: String,
)

/**
 * 실습 화면 오른쪽 차 사진. 시안(1700 판)의 화면 이미지를 그대로 쓴다(res/drawable-nodpi).
 * 보여주기만 하고 누르지 않는다(입력은 차·Virtual Console 에서).
 */
data class LessonPhotos(
    @DrawableRes val mission: Int,
    @DrawableRes val wrong: Int,
    @DrawableRes val hint: Int,
    @DrawableRes val success: Int,
)
