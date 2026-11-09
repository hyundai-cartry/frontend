// 이 파일은 designsystem/tools/svg_to_compose.py 가 만든다. 직접 고치지 말고 icons-svg/*.svg 를 고친 뒤 다시 생성한다.
package com.cartry.designsystem.icon

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

/** 카트리 마스코트 벡터. 표정(eyes*)·표시(mark*)는 0f 또는 1f, bar 는 차 앞 빛줄 색. CartryBuddy 컴포저블이 쓴다. */
internal fun buddyVector(bar: Color, eyesIdle: Float, eyesOops: Float, eyesThink: Float, eyesHappy: Float, markOops: Float, markThink: Float, markCheer: Float, markRain: Float, red: Color, blue: Color, green: Color): ImageVector =
    ImageVector.Builder(name = "buddy", defaultWidth = 300.dp, defaultHeight = 224.dp, viewportWidth = 300f, viewportHeight = 224f).apply {
        addGroup(translationX = 0f, translationY = 24f)
        addPath(pathData = addPathNodes("M52.0,191.0A98.0,9.0 0 1 0 248.0,191.0A98.0,9.0 0 1 0 52.0,191.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M93.0,156.0H105.0A13.0,13.0 0 0 1 118.0,169.0V177.0A13.0,13.0 0 0 1 105.0,190.0H93.0A13.0,13.0 0 0 1 80.0,177.0V169.0A13.0,13.0 0 0 1 93.0,156.0Z"), fill = SolidColor(Color(0xFF262B35)))
        addPath(pathData = addPathNodes("M195.0,156.0H207.0A13.0,13.0 0 0 1 220.0,169.0V177.0A13.0,13.0 0 0 1 207.0,190.0H195.0A13.0,13.0 0 0 1 182.0,177.0V169.0A13.0,13.0 0 0 1 195.0,156.0Z"), fill = SolidColor(Color(0xFF262B35)))
        addGroup(rotate = -18f, pivotX = 56f, pivotY = 104f)
        addPath(pathData = addPathNodes("M39.0,104.0A17.0,11.0 0 1 0 73.0,104.0A17.0,11.0 0 1 0 39.0,104.0Z"), fill = SolidColor(Color(0xFFE3E7EE)), stroke = SolidColor(Color(0xFF8F99AB)), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        clearGroup()
        addGroup(rotate = 18f, pivotX = 244f, pivotY = 104f)
        addPath(pathData = addPathNodes("M227.0,104.0A17.0,11.0 0 1 0 261.0,104.0A17.0,11.0 0 1 0 227.0,104.0Z"), fill = SolidColor(Color(0xFFE3E7EE)), stroke = SolidColor(Color(0xFF8F99AB)), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        clearGroup()
        addPath(pathData = addPathNodes("M62 122 C62 62 100 30 150 30 C200 30 238 62 238 122 L238 150 Q238 180 208 180 L92 180 Q62 180 62 150 Z"), fill = SolidColor(Color(0xFFE3E7EE)))
        addPath(pathData = addPathNodes("M62 142 L238 142 L238 150 Q238 180 208 180 L92 180 Q62 180 62 150 Z"), fill = SolidColor(Color(0xFFC6CDD8)))
        addPath(pathData = addPathNodes("M62 122 C62 62 100 30 150 30 C200 30 238 62 238 122 L238 150 Q238 180 208 180 L92 180 Q62 180 62 150 Z"), stroke = SolidColor(Color(0xFF8F99AB)), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M84 90 Q96 56 136 44"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.85f, strokeLineWidth = 7f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M90 112 C90 76 114 58 150 58 C186 58 210 76 210 112 L210 118 Q210 136 192 136 L108 136 Q90 136 90 118 Z"), fill = SolidColor(Color(0xFF172033)))
        addPath(pathData = addPathNodes("M104 86 Q112 72 128 67"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.22f, strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M88.0,150.0H212.0A4.0,4.0 0 0 1 216.0,154.0V154.0A4.0,4.0 0 0 1 212.0,158.0H88.0A4.0,4.0 0 0 1 84.0,154.0V154.0A4.0,4.0 0 0 1 88.0,150.0Z"), fill = SolidColor(bar))
        addPath(pathData = addPathNodes("M125.0,84.0H125.0A9.0,9.0 0 0 1 134.0,93.0V103.0A9.0,9.0 0 0 1 125.0,112.0H125.0A9.0,9.0 0 0 1 116.0,103.0V93.0A9.0,9.0 0 0 1 125.0,84.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = eyesIdle)
        addPath(pathData = addPathNodes("M175.0,84.0H175.0A9.0,9.0 0 0 1 184.0,93.0V103.0A9.0,9.0 0 0 1 175.0,112.0H175.0A9.0,9.0 0 0 1 166.0,103.0V93.0A9.0,9.0 0 0 1 175.0,84.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = eyesIdle)
        addPath(pathData = addPathNodes("M139 120 Q150 128 161 120"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = eyesIdle, strokeLineWidth = 4.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M125.0,84.0H125.0A8.0,8.0 0 0 1 133.0,92.0V106.0A8.0,8.0 0 0 1 125.0,114.0H125.0A8.0,8.0 0 0 1 117.0,106.0V92.0A8.0,8.0 0 0 1 125.0,84.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = eyesOops)
        addPath(pathData = addPathNodes("M175.0,84.0H175.0A8.0,8.0 0 0 1 183.0,92.0V106.0A8.0,8.0 0 0 1 175.0,114.0H175.0A8.0,8.0 0 0 1 167.0,106.0V92.0A8.0,8.0 0 0 1 175.0,84.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = eyesOops)
        addPath(pathData = addPathNodes("M144.0,124.0A6.0,5.0 0 1 0 156.0,124.0A6.0,5.0 0 1 0 144.0,124.0Z"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = eyesOops, strokeLineWidth = 4f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addGroup(rotate = -9f, pivotX = 150f, pivotY = 104f)
        addPath(pathData = addPathNodes("M123.5,80.0H123.5A10.5,10.5 0 0 1 134.0,90.5V101.5A10.5,10.5 0 0 1 123.5,112.0H123.5A10.5,10.5 0 0 1 113.0,101.5V90.5A10.5,10.5 0 0 1 123.5,80.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = eyesThink)
        addPath(pathData = addPathNodes("M175.0,87.0H175.0A8.0,8.0 0 0 1 183.0,95.0V101.0A8.0,8.0 0 0 1 175.0,109.0H175.0A8.0,8.0 0 0 1 167.0,101.0V95.0A8.0,8.0 0 0 1 175.0,87.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = eyesThink)
        addPath(pathData = addPathNodes("M143 121 Q151 127 160 118"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = eyesThink, strokeLineWidth = 4.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        clearGroup()
        addPath(pathData = addPathNodes("M114 106 Q125 88 136 106"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = eyesHappy, strokeLineWidth = 7f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M164 106 Q175 88 186 106"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = eyesHappy, strokeLineWidth = 7f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M138 118 Q150 130 162 118"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = eyesHappy, strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M266.0,-8.0H270.0A4.0,4.0 0 0 1 274.0,-4.0V28.0A4.0,4.0 0 0 1 270.0,32.0H266.0A4.0,4.0 0 0 1 262.0,28.0V-4.0A4.0,4.0 0 0 1 266.0,-8.0Z"), fill = SolidColor(red), fillAlpha = markOops)
        addPath(pathData = addPathNodes("M265.0,40.0H271.0A3.0,3.0 0 0 1 274.0,43.0V49.0A3.0,3.0 0 0 1 271.0,52.0H265.0A3.0,3.0 0 0 1 262.0,49.0V43.0A3.0,3.0 0 0 1 265.0,40.0Z"), fill = SolidColor(red), fillAlpha = markOops)
        addPath(pathData = addPathNodes("M259 4 Q259 -12 275 -12 Q291 -12 291 3 Q291 13 281 18 Q275 21 275 29"), stroke = SolidColor(blue), strokeAlpha = markThink, strokeLineWidth = 9f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        addPath(pathData = addPathNodes("M269.5,44.0A5.5,5.5 0 1 0 280.5,44.0A5.5,5.5 0 1 0 269.5,44.0Z"), fill = SolidColor(blue), fillAlpha = markThink)
        addPath(pathData = addPathNodes("M252.0,-6.0H262.0V4.0H252.0Z"), fill = SolidColor(green), fillAlpha = markCheer)
        addPath(pathData = addPathNodes("M242.0,4.0H252.0V14.0H242.0Z"), fill = SolidColor(green), fillAlpha = markCheer)
        addPath(pathData = addPathNodes("M262.0,4.0H272.0V14.0H262.0Z"), fill = SolidColor(green), fillAlpha = markCheer)
        addPath(pathData = addPathNodes("M252.0,14.0H262.0V24.0H252.0Z"), fill = SolidColor(green), fillAlpha = markCheer)
        addPath(pathData = addPathNodes("M40.0,2.0H48.0V10.0H40.0Z"), fill = SolidColor(green), fillAlpha = markCheer)
        addPath(pathData = addPathNodes("M32.0,10.0H40.0V18.0H32.0Z"), fill = SolidColor(green), fillAlpha = markCheer)
        addPath(pathData = addPathNodes("M48.0,10.0H56.0V18.0H48.0Z"), fill = SolidColor(green), fillAlpha = markCheer)
        addPath(pathData = addPathNodes("M40.0,18.0H48.0V26.0H40.0Z"), fill = SolidColor(green), fillAlpha = markCheer)
        addPath(pathData = addPathNodes("M19.0,-4.0H19.0A3.0,3.0 0 0 1 22.0,-1.0V5.0A3.0,3.0 0 0 1 19.0,8.0H19.0A3.0,3.0 0 0 1 16.0,5.0V-1.0A3.0,3.0 0 0 1 19.0,-4.0Z"), fill = SolidColor(blue), fillAlpha = markRain)
        addPath(pathData = addPathNodes("M35.0,-12.0H35.0A3.0,3.0 0 0 1 38.0,-9.0V-3.0A3.0,3.0 0 0 1 35.0,0.0H35.0A3.0,3.0 0 0 1 32.0,-3.0V-9.0A3.0,3.0 0 0 1 35.0,-12.0Z"), fill = SolidColor(blue), fillAlpha = markRain)
        addPath(pathData = addPathNodes("M51.0,-2.0H51.0A3.0,3.0 0 0 1 54.0,1.0V7.0A3.0,3.0 0 0 1 51.0,10.0H51.0A3.0,3.0 0 0 1 48.0,7.0V1.0A3.0,3.0 0 0 1 51.0,-2.0Z"), fill = SolidColor(blue), fillAlpha = markRain)
    }.build()
