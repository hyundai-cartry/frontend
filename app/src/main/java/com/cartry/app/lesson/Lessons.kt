package com.cartry.app.lesson

import com.cartry.app.R
import com.cartry.app.vehicle.CarControl
import com.cartry.designsystem.icon.CartryIcons

/**
 * 오늘의 추천 기본 기능 3개.
 * 문구는 시안(앞유리·와이퍼·뒷좌석 창문 12장)과 시연 영상에서 옮겼다. 작은 글씨는 시안에서 읽기 어려워 다듬었으니 시안 최종본과 한 번 맞춰 본다.
 */
object Lessons {

    val Defrost = Lesson(
        id = "defrost",
        category = "기본 기능 · 앞유리 김서림",
        homeHeadline = "앞유리가 뿌예지기 전에 김서림 제거를 익혀요. 1분이면 배워요.",
        homeTitle = "앞유리 김서림 제거",
        homeSubtitle = "시야 확보 · 약 1분 · 공조 바 온도 옆 첫 번째 버튼",
        missionTitle = "앞유리 김서림을 없애볼까요?",
        missionBody = "공조 화면이나 아래 공조 바에서 찾아보세요.",
        target = LessonControl(CarControl.FrontDefrost, "앞유리 김서림 제거", CartryIcons.LineFront),
        decoy = LessonControl(CarControl.RearDefrost, "뒷유리 열선", CartryIcons.LineRear),
        wrongTitle = "앗, 뒷유리 열선이 켜졌어요.\n앞유리 버튼을 찾아보세요.",
        wrongBody = "뒷유리 열선은 네모 모양 버튼이에요. 앞유리 버튼은 부채꼴 모양이에요.",
        hintTitle = "앞유리가 뿌옇게 됐어요.\n필요한 기능을 켜보세요.",
        hints = listOf(
            LessonHint("기능 설명", "앞유리 쪽으로 바람을 보내 김서림을 없애요."),
            LessonHint("비슷한 기능 비교", "부채꼴은 앞유리, 네모는 뒷유리 열선이에요."),
            LessonHint("이 자리에서는 여기예요", "공조 바 온도 오른쪽 첫 번째 버튼이에요."),
        ),
        compare = LessonCompare(
            targetTitle = "부채꼴은 앞유리",
            targetBody = "앞유리에 바람을 보내요",
            decoyTitle = "네모는 뒷유리 열선",
            decoyBody = "뒷유리를 데워요",
        ),
        carToast = "부채꼴 앞유리 버튼을 눌렀어요",
        successTitle = "앞유리 김서림 제거가 켜졌어요.",
        remember = "부채꼴 버튼은 앞유리 김서림 제거",
        photos = LessonPhotos(
            mission = R.drawable.practice_defrost_target,
            wrong = R.drawable.practice_defrost_wrong,
            hint = R.drawable.practice_defrost_hint,
            success = R.drawable.practice_defrost_ok,
        ),
    )

    val Wiper = Lesson(
        id = "wiper",
        category = "기본 기능 · 와이퍼 AUTO",
        homeHeadline = "비 오는 날 당황하지 않게 와이퍼 AUTO를 익혀요. 2분이면 배워요.",
        homeTitle = "와이퍼 AUTO",
        homeSubtitle = "비 오는 날 · 약 2분 · 핸들 오른쪽 레버",
        missionTitle = "비가 와요. 와이퍼를\nAUTO로 바꿔보세요.",
        missionBody = "핸들 오른쪽 레버를 한 칸 내려보세요.",
        target = LessonControl(CarControl.WiperAuto, "앞유리 와이퍼", CartryIcons.LineWiperF, onText = "AUTO"),
        decoy = LessonControl(CarControl.TurnSignal, "방향지시등", CartryIcons.LineTurnL),
        wrongTitle = "앗, 방향지시등이 켜졌어요.\n와이퍼는 핸들 오른쪽 레버예요.",
        wrongBody = "방향지시등은 다시 제자리로 돌려 주세요. 오른쪽 레버를 한 칸 내리면 AUTO예요.",
        hintTitle = "비가 와요.\n와이퍼를 AUTO로 바꿔보세요.",
        hints = listOf(
            LessonHint("기능 설명", "빗물 양에 맞춰 와이퍼 속도를 알아서 바꿔요."),
            LessonHint("비슷한 기능 비교", "왼쪽 레버는 방향지시등, 오른쪽 레버는 와이퍼예요."),
            LessonHint("이 자리에서는 여기예요", "핸들 오른쪽 레버를 한 칸 내리면 AUTO예요."),
        ),
        compare = LessonCompare(
            targetTitle = "오른쪽 레버는 와이퍼",
            targetBody = "한 칸 내리면 AUTO",
            decoyTitle = "왼쪽 레버는 방향지시등",
            decoyBody = "내리면 왼쪽, 올리면 오른쪽",
        ),
        carToast = "와이퍼 레버를 AUTO로 내렸어요",
        successTitle = "와이퍼가 AUTO로 바뀌었어요.",
        remember = "오른쪽 레버 한 칸 아래는 AUTO",
        photos = LessonPhotos(
            mission = R.drawable.practice_wiper_target,
            wrong = R.drawable.practice_wiper_wrong,
            hint = R.drawable.practice_wiper_hint,
            success = R.drawable.practice_wiper_ok,
        ),
    )

