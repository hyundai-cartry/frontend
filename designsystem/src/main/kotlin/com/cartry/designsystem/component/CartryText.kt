package com.cartry.designsystem.component

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.Constraints

/**
 * 여러 줄 한국어 문장용 글자. 시안 CSS 의 줄바꿈을 그대로 따른다.
 * - `word-break: keep-all`: 띄어쓰기 자리에서만 줄을 바꾼다(어절 가운데서 끊지 않는다).
 *   안드로이드·PC 의 기본 규칙은 한글 글자 사이에서도 줄을 바꾸기 때문에 직접 계산한다.
 * - balance = true 면 `text-wrap: balance`: 줄 수는 그대로 두고 줄 길이를 고르게 맞춘다(말풍선 제목).
 * 한 어절이 한 줄보다 길면 그 어절만 기본 규칙대로 끊긴다.
 */
@Composable
fun CartryText(text: String, style: TextStyle, modifier: Modifier = Modifier, balance: Boolean = false) {
    val measurer = rememberTextMeasurer()
    BoxWithConstraints(modifier) {
        val maxW = constraints.maxWidth
        val broken = remember(text, style, maxW, balance) {
            if (maxW == Constraints.Infinity) text else breakKeepAll(measurer, text, style, maxW, balance)
        }
        BasicText(broken, style = style)
    }
}

internal fun breakKeepAll(m: TextMeasurer, text: String, style: TextStyle, maxWidth: Int, balance: Boolean): String {
    fun width(s: String) = m.measure(AnnotatedString(s), style, softWrap = false, maxLines = 1).size.width
    fun greedy(paragraph: String, limit: Int): List<String> {
        val out = mutableListOf<String>()
        var cur = ""
        for (w in paragraph.split(' ').filter { it.isNotEmpty() }) {
            val cand = if (cur.isEmpty()) w else "$cur $w"
            if (cur.isEmpty() || width(cand) <= limit) cur = cand else { out += cur; cur = w }
        }
        if (cur.isNotEmpty()) out += cur
        return out
    }
    return text.split('\n').joinToString("\n") { para ->
        val lines = greedy(para, maxWidth)
        if (balance && lines.size > 1) balanced(para.split(' ').filter { it.isNotEmpty() }, lines.size, maxWidth, ::width).joinToString("\n")
        else lines.joinToString("\n")
    }
}

/**
 * 줄 수(lineCount)는 그대로 두고 줄 길이가 가장 고르게 되는 끊는 자리를 찾는다(줄 폭 제곱의 합이 가장 작은 조합).
 * 쉼표·마침표·물음표·느낌표로 끝나는 줄은 폭을 2% 짧게 쳐서, 길이가 거의 같으면 문장 부호 뒤에서 끊는다(크롬 시안과 같은 결과).
 */
internal fun balanced(words: List<String>, lineCount: Int, maxWidth: Int, width: (String) -> Int): List<String> {
    val n = words.size
    val seg = Array(n) { i -> IntArray(n + 1) { -1 } }
    fun w(i: Int, j: Int): Int { if (seg[i][j] < 0) seg[i][j] = width(words.subList(i, j).joinToString(" ")); return seg[i][j] }
    val bonus = maxWidth * 0.02
    fun cost(i: Int, j: Int): Double {
        val ww = w(i, j); if (ww > maxWidth) return Double.POSITIVE_INFINITY
        val eff = if (words[j - 1].last() in ",.?!") ww - bonus else ww.toDouble()
        return eff * eff
    }
    // best[k][j] = 앞의 j 단어를 k 줄로 나눌 때 최소 비용
    val best = Array(lineCount + 1) { DoubleArray(n + 1) { Double.POSITIVE_INFINITY } }
    val from = Array(lineCount + 1) { IntArray(n + 1) }
    best[0][0] = 0.0
    for (k in 1..lineCount) for (j in k..n) for (i in (k - 1) until j) {
        val c = best[k - 1][i] + cost(i, j)
        if (c < best[k][j]) { best[k][j] = c; from[k][j] = i }
    }
    if (best[lineCount][n].isInfinite()) return listOf(words.joinToString(" "))
    val out = ArrayDeque<String>()
    var j = n
    for (k in lineCount downTo 1) { val i = from[k][j]; out.addFirst(words.subList(i, j).joinToString(" ")); j = i }
    return out.toList()
}
