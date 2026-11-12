package com.cartry.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.cartry.app.home.HomeScreen
import com.cartry.app.practice.PracticeScreen
import com.cartry.app.practice.PracticeViewModel

/** 화면 경로. 로드맵·설정 같은 화면이 생기면 여기에 더한다. */
private object Routes {
    const val HOME = "home"
    const val PRACTICE = "practice/{${PracticeViewModel.ARG_LESSON_ID}}"
    fun practice(lessonId: String) = "practice/$lessonId"
}

/**
 * 홈 ↔ 실습 화면 이동.
 * 실습 화면은 경로의 lessonId 로 어떤 기능을 실습할지 정한다. PracticeViewModel 이 SavedStateHandle 에서 이 값을 읽는다.
 */
@Composable
fun CartryNavHost() {
    val nav = rememberNavController()
    NavHost(navController = nav, startDestination = Routes.HOME) {
        composable(Routes.HOME) {
            HomeScreen(onStartLesson = { lesson -> nav.navigate(Routes.practice(lesson.id)) })
        }
        composable(
            Routes.PRACTICE,
            arguments = listOf(navArgument(PracticeViewModel.ARG_LESSON_ID) { type = NavType.StringType }),
        ) {
            PracticeScreen(
                onBack = { nav.popBackStack() },
                onHome = { nav.popBackStack(Routes.HOME, inclusive = false) },
            )
        }
    }
}