    val WindowLock = Lesson(
        id = "window_lock",
        category = "기본 기능 · 뒷좌석 창문 잠금",
        homeHeadline = "아이가 창문을 열지 않게 뒷좌석 창문 잠금을 익혀요. 1분이면 배워요.",
        homeTitle = "뒷좌석 창문 잠금",
        homeSubtitle = "아이 안전 · 약 1분 · 운전석 창문 스위치 끝 버튼",
        missionTitle = "아이가 뒷좌석에 탔어요.\n뒷좌석 창문을 잠가보세요.",
        missionBody = "운전석 문의 창문 스위치 옆에 있어요.",
        target = LessonControl(CarControl.RearWindowLock, "뒷좌석 창문 잠금", CartryIcons.LineWinlock),
        decoy = LessonControl(CarControl.RearWindowOpen, "창문 위치", CartryIcons.LineWindow, offText = "모두 닫힘", onText = "뒷좌석 창문 열림"),
        wrongTitle = "앗, 창문이 열렸어요.\n잠금 버튼을 찾아보세요.",
        wrongBody = "창문을 다시 닫고, 스위치 줄 끝의 잠금 버튼을 눌러 보세요.",
        hintTitle = "아이가 뒷좌석에 탔어요.\n뒷좌석 창문을 잠가보세요.",
        hints = listOf(
            LessonHint("기능 설명", "뒷좌석에서 창문을 열지 못하게 막아요."),
            LessonHint("비슷한 기능 비교", "화살표 스위치는 창문을 여닫고, 끝 버튼은 잠가요."),
            LessonHint("이 자리에서는 여기예요", "운전석 창문 스위치 4개 오른쪽 끝 버튼이에요."),
        ),
        compare = LessonCompare(
            targetTitle = "끝 버튼은 잠금",
            targetBody = "뒷좌석 스위치를 잠가요",
            decoyTitle = "화살표는 창문 여닫기",
            decoyBody = "누르면 열리고 당기면 닫혀요",
        ),
        carToast = "뒷좌석 창문 잠금 버튼을 눌렀어요",
        successTitle = "뒷좌석 창문이 잠겼어요.",
        remember = "스위치 줄 끝 버튼은 창문 잠금",
        photos = LessonPhotos(
            mission = R.drawable.practice_window_target,
            wrong = R.drawable.practice_window_wrong,
            hint = R.drawable.practice_window_hint,
            success = R.drawable.practice_window_ok,
        ),
    )

    val all = listOf(Defrost, Wiper, WindowLock)

    fun byId(id: String): Lesson = all.firstOrNull { it.id == id } ?: Defrost
}

/**
 * 진행률 자리 표시 값. 진행률 저장은 이번 범위가 아니라 시안 숫자를 그대로 둔다.
 * 나중에 진행률 저장을 붙이면 이 값을 그쪽에서 읽어 오게 바꾼다.
 */
object ProgressPlaceholder {
    const val LEVEL_NAME = "왕초보"
    const val LEVEL_PERCENT = 8
    const val ACHIEVEMENT_PERCENT = 6
}
