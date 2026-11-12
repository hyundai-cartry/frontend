package com.cartry.app.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.cartry.app.lesson.Lesson
import com.cartry.app.lesson.Lessons

/**
 * 홈의 오늘의 추천을 고른다.
 * ViewModel 은 화면이 다시 그려지거나 실습에 다녀와도 남아 있어서, 추천이 한 번 정해지면 그대로 유지된다.
 * (화면 함수 안에서 random() 을 부르면 다시 그릴 때마다 카드가 바뀐다.)
 */
class HomeViewModel : ViewModel() {
    var lesson: Lesson by mutableStateOf(Lessons.all.random())
        private set

    /** 「다른 기능 보기」: 지금 것을 뺀 나머지 중에서 하나 */
    fun showAnother() {
        lesson = (Lessons.all - lesson).random()
    }
}
