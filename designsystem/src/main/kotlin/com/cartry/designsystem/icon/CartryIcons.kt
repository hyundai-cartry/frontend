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

/** 시안에서 직접 그린 아이콘. `I3*` = 3D 아이콘(색이 들어 있음), `Line*` = 선 아이콘(검정으로 그려 두고 쓸 때 tint 로 색을 입힌다). */
object CartryIcons {
    /** `i3-accel` */
    val I3Accel: ImageVector by lazy {
        ImageVector.Builder(name = "i3-accel", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M8 86 L20 22 Q22 14 30 14 L70 14 Q78 14 80 22 L92 86 Z"), fill = Brush.linearGradient(0f to Color(0xFF3A4150), 1f to Color(0xFF1C2028), start = Offset(8f, 14f), end = Offset(8f, 86f)))
        addPath(pathData = addPathNodes("M23.0,38.0H45.0A7.0,7.0 0 0 1 52.0,45.0V61.0A7.0,7.0 0 0 1 45.0,68.0H23.0A7.0,7.0 0 0 1 16.0,61.0V45.0A7.0,7.0 0 0 1 23.0,38.0Z"), fill = Brush.linearGradient(0f to Color(0xFF4A5262), 1f to Color(0xFF2A303B), start = Offset(16f, 38f), end = Offset(16f, 68f)))
        addPath(pathData = addPathNodes("M67.0,22.0H73.0A7.0,7.0 0 0 1 80.0,29.0V71.0A7.0,7.0 0 0 1 73.0,78.0H67.0A7.0,7.0 0 0 1 60.0,71.0V29.0A7.0,7.0 0 0 1 67.0,22.0Z"), fill = Brush.linearGradient(0f to Color(0xFFF2F4F8), 1f to Color(0xFF9AA3B4), start = Offset(60f, 22f), end = Offset(60f, 78f)))
        addPath(pathData = addPathNodes("M65 34 H75"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M65 44 H75"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M65 54 H75"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M65 64 H75"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M58 84 Q70 88 82 84"), stroke = SolidColor(Color(0xFF58AEFF)), strokeLineWidth = 3.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M64 28 Q64 25 68 25"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.8f, strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `i3-bdg-childlock` */
    val I3BdgChildlock: ImageVector by lazy {
        ImageVector.Builder(name = "i3-bdg-childlock", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M29 60 L46 69 L40.5 95 L34.5 89.5 L26 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFFE8558C), 1f to Color(0xFF9C1F50), start = Offset(26f, 60f), end = Offset(26f, 95f)))
        addPath(pathData = addPathNodes("M71 60 L54 69 L59.5 95 L65.5 89.5 L74 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFFE8558C), 1f to Color(0xFF9C1F50), start = Offset(54f, 60f), end = Offset(54f, 95f)))
        addPath(pathData = addPathNodes("M36.5 74 L33.5 88 M63.5 74 L66.5 88"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.28f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.28f, strokeLineWidth = 2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M43.9 8.5 Q50.0 5.0 56.1 8.5 L77.7 21.0 Q83.8 24.5 83.8 31.5 L83.8 56.5 Q83.8 63.5 77.7 67.0 L56.1 79.5 Q50.0 83.0 43.9 79.5 L22.3 67.0 Q16.2 63.5 16.2 56.5 L16.2 31.5 Q16.2 24.5 22.3 21.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFEEF1F6), 1f to Color(0xFF8A94A8), start = Offset(16.2f, 6.75f), end = Offset(16.2f, 81.25f)))
        addPath(pathData = addPathNodes("M44.8 13.0 Q50.0 10.0 55.2 13.0 L74.2 24.0 Q79.4 27.0 79.4 33.0 L79.4 55.0 Q79.4 61.0 74.2 64.0 L55.2 75.0 Q50.0 78.0 44.8 75.0 L25.8 64.0 Q20.6 61.0 20.6 55.0 L20.6 33.0 Q20.6 27.0 25.8 24.0 Z"), fill = Brush.linearGradient(0f to Color(0xFF7A8498), 1f to Color(0xFFF2F4F8), start = Offset(20.6f, 11.5f), end = Offset(20.6f, 76.5f)))
        addPath(pathData = addPathNodes("M45.7 15.5 Q50.0 13.0 54.3 15.5 L72.5 26.0 Q76.8 28.5 76.8 33.5 L76.8 54.5 Q76.8 59.5 72.5 62.0 L54.3 72.5 Q50.0 75.0 45.7 72.5 L27.5 62.0 Q23.2 59.5 23.2 54.5 L23.2 33.5 Q23.2 28.5 27.5 26.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFFFA3C8), 1f to Color(0xFFDD3F7C), start = Offset(23.2f, 14.25f), end = Offset(23.2f, 73.75f)))
        addPath(pathData = addPathNodes("M26 31 L50 17 L74 31 L74 35 Q50 46 26 39 Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.13f)
        addGroup(translationX = 0f, translationY = 2.4f)
        addPath(pathData = addPathNodes("M39.5 40 V33 a10.5 10.5 0 0 1 21 0 V40"), stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 5.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M39.5,38.0H60.5A7.0,7.0 0 0 1 67.5,45.0V57.5A7.0,7.0 0 0 1 60.5,64.5H39.5A7.0,7.0 0 0 1 32.5,57.5V45.0A7.0,7.0 0 0 1 39.5,38.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M50 59 C40.5 53 41 44.5 45.8 44 C47.9 43.8 49.4 45.1 50 46.6 C50.6 45.1 52.1 43.8 54.2 44 C59 44.5 59.5 53 50 59 Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        clearGroup()
        addPath(pathData = addPathNodes("M39.5 40 V33 a10.5 10.5 0 0 1 21 0 V40"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 5.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M39.5,38.0H60.5A7.0,7.0 0 0 1 67.5,45.0V57.5A7.0,7.0 0 0 1 60.5,64.5H39.5A7.0,7.0 0 0 1 32.5,57.5V45.0A7.0,7.0 0 0 1 39.5,38.0Z"), fill = Brush.linearGradient(0f to Color(0xFFFFFFFF), 1f to Color(0xFFE2EAF5), start = Offset(32.5f, 38f), end = Offset(32.5f, 64.5f)))
        addPath(pathData = addPathNodes("M50 59 C40.5 53 41 44.5 45.8 44 C47.9 43.8 49.4 45.1 50 46.6 C50.6 45.1 52.1 43.8 54.2 44 C59 44.5 59.5 53 50 59 Z"), fill = Brush.linearGradient(0f to Color(0xFFFF7EA6), 1f to Color(0xFFD42A62), start = Offset(42.446f, 43.98f), end = Offset(42.446f, 59f)))
        addPath(pathData = addPathNodes("M21 25.5 L41 13.5"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.6f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.6f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M80 12 L81.8 17.2 L87 19 L81.8 20.8 L80 26 L78.2 20.8 L73 19 L78.2 17.2 Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        }.build()
    }

    /** `i3-bdg-climate` */
    val I3BdgClimate: ImageVector by lazy {
        ImageVector.Builder(name = "i3-bdg-climate", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M29 60 L46 69 L40.5 95 L34.5 89.5 L26 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFF14AFBC), 1f to Color(0xFF06616C), start = Offset(26f, 60f), end = Offset(26f, 95f)))
        addPath(pathData = addPathNodes("M71 60 L54 69 L59.5 95 L65.5 89.5 L74 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFF14AFBC), 1f to Color(0xFF06616C), start = Offset(54f, 60f), end = Offset(54f, 95f)))
        addPath(pathData = addPathNodes("M36.5 74 L33.5 88 M63.5 74 L66.5 88"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.28f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.28f, strokeLineWidth = 2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M43.9 8.5 Q50.0 5.0 56.1 8.5 L77.7 21.0 Q83.8 24.5 83.8 31.5 L83.8 56.5 Q83.8 63.5 77.7 67.0 L56.1 79.5 Q50.0 83.0 43.9 79.5 L22.3 67.0 Q16.2 63.5 16.2 56.5 L16.2 31.5 Q16.2 24.5 22.3 21.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFEEF1F6), 1f to Color(0xFF8A94A8), start = Offset(16.2f, 6.75f), end = Offset(16.2f, 81.25f)))
        addPath(pathData = addPathNodes("M44.8 13.0 Q50.0 10.0 55.2 13.0 L74.2 24.0 Q79.4 27.0 79.4 33.0 L79.4 55.0 Q79.4 61.0 74.2 64.0 L55.2 75.0 Q50.0 78.0 44.8 75.0 L25.8 64.0 Q20.6 61.0 20.6 55.0 L20.6 33.0 Q20.6 27.0 25.8 24.0 Z"), fill = Brush.linearGradient(0f to Color(0xFF7A8498), 1f to Color(0xFFF2F4F8), start = Offset(20.6f, 11.5f), end = Offset(20.6f, 76.5f)))
        addPath(pathData = addPathNodes("M45.7 15.5 Q50.0 13.0 54.3 15.5 L72.5 26.0 Q76.8 28.5 76.8 33.5 L76.8 54.5 Q76.8 59.5 72.5 62.0 L54.3 72.5 Q50.0 75.0 45.7 72.5 L27.5 62.0 Q23.2 59.5 23.2 54.5 L23.2 33.5 Q23.2 28.5 27.5 26.0 Z"), fill = Brush.linearGradient(0f to Color(0xFF63E9DF), 1f to Color(0xFF0A93A3), start = Offset(23.2f, 14.25f), end = Offset(23.2f, 73.75f)))
        addPath(pathData = addPathNodes("M26 31 L50 17 L74 31 L74 35 Q50 46 26 39 Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.13f)
        addGroup(translationX = 0f, translationY = 2.4f)
        addPath(pathData = addPathNodes("M27 34 H55 C61 34 63.5 27.5 60 24.3 C57 21.6 52 23.4 52.4 27.8"), stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 5.4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M22 45 H63 C69.5 45 72 52 68.3 55.6 C65.2 58.6 59.6 57 60 52.4"), stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 5.4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M30 56 H48"), stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 5.4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        clearGroup()
        addPath(pathData = addPathNodes("M27 34 H55 C61 34 63.5 27.5 60 24.3 C57 21.6 52 23.4 52.4 27.8"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 5.4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M22 45 H63 C69.5 45 72 52 68.3 55.6 C65.2 58.6 59.6 57 60 52.4"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 5.4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M30 56 H48"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 5.4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M21 25.5 L41 13.5"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.6f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.6f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M80 12 L81.8 17.2 L87 19 L81.8 20.8 L80 26 L78.2 20.8 L73 19 L78.2 17.2 Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        }.build()
    }

    /** `i3-bdg-dkey` */
    val I3BdgDkey: ImageVector by lazy {
        ImageVector.Builder(name = "i3-bdg-dkey", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M29 60 L46 69 L40.5 95 L34.5 89.5 L26 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFF3A4356), 1f to Color(0xFF151A24), start = Offset(26f, 60f), end = Offset(26f, 95f)))
        addPath(pathData = addPathNodes("M71 60 L54 69 L59.5 95 L65.5 89.5 L74 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFF3A4356), 1f to Color(0xFF151A24), start = Offset(54f, 60f), end = Offset(54f, 95f)))
        addPath(pathData = addPathNodes("M36.5 74 L33.5 88 M63.5 74 L66.5 88"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.28f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.28f, strokeLineWidth = 2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M43.9 8.5 Q50.0 5.0 56.1 8.5 L77.7 21.0 Q83.8 24.5 83.8 31.5 L83.8 56.5 Q83.8 63.5 77.7 67.0 L56.1 79.5 Q50.0 83.0 43.9 79.5 L22.3 67.0 Q16.2 63.5 16.2 56.5 L16.2 31.5 Q16.2 24.5 22.3 21.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFFFF0B8), 1f to Color(0xFFD29400), start = Offset(16.2f, 6.75f), end = Offset(16.2f, 81.25f)))
        addPath(pathData = addPathNodes("M44.8 13.0 Q50.0 10.0 55.2 13.0 L74.2 24.0 Q79.4 27.0 79.4 33.0 L79.4 55.0 Q79.4 61.0 74.2 64.0 L55.2 75.0 Q50.0 78.0 44.8 75.0 L25.8 64.0 Q20.6 61.0 20.6 55.0 L20.6 33.0 Q20.6 27.0 25.8 24.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFA06C00), 1f to Color(0xFFFFE48E), start = Offset(20.6f, 11.5f), end = Offset(20.6f, 76.5f)))
        addPath(pathData = addPathNodes("M45.7 15.5 Q50.0 13.0 54.3 15.5 L72.5 26.0 Q76.8 28.5 76.8 33.5 L76.8 54.5 Q76.8 59.5 72.5 62.0 L54.3 72.5 Q50.0 75.0 45.7 72.5 L27.5 62.0 Q23.2 59.5 23.2 54.5 L23.2 33.5 Q23.2 28.5 27.5 26.0 Z"), fill = Brush.linearGradient(0f to Color(0xFF5D677C), 1f to Color(0xFF1C222E), start = Offset(23.2f, 14.25f), end = Offset(23.2f, 73.75f)))
        addPath(pathData = addPathNodes("M26 31 L50 17 L74 31 L74 35 Q50 46 26 39 Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.13f)
        addGroup(translationX = 0f, translationY = 2.4f)
        addPath(pathData = addPathNodes("M52 36.6 A7.5 7.5 0 0 1 62.6 36.6"), stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 4.2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M47.6 32.2 A13.7 13.7 0 0 1 67 32.2"), stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 4.2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M25.5,51.0A10.5,10.5 0 1 0 46.5,51.0A10.5,10.5 0 1 0 25.5,51.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M31.7,51.0A4.3,4.3 0 1 0 40.3,51.0A4.3,4.3 0 1 0 31.7,51.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M46.4,47.6H68.6A3.4,3.4 0 0 1 72.0,51.0V51.0A3.4,3.4 0 0 1 68.6,54.4H46.4A3.4,3.4 0 0 1 43.0,51.0V51.0A3.4,3.4 0 0 1 46.4,47.6Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M59.3,52.0H61.300000000000004A1.8,1.8 0 0 1 63.1,53.8V59.2A1.8,1.8 0 0 1 61.300000000000004,61.0H59.3A1.8,1.8 0 0 1 57.5,59.2V53.8A1.8,1.8 0 0 1 59.3,52.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M66.8,52.0H68.8A1.8,1.8 0 0 1 70.6,53.8V56.800000000000004A1.8,1.8 0 0 1 68.8,58.6H66.8A1.8,1.8 0 0 1 65.0,56.800000000000004V53.8A1.8,1.8 0 0 1 66.8,52.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        clearGroup()
        addPath(pathData = addPathNodes("M52 36.6 A7.5 7.5 0 0 1 62.6 36.6"), stroke = SolidColor(Color(0xFF8FD0FF)), strokeLineWidth = 4.2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M47.6 32.2 A13.7 13.7 0 0 1 67 32.2"), stroke = SolidColor(Color(0xFF8FD0FF)), strokeLineWidth = 4.2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M25.5,51.0A10.5,10.5 0 1 0 46.5,51.0A10.5,10.5 0 1 0 25.5,51.0Z"), fill = Brush.linearGradient(0f to Color(0xFFFFE79A), 1f to Color(0xFFE5A400), start = Offset(25.5f, 40.5f), end = Offset(25.5f, 61.5f)))
        addPath(pathData = addPathNodes("M31.7,51.0A4.3,4.3 0 1 0 40.3,51.0A4.3,4.3 0 1 0 31.7,51.0Z"), fill = SolidColor(Color(0xFF1C222E)))
        addPath(pathData = addPathNodes("M46.4,47.6H68.6A3.4,3.4 0 0 1 72.0,51.0V51.0A3.4,3.4 0 0 1 68.6,54.4H46.4A3.4,3.4 0 0 1 43.0,51.0V51.0A3.4,3.4 0 0 1 46.4,47.6Z"), fill = Brush.linearGradient(0f to Color(0xFFFFE79A), 1f to Color(0xFFE5A400), start = Offset(43f, 47.6f), end = Offset(43f, 54.4f)))
        addPath(pathData = addPathNodes("M59.3,52.0H61.300000000000004A1.8,1.8 0 0 1 63.1,53.8V59.2A1.8,1.8 0 0 1 61.300000000000004,61.0H59.3A1.8,1.8 0 0 1 57.5,59.2V53.8A1.8,1.8 0 0 1 59.3,52.0Z"), fill = Brush.linearGradient(0f to Color(0xFFFFE79A), 1f to Color(0xFFE5A400), start = Offset(57.5f, 52f), end = Offset(57.5f, 61f)))
        addPath(pathData = addPathNodes("M66.8,52.0H68.8A1.8,1.8 0 0 1 70.6,53.8V56.800000000000004A1.8,1.8 0 0 1 68.8,58.6H66.8A1.8,1.8 0 0 1 65.0,56.800000000000004V53.8A1.8,1.8 0 0 1 66.8,52.0Z"), fill = Brush.linearGradient(0f to Color(0xFFFFE79A), 1f to Color(0xFFE5A400), start = Offset(65f, 52f), end = Offset(65f, 58.6f)))
        addPath(pathData = addPathNodes("M21 25.5 L41 13.5"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.6f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.6f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M80 12 L81.8 17.2 L87 19 L81.8 20.8 L80 26 L78.2 20.8 L73 19 L78.2 17.2 Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        }.build()
    }

    /** `i3-bdg-drivemode` */
    val I3BdgDrivemode: ImageVector by lazy {
        ImageVector.Builder(name = "i3-bdg-drivemode", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M29 60 L46 69 L40.5 95 L34.5 89.5 L26 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFFE2384A), 1f to Color(0xFF8E1424), start = Offset(26f, 60f), end = Offset(26f, 95f)))
        addPath(pathData = addPathNodes("M71 60 L54 69 L59.5 95 L65.5 89.5 L74 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFFE2384A), 1f to Color(0xFF8E1424), start = Offset(54f, 60f), end = Offset(54f, 95f)))
        addPath(pathData = addPathNodes("M36.5 74 L33.5 88 M63.5 74 L66.5 88"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.28f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.28f, strokeLineWidth = 2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M43.9 8.5 Q50.0 5.0 56.1 8.5 L77.7 21.0 Q83.8 24.5 83.8 31.5 L83.8 56.5 Q83.8 63.5 77.7 67.0 L56.1 79.5 Q50.0 83.0 43.9 79.5 L22.3 67.0 Q16.2 63.5 16.2 56.5 L16.2 31.5 Q16.2 24.5 22.3 21.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFFFF0B8), 1f to Color(0xFFD29400), start = Offset(16.2f, 6.75f), end = Offset(16.2f, 81.25f)))
        addPath(pathData = addPathNodes("M44.8 13.0 Q50.0 10.0 55.2 13.0 L74.2 24.0 Q79.4 27.0 79.4 33.0 L79.4 55.0 Q79.4 61.0 74.2 64.0 L55.2 75.0 Q50.0 78.0 44.8 75.0 L25.8 64.0 Q20.6 61.0 20.6 55.0 L20.6 33.0 Q20.6 27.0 25.8 24.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFA06C00), 1f to Color(0xFFFFE48E), start = Offset(20.6f, 11.5f), end = Offset(20.6f, 76.5f)))
        addPath(pathData = addPathNodes("M45.7 15.5 Q50.0 13.0 54.3 15.5 L72.5 26.0 Q76.8 28.5 76.8 33.5 L76.8 54.5 Q76.8 59.5 72.5 62.0 L54.3 72.5 Q50.0 75.0 45.7 72.5 L27.5 62.0 Q23.2 59.5 23.2 54.5 L23.2 33.5 Q23.2 28.5 27.5 26.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFFF8A73), 1f to Color(0xFFD02638), start = Offset(23.2f, 14.25f), end = Offset(23.2f, 73.75f)))
        addPath(pathData = addPathNodes("M26 31 L50 17 L74 31 L74 35 Q50 46 26 39 Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.13f)
        addGroup(translationX = 0f, translationY = 2.4f)
        addPath(pathData = addPathNodes("M28.5 55 A21.5 21.5 0 0 1 71.5 55"), stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 6.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M65.2 39.8 A21.5 21.5 0 0 1 71.5 55"), stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 6.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M35.5,47.4A1.9,1.9 0 1 0 39.3,47.4A1.9,1.9 0 1 0 35.5,47.4Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M41.5,42.5A1.9,1.9 0 1 0 45.3,42.5A1.9,1.9 0 1 0 41.5,42.5Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M48.6,40.6A1.9,1.9 0 1 0 52.4,40.6A1.9,1.9 0 1 0 48.6,40.6Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M50 55 L63.5 43.5"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f, stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 4.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M43.2,55.0A6.8,6.8 0 1 0 56.8,55.0A6.8,6.8 0 1 0 43.2,55.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M47.4,55.0A2.6,2.6 0 1 0 52.6,55.0A2.6,2.6 0 1 0 47.4,55.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        clearGroup()
        addPath(pathData = addPathNodes("M28.5 55 A21.5 21.5 0 0 1 71.5 55"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 6.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M65.2 39.8 A21.5 21.5 0 0 1 71.5 55"), stroke = SolidColor(Color(0xFFFFD84A)), strokeLineWidth = 6.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M35.5,47.4A1.9,1.9 0 1 0 39.3,47.4A1.9,1.9 0 1 0 35.5,47.4Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        addPath(pathData = addPathNodes("M41.5,42.5A1.9,1.9 0 1 0 45.3,42.5A1.9,1.9 0 1 0 41.5,42.5Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        addPath(pathData = addPathNodes("M48.6,40.6A1.9,1.9 0 1 0 52.4,40.6A1.9,1.9 0 1 0 48.6,40.6Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        addPath(pathData = addPathNodes("M50 55 L63.5 43.5"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 4.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M43.2,55.0A6.8,6.8 0 1 0 56.8,55.0A6.8,6.8 0 1 0 43.2,55.0Z"), fill = Brush.linearGradient(0f to Color(0xFFFFFFFF), 1f to Color(0xFFE2EAF5), start = Offset(43.2f, 48.2f), end = Offset(43.2f, 61.8f)))
        addPath(pathData = addPathNodes("M47.4,55.0A2.6,2.6 0 1 0 52.6,55.0A2.6,2.6 0 1 0 47.4,55.0Z"), fill = SolidColor(Color(0xFFD02638)))
        addPath(pathData = addPathNodes("M21 25.5 L41 13.5"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.6f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.6f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M80 12 L81.8 17.2 L87 19 L81.8 20.8 L80 26 L78.2 20.8 L73 19 L78.2 17.2 Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        }.build()
    }

    /** `i3-bdg-firstdrive` */
    val I3BdgFirstdrive: ImageVector by lazy {
        ImageVector.Builder(name = "i3-bdg-firstdrive", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M29 60 L46 69 L40.5 95 L34.5 89.5 L26 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFFF08A24), 1f to Color(0xFFA44A08), start = Offset(26f, 60f), end = Offset(26f, 95f)))
        addPath(pathData = addPathNodes("M71 60 L54 69 L59.5 95 L65.5 89.5 L74 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFFF08A24), 1f to Color(0xFFA44A08), start = Offset(54f, 60f), end = Offset(54f, 95f)))
        addPath(pathData = addPathNodes("M36.5 74 L33.5 88 M63.5 74 L66.5 88"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.28f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.28f, strokeLineWidth = 2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M43.9 8.5 Q50.0 5.0 56.1 8.5 L77.7 21.0 Q83.8 24.5 83.8 31.5 L83.8 56.5 Q83.8 63.5 77.7 67.0 L56.1 79.5 Q50.0 83.0 43.9 79.5 L22.3 67.0 Q16.2 63.5 16.2 56.5 L16.2 31.5 Q16.2 24.5 22.3 21.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFFFD2A4), 1f to Color(0xFFAD5C26), start = Offset(16.2f, 6.75f), end = Offset(16.2f, 81.25f)))
        addPath(pathData = addPathNodes("M44.8 13.0 Q50.0 10.0 55.2 13.0 L74.2 24.0 Q79.4 27.0 79.4 33.0 L79.4 55.0 Q79.4 61.0 74.2 64.0 L55.2 75.0 Q50.0 78.0 44.8 75.0 L25.8 64.0 Q20.6 61.0 20.6 55.0 L20.6 33.0 Q20.6 27.0 25.8 24.0 Z"), fill = Brush.linearGradient(0f to Color(0xFF87441A), 1f to Color(0xFFFFC48E), start = Offset(20.6f, 11.5f), end = Offset(20.6f, 76.5f)))
        addPath(pathData = addPathNodes("M45.7 15.5 Q50.0 13.0 54.3 15.5 L72.5 26.0 Q76.8 28.5 76.8 33.5 L76.8 54.5 Q76.8 59.5 72.5 62.0 L54.3 72.5 Q50.0 75.0 45.7 72.5 L27.5 62.0 Q23.2 59.5 23.2 54.5 L23.2 33.5 Q23.2 28.5 27.5 26.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFFFC56E), 1f to Color(0xFFEC7410), start = Offset(23.2f, 14.25f), end = Offset(23.2f, 73.75f)))
        addPath(pathData = addPathNodes("M26 31 L50 17 L74 31 L74 35 Q50 46 26 39 Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.13f)
        addGroup(translationX = 0f, translationY = 2.4f)
        addPath(pathData = addPathNodes("M30.5,44.0A19.5,19.5 0 1 0 69.5,44.0A19.5,19.5 0 1 0 30.5,44.0Z"), stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 6.6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M45 24.9 A19.5 19.5 0 0 1 55 24.9"), stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 6.6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M33 46.5 H44 M56 46.5 H67 M50 53 V60"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f, stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 5.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M42.2,47.0A7.8,7.8 0 1 0 57.8,47.0A7.8,7.8 0 1 0 42.2,47.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M47.0,47.0A3.0,3.0 0 1 0 53.0,47.0A3.0,3.0 0 1 0 47.0,47.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        clearGroup()
        addPath(pathData = addPathNodes("M30.5,44.0A19.5,19.5 0 1 0 69.5,44.0A19.5,19.5 0 1 0 30.5,44.0Z"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 6.6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M45 24.9 A19.5 19.5 0 0 1 55 24.9"), stroke = SolidColor(Color(0xFF4FA8FF)), strokeLineWidth = 6.6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M33 46.5 H44 M56 46.5 H67 M50 53 V60"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 5.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M42.2,47.0A7.8,7.8 0 1 0 57.8,47.0A7.8,7.8 0 1 0 42.2,47.0Z"), fill = Brush.linearGradient(0f to Color(0xFFFFFFFF), 1f to Color(0xFFE2EAF5), start = Offset(42.2f, 39.2f), end = Offset(42.2f, 54.8f)))
        addPath(pathData = addPathNodes("M47.0,47.0A3.0,3.0 0 1 0 53.0,47.0A3.0,3.0 0 1 0 47.0,47.0Z"), fill = SolidColor(Color(0xFFEC7410)))
        addPath(pathData = addPathNodes("M21 25.5 L41 13.5"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.6f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.6f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M80 12 L81.8 17.2 L87 19 L81.8 20.8 L80 26 L78.2 20.8 L73 19 L78.2 17.2 Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        }.build()
    }

    /** `i3-bdg-nohint` */
    val I3BdgNohint: ImageVector by lazy {
        ImageVector.Builder(name = "i3-bdg-nohint", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M29 60 L46 69 L40.5 95 L34.5 89.5 L26 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFF7447E0), 1f to Color(0xFF3D1F96), start = Offset(26f, 60f), end = Offset(26f, 95f)))
        addPath(pathData = addPathNodes("M71 60 L54 69 L59.5 95 L65.5 89.5 L74 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFF7447E0), 1f to Color(0xFF3D1F96), start = Offset(54f, 60f), end = Offset(54f, 95f)))
        addPath(pathData = addPathNodes("M36.5 74 L33.5 88 M63.5 74 L66.5 88"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.28f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.28f, strokeLineWidth = 2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M43.9 8.5 Q50.0 5.0 56.1 8.5 L77.7 21.0 Q83.8 24.5 83.8 31.5 L83.8 56.5 Q83.8 63.5 77.7 67.0 L56.1 79.5 Q50.0 83.0 43.9 79.5 L22.3 67.0 Q16.2 63.5 16.2 56.5 L16.2 31.5 Q16.2 24.5 22.3 21.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFFFF0B8), 1f to Color(0xFFD29400), start = Offset(16.2f, 6.75f), end = Offset(16.2f, 81.25f)))
        addPath(pathData = addPathNodes("M44.8 13.0 Q50.0 10.0 55.2 13.0 L74.2 24.0 Q79.4 27.0 79.4 33.0 L79.4 55.0 Q79.4 61.0 74.2 64.0 L55.2 75.0 Q50.0 78.0 44.8 75.0 L25.8 64.0 Q20.6 61.0 20.6 55.0 L20.6 33.0 Q20.6 27.0 25.8 24.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFA06C00), 1f to Color(0xFFFFE48E), start = Offset(20.6f, 11.5f), end = Offset(20.6f, 76.5f)))
        addPath(pathData = addPathNodes("M45.7 15.5 Q50.0 13.0 54.3 15.5 L72.5 26.0 Q76.8 28.5 76.8 33.5 L76.8 54.5 Q76.8 59.5 72.5 62.0 L54.3 72.5 Q50.0 75.0 45.7 72.5 L27.5 62.0 Q23.2 59.5 23.2 54.5 L23.2 33.5 Q23.2 28.5 27.5 26.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFBC9BFF), 1f to Color(0xFF5F33D0), start = Offset(23.2f, 14.25f), end = Offset(23.2f, 73.75f)))
        addPath(pathData = addPathNodes("M26 31 L50 17 L74 31 L74 35 Q50 46 26 39 Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.13f)
        addGroup(translationX = 0f, translationY = 2.4f)
        addPath(pathData = addPathNodes("M27.5,47.0A19.5,19.5 0 1 0 66.5,47.0A19.5,19.5 0 1 0 27.5,47.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M33.5,47.0A13.5,13.5 0 1 0 60.5,47.0A13.5,13.5 0 1 0 33.5,47.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M39.0,47.0A8.0,8.0 0 1 0 55.0,47.0A8.0,8.0 0 1 0 39.0,47.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M43.8,47.0A3.2,3.2 0 1 0 50.2,47.0A3.2,3.2 0 1 0 43.8,47.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addGroup(rotate = -45f, pivotX = 47f, pivotY = 47f)
        addPath(pathData = addPathNodes("M47 47 H72"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f, stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 3.8f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M66 47 L74 47 L77.5 40.5 L70 40.5 Z M66 47 L74 47 L77.5 53.5 L70 53.5 Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        clearGroup()
        clearGroup()
        addPath(pathData = addPathNodes("M27.5,47.0A19.5,19.5 0 1 0 66.5,47.0A19.5,19.5 0 1 0 27.5,47.0Z"), fill = Brush.linearGradient(0f to Color(0xFFFFFFFF), 1f to Color(0xFFE2EAF5), start = Offset(27.5f, 27.5f), end = Offset(27.5f, 66.5f)))
        addPath(pathData = addPathNodes("M33.5,47.0A13.5,13.5 0 1 0 60.5,47.0A13.5,13.5 0 1 0 33.5,47.0Z"), fill = SolidColor(Color(0xFF5F33D0)))
        addPath(pathData = addPathNodes("M39.0,47.0A8.0,8.0 0 1 0 55.0,47.0A8.0,8.0 0 1 0 39.0,47.0Z"), fill = Brush.linearGradient(0f to Color(0xFFFFFFFF), 1f to Color(0xFFE2EAF5), start = Offset(39f, 39f), end = Offset(39f, 55f)))
        addPath(pathData = addPathNodes("M43.8,47.0A3.2,3.2 0 1 0 50.2,47.0A3.2,3.2 0 1 0 43.8,47.0Z"), fill = SolidColor(Color(0xFF5F33D0)))
        addGroup(rotate = -45f, pivotX = 47f, pivotY = 47f)
        addPath(pathData = addPathNodes("M47 47 H72"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFFFFE38A)), strokeLineWidth = 3.8f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M66 47 L74 47 L77.5 40.5 L70 40.5 Z M66 47 L74 47 L77.5 53.5 L70 53.5 Z"), fill = Brush.linearGradient(0f to Color(0xFFFFE38A), 1f to Color(0xFFE8A800), start = Offset(66f, 40.5f), end = Offset(66f, 53.5f)))
        clearGroup()
        addPath(pathData = addPathNodes("M21 25.5 L41 13.5"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.6f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.6f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M80 12 L81.8 17.2 L87 19 L81.8 20.8 L80 26 L78.2 20.8 L73 19 L78.2 17.2 Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        }.build()
    }

    /** `i3-bdg-rain` */
    val I3BdgRain: ImageVector by lazy {
        ImageVector.Builder(name = "i3-bdg-rain", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M29 60 L46 69 L40.5 95 L34.5 89.5 L26 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFF2F78E6), 1f to Color(0xFF123F9C), start = Offset(26f, 60f), end = Offset(26f, 95f)))
        addPath(pathData = addPathNodes("M71 60 L54 69 L59.5 95 L65.5 89.5 L74 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFF2F78E6), 1f to Color(0xFF123F9C), start = Offset(54f, 60f), end = Offset(54f, 95f)))
        addPath(pathData = addPathNodes("M36.5 74 L33.5 88 M63.5 74 L66.5 88"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.28f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.28f, strokeLineWidth = 2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M43.9 8.5 Q50.0 5.0 56.1 8.5 L77.7 21.0 Q83.8 24.5 83.8 31.5 L83.8 56.5 Q83.8 63.5 77.7 67.0 L56.1 79.5 Q50.0 83.0 43.9 79.5 L22.3 67.0 Q16.2 63.5 16.2 56.5 L16.2 31.5 Q16.2 24.5 22.3 21.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFEEF1F6), 1f to Color(0xFF8A94A8), start = Offset(16.2f, 6.75f), end = Offset(16.2f, 81.25f)))
        addPath(pathData = addPathNodes("M44.8 13.0 Q50.0 10.0 55.2 13.0 L74.2 24.0 Q79.4 27.0 79.4 33.0 L79.4 55.0 Q79.4 61.0 74.2 64.0 L55.2 75.0 Q50.0 78.0 44.8 75.0 L25.8 64.0 Q20.6 61.0 20.6 55.0 L20.6 33.0 Q20.6 27.0 25.8 24.0 Z"), fill = Brush.linearGradient(0f to Color(0xFF7A8498), 1f to Color(0xFFF2F4F8), start = Offset(20.6f, 11.5f), end = Offset(20.6f, 76.5f)))
        addPath(pathData = addPathNodes("M45.7 15.5 Q50.0 13.0 54.3 15.5 L72.5 26.0 Q76.8 28.5 76.8 33.5 L76.8 54.5 Q76.8 59.5 72.5 62.0 L54.3 72.5 Q50.0 75.0 45.7 72.5 L27.5 62.0 Q23.2 59.5 23.2 54.5 L23.2 33.5 Q23.2 28.5 27.5 26.0 Z"), fill = Brush.linearGradient(0f to Color(0xFF70BBFF), 1f to Color(0xFF1B5BD3), start = Offset(23.2f, 14.25f), end = Offset(23.2f, 73.75f)))
        addPath(pathData = addPathNodes("M26 31 L50 17 L74 31 L74 35 Q50 46 26 39 Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.13f)
        addGroup(translationX = 0f, translationY = 2.4f)
        addPath(pathData = addPathNodes("M50 24 V19"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f, stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 3.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50 42 V58 a4 4 0 0 1 -8 0"), stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 4.2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M26 44 Q27 23 50 22 Q73 23 74 44 Q68 38.5 62 44 Q56 38.5 50 44 Q44 38.5 38 44 Q32 38.5 26 44 Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M50 23 Q42.5 30 38 44 M50 23 Q57.5 30 62 44"), stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 1.8f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M30 50 c2.6 3.6 3.6 5.6 3.6 7.2 a3.6 3.6 0 0 1 -7.2 0 c0 -1.6 1 -3.6 3.6 -7.2 Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M69 49 c2.6 3.6 3.6 5.6 3.6 7.2 a3.6 3.6 0 0 1 -7.2 0 c0 -1.6 1 -3.6 3.6 -7.2 Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M62 58 c2.6 3.6 3.6 5.6 3.6 7.2 a3.6 3.6 0 0 1 -7.2 0 c0 -1.6 1 -3.6 3.6 -7.2 Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        clearGroup()
        addPath(pathData = addPathNodes("M50 24 V19"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 3.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50 42 V58 a4 4 0 0 1 -8 0"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 4.2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M26 44 Q27 23 50 22 Q73 23 74 44 Q68 38.5 62 44 Q56 38.5 50 44 Q44 38.5 38 44 Q32 38.5 26 44 Z"), fill = Brush.linearGradient(0f to Color(0xFFFFFFFF), 1f to Color(0xFFE2EAF5), start = Offset(26f, 22f), end = Offset(26f, 44f)))
        addPath(pathData = addPathNodes("M50 23 Q42.5 30 38 44 M50 23 Q57.5 30 62 44"), stroke = SolidColor(Color(0xFF9CC2F5)), strokeLineWidth = 1.8f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M30 50 c2.6 3.6 3.6 5.6 3.6 7.2 a3.6 3.6 0 0 1 -7.2 0 c0 -1.6 1 -3.6 3.6 -7.2 Z"), fill = Brush.linearGradient(0f to Color(0xFFD6EEFF), 1f to Color(0xFF86C4FF), start = Offset(26.4f, 50f), end = Offset(26.4f, 60.8f)))
        addPath(pathData = addPathNodes("M69 49 c2.6 3.6 3.6 5.6 3.6 7.2 a3.6 3.6 0 0 1 -7.2 0 c0 -1.6 1 -3.6 3.6 -7.2 Z"), fill = Brush.linearGradient(0f to Color(0xFFD6EEFF), 1f to Color(0xFF86C4FF), start = Offset(65.4f, 49f), end = Offset(65.4f, 59.8f)))
        addPath(pathData = addPathNodes("M62 58 c2.6 3.6 3.6 5.6 3.6 7.2 a3.6 3.6 0 0 1 -7.2 0 c0 -1.6 1 -3.6 3.6 -7.2 Z"), fill = Brush.linearGradient(0f to Color(0xFFD6EEFF), 1f to Color(0xFF86C4FF), start = Offset(58.4f, 58f), end = Offset(58.4f, 68.8f)))
        addPath(pathData = addPathNodes("M21 25.5 L41 13.5"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.6f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.6f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M80 12 L81.8 17.2 L87 19 L81.8 20.8 L80 26 L78.2 20.8 L73 19 L78.2 17.2 Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        }.build()
    }

    /** `i3-bdg-tutorial` */
    val I3BdgTutorial: ImageVector by lazy {
        ImageVector.Builder(name = "i3-bdg-tutorial", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M29 60 L46 69 L40.5 95 L34.5 89.5 L26 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFF1FA85A), 1f to Color(0xFF0B5E31), start = Offset(26f, 60f), end = Offset(26f, 95f)))
        addPath(pathData = addPathNodes("M71 60 L54 69 L59.5 95 L65.5 89.5 L74 92.5 Z"), fill = Brush.linearGradient(0f to Color(0xFF1FA85A), 1f to Color(0xFF0B5E31), start = Offset(54f, 60f), end = Offset(54f, 95f)))
        addPath(pathData = addPathNodes("M36.5 74 L33.5 88 M63.5 74 L66.5 88"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.28f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.28f, strokeLineWidth = 2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M43.9 8.5 Q50.0 5.0 56.1 8.5 L77.7 21.0 Q83.8 24.5 83.8 31.5 L83.8 56.5 Q83.8 63.5 77.7 67.0 L56.1 79.5 Q50.0 83.0 43.9 79.5 L22.3 67.0 Q16.2 63.5 16.2 56.5 L16.2 31.5 Q16.2 24.5 22.3 21.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFFFF0B8), 1f to Color(0xFFD29400), start = Offset(16.2f, 6.75f), end = Offset(16.2f, 81.25f)))
        addPath(pathData = addPathNodes("M44.8 13.0 Q50.0 10.0 55.2 13.0 L74.2 24.0 Q79.4 27.0 79.4 33.0 L79.4 55.0 Q79.4 61.0 74.2 64.0 L55.2 75.0 Q50.0 78.0 44.8 75.0 L25.8 64.0 Q20.6 61.0 20.6 55.0 L20.6 33.0 Q20.6 27.0 25.8 24.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFA06C00), 1f to Color(0xFFFFE48E), start = Offset(20.6f, 11.5f), end = Offset(20.6f, 76.5f)))
        addPath(pathData = addPathNodes("M45.7 15.5 Q50.0 13.0 54.3 15.5 L72.5 26.0 Q76.8 28.5 76.8 33.5 L76.8 54.5 Q76.8 59.5 72.5 62.0 L54.3 72.5 Q50.0 75.0 45.7 72.5 L27.5 62.0 Q23.2 59.5 23.2 54.5 L23.2 33.5 Q23.2 28.5 27.5 26.0 Z"), fill = Brush.linearGradient(0f to Color(0xFF62E395), 1f to Color(0xFF12904A), start = Offset(23.2f, 14.25f), end = Offset(23.2f, 73.75f)))
        addPath(pathData = addPathNodes("M26 31 L50 17 L74 31 L74 35 Q50 46 26 39 Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.13f)
        addGroup(translationX = 0f, translationY = 2.4f)
        addPath(pathData = addPathNodes("M37 27 V62"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f, stroke = SolidColor(Color(0xFF000000)), strokeAlpha = 0.26f, strokeLineWidth = 4.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M39.0 26.0 L41.0 27.0 L43.0 27.8 L45.0 28.4 L47.0 28.6 L49.0 28.4 L51.0 27.8 L53.0 27.0 L55.0 26.0 L57.0 25.0 L59.0 24.2 L61.0 23.6 L63.0 23.4 L65.0 23.6 L67.0 24.2 L69.0 25.0 L71.0 26.0 L71.0 48.0 L69.0 47.0 L67.0 46.2 L65.0 45.6 L63.0 45.4 L61.0 45.6 L59.0 46.2 L57.0 47.0 L55.0 48.0 L53.0 49.0 L51.0 49.8 L49.0 50.4 L47.0 50.6 L45.0 50.4 L43.0 49.8 L41.0 49.0 L39.0 48.0 Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M39.0 33.3 L41.0 34.3 L43.0 35.2 L45.0 35.7 L47.0 35.9 L47.0 43.3 L45.0 43.1 L43.0 42.5 L41.0 41.7 L39.0 40.7 Z M47.0 28.6 L49.0 28.4 L51.0 27.8 L53.0 27.0 L55.0 26.0 L55.0 33.3 L53.0 34.3 L51.0 35.2 L49.0 35.7 L47.0 35.9 Z M47.0 43.3 L49.0 43.1 L51.0 42.5 L53.0 41.7 L55.0 40.7 L55.0 48.0 L53.0 49.0 L51.0 49.8 L49.0 50.4 L47.0 50.6 Z M55.0 33.3 L57.0 32.3 L59.0 31.5 L61.0 30.9 L63.0 30.7 L63.0 38.1 L61.0 38.3 L59.0 38.8 L57.0 39.7 L55.0 40.7 Z M63.0 23.4 L65.0 23.6 L67.0 24.2 L69.0 25.0 L71.0 26.0 L71.0 33.3 L69.0 32.3 L67.0 31.5 L65.0 30.9 L63.0 30.7 Z M63.0 38.1 L65.0 38.3 L67.0 38.8 L69.0 39.7 L71.0 40.7 L71.0 48.0 L69.0 47.0 L67.0 46.2 L65.0 45.6 L63.0 45.4 Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        addPath(pathData = addPathNodes("M33.4,24.5A3.6,3.6 0 1 0 40.6,24.5A3.6,3.6 0 1 0 33.4,24.5Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.26f)
        clearGroup()
        addPath(pathData = addPathNodes("M37 27 V62"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 4.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M39.0 26.0 L41.0 27.0 L43.0 27.8 L45.0 28.4 L47.0 28.6 L49.0 28.4 L51.0 27.8 L53.0 27.0 L55.0 26.0 L57.0 25.0 L59.0 24.2 L61.0 23.6 L63.0 23.4 L65.0 23.6 L67.0 24.2 L69.0 25.0 L71.0 26.0 L71.0 48.0 L69.0 47.0 L67.0 46.2 L65.0 45.6 L63.0 45.4 L61.0 45.6 L59.0 46.2 L57.0 47.0 L55.0 48.0 L53.0 49.0 L51.0 49.8 L49.0 50.4 L47.0 50.6 L45.0 50.4 L43.0 49.8 L41.0 49.0 L39.0 48.0 Z"), fill = Brush.linearGradient(0f to Color(0xFFFFFFFF), 1f to Color(0xFFE2EAF5), start = Offset(39f, 23.4f), end = Offset(39f, 50.6f)))
        addPath(pathData = addPathNodes("M39.0 33.3 L41.0 34.3 L43.0 35.2 L45.0 35.7 L47.0 35.9 L47.0 43.3 L45.0 43.1 L43.0 42.5 L41.0 41.7 L39.0 40.7 Z M47.0 28.6 L49.0 28.4 L51.0 27.8 L53.0 27.0 L55.0 26.0 L55.0 33.3 L53.0 34.3 L51.0 35.2 L49.0 35.7 L47.0 35.9 Z M47.0 43.3 L49.0 43.1 L51.0 42.5 L53.0 41.7 L55.0 40.7 L55.0 48.0 L53.0 49.0 L51.0 49.8 L49.0 50.4 L47.0 50.6 Z M55.0 33.3 L57.0 32.3 L59.0 31.5 L61.0 30.9 L63.0 30.7 L63.0 38.1 L61.0 38.3 L59.0 38.8 L57.0 39.7 L55.0 40.7 Z M63.0 23.4 L65.0 23.6 L67.0 24.2 L69.0 25.0 L71.0 26.0 L71.0 33.3 L69.0 32.3 L67.0 31.5 L65.0 30.9 L63.0 30.7 Z M63.0 38.1 L65.0 38.3 L67.0 38.8 L69.0 39.7 L71.0 40.7 L71.0 48.0 L69.0 47.0 L67.0 46.2 L65.0 45.6 L63.0 45.4 Z"), fill = SolidColor(Color(0xFF2A3140)))
        addPath(pathData = addPathNodes("M33.4,24.5A3.6,3.6 0 1 0 40.6,24.5A3.6,3.6 0 1 0 33.4,24.5Z"), fill = Brush.linearGradient(0f to Color(0xFFFFE38A), 1f to Color(0xFFE8A800), start = Offset(33.4f, 20.9f), end = Offset(33.4f, 28.1f)))
        addPath(pathData = addPathNodes("M21 25.5 L41 13.5"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.6f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.6f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M80 12 L81.8 17.2 L87 19 L81.8 20.8 L80 26 L78.2 20.8 L73 19 L78.2 17.2 Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        }.build()
    }

    /** `i3-bell` */
    val I3Bell: ImageVector by lazy {
        ImageVector.Builder(name = "i3-bell", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M45.0,17.0A5.0,5.0 0 1 0 55.0,17.0A5.0,5.0 0 1 0 45.0,17.0Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(45f, 12f), end = Offset(45f, 22f)))
        addPath(pathData = addPathNodes("M50 20 Q67 20 69 40 L71 58 Q72 64 79 68 Q80 71 76 71 L24 71 Q20 71 21 68 Q28 64 29 58 L31 40 Q33 20 50 20 Z"), fill = Brush.linearGradient(0f to Color(0xFFFFE38A), 1f to Color(0xFFE8A800), start = Offset(20.8f, 20f), end = Offset(20.8f, 71f)))
        addPath(pathData = addPathNodes("M43.0,77.0A7.0,7.0 0 1 0 57.0,77.0A7.0,7.0 0 1 0 43.0,77.0Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(43f, 70f), end = Offset(43f, 84f)))
        addGroup(rotate = 15f, pivotX = 40f, pivotY = 36f)
        addPath(pathData = addPathNodes("M35.0,36.0A5.0,10.0 0 1 0 45.0,36.0A5.0,10.0 0 1 0 35.0,36.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.45f)
        clearGroup()
        addPath(pathData = addPathNodes("M64.0,24.0A10.0,10.0 0 1 0 84.0,24.0A10.0,10.0 0 1 0 64.0,24.0Z"), fill = Brush.linearGradient(0f to Color(0xFF58AEFF), 1f to Color(0xFF0062D6), start = Offset(64f, 14f), end = Offset(64f, 34f)))
        addPath(pathData = addPathNodes("M68.0,21.0A3.0,3.0 0 1 0 74.0,21.0A3.0,3.0 0 1 0 68.0,21.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.55f)
        }.build()
    }

    /** `i3-brake` */
    val I3Brake: ImageVector by lazy {
        ImageVector.Builder(name = "i3-brake", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M8 86 L20 22 Q22 14 30 14 L70 14 Q78 14 80 22 L92 86 Z"), fill = Brush.linearGradient(0f to Color(0xFF3A4150), 1f to Color(0xFF1C2028), start = Offset(8f, 14f), end = Offset(8f, 86f)))
        addPath(pathData = addPathNodes("M26.0,34.0H50.0A8.0,8.0 0 0 1 58.0,42.0V60.0A8.0,8.0 0 0 1 50.0,68.0H26.0A8.0,8.0 0 0 1 18.0,60.0V42.0A8.0,8.0 0 0 1 26.0,34.0Z"), fill = Brush.linearGradient(0f to Color(0xFFF2F4F8), 1f to Color(0xFF9AA3B4), start = Offset(18f, 34f), end = Offset(18f, 68f)))
        addPath(pathData = addPathNodes("M25 44 H51"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M25 51 H51"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M25 58 H51"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M70.0,26.0H74.0A6.0,6.0 0 0 1 80.0,32.0V68.0A6.0,6.0 0 0 1 74.0,74.0H70.0A6.0,6.0 0 0 1 64.0,68.0V32.0A6.0,6.0 0 0 1 70.0,26.0Z"), fill = Brush.linearGradient(0f to Color(0xFF4A5262), 1f to Color(0xFF2A303B), start = Offset(64f, 26f), end = Offset(64f, 74f)))
        addPath(pathData = addPathNodes("M20 74 Q38 80 56 74"), stroke = SolidColor(Color(0xFF58AEFF)), strokeLineWidth = 3.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M22 40 Q22 37 26 37 L40 37"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.8f, strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `i3-bulb` */
    val I3Bulb: ImageVector by lazy {
        ImageVector.Builder(name = "i3-bulb", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M50 14 a26 26 0 0 1 14 48 q-4 3-4 8 H40 q0-5-4-8 a26 26 0 0 1 14-48 Z"), fill = Brush.linearGradient(0f to Color(0xFFFFE38A), 1f to Color(0xFFE8A800), start = Offset(23.856f, 14f), end = Offset(23.856f, 70f)))
        addGroup(rotate = 20f, pivotX = 42f, pivotY = 30f)
        addPath(pathData = addPathNodes("M35.0,30.0A7.0,11.0 0 1 0 49.0,30.0A7.0,11.0 0 1 0 35.0,30.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.45f)
        clearGroup()
        addPath(pathData = addPathNodes("M41.0,72.0H59.0A3.0,3.0 0 0 1 62.0,75.0V76.0A3.0,3.0 0 0 1 59.0,79.0H41.0A3.0,3.0 0 0 1 38.0,76.0V75.0A3.0,3.0 0 0 1 41.0,72.0Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(38f, 72f), end = Offset(38f, 79f)))
        addPath(pathData = addPathNodes("M43.0,81.0H57.0A3.0,3.0 0 0 1 60.0,84.0V84.0A3.0,3.0 0 0 1 57.0,87.0H43.0A3.0,3.0 0 0 1 40.0,84.0V84.0A3.0,3.0 0 0 1 43.0,81.0Z"), fill = SolidColor(Color(0xFF8A93A5)))
        }.build()
    }

    /** `i3-climate` */
    val I3Climate: ImageVector by lazy {
        ImageVector.Builder(name = "i3-climate", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M19.0,27.0H49.0A16.0,16.0 0 0 1 65.0,43.0V63.0A16.0,16.0 0 0 1 49.0,79.0H19.0A16.0,16.0 0 0 1 3.0,63.0V43.0A16.0,16.0 0 0 1 19.0,27.0Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(3f, 27f), end = Offset(3f, 79f)))
        addPath(pathData = addPathNodes("M19.0,33.0H49.0A10.0,10.0 0 0 1 59.0,43.0V63.0A10.0,10.0 0 0 1 49.0,73.0H19.0A10.0,10.0 0 0 1 9.0,63.0V43.0A10.0,10.0 0 0 1 19.0,33.0Z"), fill = SolidColor(Color(0xFF161A22)))
        addPath(pathData = addPathNodes("M15.7,37.5H52.3A3.7,3.7 0 0 1 56.0,41.2V41.3A3.7,3.7 0 0 1 52.3,45.0H15.7A3.7,3.7 0 0 1 12.0,41.3V41.2A3.7,3.7 0 0 1 15.7,37.5Z"), fill = Brush.linearGradient(0f to Color(0xFFF4F6FA), 1f to Color(0xFF9AA3B4), start = Offset(12f, 37.5f), end = Offset(12f, 45f)))
        addPath(pathData = addPathNodes("M15.7,49.2H52.3A3.7,3.7 0 0 1 56.0,52.900000000000006V53.0A3.7,3.7 0 0 1 52.3,56.7H15.7A3.7,3.7 0 0 1 12.0,53.0V52.900000000000006A3.7,3.7 0 0 1 15.7,49.2Z"), fill = Brush.linearGradient(0f to Color(0xFFF4F6FA), 1f to Color(0xFF9AA3B4), start = Offset(12f, 49.2f), end = Offset(12f, 56.7f)))
        addPath(pathData = addPathNodes("M15.7,61.0H52.3A3.7,3.7 0 0 1 56.0,64.7V64.8A3.7,3.7 0 0 1 52.3,68.5H15.7A3.7,3.7 0 0 1 12.0,64.8V64.7A3.7,3.7 0 0 1 15.7,61.0Z"), fill = Brush.linearGradient(0f to Color(0xFFF4F6FA), 1f to Color(0xFF9AA3B4), start = Offset(12f, 61f), end = Offset(12f, 68.5f)))
        addPath(pathData = addPathNodes("M34.2,35.0H34.3A4.2,4.2 0 0 1 38.5,39.2V66.8A4.2,4.2 0 0 1 34.3,71.0H34.2A4.2,4.2 0 0 1 30.0,66.8V39.2A4.2,4.2 0 0 1 34.2,35.0Z"), fill = Brush.linearGradient(0f to Color(0xFF58AEFF), 1f to Color(0xFF0062D6), start = Offset(30f, 35f), end = Offset(30f, 71f)))
        addPath(pathData = addPathNodes("M33.0,38.0H33.099999999999994A1.1,1.1 0 0 1 34.199999999999996,39.1V49.9A1.1,1.1 0 0 1 33.099999999999994,51.0H33.0A1.1,1.1 0 0 1 31.9,49.9V39.1A1.1,1.1 0 0 1 33.0,38.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.55f)
        addPath(pathData = addPathNodes("M10 39 Q10 31 20 31"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.6f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M66 44 C71 34 76 46 81 37 C85 30 90 30 95 27"), stroke = Brush.linearGradient(0f to Color(0xFFFFC48A), 1f to Color(0xFFF0641E), start = Offset(66f, 27f), end = Offset(95f, 27f)), strokeLineWidth = 7f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M66 64 C71 54 76 66 81 57 C85 50 90 50 95 47"), stroke = Brush.linearGradient(0f to Color(0xFF9ED8FF), 1f to Color(0xFF1F7CEB), start = Offset(66f, 47f), end = Offset(95f, 47f)), strokeLineWidth = 7f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `i3-clock` */
    val I3Clock: ImageVector by lazy {
        ImageVector.Builder(name = "i3-clock", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M47.0,12.0H53.0A3.0,3.0 0 0 1 56.0,15.0V18.0A3.0,3.0 0 0 1 53.0,21.0H47.0A3.0,3.0 0 0 1 44.0,18.0V15.0A3.0,3.0 0 0 1 47.0,12.0Z"), fill = SolidColor(Color(0xFF8A93A5)))
        addGroup(rotate = 40f, pivotX = 73f, pivotY = 26f)
        addPath(pathData = addPathNodes("M71.5,23.0H75.5A2.5,2.5 0 0 1 78.0,25.5V27.5A2.5,2.5 0 0 1 75.5,30.0H71.5A2.5,2.5 0 0 1 69.0,27.5V25.5A2.5,2.5 0 0 1 71.5,23.0Z"), fill = SolidColor(Color(0xFF8A93A5)))
        clearGroup()
        addPath(pathData = addPathNodes("M19.0,55.0A31.0,31.0 0 1 0 81.0,55.0A31.0,31.0 0 1 0 19.0,55.0Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(19f, 24f), end = Offset(19f, 86f)))
        addPath(pathData = addPathNodes("M26.0,55.0A24.0,24.0 0 1 0 74.0,55.0A24.0,24.0 0 1 0 26.0,55.0Z"), fill = Brush.linearGradient(0f to Color(0xFF2A3140), 1f to Color(0xFF11141B), start = Offset(26f, 31f), end = Offset(26f, 79f)))
        addPath(pathData = addPathNodes("M50.0,34.0H50.0A1.5,1.5 0 0 1 51.5,35.5V38.5A1.5,1.5 0 0 1 50.0,40.0H50.0A1.5,1.5 0 0 1 48.5,38.5V35.5A1.5,1.5 0 0 1 50.0,34.0Z"), fill = SolidColor(Color(0xFFAEB6C4)))
        addPath(pathData = addPathNodes("M50.0,70.0H50.0A1.5,1.5 0 0 1 51.5,71.5V74.5A1.5,1.5 0 0 1 50.0,76.0H50.0A1.5,1.5 0 0 1 48.5,74.5V71.5A1.5,1.5 0 0 1 50.0,70.0Z"), fill = SolidColor(Color(0xFFAEB6C4)))
        addPath(pathData = addPathNodes("M30.5,53.5H33.5A1.5,1.5 0 0 1 35.0,55.0V55.0A1.5,1.5 0 0 1 33.5,56.5H30.5A1.5,1.5 0 0 1 29.0,55.0V55.0A1.5,1.5 0 0 1 30.5,53.5Z"), fill = SolidColor(Color(0xFFAEB6C4)))
        addPath(pathData = addPathNodes("M66.5,53.5H69.5A1.5,1.5 0 0 1 71.0,55.0V55.0A1.5,1.5 0 0 1 69.5,56.5H66.5A1.5,1.5 0 0 1 65.0,55.0V55.0A1.5,1.5 0 0 1 66.5,53.5Z"), fill = SolidColor(Color(0xFFAEB6C4)))
        addPath(pathData = addPathNodes("M50 55 L62 44"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF58AEFF)), strokeLineWidth = 4.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M45.5,55.0A4.5,4.5 0 1 0 54.5,55.0A4.5,4.5 0 1 0 45.5,55.0Z"), fill = SolidColor(Color(0xFFE4E8EF)))
        addPath(pathData = addPathNodes("M26 44 A26 26 0 0 1 44 28"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.45f, strokeLineWidth = 3.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `i3-defrost` */
    val I3Defrost: ImageVector by lazy {
        ImageVector.Builder(name = "i3-defrost", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M21.0,70.0H27.0A5.0,5.0 0 0 1 32.0,75.0V82.0A5.0,5.0 0 0 1 27.0,87.0H21.0A5.0,5.0 0 0 1 16.0,82.0V75.0A5.0,5.0 0 0 1 21.0,70.0Z"), fill = SolidColor(Color(0xFF20242C)))
        addPath(pathData = addPathNodes("M73.0,70.0H79.0A5.0,5.0 0 0 1 84.0,75.0V82.0A5.0,5.0 0 0 1 79.0,87.0H73.0A5.0,5.0 0 0 1 68.0,82.0V75.0A5.0,5.0 0 0 1 73.0,70.0Z"), fill = SolidColor(Color(0xFF20242C)))
        addPath(pathData = addPathNodes("M8 46 Q8 42 13 42 L19 42 L19 50 L10 50 Q8 50 8 48 Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(8f, 42f), end = Offset(8f, 50f)))
        addPath(pathData = addPathNodes("M92 46 Q92 42 87 42 L81 42 L81 50 L90 50 Q92 50 92 48 Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(81f, 42f), end = Offset(81f, 50f)))
        addPath(pathData = addPathNodes("M20 50 L29 22 Q31 16 38 16 L62 16 Q69 16 71 22 L80 50 Z"), fill = Brush.linearGradient(0f to Color(0xFF5B6475), 1f to Color(0xFF262B35), start = Offset(20f, 16f), end = Offset(20f, 50f)))
        addPath(pathData = addPathNodes("M25 49 L33 25 Q34 21 38 21 L62 21 Q66 21 67 25 L75 49 Z"), fill = Brush.linearGradient(0f to Color(0xFFCFE8FF), 1f to Color(0xFF3F86E0), start = Offset(25f, 21f), end = Offset(25f, 49f)))
        addPath(pathData = addPathNodes("M27 47 L34 27 Q35 24 38 24 L62 24 Q65 24 66 27 L73 47 Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.55f)
        addPath(pathData = addPathNodes("M33.0,34.0A5.0,5.0 0 1 0 43.0,34.0A5.0,5.0 0 1 0 33.0,34.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.6f)
        addPath(pathData = addPathNodes("M43.0,31.0A6.0,6.0 0 1 0 55.0,31.0A6.0,6.0 0 1 0 43.0,31.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.6f)
        addPath(pathData = addPathNodes("M55.0,35.0A5.0,5.0 0 1 0 65.0,35.0A5.0,5.0 0 1 0 55.0,35.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.6f)
        addPath(pathData = addPathNodes("M39.0,41.0A5.0,5.0 0 1 0 49.0,41.0A5.0,5.0 0 1 0 39.0,41.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.6f)
        addPath(pathData = addPathNodes("M52.5,42.0A4.5,4.5 0 1 0 61.5,42.0A4.5,4.5 0 1 0 52.5,42.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.6f)
        addPath(pathData = addPathNodes("M38 47 q-3-4 0-8 q3-4 0-8"), stroke = SolidColor(Color(0xFF2F7FE0)), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50 47 q-3-4 0-8 q3-4 0-8 q3-4 0-6"), stroke = SolidColor(Color(0xFF2F7FE0)), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M62 47 q-3-4 0-8 q3-4 0-8"), stroke = SolidColor(Color(0xFF2F7FE0)), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M35.5 33 L38 28 L40.5 33 Z"), fill = SolidColor(Color(0xFF2F7FE0)))
        addPath(pathData = addPathNodes("M47.5 27 L50 22 L52.5 27 Z"), fill = SolidColor(Color(0xFF2F7FE0)))
        addPath(pathData = addPathNodes("M59.5 33 L62 28 L64.5 33 Z"), fill = SolidColor(Color(0xFF2F7FE0)))
        addPath(pathData = addPathNodes("M8 60 Q8 50 18 49 L82 49 Q92 50 92 60 L92 74 Q92 79 87 79 L13 79 Q8 79 8 74 Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(8f, 49f), end = Offset(8f, 79f)))
        addPath(pathData = addPathNodes("M14 54 Q16 52 22 52 L44 52"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.7f, strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M16.5,58.0H26.5A3.5,3.5 0 0 1 30.0,61.5V61.5A3.5,3.5 0 0 1 26.5,65.0H16.5A3.5,3.5 0 0 1 13.0,61.5V61.5A3.5,3.5 0 0 1 16.5,58.0Z"), fill = SolidColor(Color(0xFFF4F8FF)))
        addPath(pathData = addPathNodes("M73.5,58.0H83.5A3.5,3.5 0 0 1 87.0,61.5V61.5A3.5,3.5 0 0 1 83.5,65.0H73.5A3.5,3.5 0 0 1 70.0,61.5V61.5A3.5,3.5 0 0 1 73.5,58.0Z"), fill = SolidColor(Color(0xFFF4F8FF)))
        addPath(pathData = addPathNodes("M16.2,60.0H26.8A1.2,1.2 0 0 1 28.0,61.2V61.3A1.2,1.2 0 0 1 26.8,62.5H16.2A1.2,1.2 0 0 1 15.0,61.3V61.2A1.2,1.2 0 0 1 16.2,60.0Z"), fill = SolidColor(Color(0xFF58AEFF)))
        addPath(pathData = addPathNodes("M73.2,60.0H83.8A1.2,1.2 0 0 1 85.0,61.2V61.3A1.2,1.2 0 0 1 83.8,62.5H73.2A1.2,1.2 0 0 1 72.0,61.3V61.2A1.2,1.2 0 0 1 73.2,60.0Z"), fill = SolidColor(Color(0xFF58AEFF)))
        addPath(pathData = addPathNodes("M40.5,66.0H59.5A3.5,3.5 0 0 1 63.0,69.5V69.5A3.5,3.5 0 0 1 59.5,73.0H40.5A3.5,3.5 0 0 1 37.0,69.5V69.5A3.5,3.5 0 0 1 40.5,66.0Z"), fill = SolidColor(Color(0xFF2A303B)))
        }.build()
    }

    /** `i3-dial` */
    val I3Dial: ImageVector by lazy {
        ImageVector.Builder(name = "i3-dial", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M12.0,50.0A38.0,38.0 0 1 0 88.0,50.0A38.0,38.0 0 1 0 12.0,50.0Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(12f, 12f), end = Offset(12f, 88f)))
        addPath(pathData = addPathNodes("M20.0,50.0A30.0,30.0 0 1 0 80.0,50.0A30.0,30.0 0 1 0 20.0,50.0Z"), fill = Brush.linearGradient(0f to Color(0xFF2A3140), 1f to Color(0xFF11141B), start = Offset(20f, 20f), end = Offset(20f, 80f)))
        addPath(pathData = addPathNodes("M50 27 V33"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M30 42 L35 44"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M70 42 L65 44"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M34 66 L38 63"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M66 66 L62 63"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50 52 L66 36"), fill = SolidColor(Color(0xFF000000)), stroke = Brush.linearGradient(0f to Color(0xFF58AEFF), 1f to Color(0xFF0062D6), start = Offset(50f, 36f), end = Offset(50f, 52f)), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M44.0,52.0A6.0,6.0 0 1 0 56.0,52.0A6.0,6.0 0 1 0 44.0,52.0Z"), fill = SolidColor(Color(0xFFE4E8EF)))
        addPath(pathData = addPathNodes("M24 30 A32 32 0 0 1 48 14"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.4f, strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `i3-drivemode` */
    val I3Drivemode: ImageVector by lazy {
        ImageVector.Builder(name = "i3-drivemode", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M23.0,60.0A27.0,27.0 0 1 0 77.0,60.0A27.0,27.0 0 1 0 23.0,60.0Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(23f, 33f), end = Offset(23f, 87f)))
        addPath(pathData = addPathNodes("M29.0,60.0A21.0,21.0 0 1 0 71.0,60.0A21.0,21.0 0 1 0 29.0,60.0Z"), fill = Brush.linearGradient(0f to Color(0xFF2A3140), 1f to Color(0xFF11141B), start = Offset(29f, 39f), end = Offset(29f, 81f)))
        addPath(pathData = addPathNodes("M26 50 A26 26 0 0 1 74 50"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.75f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M25.8,38.8A3.0,3.0 0 1 0 31.8,38.8A3.0,3.0 0 1 0 25.8,38.8Z"), fill = SolidColor(Color(0xFF58AEFF)))
        addPath(pathData = addPathNodes("M47.4,30.0A2.6,2.6 0 1 0 52.6,30.0A2.6,2.6 0 1 0 47.4,30.0Z"), fill = SolidColor(Color(0xFF8A93A5)))
        addPath(pathData = addPathNodes("M68.60000000000001,38.8A2.6,2.6 0 1 0 73.8,38.8A2.6,2.6 0 1 0 68.60000000000001,38.8Z"), fill = SolidColor(Color(0xFF8A93A5)))
        addPath(pathData = addPathNodes("M10.078125 23.9296875H14.970703125V25.287109375H11.73828125V26.78125H14.716796875V28.138671875H11.73828125V29.642578125H14.98046875V31.0H10.078125ZM19.326171875 25.296875Q18.8037109375 25.296875 18.427734375 25.55322265625Q18.0517578125 25.8095703125 17.84912109375 26.29541015625Q17.646484375 26.78125 17.646484375 27.46484375Q17.646484375 28.16796875 17.84912109375 28.65380859375Q18.0517578125 29.1396484375 18.427734375 29.38623046875Q18.8037109375 29.6328125 19.31640625 29.6328125Q19.8876953125 29.6328125 20.263671875 29.33984375Q20.6396484375 29.046875 20.732421875 28.529296875L22.412109375 28.5390625Q22.3388671875 29.193359375 21.953125 29.779296875Q21.5673828125 30.365234375 20.8837890625 30.7314453125Q20.2001953125 31.09765625 19.287109375 31.09765625Q18.3203125 31.09765625 17.5634765625 30.66796875Q16.806640625 30.23828125 16.376953125 29.41796875Q15.947265625 28.59765625 15.947265625 27.46484375Q15.947265625 26.3271484375 16.3818359375 25.5068359375Q16.81640625 24.6865234375 17.57568359375 24.25927734375Q18.3349609375 23.83203125 19.287109375 23.83203125Q20.1416015625 23.83203125 20.8154296875 24.14453125Q21.4892578125 24.45703125 21.90673828125 25.052734375Q22.32421875 25.6484375 22.412109375 26.478515625H20.732421875Q20.6591796875 25.931640625 20.28564453125 25.6142578125Q19.912109375 25.296875 19.326171875 25.296875ZM26.650390625 31.09765625Q25.6884765625 31.09765625 24.9267578125 30.66796875Q24.1650390625 30.23828125 23.72802734375 29.41796875Q23.291015625 28.59765625 23.291015625 27.46484375Q23.291015625 26.3271484375 23.72802734375 25.5068359375Q24.1650390625 24.6865234375 24.9267578125 24.25927734375Q25.6884765625 23.83203125 26.650390625 23.83203125Q27.607421875 23.83203125 28.37158203125 24.25927734375Q29.1357421875 24.6865234375 29.57275390625 25.5068359375Q30.009765625 26.3271484375 30.009765625 27.46484375Q30.009765625 28.6025390625 29.57275390625 29.4228515625Q29.1357421875 30.2431640625 28.37158203125 30.67041015625Q27.607421875 31.09765625 26.650390625 31.09765625ZM26.650390625 25.296875Q26.1328125 25.296875 25.75927734375 25.5458984375Q25.3857421875 25.794921875 25.18798828125 26.283203125Q24.990234375 26.771484375 24.990234375 27.46484375Q24.990234375 28.158203125 25.18798828125 28.646484375Q25.3857421875 29.134765625 25.75927734375 29.3837890625Q26.1328125 29.6328125 26.650390625 29.6328125Q27.16796875 29.6328125 27.54150390625 29.3837890625Q27.9150390625 29.134765625 28.11279296875 28.646484375Q28.310546875 28.158203125 28.310546875 27.46484375Q28.310546875 26.771484375 28.11279296875 26.283203125Q27.9150390625 25.794921875 27.54150390625 25.5458984375Q27.16796875 25.296875 26.650390625 25.296875Z"), fill = SolidColor(Color(0xFF58AEFF)))
        addPath(pathData = addPathNodes("M37.30810546875 22.0H36.1044921875L33.6640625 18.47216796875H33.62255859375V22.0H32.21142578125V15.990234375H33.431640625L35.84716796875 19.51806640625H35.89697265625V15.990234375H37.30810546875ZM41.001953125 22.0830078125Q40.184326171875 22.0830078125 39.536865234375 21.7177734375Q38.889404296875 21.3525390625 38.5179443359375 20.6552734375Q38.146484375 19.9580078125 38.146484375 18.9951171875Q38.146484375 18.028076171875 38.5179443359375 17.330810546875Q38.889404296875 16.633544921875 39.536865234375 16.2703857421875Q40.184326171875 15.9072265625 41.001953125 15.9072265625Q41.8154296875 15.9072265625 42.4649658203125 16.2703857421875Q43.114501953125 16.633544921875 43.4859619140625 17.330810546875Q43.857421875 18.028076171875 43.857421875 18.9951171875Q43.857421875 19.962158203125 43.4859619140625 20.659423828125Q43.114501953125 21.356689453125 42.4649658203125 21.7198486328125Q41.8154296875 22.0830078125 41.001953125 22.0830078125ZM41.001953125 17.15234375Q40.56201171875 17.15234375 40.2445068359375 17.364013671875Q39.927001953125 17.57568359375 39.7589111328125 17.99072265625Q39.5908203125 18.40576171875 39.5908203125 18.9951171875Q39.5908203125 19.58447265625 39.7589111328125 19.99951171875Q39.927001953125 20.41455078125 40.2445068359375 20.626220703125Q40.56201171875 20.837890625 41.001953125 20.837890625Q41.44189453125 20.837890625 41.7593994140625 20.626220703125Q42.076904296875 20.41455078125 42.2449951171875 19.99951171875Q42.4130859375 19.58447265625 42.4130859375 18.9951171875Q42.4130859375 18.40576171875 42.2449951171875 17.99072265625Q42.076904296875 17.57568359375 41.7593994140625 17.364013671875Q41.44189453125 17.15234375 41.001953125 17.15234375ZM44.69580078125 15.990234375H47.15283203125Q47.8251953125 15.990234375 48.3170166015625 16.23095703125Q48.808837890625 16.4716796875 49.0723876953125 16.9219970703125Q49.3359375 17.372314453125 49.3359375 17.982421875Q49.3359375 18.5966796875 49.0682373046875 19.03662109375Q48.800537109375 19.4765625 48.29833984375 19.704833984375L49.5517578125 22.0H47.99951171875L46.8955078125 19.93310546875H46.10693359375V22.0H44.69580078125ZM46.85400390625 18.80419921875Q47.875 18.80419921875 47.875 17.982421875Q47.875 17.563232421875 47.6156005859375 17.3494873046875Q47.356201171875 17.1357421875 46.85400390625 17.1357421875H46.10693359375V18.80419921875ZM51.88427734375 15.990234375 53.4365234375 19.775390625H53.5029296875L55.05517578125 15.990234375H56.806640625V22.0H55.4287109375V18.2646484375H55.37890625L53.91796875 21.966796875H53.021484375L51.560546875 18.248046875H51.5107421875V22.0H50.1328125V15.990234375ZM57.4375 22.0 59.4794921875 15.990234375H61.35546875L63.38916015625 22.0H61.8701171875L61.46337890625 20.71337890625H59.37158203125L58.96484375 22.0ZM61.123046875 19.63427734375 60.4423828125 17.47607421875H60.392578125L59.7119140625 19.63427734375ZM64.0283203125 15.990234375H65.439453125V20.84619140625H67.962890625V22.0H64.0283203125Z"), fill = SolidColor(Color(0xFFAEB6C4)))
        addPath(pathData = addPathNodes("M68.64453125 26.07763671875Q68.225341796875 26.07763671875 67.9991455078125 26.24365234375Q67.77294921875 26.40966796875 67.77294921875 26.67529296875Q67.77294921875 26.9326171875 68.00537109375 27.0882568359375Q68.23779296875 27.243896484375 68.66943359375 27.33935546875L69.1923828125 27.4638671875Q70.08056640625 27.6630859375 70.5516357421875 28.107177734375Q71.022705078125 28.55126953125 71.02685546875 29.2568359375Q71.022705078125 29.8212890625 70.7384033203125 30.232177734375Q70.4541015625 30.64306640625 69.9207763671875 30.863037109375Q69.387451171875 31.0830078125 68.64453125 31.0830078125Q67.88916015625 31.0830078125 67.3350830078125 30.8526611328125Q66.781005859375 30.622314453125 66.473876953125 30.16162109375Q66.166748046875 29.700927734375 66.154296875 29.0244140625H67.515625Q67.54052734375 29.451904296875 67.8372802734375 29.6781005859375Q68.134033203125 29.904296875 68.6279296875 29.904296875Q69.06787109375 29.904296875 69.3251953125 29.725830078125Q69.58251953125 29.54736328125 69.5908203125 29.2568359375Q69.586669921875 28.99951171875 69.354248046875 28.845947265625Q69.121826171875 28.6923828125 68.611328125 28.576171875L67.98046875 28.4267578125Q66.31201171875 28.040771484375 66.31201171875 26.7666015625Q66.307861328125 26.21875 66.6087646484375 25.79541015625Q66.90966796875 25.3720703125 67.4429931640625 25.1396484375Q67.976318359375 24.9072265625 68.65283203125 24.9072265625Q69.337646484375 24.9072265625 69.852294921875 25.1417236328125Q70.366943359375 25.376220703125 70.6512451171875 25.799560546875Q70.935546875 26.222900390625 70.94384765625 26.77490234375H69.58251953125Q69.5576171875 26.44287109375 69.31689453125 26.26025390625Q69.076171875 26.07763671875 68.64453125 26.07763671875ZM71.75732421875 24.990234375H74.21435546875Q74.87841796875 24.990234375 75.372314453125 25.251708984375Q75.8662109375 25.51318359375 76.1318359375 25.9801025390625Q76.3974609375 26.447021484375 76.3974609375 27.05712890625Q76.3974609375 27.675537109375 76.127685546875 28.1424560546875Q75.85791015625 28.609375 75.355712890625 28.862548828125Q74.853515625 29.11572265625 74.1728515625 29.11572265625H73.16845703125V31.0H71.75732421875ZM73.91552734375 27.9951171875Q74.4052734375 27.9951171875 74.6708984375 27.741943359375Q74.9365234375 27.48876953125 74.9365234375 27.05712890625Q74.9365234375 26.62548828125 74.6708984375 26.380615234375Q74.4052734375 26.1357421875 73.91552734375 26.1357421875H73.16845703125V27.9951171875ZM79.89208984375 31.0830078125Q79.074462890625 31.0830078125 78.427001953125 30.7177734375Q77.779541015625 30.3525390625 77.4080810546875 29.6552734375Q77.03662109375 28.9580078125 77.03662109375 27.9951171875Q77.03662109375 27.028076171875 77.4080810546875 26.330810546875Q77.779541015625 25.633544921875 78.427001953125 25.2703857421875Q79.074462890625 24.9072265625 79.89208984375 24.9072265625Q80.70556640625 24.9072265625 81.3551025390625 25.2703857421875Q82.004638671875 25.633544921875 82.3760986328125 26.330810546875Q82.74755859375 27.028076171875 82.74755859375 27.9951171875Q82.74755859375 28.962158203125 82.3760986328125 29.659423828125Q82.004638671875 30.356689453125 81.3551025390625 30.7198486328125Q80.70556640625 31.0830078125 79.89208984375 31.0830078125ZM79.89208984375 26.15234375Q79.4521484375 26.15234375 79.1346435546875 26.364013671875Q78.817138671875 26.57568359375 78.6490478515625 26.99072265625Q78.48095703125 27.40576171875 78.48095703125 27.9951171875Q78.48095703125 28.58447265625 78.6490478515625 28.99951171875Q78.817138671875 29.41455078125 79.1346435546875 29.626220703125Q79.4521484375 29.837890625 79.89208984375 29.837890625Q80.33203125 29.837890625 80.6495361328125 29.626220703125Q80.967041015625 29.41455078125 81.1351318359375 28.99951171875Q81.30322265625 28.58447265625 81.30322265625 27.9951171875Q81.30322265625 27.40576171875 81.1351318359375 26.99072265625Q80.967041015625 26.57568359375 80.6495361328125 26.364013671875Q80.33203125 26.15234375 79.89208984375 26.15234375ZM83.5859375 24.990234375H86.04296875Q86.71533203125 24.990234375 87.2071533203125 25.23095703125Q87.698974609375 25.4716796875 87.9625244140625 25.9219970703125Q88.22607421875 26.372314453125 88.22607421875 26.982421875Q88.22607421875 27.5966796875 87.9583740234375 28.03662109375Q87.690673828125 28.4765625 87.1884765625 28.704833984375L88.44189453125 31.0H86.8896484375L85.78564453125 28.93310546875H84.9970703125V31.0H83.5859375ZM85.744140625 27.80419921875Q86.76513671875 27.80419921875 86.76513671875 26.982421875Q86.76513671875 26.563232421875 86.5057373046875 26.3494873046875Q86.246337890625 26.1357421875 85.744140625 26.1357421875H84.9970703125V27.80419921875ZM88.8154296875 24.990234375H93.87060546875V26.14404296875H92.04443359375V31.0H90.6416015625V26.14404296875H88.8154296875Z"), fill = SolidColor(Color(0xFFAEB6C4)))
        addPath(pathData = addPathNodes("M50 60 L37 47"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF58AEFF)), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M44.0,60.0A6.0,6.0 0 1 0 56.0,60.0A6.0,6.0 0 1 0 44.0,60.0Z"), fill = SolidColor(Color(0xFFE4E8EF)))
        }.build()
    }

    /** `i3-expert` */
    val I3Expert: ImageVector by lazy {
        ImageVector.Builder(name = "i3-expert", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M21.0,70.0H27.0A5.0,5.0 0 0 1 32.0,75.0V82.0A5.0,5.0 0 0 1 27.0,87.0H21.0A5.0,5.0 0 0 1 16.0,82.0V75.0A5.0,5.0 0 0 1 21.0,70.0Z"), fill = SolidColor(Color(0xFF20242C)))
        addPath(pathData = addPathNodes("M73.0,70.0H79.0A5.0,5.0 0 0 1 84.0,75.0V82.0A5.0,5.0 0 0 1 79.0,87.0H73.0A5.0,5.0 0 0 1 68.0,82.0V75.0A5.0,5.0 0 0 1 73.0,70.0Z"), fill = SolidColor(Color(0xFF20242C)))
        addPath(pathData = addPathNodes("M20 50 L28 24 Q30 18 37 18 L63 18 Q70 18 72 24 L80 50 Z"), fill = Brush.linearGradient(0f to Color(0xFF5B6475), 1f to Color(0xFF262B35), start = Offset(20f, 18f), end = Offset(20f, 50f)))
        addPath(pathData = addPathNodes("M25 48 L32 27 Q33 23 38 23 L62 23 Q67 23 68 27 L75 48 Z"), fill = Brush.linearGradient(0f to Color(0xFF5B6B85), 1f to Color(0xFF232B3A), start = Offset(25f, 23f), end = Offset(25f, 48f)))
        addPath(pathData = addPathNodes("M8 60 Q8 50 18 49 L82 49 Q92 50 92 60 L92 74 Q92 79 87 79 L13 79 Q8 79 8 74 Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(8f, 49f), end = Offset(8f, 79f)))
        addPath(pathData = addPathNodes("M14 54 Q16 52 22 52 L44 52"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.7f, strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M12.5,56.0H87.5A2.5,2.5 0 0 1 90.0,58.5V58.5A2.5,2.5 0 0 1 87.5,61.0H12.5A2.5,2.5 0 0 1 10.0,58.5V58.5A2.5,2.5 0 0 1 12.5,56.0Z"), fill = SolidColor(Color(0xFFB9C8DE)))
        addPath(pathData = addPathNodes("M12.8,57.2H87.2A0.8,0.8 0 0 1 88.0,58.0V58.00000000000001A0.8,0.8 0 0 1 87.2,58.800000000000004H12.8A0.8,0.8 0 0 1 12.0,58.00000000000001V58.0A0.8,0.8 0 0 1 12.8,57.2Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        addPath(pathData = addPathNodes("M40.0,66.0H60.0A2.0,2.0 0 0 1 62.0,68.0V73.0A2.0,2.0 0 0 1 60.0,75.0H40.0A2.0,2.0 0 0 1 38.0,73.0V68.0A2.0,2.0 0 0 1 40.0,66.0Z"), fill = SolidColor(Color(0xFFF4F6FA)))
        addPath(pathData = addPathNodes("M40.0,66.0H60.0A2.0,2.0 0 0 1 62.0,68.0V73.0A2.0,2.0 0 0 1 60.0,75.0H40.0A2.0,2.0 0 0 1 38.0,73.0V68.0A2.0,2.0 0 0 1 40.0,66.0Z"), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 1f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M40.0,35.0A10.0,10.0 0 1 0 60.0,35.0A10.0,10.0 0 1 0 40.0,35.0Z"), fill = SolidColor(Color(0xFF0082FF)))
        addPath(pathData = addPathNodes("M50 28.5 L52 33 L57 33.4 L53.2 36.6 L54.4 41.5 L50 38.9 L45.6 41.5 L46.8 36.6 L43 33.4 L48 33 Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        addPath(pathData = addPathNodes("M78 10 L80 15 L85 17 L80 19 L78 24 L76 19 L71 17 L76 15 Z"), fill = SolidColor(Color(0xFF9FD4FF)))
        addPath(pathData = addPathNodes("M20 14 L21.3 17.2 L24.5 18.5 L21.3 19.8 L20 23 L18.7 19.8 L15.5 18.5 L18.7 17.2 Z"), fill = SolidColor(Color(0xFF9FD4FF)))
        }.build()
    }

    /** `i3-fan` */
    val I3Fan: ImageVector by lazy {
        ImageVector.Builder(name = "i3-fan", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M50 50 C 30 46, 20 30, 30 16 C 42 10, 52 26, 50 50 Z"), fill = Brush.linearGradient(0f to Color(0xFFBFE3FF), 1f to Color(0xFF2F7FE0), start = Offset(26.077f, 14.735f), end = Offset(26.077f, 50f)))
        addPath(pathData = addPathNodes("M50 50 C 54 30, 70 20, 84 30 C 90 42, 74 52, 50 50 Z"), fill = Brush.linearGradient(0f to Color(0xFFBFE3FF), 1f to Color(0xFF2F7FE0), start = Offset(50f, 26.077f), end = Offset(50f, 50.256f)))
        addPath(pathData = addPathNodes("M50 50 C 70 54, 80 70, 70 84 C 58 90, 48 74, 50 50 Z"), fill = Brush.linearGradient(0f to Color(0xFFBFE3FF), 1f to Color(0xFF2F7FE0), start = Offset(49.744f, 50f), end = Offset(49.744f, 85.265f)))
        addPath(pathData = addPathNodes("M50 50 C 46 70, 30 80, 16 70 C 10 58, 26 48, 50 50 Z"), fill = Brush.linearGradient(0f to Color(0xFFBFE3FF), 1f to Color(0xFF2F7FE0), start = Offset(14.735f, 49.744f), end = Offset(14.735f, 73.923f)))
        addPath(pathData = addPathNodes("M40.0,50.0A10.0,10.0 0 1 0 60.0,50.0A10.0,10.0 0 1 0 40.0,50.0Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(40f, 40f), end = Offset(40f, 60f)))
        addPath(pathData = addPathNodes("M46.0,50.0A4.0,4.0 0 1 0 54.0,50.0A4.0,4.0 0 1 0 46.0,50.0Z"), fill = SolidColor(Color(0xFF262B35)))
        }.build()
    }

    /** `i3-gear` */
    val I3Gear: ImageVector by lazy {
        ImageVector.Builder(name = "i3-gear", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M50 10 L58 12 L60 22 L68 26 L77 21 L83 27 L78 36 L82 44 L92 46 L92 54 L82 56 L78 64 L83 73 L77 79 L68 74 L60 78 L58 88 L42 88 L40 78 L32 74 L23 79 L17 73 L22 64 L18 56 L8 54 L8 46 L18 44 L22 36 L17 27 L23 21 L32 26 L40 22 L42 12 Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(8f, 10f), end = Offset(8f, 88f)))
        addPath(pathData = addPathNodes("M32.0,50.0A18.0,18.0 0 1 0 68.0,50.0A18.0,18.0 0 1 0 32.0,50.0Z"), fill = SolidColor(Color(0xFF262B35)))
        addPath(pathData = addPathNodes("M39.0,50.0A11.0,11.0 0 1 0 61.0,50.0A11.0,11.0 0 1 0 39.0,50.0Z"), fill = Brush.linearGradient(0f to Color(0xFF58AEFF), 1f to Color(0xFF0062D6), start = Offset(39f, 39f), end = Offset(39f, 61f)))
        addGroup(rotate = -25f, pivotX = 44f, pivotY = 30f)
        addPath(pathData = addPathNodes("M34.0,30.0A10.0,4.0 0 1 0 54.0,30.0A10.0,4.0 0 1 0 34.0,30.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.45f)
        clearGroup()
        }.build()
    }

    /** `i3-headlamp` */
    val I3Headlamp: ImageVector by lazy {
        ImageVector.Builder(name = "i3-headlamp", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M30.0,14.0H70.0A20.0,20.0 0 0 1 90.0,34.0V68.0A20.0,20.0 0 0 1 70.0,88.0H30.0A20.0,20.0 0 0 1 10.0,68.0V34.0A20.0,20.0 0 0 1 30.0,14.0Z"), fill = Brush.linearGradient(0f to Color(0xFF6A7385), 1f to Color(0xFF20242D), start = Offset(10f, 14f), end = Offset(10f, 88f)))
        addPath(pathData = addPathNodes("M31.0,16.0H69.0A17.0,17.0 0 0 1 86.0,33.0V65.0A17.0,17.0 0 0 1 69.0,82.0H31.0A17.0,17.0 0 0 1 14.0,65.0V33.0A17.0,17.0 0 0 1 31.0,16.0Z"), fill = Brush.linearGradient(0f to Color(0xFF3B4352), 1f to Color(0xFF191D25), start = Offset(14f, 16f), end = Offset(14f, 82f)))
        addPath(pathData = addPathNodes("M22 32 Q22 21 33 21 L64 21"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.28f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M44.0,25.0H56.0A2.0,2.0 0 0 1 58.0,27.0V27.0A2.0,2.0 0 0 1 56.0,29.0H44.0A2.0,2.0 0 0 1 42.0,27.0V27.0A2.0,2.0 0 0 1 44.0,25.0Z"), fill = SolidColor(Color(0xFF58AEFF)))
        addPath(pathData = addPathNodes("M52 39 Q71 39 71 53 Q71 67 52 67 Z"), fill = SolidColor(Color(0xFFF4F6FA)))
        addPath(pathData = addPathNodes("M28 44 L45 41"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFFF4F6FA)), strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M28 51 L45 48"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFFF4F6FA)), strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M28 58 L45 55"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFFF4F6FA)), strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M28 65 L45 62"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFFF4F6FA)), strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `i3-hud` */
    val I3Hud: ImageVector by lazy {
        ImageVector.Builder(name = "i3-hud", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M12 78 L28 30 Q30 24 36 24 L64 24 Q70 24 72 30 L88 78 Z"), fill = Brush.linearGradient(0f to Color(0xFF5B6475), 1f to Color(0xFF262B35), start = Offset(12f, 24f), end = Offset(12f, 78f)))
        addPath(pathData = addPathNodes("M19 72 L32 32 Q33 29 36 29 L64 29 Q67 29 68 32 L81 72 Z"), fill = Brush.linearGradient(0f to Color(0xFFCFE8FF), 1f to Color(0xFF3F86E0), start = Offset(19f, 29f), end = Offset(19f, 72f)))
        addPath(pathData = addPathNodes("M40.0,42.0H60.0A4.0,4.0 0 0 1 64.0,46.0V56.0A4.0,4.0 0 0 1 60.0,60.0H40.0A4.0,4.0 0 0 1 36.0,56.0V46.0A4.0,4.0 0 0 1 40.0,42.0Z"), fill = Brush.linearGradient(0f to Color(0xFF58AEFF), 1f to Color(0xFF0062D6), start = Offset(36f, 42f), end = Offset(36f, 60f)))
        addPath(pathData = addPathNodes("M42 51 H58 M50 46 V56"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `i3-key` */
    val I3Key: ImageVector by lazy {
        ImageVector.Builder(name = "i3-key", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M39.0,12.0H61.0A9.0,9.0 0 0 1 70.0,21.0V79.0A9.0,9.0 0 0 1 61.0,88.0H39.0A9.0,9.0 0 0 1 30.0,79.0V21.0A9.0,9.0 0 0 1 39.0,12.0Z"), fill = Brush.linearGradient(0f to Color(0xFF5B6475), 1f to Color(0xFF262B35), start = Offset(30f, 12f), end = Offset(30f, 88f)))
        addPath(pathData = addPathNodes("M39.0,18.0H61.0A5.0,5.0 0 0 1 66.0,23.0V71.0A5.0,5.0 0 0 1 61.0,76.0H39.0A5.0,5.0 0 0 1 34.0,71.0V23.0A5.0,5.0 0 0 1 39.0,18.0Z"), fill = Brush.linearGradient(0f to Color(0xFFBFE3FF), 1f to Color(0xFF2F7FE0), start = Offset(34f, 18f), end = Offset(34f, 76f)))
        addPath(pathData = addPathNodes("M37.0,28.0A5.0,9.0 0 1 0 47.0,28.0A5.0,9.0 0 1 0 37.0,28.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.4f)
        addPath(pathData = addPathNodes("M47.0,82.0A3.0,3.0 0 1 0 53.0,82.0A3.0,3.0 0 1 0 47.0,82.0Z"), fill = SolidColor(Color(0xFF8A93A5)))
        }.build()
    }

    /** `i3-list` */
    val I3List: ImageVector by lazy {
        ImageVector.Builder(name = "i3-list", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M30.0,12.0H70.0A12.0,12.0 0 0 1 82.0,24.0V76.0A12.0,12.0 0 0 1 70.0,88.0H30.0A12.0,12.0 0 0 1 18.0,76.0V24.0A12.0,12.0 0 0 1 30.0,12.0Z"), fill = Brush.linearGradient(0f to Color(0xFFF7F9FC), 1f to Color(0xFFC3CCDA), start = Offset(18f, 12f), end = Offset(18f, 88f)))
        addPath(pathData = addPathNodes("M24.5,28.0A6.5,6.5 0 1 0 37.5,28.0A6.5,6.5 0 1 0 24.5,28.0Z"), fill = Brush.linearGradient(0f to Color(0xFF58AEFF), 1f to Color(0xFF0062D6), start = Offset(24.5f, 21.5f), end = Offset(24.5f, 34.5f)))
        addPath(pathData = addPathNodes("M28 28 L30.5 30.5 L34.5 25.5"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        addPath(pathData = addPathNodes("M45.0,25.0H73.0A3.0,3.0 0 0 1 76.0,28.0V28.0A3.0,3.0 0 0 1 73.0,31.0H45.0A3.0,3.0 0 0 1 42.0,28.0V28.0A3.0,3.0 0 0 1 45.0,25.0Z"), fill = SolidColor(Color(0xFF9AA4B2)), fillAlpha = 0.75f)
        addPath(pathData = addPathNodes("M24.5,44.0A6.5,6.5 0 1 0 37.5,44.0A6.5,6.5 0 1 0 24.5,44.0Z"), fill = Brush.linearGradient(0f to Color(0xFF58AEFF), 1f to Color(0xFF0062D6), start = Offset(24.5f, 37.5f), end = Offset(24.5f, 50.5f)))
        addPath(pathData = addPathNodes("M28 44 L30.5 46.5 L34.5 41.5"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        addPath(pathData = addPathNodes("M45.0,41.0H69.0A3.0,3.0 0 0 1 72.0,44.0V44.0A3.0,3.0 0 0 1 69.0,47.0H45.0A3.0,3.0 0 0 1 42.0,44.0V44.0A3.0,3.0 0 0 1 45.0,41.0Z"), fill = SolidColor(Color(0xFF9AA4B2)), fillAlpha = 0.75f)
        addPath(pathData = addPathNodes("M25.0,60.0A6.0,6.0 0 1 0 37.0,60.0A6.0,6.0 0 1 0 25.0,60.0Z"), stroke = SolidColor(Color(0xFF9AA4B2)), strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M45.0,57.0H73.0A3.0,3.0 0 0 1 76.0,60.0V60.0A3.0,3.0 0 0 1 73.0,63.0H45.0A3.0,3.0 0 0 1 42.0,60.0V60.0A3.0,3.0 0 0 1 45.0,57.0Z"), fill = SolidColor(Color(0xFF9AA4B2)), fillAlpha = 0.75f)
        addPath(pathData = addPathNodes("M25.0,76.0A6.0,6.0 0 1 0 37.0,76.0A6.0,6.0 0 1 0 25.0,76.0Z"), stroke = SolidColor(Color(0xFF9AA4B2)), strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M45.0,73.0H69.0A3.0,3.0 0 0 1 72.0,76.0V76.0A3.0,3.0 0 0 1 69.0,79.0H45.0A3.0,3.0 0 0 1 42.0,76.0V76.0A3.0,3.0 0 0 1 45.0,73.0Z"), fill = SolidColor(Color(0xFF9AA4B2)), fillAlpha = 0.75f)
        addPath(pathData = addPathNodes("M24 20 Q24 16 30 16 L52 16"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.8f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `i3-map` */
    val I3Map: ImageVector by lazy {
        ImageVector.Builder(name = "i3-map", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M14 30 L38 22 L38 78 L14 86 Z"), fill = Brush.linearGradient(0f to Color(0xFFF3F6FB), 1f to Color(0xFFC9D1DE), start = Offset(14f, 22f), end = Offset(14f, 86f)))
        addPath(pathData = addPathNodes("M38 22 L62 30 L62 86 L38 78 Z"), fill = Brush.linearGradient(0f to Color(0xFFDDE4EE), 1f to Color(0xFFAEB8C8), start = Offset(38f, 22f), end = Offset(38f, 86f)))
        addPath(pathData = addPathNodes("M62 30 L86 22 L86 78 L62 86 Z"), fill = Brush.linearGradient(0f to Color(0xFFF3F6FB), 1f to Color(0xFFC9D1DE), start = Offset(62f, 22f), end = Offset(62f, 86f)))
        addPath(pathData = addPathNodes("M22.000,70.000L22.251,69.567 22.507,69.138 22.770,68.713 23.038,68.291 23.312,67.872 23.592,67.458 23.879,67.049 24.172,66.644 24.471,66.243 24.778,65.848 25.091,65.458 25.411,65.074 25.738,64.696 26.072,64.324M30.660,60.487L31.089,60.231 31.525,59.986 31.968,59.754 32.416,59.533 32.871,59.325 33.331,59.129 33.796,58.946 34.267,58.776 34.741,58.620 35.220,58.476 35.703,58.346 36.189,58.229 36.678,58.125 37.170,58.034M43.149,57.893L43.645,57.952 44.141,58.020 44.637,58.083 45.134,58.137 45.632,58.180 46.131,58.214 46.630,58.236 47.130,58.248 47.630,58.249 48.130,58.238 48.629,58.215 49.128,58.180 49.626,58.133 50.122,58.074M55.839,56.343L56.284,56.116 56.723,55.876 57.156,55.625 57.581,55.362 58.000,55.089 58.411,54.805 58.815,54.510 59.212,54.206 59.601,53.893 59.983,53.570 60.358,53.239 60.725,52.899 61.084,52.552 61.436,52.196M65.115,47.470L65.380,47.046 65.639,46.618 65.892,46.187 66.141,45.754 66.393,45.322 66.647,44.891 66.905,44.463 67.167,44.037 67.432,43.613 67.701,43.192 67.974,42.773 68.252,42.357 68.534,41.944 68.821,41.535M72.786,37.053L73.176,36.740 73.579,36.444 73.995,36.167 74.426,35.913 74.870,35.685 75.330,35.487 75.803,35.326 76.288,35.206 76.782,35.133 77.282,35.111 77.780,35.144 78.272,35.231 78.752,35.370 79.216,35.558"), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M66 44 V14"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF262B35)), strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M66 14 L86 20 L66 26 Z"), fill = Brush.linearGradient(0f to Color(0xFF58AEFF), 1f to Color(0xFF0062D6), start = Offset(66f, 14f), end = Offset(66f, 26f)))
        }.build()
    }

    /** `i3-medal` */
    val I3Medal: ImageVector by lazy {
        ImageVector.Builder(name = "i3-medal", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M36 10 L50 40 L30 48 L20 14 Z"), fill = Brush.linearGradient(0f to Color(0xFF4C8DFF), 1f to Color(0xFF0062D6), start = Offset(20f, 10f), end = Offset(20f, 48f)))
        addPath(pathData = addPathNodes("M64 10 L50 40 L70 48 L80 14 Z"), fill = SolidColor(Color(0xFF2F6FD9)))
        addPath(pathData = addPathNodes("M24.0,62.0A26.0,26.0 0 1 0 76.0,62.0A26.0,26.0 0 1 0 24.0,62.0Z"), fill = Brush.linearGradient(0f to Color(0xFFFFE38A), 1f to Color(0xFFE8A800), start = Offset(24f, 36f), end = Offset(24f, 88f)))
        addPath(pathData = addPathNodes("M32.0,62.0A18.0,18.0 0 1 0 68.0,62.0A18.0,18.0 0 1 0 32.0,62.0Z"), fill = Brush.linearGradient(0f to Color(0xFFFFF3C4), 1f to Color(0xFFF2C14E), start = Offset(32f, 44f), end = Offset(32f, 80f)))
        addGroup(rotate = -25f, pivotX = 42f, pivotY = 50f)
        addPath(pathData = addPathNodes("M35.0,50.0A7.0,4.0 0 1 0 49.0,50.0A7.0,4.0 0 1 0 35.0,50.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.6f)
        clearGroup()
        addPath(pathData = addPathNodes("M50 52 L53 59 L61 60 L55 65 L57 73 L50 69 L43 73 L45 65 L39 60 L47 59 Z"), fill = SolidColor(Color(0xFFC98900)))
        }.build()
    }

    /** `i3-mirror` */
    val I3Mirror: ImageVector by lazy {
        ImageVector.Builder(name = "i3-mirror", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M16 38 Q16 26 28 26 L74 26 Q86 26 86 36 L86 58 Q86 68 76 68 L40 68 Q16 68 16 48 Z"), fill = Brush.linearGradient(0f to Color(0xFF5B6475), 1f to Color(0xFF262B35), start = Offset(16f, 26f), end = Offset(16f, 68f)))
        addPath(pathData = addPathNodes("M24 40 Q24 32 32 32 L72 32 Q79 32 79 38 L79 56 Q79 62 73 62 L42 62 Q24 62 24 48 Z"), fill = Brush.linearGradient(0f to Color(0xFFCFE8FF), 1f to Color(0xFF3F86E0), start = Offset(24f, 32f), end = Offset(24f, 62f)))
        addPath(pathData = addPathNodes("M30 38 Q46 34 64 34 L66 39 Q48 39 34 44 Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.4f)
        addPath(pathData = addPathNodes("M44 68 V82 H60"), stroke = SolidColor(Color(0xFF262B35)), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `i3-nohint` */
    val I3Nohint: ImageVector by lazy {
        ImageVector.Builder(name = "i3-nohint", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M50 14 a26 26 0 0 1 14 48 q-4 3-4 8 H40 q0-5-4-8 a26 26 0 0 1 14-48 Z"), fill = Brush.linearGradient(0f to Color(0xFFD9DEE7), 1f to Color(0xFF8E97A8), start = Offset(23.856f, 14f), end = Offset(23.856f, 70f)))
        addGroup(rotate = 20f, pivotX = 42f, pivotY = 30f)
        addPath(pathData = addPathNodes("M35.0,30.0A7.0,11.0 0 1 0 49.0,30.0A7.0,11.0 0 1 0 35.0,30.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.45f)
        clearGroup()
        addPath(pathData = addPathNodes("M41.0,72.0H59.0A3.0,3.0 0 0 1 62.0,75.0V76.0A3.0,3.0 0 0 1 59.0,79.0H41.0A3.0,3.0 0 0 1 38.0,76.0V75.0A3.0,3.0 0 0 1 41.0,72.0Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(38f, 72f), end = Offset(38f, 79f)))
        addPath(pathData = addPathNodes("M43.0,81.0H57.0A3.0,3.0 0 0 1 60.0,84.0V84.0A3.0,3.0 0 0 1 57.0,87.0H43.0A3.0,3.0 0 0 1 40.0,84.0V84.0A3.0,3.0 0 0 1 43.0,81.0Z"), fill = SolidColor(Color(0xFF8A93A5)))
        addPath(pathData = addPathNodes("M20 18 L80 78"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFFF4F6FA)), strokeLineWidth = 12f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M20 18 L80 78"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF4A5262)), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `i3-novice` */
    val I3Novice: ImageVector by lazy {
        ImageVector.Builder(name = "i3-novice", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M21.0,70.0H27.0A5.0,5.0 0 0 1 32.0,75.0V82.0A5.0,5.0 0 0 1 27.0,87.0H21.0A5.0,5.0 0 0 1 16.0,82.0V75.0A5.0,5.0 0 0 1 21.0,70.0Z"), fill = SolidColor(Color(0xFF20242C)))
        addPath(pathData = addPathNodes("M73.0,70.0H79.0A5.0,5.0 0 0 1 84.0,75.0V82.0A5.0,5.0 0 0 1 79.0,87.0H73.0A5.0,5.0 0 0 1 68.0,82.0V75.0A5.0,5.0 0 0 1 73.0,70.0Z"), fill = SolidColor(Color(0xFF20242C)))
        addPath(pathData = addPathNodes("M20 50 L28 24 Q30 18 37 18 L63 18 Q70 18 72 24 L80 50 Z"), fill = Brush.linearGradient(0f to Color(0xFF5B6475), 1f to Color(0xFF262B35), start = Offset(20f, 18f), end = Offset(20f, 50f)))
        addPath(pathData = addPathNodes("M25 48 L32 27 Q33 23 38 23 L62 23 Q67 23 68 27 L75 48 Z"), fill = Brush.linearGradient(0f to Color(0xFF5B6B85), 1f to Color(0xFF232B3A), start = Offset(25f, 23f), end = Offset(25f, 48f)))
        addPath(pathData = addPathNodes("M8 60 Q8 50 18 49 L82 49 Q92 50 92 60 L92 74 Q92 79 87 79 L13 79 Q8 79 8 74 Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(8f, 49f), end = Offset(8f, 79f)))
        addPath(pathData = addPathNodes("M14 54 Q16 52 22 52 L44 52"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.7f, strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M12.5,56.0H87.5A2.5,2.5 0 0 1 90.0,58.5V58.5A2.5,2.5 0 0 1 87.5,61.0H12.5A2.5,2.5 0 0 1 10.0,58.5V58.5A2.5,2.5 0 0 1 12.5,56.0Z"), fill = SolidColor(Color(0xFFB9C8DE)))
        addPath(pathData = addPathNodes("M12.8,57.2H87.2A0.8,0.8 0 0 1 88.0,58.0V58.00000000000001A0.8,0.8 0 0 1 87.2,58.800000000000004H12.8A0.8,0.8 0 0 1 12.0,58.00000000000001V58.0A0.8,0.8 0 0 1 12.8,57.2Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        addPath(pathData = addPathNodes("M40.0,66.0H60.0A2.0,2.0 0 0 1 62.0,68.0V73.0A2.0,2.0 0 0 1 60.0,75.0H40.0A2.0,2.0 0 0 1 38.0,73.0V68.0A2.0,2.0 0 0 1 40.0,66.0Z"), fill = SolidColor(Color(0xFFF4F6FA)))
        addPath(pathData = addPathNodes("M40.0,66.0H60.0A2.0,2.0 0 0 1 62.0,68.0V73.0A2.0,2.0 0 0 1 60.0,75.0H40.0A2.0,2.0 0 0 1 38.0,73.0V68.0A2.0,2.0 0 0 1 40.0,66.0Z"), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 1f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M33.0,27.0H67.0A3.0,3.0 0 0 1 70.0,30.0V40.0A3.0,3.0 0 0 1 67.0,43.0H33.0A3.0,3.0 0 0 1 30.0,40.0V30.0A3.0,3.0 0 0 1 33.0,27.0Z"), fill = SolidColor(Color(0xFFFFD24A)), stroke = SolidColor(Color(0xFFE0A800)), strokeLineWidth = 1.5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M41.142578125 38.551171875H32.94921875V37.40859375H36.34765625V35.7484375H37.734375V37.40859375H41.142578125ZM40.44921875 32.8578125H37.7783203125Q37.841796875 33.3265625 38.193359375 33.76357421875Q38.544921875 34.2005859375 39.228515625 34.5228515625Q39.912109375 34.8451171875 40.91796875 34.957421875L40.41015625 36.0609375Q39.2138671875 35.9193359375 38.359375 35.4701171875Q37.5048828125 35.0208984375 37.0361328125 34.3470703125Q36.5673828125 35.0208984375 35.72021484375 35.4701171875Q34.873046875 35.9193359375 33.681640625 36.0609375L33.173828125 34.957421875Q34.1748046875 34.8451171875 34.85595703125 34.5228515625Q35.537109375 34.2005859375 35.888671875 33.76357421875Q36.240234375 33.3265625 36.3037109375 32.8578125H33.642578125V31.74453125H36.34765625V30.660546875H37.734375V31.74453125H40.44921875ZM49.78515625 38.531640625H41.591796875V37.3890625H44.98046875V35.816796875H42.431640625V31.129296875H43.837890625V32.44765625H47.5V31.129296875H48.90625V35.816796875H46.3671875V37.3890625H49.78515625ZM47.5 34.703515625V33.551171875H43.837890625V34.703515625ZM58.41796875 35.9828125H55.107421875V37.457421875H53.681640625V35.9828125H50.224609375V34.879296875H58.41796875ZM57.51953125 39.391015625H51.171875V36.6859375H52.587890625V38.258203125H57.51953125ZM57.578125 32.60390625Q57.578125 33.1703125 57.1728515625 33.59267578125Q56.767578125 34.0150390625 56.02783203125 34.24208984375Q55.2880859375 34.469140625 54.31640625 34.469140625Q53.3447265625 34.469140625 52.6025390625 34.24208984375Q51.8603515625 34.0150390625 51.45263671875 33.59267578125Q51.044921875 33.1703125 51.044921875 32.60390625Q51.044921875 32.0423828125 51.45263671875 31.617578125Q51.8603515625 31.1927734375 52.6025390625 30.96328125Q53.3447265625 30.7337890625 54.31640625 30.72890625Q55.2880859375 30.7337890625 56.025390625 30.96328125Q56.7626953125 31.1927734375 57.17041015625 31.617578125Q57.578125 32.0423828125 57.578125 32.60390625ZM52.568359375 32.60390625Q52.5634765625 32.9701171875 53.02734375 33.16298828125Q53.4912109375 33.355859375 54.31640625 33.355859375Q55.1416015625 33.355859375 55.60302734375 33.16298828125Q56.064453125 32.9701171875 56.064453125 32.60390625Q56.064453125 32.223046875 55.60546875 32.027734375Q55.146484375 31.832421875 54.31640625 31.832421875Q53.4912109375 31.832421875 53.02734375 32.027734375Q52.5634765625 32.223046875 52.568359375 32.60390625ZM66.46484375 37.115625H65.068359375V33.980859375H63.720703125V32.848046875H65.068359375V30.582421875H66.46484375ZM66.669921875 39.391015625H60.458984375V36.54921875H61.865234375V38.26796875H66.669921875ZM64.35546875 34.879296875 63.671875 35.992578125Q62.958984375 35.76796875 62.451171875 35.328515625Q61.943359375 34.8890625 61.640625 34.293359375Q61.337890625 34.957421875 60.80810546875 35.43837890625Q60.2783203125 35.9193359375 59.521484375 36.15859375L58.798828125 35.02578125Q59.53125 34.8060546875 60.00244140625 34.37880859375Q60.4736328125 33.9515625 60.69091796875 33.414453125Q60.908203125 32.87734375 60.908203125 32.29140625V32.271875H59.189453125V31.148828125H64.052734375V32.271875H62.34375V32.301171875Q62.34375 32.8333984375 62.55126953125 33.336328125Q62.7587890625 33.8392578125 63.21044921875 34.24697265625Q63.662109375 34.6546875 64.35546875 34.879296875Z"), fill = SolidColor(Color(0xFF1B1E24)))
        }.build()
    }

    /** `i3-paddle` */
    val I3Paddle: ImageVector by lazy {
        ImageVector.Builder(name = "i3-paddle", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M24 38 Q9 42 8 58 Q8 72 19 80 L29 70 Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(8f, 38f), end = Offset(8f, 80f)))
        addPath(pathData = addPathNodes("M76 38 Q91 42 92 58 Q92 72 81 80 L71 70 Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(71f, 38f), end = Offset(71f, 80f)))
        addPath(pathData = addPathNodes("M19.720703125 60.748046875H12.2939453125V58.7119140625H19.720703125Z"), fill = SolidColor(Color(0xFF262B35)))
        addPath(pathData = addPathNodes("M83.04296875 60.96484375H80.513671875V59.064453125H83.04296875V56.53515625H84.95703125V59.064453125H87.486328125V60.96484375H84.95703125V63.494140625H83.04296875Z"), fill = SolidColor(Color(0xFF262B35)))
        addPath(pathData = addPathNodes("M21.0,54.0A29.0,29.0 0 1 0 79.0,54.0A29.0,29.0 0 1 0 21.0,54.0Z"), stroke = Brush.linearGradient(0f to Color(0xFF5B6475), 1f to Color(0xFF1E222A), start = Offset(21f, 25f), end = Offset(21f, 83f)), strokeLineWidth = 9f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M25 46 A29 29 0 0 1 75 46"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.35f, strokeLineWidth = 2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M23 58 H38 M62 58 H77 M50 70 V82"), fill = SolidColor(Color(0xFF000000)), stroke = Brush.linearGradient(0f to Color(0xFF5B6475), 1f to Color(0xFF1E222A), start = Offset(23f, 58f), end = Offset(23f, 82f)), strokeLineWidth = 8f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M39.0,58.0A11.0,11.0 0 1 0 61.0,58.0A11.0,11.0 0 1 0 39.0,58.0Z"), fill = Brush.linearGradient(0f to Color(0xFF4A5262), 1f to Color(0xFF20242C), start = Offset(39f, 47f), end = Offset(39f, 69f)), stroke = SolidColor(Color(0xFFB9C2CF)), strokeLineWidth = 1.5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M43.0,8.0H57.0A4.0,4.0 0 0 1 61.0,12.0V19.0A4.0,4.0 0 0 1 57.0,23.0H43.0A4.0,4.0 0 0 1 39.0,19.0V12.0A4.0,4.0 0 0 1 43.0,8.0Z"), fill = SolidColor(Color(0xFF0E1116)), stroke = SolidColor(Color(0xFF3A4150)), strokeLineWidth = 1f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M46.818359375 17.52734375H48.763671875Q48.775390625 17.837890625 48.9482421875 18.0751953125Q49.12109375 18.3125 49.408203125 18.44140625Q49.6953125 18.5703125 50.041015625 18.5703125Q50.43359375 18.5703125 50.7470703125 18.39453125Q51.060546875 18.21875 51.2333984375 17.9052734375Q51.40625 17.591796875 51.400390625 17.1875Q51.40625 16.77734375 51.23046875 16.4609375Q51.0546875 16.14453125 50.73828125 15.96875Q50.421875 15.79296875 50.017578125 15.79296875Q49.56640625 15.79296875 49.2587890625 15.9658203125Q48.951171875 16.138671875 48.775390625 16.484375H46.982421875L47.404296875 11.515625H52.830078125V13.1328125H49.044921875L48.845703125 15.16015625H48.904296875Q49.126953125 14.802734375 49.595703125 14.5830078125Q50.064453125 14.36328125 50.650390625 14.36328125Q51.41796875 14.36328125 52.02734375 14.7177734375Q52.63671875 15.072265625 52.9853515625 15.7021484375Q53.333984375 16.33203125 53.333984375 17.12890625Q53.333984375 17.99609375 52.9208984375 18.67578125Q52.5078125 19.35546875 51.7607421875 19.736328125Q51.013671875 20.1171875 50.041015625 20.1171875Q49.126953125 20.1171875 48.3974609375 19.7861328125Q47.66796875 19.455078125 47.2490234375 18.86328125Q46.830078125 18.271484375 46.818359375 17.52734375Z"), fill = SolidColor(Color(0xFF58AEFF)))
        }.build()
    }

    /** `i3-park` */
    val I3Park: ImageVector by lazy {
        ImageVector.Builder(name = "i3-park", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M30.0,14.0H70.0A20.0,20.0 0 0 1 90.0,34.0V68.0A20.0,20.0 0 0 1 70.0,88.0H30.0A20.0,20.0 0 0 1 10.0,68.0V34.0A20.0,20.0 0 0 1 30.0,14.0Z"), fill = Brush.linearGradient(0f to Color(0xFF6A7385), 1f to Color(0xFF20242D), start = Offset(10f, 14f), end = Offset(10f, 88f)))
        addPath(pathData = addPathNodes("M31.0,16.0H69.0A17.0,17.0 0 0 1 86.0,33.0V65.0A17.0,17.0 0 0 1 69.0,82.0H31.0A17.0,17.0 0 0 1 14.0,65.0V33.0A17.0,17.0 0 0 1 31.0,16.0Z"), fill = Brush.linearGradient(0f to Color(0xFF3B4352), 1f to Color(0xFF191D25), start = Offset(14f, 16f), end = Offset(14f, 82f)))
        addPath(pathData = addPathNodes("M22 32 Q22 21 33 21 L64 21"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.28f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M44.0,25.0H56.0A2.0,2.0 0 0 1 58.0,27.0V27.0A2.0,2.0 0 0 1 56.0,29.0H44.0A2.0,2.0 0 0 1 42.0,27.0V27.0A2.0,2.0 0 0 1 44.0,25.0Z"), fill = SolidColor(Color(0xFF58AEFF)))
        addPath(pathData = addPathNodes("M29.0,54.0A21.0,21.0 0 1 0 71.0,54.0A21.0,21.0 0 1 0 29.0,54.0Z"), stroke = SolidColor(Color(0xFFF4F6FA)), strokeLineWidth = 4f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M44 66 V42 H52 Q60 42 60 50 Q60 58 52 58 H44"), stroke = SolidColor(Color(0xFFF4F6FA)), strokeLineWidth = 5.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        }.build()
    }

    /** `i3-press` */
    val I3Press: ImageVector by lazy {
        ImageVector.Builder(name = "i3-press", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M30.0,14.0H70.0A20.0,20.0 0 0 1 90.0,34.0V68.0A20.0,20.0 0 0 1 70.0,88.0H30.0A20.0,20.0 0 0 1 10.0,68.0V34.0A20.0,20.0 0 0 1 30.0,14.0Z"), fill = Brush.linearGradient(0f to Color(0xFF6A7385), 1f to Color(0xFF20242D), start = Offset(10f, 14f), end = Offset(10f, 88f)))
        addPath(pathData = addPathNodes("M31.0,16.0H69.0A17.0,17.0 0 0 1 86.0,33.0V65.0A17.0,17.0 0 0 1 69.0,82.0H31.0A17.0,17.0 0 0 1 14.0,65.0V33.0A17.0,17.0 0 0 1 31.0,16.0Z"), fill = Brush.linearGradient(0f to Color(0xFF3B4352), 1f to Color(0xFF191D25), start = Offset(14f, 16f), end = Offset(14f, 82f)))
        addPath(pathData = addPathNodes("M22 32 Q22 21 33 21 L64 21"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.28f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M44.0,25.0H56.0A2.0,2.0 0 0 1 58.0,27.0V27.0A2.0,2.0 0 0 1 56.0,29.0H44.0A2.0,2.0 0 0 1 42.0,27.0V27.0A2.0,2.0 0 0 1 44.0,25.0Z"), fill = SolidColor(Color(0xFF58AEFF)))
        addPath(pathData = addPathNodes("M19.0,54.0A31.0,31.0 0 1 0 81.0,54.0A31.0,31.0 0 1 0 19.0,54.0Z"), stroke = SolidColor(Color(0xFF58AEFF)), strokeAlpha = 0.35f, strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M26.0,54.0A24.0,24.0 0 1 0 74.0,54.0A24.0,24.0 0 1 0 26.0,54.0Z"), stroke = SolidColor(Color(0xFF58AEFF)), strokeAlpha = 0.75f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M34.0,54.0A16.0,16.0 0 1 0 66.0,54.0A16.0,16.0 0 1 0 34.0,54.0Z"), fill = SolidColor(Color(0xFF141820)), stroke = SolidColor(Color(0xFFF4F6FA)), strokeLineWidth = 4f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M43.5,54.0A6.5,6.5 0 1 0 56.5,54.0A6.5,6.5 0 1 0 43.5,54.0Z"), fill = SolidColor(Color(0xFF58AEFF)))
        addPath(pathData = addPathNodes("M66.0,22.0A14.0,14.0 0 1 0 94.0,22.0A14.0,14.0 0 1 0 66.0,22.0Z"), fill = Brush.linearGradient(0f to Color(0xFF5CF2A8), 1f to Color(0xFF00B85C), start = Offset(66f, 8f), end = Offset(66f, 36f)), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M73 22 L78 27 L87 17"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        }.build()
    }

    /** `i3-rain` */
    val I3Rain: ImageVector by lazy {
        ImageVector.Builder(name = "i3-rain", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addGroup(translationX = -6f, translationY = -2f)
        addPath(pathData = addPathNodes("M38 52 a16 16 0 0 1 4-31 a21 21 0 0 1 40-5 a17 17 0 0 1 10 34 Z"), fill = Brush.linearGradient(0f to Color(0xFF6F93C9), 1f to Color(0xFF3C5E97), start = Offset(27.4f, 3.349f), end = Offset(27.4f, 52f)))
        clearGroup()
        addPath(pathData = addPathNodes("M26 60 a17 17 0 0 1 3-33 a23 23 0 0 1 44-6 a18 18 0 0 1 11 39 Z"), fill = Brush.linearGradient(0f to Color(0xFFE9F2FF), 1f to Color(0xFF9DBEF0), start = Offset(14.292f, 6.945f), end = Offset(14.292f, 60f)))
        addPath(pathData = addPathNodes("M32.0,36.0A14.0,6.0 0 1 0 60.0,36.0A14.0,6.0 0 1 0 32.0,36.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.5f)
        addPath(pathData = addPathNodes("M36 68 l-4 12"), stroke = Brush.linearGradient(0f to Color(0xFF8CC4FF), 1f to Color(0xFF0082FF), start = Offset(32f, 68f), end = Offset(32f, 80f)), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M52 70 l-4 12"), stroke = Brush.linearGradient(0f to Color(0xFF8CC4FF), 1f to Color(0xFF0082FF), start = Offset(48f, 70f), end = Offset(48f, 82f)), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M68 68 l-4 12"), stroke = Brush.linearGradient(0f to Color(0xFF8CC4FF), 1f to Color(0xFF0082FF), start = Offset(64f, 68f), end = Offset(64f, 80f)), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `i3-rear` */
    val I3Rear: ImageVector by lazy {
        ImageVector.Builder(name = "i3-rear", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M21.0,70.0H27.0A5.0,5.0 0 0 1 32.0,75.0V82.0A5.0,5.0 0 0 1 27.0,87.0H21.0A5.0,5.0 0 0 1 16.0,82.0V75.0A5.0,5.0 0 0 1 21.0,70.0Z"), fill = SolidColor(Color(0xFF20242C)))
        addPath(pathData = addPathNodes("M73.0,70.0H79.0A5.0,5.0 0 0 1 84.0,75.0V82.0A5.0,5.0 0 0 1 79.0,87.0H73.0A5.0,5.0 0 0 1 68.0,82.0V75.0A5.0,5.0 0 0 1 73.0,70.0Z"), fill = SolidColor(Color(0xFF20242C)))
        addPath(pathData = addPathNodes("M20 50 L28 24 Q30 18 37 18 L63 18 Q70 18 72 24 L80 50 Z"), fill = Brush.linearGradient(0f to Color(0xFF5B6475), 1f to Color(0xFF262B35), start = Offset(20f, 18f), end = Offset(20f, 50f)))
        addPath(pathData = addPathNodes("M25 48 L32 27 Q33 23 38 23 L62 23 Q67 23 68 27 L75 48 Z"), fill = Brush.linearGradient(0f to Color(0xFF5B6B85), 1f to Color(0xFF232B3A), start = Offset(25f, 23f), end = Offset(25f, 48f)))
        addPath(pathData = addPathNodes("M31 33 H69"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFFFF8A3D)), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M29.5 38.5 H70.5"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFFFF8A3D)), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M28 44 H72"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFFFF8A3D)), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M40 20 q3-4 0-8"), stroke = SolidColor(Color(0xFFFFB36B)), strokeAlpha = 0.9f, strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50 20 q3-4 0-8"), stroke = SolidColor(Color(0xFFFFB36B)), strokeAlpha = 0.9f, strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M60 20 q3-4 0-8"), stroke = SolidColor(Color(0xFFFFB36B)), strokeAlpha = 0.9f, strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M8 60 Q8 50 18 49 L82 49 Q92 50 92 60 L92 74 Q92 79 87 79 L13 79 Q8 79 8 74 Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(8f, 49f), end = Offset(8f, 79f)))
        addPath(pathData = addPathNodes("M14 54 Q16 52 22 52 L44 52"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.7f, strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M12.5,56.0H87.5A2.5,2.5 0 0 1 90.0,58.5V58.5A2.5,2.5 0 0 1 87.5,61.0H12.5A2.5,2.5 0 0 1 10.0,58.5V58.5A2.5,2.5 0 0 1 12.5,56.0Z"), fill = SolidColor(Color(0xFFE2483B)))
        addPath(pathData = addPathNodes("M12.8,57.2H87.2A0.8,0.8 0 0 1 88.0,58.0V58.00000000000001A0.8,0.8 0 0 1 87.2,58.800000000000004H12.8A0.8,0.8 0 0 1 12.0,58.00000000000001V58.0A0.8,0.8 0 0 1 12.8,57.2Z"), fill = SolidColor(Color(0xFFFF9A8F)))
        addPath(pathData = addPathNodes("M40.0,66.0H60.0A2.0,2.0 0 0 1 62.0,68.0V73.0A2.0,2.0 0 0 1 60.0,75.0H40.0A2.0,2.0 0 0 1 38.0,73.0V68.0A2.0,2.0 0 0 1 40.0,66.0Z"), fill = SolidColor(Color(0xFFF4F6FA)))
        addPath(pathData = addPathNodes("M40.0,66.0H60.0A2.0,2.0 0 0 1 62.0,68.0V73.0A2.0,2.0 0 0 1 60.0,75.0H40.0A2.0,2.0 0 0 1 38.0,73.0V68.0A2.0,2.0 0 0 1 40.0,66.0Z"), stroke = SolidColor(Color(0xFF8A93A5)), strokeLineWidth = 1f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `i3-recirc` */
    val I3Recirc: ImageVector by lazy {
        ImageVector.Builder(name = "i3-recirc", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M30.0,14.0H70.0A20.0,20.0 0 0 1 90.0,34.0V68.0A20.0,20.0 0 0 1 70.0,88.0H30.0A20.0,20.0 0 0 1 10.0,68.0V34.0A20.0,20.0 0 0 1 30.0,14.0Z"), fill = Brush.linearGradient(0f to Color(0xFF6A7385), 1f to Color(0xFF20242D), start = Offset(10f, 14f), end = Offset(10f, 88f)))
        addPath(pathData = addPathNodes("M31.0,16.0H69.0A17.0,17.0 0 0 1 86.0,33.0V65.0A17.0,17.0 0 0 1 69.0,82.0H31.0A17.0,17.0 0 0 1 14.0,65.0V33.0A17.0,17.0 0 0 1 31.0,16.0Z"), fill = Brush.linearGradient(0f to Color(0xFF3B4352), 1f to Color(0xFF191D25), start = Offset(14f, 16f), end = Offset(14f, 82f)))
        addPath(pathData = addPathNodes("M22 32 Q22 21 33 21 L64 21"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.28f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M44.0,25.0H56.0A2.0,2.0 0 0 1 58.0,27.0V27.0A2.0,2.0 0 0 1 56.0,29.0H44.0A2.0,2.0 0 0 1 42.0,27.0V27.0A2.0,2.0 0 0 1 44.0,25.0Z"), fill = SolidColor(Color(0xFF58AEFF)))
        addPath(pathData = addPathNodes("M23 66 V58 Q23 54 27 53 L33 52 L40 43 Q42 41 45 41 L57 41 Q60 41 62 44 L68 52 L73 53 Q77 54 77 58 V66"), stroke = SolidColor(Color(0xFFF4F6FA)), strokeLineWidth = 4.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        addPath(pathData = addPathNodes("M29.0,67.0A5.0,5.0 0 1 0 39.0,67.0A5.0,5.0 0 1 0 29.0,67.0Z"), fill = SolidColor(Color(0xFFF4F6FA)))
        addPath(pathData = addPathNodes("M61.0,67.0A5.0,5.0 0 1 0 71.0,67.0A5.0,5.0 0 1 0 61.0,67.0Z"), fill = SolidColor(Color(0xFFF4F6FA)))
        addPath(pathData = addPathNodes("M58 61 H45 Q40 61 40 56 Q40 51 45 51 H54"), stroke = SolidColor(Color(0xFF58AEFF)), strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50.5 46.5 L55 51 L50.5 55.5"), stroke = SolidColor(Color(0xFF58AEFF)), strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        }.build()
    }

    /** `i3-search` */
    val I3Search: ImageVector by lazy {
        ImageVector.Builder(name = "i3-search", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M60 60 L84 84"), fill = SolidColor(Color(0xFF000000)), stroke = Brush.linearGradient(0f to Color(0xFF5B6475), 1f to Color(0xFF262B35), start = Offset(60f, 60f), end = Offset(60f, 84f)), strokeLineWidth = 13f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M14.0,42.0A28.0,28.0 0 1 0 70.0,42.0A28.0,28.0 0 1 0 14.0,42.0Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(14f, 14f), end = Offset(14f, 70f)))
        addPath(pathData = addPathNodes("M21.0,42.0A21.0,21.0 0 1 0 63.0,42.0A21.0,21.0 0 1 0 21.0,42.0Z"), fill = Brush.linearGradient(0f to Color(0xFFBFE3FF), 1f to Color(0xFF2F7FE0), start = Offset(21f, 21f), end = Offset(21f, 63f)))
        addGroup(rotate = -30f, pivotX = 34f, pivotY = 33f)
        addPath(pathData = addPathNodes("M25.0,33.0A9.0,5.0 0 1 0 43.0,33.0A9.0,5.0 0 1 0 25.0,33.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.55f)
        clearGroup()
        }.build()
    }

    /** `i3-seat` */
    val I3Seat: ImageVector by lazy {
        ImageVector.Builder(name = "i3-seat", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M36 16 Q28 16 30 26 L36 56 Q38 62 44 62 L68 62 Q74 62 74 68 L74 80 Q74 86 68 86 L30 86 Q24 86 24 80 L24 72 Q24 66 30 64 L26 26 Q24 16 36 16 Z"), fill = Brush.linearGradient(0f to Color(0xFF5B6475), 1f to Color(0xFF262B35), start = Offset(24f, 16f), end = Offset(24f, 86f)))
        addPath(pathData = addPathNodes("M38 24 L42 54 Q43 58 47 58 L66 58"), stroke = Brush.linearGradient(0f to Color(0xFF8A93A5), 1f to Color(0xFF4A5262), start = Offset(38f, 24f), end = Offset(38f, 58f)), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M30.0,26.0A4.0,8.0 0 1 0 38.0,26.0A4.0,8.0 0 1 0 30.0,26.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.25f)
        }.build()
    }

    /** `i3-shift` */
    val I3Shift: ImageVector by lazy {
        ImageVector.Builder(name = "i3-shift", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M28.0,20.0H72.0A16.0,16.0 0 0 1 88.0,36.0V66.0A16.0,16.0 0 0 1 72.0,82.0H28.0A16.0,16.0 0 0 1 12.0,66.0V36.0A16.0,16.0 0 0 1 28.0,20.0Z"), fill = Brush.linearGradient(0f to Color(0xFF5B6475), 1f to Color(0xFF262B35), start = Offset(12f, 20f), end = Offset(12f, 82f)))
        addPath(pathData = addPathNodes("M29.0,24.0H71.0A12.0,12.0 0 0 1 83.0,36.0V66.0A12.0,12.0 0 0 1 71.0,78.0H29.0A12.0,12.0 0 0 1 17.0,66.0V36.0A12.0,12.0 0 0 1 29.0,24.0Z"), fill = Brush.linearGradient(0f to Color(0xFF2A3140), 1f to Color(0xFF11141B), start = Offset(17f, 24f), end = Offset(17f, 78f)))
        addPath(pathData = addPathNodes("M56.0,34.0H62.0A5.0,5.0 0 0 1 67.0,39.0V63.0A5.0,5.0 0 0 1 62.0,68.0H56.0A5.0,5.0 0 0 1 51.0,63.0V39.0A5.0,5.0 0 0 1 56.0,34.0Z"), fill = Brush.linearGradient(0f to Color(0xFF58AEFF), 1f to Color(0xFF0062D6), start = Offset(51f, 34f), end = Offset(51f, 68f)))
        addPath(pathData = addPathNodes("M23.08154296875 46.39453125H27.41748046875Q28.58935546875 46.39453125 29.4609375 46.85595703125Q30.33251953125 47.3173828125 30.80126953125 48.141357421875Q31.27001953125 48.96533203125 31.27001953125 50.0419921875Q31.27001953125 51.13330078125 30.7939453125 51.957275390625Q30.31787109375 52.78125 29.431640625 53.22802734375Q28.54541015625 53.6748046875 27.34423828125 53.6748046875H25.57177734375V57.0H23.08154296875ZM26.89013671875 51.697265625Q27.75439453125 51.697265625 28.22314453125 51.25048828125Q28.69189453125 50.8037109375 28.69189453125 50.0419921875Q28.69189453125 49.2802734375 28.22314453125 48.84814453125Q27.75439453125 48.416015625 26.89013671875 48.416015625H25.57177734375V51.697265625Z"), fill = SolidColor(Color(0xFF6F7889)))
        addPath(pathData = addPathNodes("M39.00830078125 46.39453125H43.34423828125Q44.53076171875 46.39453125 45.398681640625 46.8193359375Q46.2666015625 47.244140625 46.731689453125 48.038818359375Q47.19677734375 48.83349609375 47.19677734375 49.91015625Q47.19677734375 50.994140625 46.724365234375 51.7705078125Q46.251953125 52.546875 45.36572265625 52.94970703125L47.57763671875 57.0H44.83837890625L42.89013671875 53.3525390625H41.49853515625V57.0H39.00830078125ZM42.81689453125 51.3603515625Q44.61865234375 51.3603515625 44.61865234375 49.91015625Q44.61865234375 49.17041015625 44.160888671875 48.793212890625Q43.703125 48.416015625 42.81689453125 48.416015625H41.49853515625V51.3603515625Z"), fill = SolidColor(Color(0xFF6F7889)))
        addPath(pathData = addPathNodes("M63.4970703125 57.0H61.373046875L57.06640625 50.7744140625H56.9931640625V57.0H54.5029296875V46.39453125H56.65625L60.9189453125 52.6201171875H61.0068359375V46.39453125H63.4970703125Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        addPath(pathData = addPathNodes("M70.51025390625 57.0V46.39453125H74.39208984375Q76.00341796875 46.39453125 77.1826171875 47.03173828125Q78.36181640625 47.6689453125 78.99169921875 48.86279296875Q79.62158203125 50.056640625 79.62158203125 51.697265625Q79.62158203125 53.337890625 78.99169921875 54.53173828125Q78.36181640625 55.7255859375 77.1826171875 56.36279296875Q76.00341796875 57.0 74.39208984375 57.0ZM74.30419921875 54.861328125Q75.71044921875 54.861328125 76.41357421875 54.117919921875Q77.11669921875 53.37451171875 77.11669921875 51.697265625Q77.11669921875 50.0126953125 76.409912109375 49.265625Q75.703125 48.5185546875 74.27490234375 48.5185546875H73.00048828125V54.861328125Z"), fill = SolidColor(Color(0xFF6F7889)))
        addPath(pathData = addPathNodes("M22 30 Q22 27 26 27 L48 27"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.3f, strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `i3-sprout` */
    val I3Sprout: ImageVector by lazy {
        ImageVector.Builder(name = "i3-sprout", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M30 62 L70 62 L65.6 84.5 Q64.8 89 60.2 89 L39.8 89 Q35.2 89 34.4 84.5 Z"), fill = Brush.linearGradient(0f to Color(0xFFF6A877), 1f to Color(0xFFB5552A), start = Offset(30f, 62f), end = Offset(30f, 89f)))
        addPath(pathData = addPathNodes("M35.5 68 L38.4 84"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.3f, stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.3f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M29.5,54.0H70.5A4.5,4.5 0 0 1 75.0,58.5V60.5A4.5,4.5 0 0 1 70.5,65.0H29.5A4.5,4.5 0 0 1 25.0,60.5V58.5A4.5,4.5 0 0 1 29.5,54.0Z"), fill = Brush.linearGradient(0f to Color(0xFFFFC59C), 1f to Color(0xFFD46F38), start = Offset(25f, 54f), end = Offset(25f, 65f)))
        addPath(pathData = addPathNodes("M30.3,57.5H42.7A1.3,1.3 0 0 1 44.0,58.8V58.800000000000004A1.3,1.3 0 0 1 42.7,60.1H30.3A1.3,1.3 0 0 1 29.0,58.800000000000004V58.8A1.3,1.3 0 0 1 30.3,57.5Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.5f)
        addPath(pathData = addPathNodes("M29.5,55.0A20.5,3.4 0 1 0 70.5,55.0A20.5,3.4 0 1 0 29.5,55.0Z"), fill = SolidColor(Color(0xFF5A3A22)))
        addPath(pathData = addPathNodes("M47.6 56 C47.2 49 47.6 42.5 48.6 36.5 L52.2 36.5 C52.9 42.5 53.2 49 52.7 56 Z"), fill = Brush.linearGradient(0f to Color(0xFF86DB62), 1f to Color(0xFF2C8A3C), start = Offset(47.447f, 36.5f), end = Offset(47.447f, 56f)))
        addPath(pathData = addPathNodes("M50 39 C44.5 42.5 31 43 23 36.5 C17.5 32 16.8 25 19.6 22.4 C27.5 18.6 45 23.5 50 39 Z"), fill = Brush.linearGradient(0f to Color(0xFFC2F58A), 1f to Color(0xFF2E9E44), start = Offset(17.995f, 21.174f), end = Offset(17.995f, 41.538f)))
        addPath(pathData = addPathNodes("M50.4 37.5 C55 25 70.5 15.6 79.6 17.6 C83.2 19.6 83.6 26.6 79 31.2 C72 38.2 57.5 40.4 50.4 37.5 Z"), fill = Brush.linearGradient(0f to Color(0xFFC2F58A), 1f to Color(0xFF2E9E44), start = Offset(50.4f, 17.331f), end = Offset(50.4f, 38.744f)))
        addPath(pathData = addPathNodes("M48.5 37.6 C42 32 32 27.6 23.5 26"), stroke = SolidColor(Color(0xFFEFFFD8)), strokeAlpha = 0.55f, strokeLineWidth = 2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M52 36.4 C59 30.6 68 25.4 77.6 23"), stroke = SolidColor(Color(0xFFEFFFD8)), strokeAlpha = 0.55f, strokeLineWidth = 2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addGroup(rotate = 20f, pivotX = 27.5f, pivotY = 27f)
        addPath(pathData = addPathNodes("M22.0,27.0A5.5,2.6 0 1 0 33.0,27.0A5.5,2.6 0 1 0 22.0,27.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.6f)
        clearGroup()
        addGroup(rotate = -24f, pivotX = 68f, pivotY = 21.6f)
        addPath(pathData = addPathNodes("M62.5,21.6A5.5,2.6 0 1 0 73.5,21.6A5.5,2.6 0 1 0 62.5,21.6Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.6f)
        clearGroup()
        }.build()
    }

    /** `i3-trophy` */
    val I3Trophy: ImageVector by lazy {
        ImageVector.Builder(name = "i3-trophy", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M28 14 L72 14 L70 44 C68 58 60 66 50 66 C40 66 32 58 30 44 Z"), fill = Brush.linearGradient(0f to Color(0xFFFFE38A), 1f to Color(0xFFE8A800), start = Offset(28f, 14f), end = Offset(28f, 66f)))
        addPath(pathData = addPathNodes("M28 20 C14 20 12 36 22 44 C26 47 30 48 32 48 L31 40 C26 39 22 36 22 30 C22 26 25 26 28 26 Z"), fill = Brush.linearGradient(0f to Color(0xFFF2C14E), 1f to Color(0xFFB97A00), start = Offset(15.75f, 20f), end = Offset(15.75f, 48f)))
        addPath(pathData = addPathNodes("M72 20 C86 20 88 36 78 44 C74 47 70 48 68 48 L69 40 C74 39 78 36 78 30 C78 26 75 26 72 26 Z"), fill = Brush.linearGradient(0f to Color(0xFFF2C14E), 1f to Color(0xFFB97A00), start = Offset(68f, 20f), end = Offset(68f, 48f)))
        addPath(pathData = addPathNodes("M45.0,64.0H55.0V74.0H45.0Z"), fill = Brush.linearGradient(0f to Color(0xFFF2C14E), 1f to Color(0xFFB97A00), start = Offset(45f, 64f), end = Offset(45f, 74f)))
        addPath(pathData = addPathNodes("M34 86 L66 86 L62 74 L38 74 Z"), fill = Brush.linearGradient(0f to Color(0xFF6B7382), 1f to Color(0xFF2E3340), start = Offset(34f, 74f), end = Offset(34f, 86f)))
        addPath(pathData = addPathNodes("M33.0,84.0H67.0A3.0,3.0 0 0 1 70.0,87.0V87.0A3.0,3.0 0 0 1 67.0,90.0H33.0A3.0,3.0 0 0 1 30.0,87.0V87.0A3.0,3.0 0 0 1 33.0,84.0Z"), fill = SolidColor(Color(0xFF2E3340)))
        addGroup(rotate = 8f, pivotX = 40f, pivotY = 24f)
        addPath(pathData = addPathNodes("M34.0,24.0A6.0,9.0 0 1 0 46.0,24.0A6.0,9.0 0 1 0 34.0,24.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.5f)
        clearGroup()
        addPath(pathData = addPathNodes("M50 28 L52.6 34.2 L59.3 34.7 L54.2 39.1 L55.8 45.6 L50 42.1 L44.2 45.6 L45.8 39.1 L40.7 34.7 L47.4 34.2 Z"), fill = SolidColor(Color(0xFFB97A00)), fillAlpha = 0.9f)
        }.build()
    }

    /** `i3-turn` */
    val I3Turn: ImageVector by lazy {
        ImageVector.Builder(name = "i3-turn", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M24.0,24.0H76.0A16.0,16.0 0 0 1 92.0,40.0V64.0A16.0,16.0 0 0 1 76.0,80.0H24.0A16.0,16.0 0 0 1 8.0,64.0V40.0A16.0,16.0 0 0 1 24.0,24.0Z"), fill = Brush.linearGradient(0f to Color(0xFF5B6475), 1f to Color(0xFF262B35), start = Offset(8f, 24f), end = Offset(8f, 80f)))
        addPath(pathData = addPathNodes("M25.0,28.0H75.0A12.0,12.0 0 0 1 87.0,40.0V64.0A12.0,12.0 0 0 1 75.0,76.0H25.0A12.0,12.0 0 0 1 13.0,64.0V40.0A12.0,12.0 0 0 1 25.0,28.0Z"), fill = Brush.linearGradient(0f to Color(0xFF2A3140), 1f to Color(0xFF11141B), start = Offset(13f, 28f), end = Offset(13f, 76f)))
        addPath(pathData = addPathNodes("M20 52 L38 36 V45 H46 V59 H38 V68 Z"), fill = Brush.linearGradient(0f to Color(0xFF7CF2B4), 1f to Color(0xFF00B85C), start = Offset(20f, 36f), end = Offset(20f, 68f)))
        addPath(pathData = addPathNodes("M80 52 L62 36 V45 H54 V59 H62 V68 Z"), fill = SolidColor(Color(0xFF3A4150)))
        addPath(pathData = addPathNodes("M24 30 L19 25"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.8f, stroke = SolidColor(Color(0xFF7CF2B4)), strokeAlpha = 0.8f, strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M16 52 H10"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.8f, stroke = SolidColor(Color(0xFF7CF2B4)), strokeAlpha = 0.8f, strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M24 74 L19 79"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.8f, stroke = SolidColor(Color(0xFF7CF2B4)), strokeAlpha = 0.8f, strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `i3-wheel` */
    val I3Wheel: ImageVector by lazy {
        ImageVector.Builder(name = "i3-wheel", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M12.0,50.0A38.0,38.0 0 1 0 88.0,50.0A38.0,38.0 0 1 0 12.0,50.0Z"), fill = Brush.linearGradient(0f to Color(0xFF5B6475), 1f to Color(0xFF262B35), start = Offset(12f, 12f), end = Offset(12f, 88f)))
        addPath(pathData = addPathNodes("M23.0,50.0A27.0,27.0 0 1 0 77.0,50.0A27.0,27.0 0 1 0 23.0,50.0Z"), fill = SolidColor(Color(0xFF161A22)))
        addPath(pathData = addPathNodes("M23 50 H40 M60 50 H77 M50 60 V77"), fill = SolidColor(Color(0xFF000000)), stroke = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(23f, 50f), end = Offset(23f, 77f)), strokeLineWidth = 10f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M37.0,50.0A13.0,13.0 0 1 0 63.0,50.0A13.0,13.0 0 1 0 37.0,50.0Z"), fill = Brush.linearGradient(0f to Color(0xFF58AEFF), 1f to Color(0xFF0062D6), start = Offset(37f, 37f), end = Offset(37f, 63f)))
        addPath(pathData = addPathNodes("M40.0,45.0A6.0,3.5 0 1 0 52.0,45.0A6.0,3.5 0 1 0 40.0,45.0Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.45f)
        addPath(pathData = addPathNodes("M22 36 A32 32 0 0 1 60 15"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.35f, strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `i3-winlock` */
    val I3Winlock: ImageVector by lazy {
        ImageVector.Builder(name = "i3-winlock", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M30.0,14.0H70.0A20.0,20.0 0 0 1 90.0,34.0V68.0A20.0,20.0 0 0 1 70.0,88.0H30.0A20.0,20.0 0 0 1 10.0,68.0V34.0A20.0,20.0 0 0 1 30.0,14.0Z"), fill = Brush.linearGradient(0f to Color(0xFF6A7385), 1f to Color(0xFF20242D), start = Offset(10f, 14f), end = Offset(10f, 88f)))
        addPath(pathData = addPathNodes("M31.0,16.0H69.0A17.0,17.0 0 0 1 86.0,33.0V65.0A17.0,17.0 0 0 1 69.0,82.0H31.0A17.0,17.0 0 0 1 14.0,65.0V33.0A17.0,17.0 0 0 1 31.0,16.0Z"), fill = Brush.linearGradient(0f to Color(0xFF3B4352), 1f to Color(0xFF191D25), start = Offset(14f, 16f), end = Offset(14f, 82f)))
        addPath(pathData = addPathNodes("M22 32 Q22 21 33 21 L64 21"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.28f, strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M44.0,25.0H56.0A2.0,2.0 0 0 1 58.0,27.0V27.0A2.0,2.0 0 0 1 56.0,29.0H44.0A2.0,2.0 0 0 1 42.0,27.0V27.0A2.0,2.0 0 0 1 44.0,25.0Z"), fill = SolidColor(Color(0xFF58AEFF)))
        addPath(pathData = addPathNodes("M26 64 L26 47 Q26 41 32 40 L60 36 Q68 35 68 43 L68 64 Z"), stroke = SolidColor(Color(0xFFF4F6FA)), strokeLineWidth = 4.5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Round)
        addPath(pathData = addPathNodes("M58.0,49.0H72.0A8.0,8.0 0 0 1 80.0,57.0V72.0A8.0,8.0 0 0 1 72.0,80.0H58.0A8.0,8.0 0 0 1 50.0,72.0V57.0A8.0,8.0 0 0 1 58.0,49.0Z"), fill = SolidColor(Color(0xFF1C2028)))
        addPath(pathData = addPathNodes("M58 61 V56 a7 7 0 0 1 14 0 v5"), stroke = SolidColor(Color(0xFF58AEFF)), strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M58.0,60.0H72.0A4.0,4.0 0 0 1 76.0,64.0V72.0A4.0,4.0 0 0 1 72.0,76.0H58.0A4.0,4.0 0 0 1 54.0,72.0V64.0A4.0,4.0 0 0 1 58.0,60.0Z"), fill = SolidColor(Color(0xFF58AEFF)))
        addPath(pathData = addPathNodes("M65.0,65.0H65.0A1.5,1.5 0 0 1 66.5,66.5V69.5A1.5,1.5 0 0 1 65.0,71.0H65.0A1.5,1.5 0 0 1 63.5,69.5V66.5A1.5,1.5 0 0 1 65.0,65.0Z"), fill = SolidColor(Color(0xFF1C2028)))
        }.build()
    }

    /** `i3-wiper` */
    val I3Wiper: ImageVector by lazy {
        ImageVector.Builder(name = "i3-wiper", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,91.0A30.0,5.0 0 1 0 80.0,91.0A30.0,5.0 0 1 0 20.0,91.0Z"), fill = SolidColor(Color(0xFF000000)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M21.0,70.0H27.0A5.0,5.0 0 0 1 32.0,75.0V82.0A5.0,5.0 0 0 1 27.0,87.0H21.0A5.0,5.0 0 0 1 16.0,82.0V75.0A5.0,5.0 0 0 1 21.0,70.0Z"), fill = SolidColor(Color(0xFF20242C)))
        addPath(pathData = addPathNodes("M73.0,70.0H79.0A5.0,5.0 0 0 1 84.0,75.0V82.0A5.0,5.0 0 0 1 79.0,87.0H73.0A5.0,5.0 0 0 1 68.0,82.0V75.0A5.0,5.0 0 0 1 73.0,70.0Z"), fill = SolidColor(Color(0xFF20242C)))
        addPath(pathData = addPathNodes("M8 46 Q8 42 13 42 L19 42 L19 50 L10 50 Q8 50 8 48 Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(8f, 42f), end = Offset(8f, 50f)))
        addPath(pathData = addPathNodes("M92 46 Q92 42 87 42 L81 42 L81 50 L90 50 Q92 50 92 48 Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(81f, 42f), end = Offset(81f, 50f)))
        addPath(pathData = addPathNodes("M20 50 L29 22 Q31 16 38 16 L62 16 Q69 16 71 22 L80 50 Z"), fill = Brush.linearGradient(0f to Color(0xFF5B6475), 1f to Color(0xFF262B35), start = Offset(20f, 16f), end = Offset(20f, 50f)))
        addPath(pathData = addPathNodes("M25 49 L33 25 Q34 21 38 21 L62 21 Q66 21 67 25 L75 49 Z"), fill = Brush.linearGradient(0f to Color(0xFFCFE8FF), 1f to Color(0xFF3F86E0), start = Offset(25f, 21f), end = Offset(25f, 49f)))
        addPath(pathData = addPathNodes("M42 49 L64 29 Q67 33 69 40 L71 49 Z"), fill = SolidColor(Color(0xFFFFFFFF)), fillAlpha = 0.22f)
        addPath(pathData = addPathNodes("M31.4,33.0A2.6,3.8 0 1 0 36.6,33.0A2.6,3.8 0 1 0 31.4,33.0Z"), fill = Brush.linearGradient(0f to Color(0xFF9ED3FF), 1f to Color(0xFF2F7FE0), start = Offset(31.4f, 29.2f), end = Offset(31.4f, 36.8f)))
        addPath(pathData = addPathNodes("M37.7,41.0A2.3,3.4 0 1 0 42.3,41.0A2.3,3.4 0 1 0 37.7,41.0Z"), fill = Brush.linearGradient(0f to Color(0xFF9ED3FF), 1f to Color(0xFF2F7FE0), start = Offset(37.7f, 37.6f), end = Offset(37.7f, 44.4f)))
        addPath(pathData = addPathNodes("M29.0,44.0A2.0,3.0 0 1 0 33.0,44.0A2.0,3.0 0 1 0 29.0,44.0Z"), fill = Brush.linearGradient(0f to Color(0xFF9ED3FF), 1f to Color(0xFF2F7FE0), start = Offset(29f, 41f), end = Offset(29f, 47f)))
        addPath(pathData = addPathNodes("M44.0,28.0A2.0,3.0 0 1 0 48.0,28.0A2.0,3.0 0 1 0 44.0,28.0Z"), fill = Brush.linearGradient(0f to Color(0xFF9ED3FF), 1f to Color(0xFF2F7FE0), start = Offset(44f, 25f), end = Offset(44f, 31f)))
        addPath(pathData = addPathNodes("M8 60 Q8 50 18 49 L82 49 Q92 50 92 60 L92 74 Q92 79 87 79 L13 79 Q8 79 8 74 Z"), fill = Brush.linearGradient(0f to Color(0xFFE4E8EF), 1f to Color(0xFF8A93A5), start = Offset(8f, 49f), end = Offset(8f, 79f)))
        addPath(pathData = addPathNodes("M14 54 Q16 52 22 52 L44 52"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeAlpha = 0.7f, strokeLineWidth = 2.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M16.5,58.0H26.5A3.5,3.5 0 0 1 30.0,61.5V61.5A3.5,3.5 0 0 1 26.5,65.0H16.5A3.5,3.5 0 0 1 13.0,61.5V61.5A3.5,3.5 0 0 1 16.5,58.0Z"), fill = SolidColor(Color(0xFFF4F8FF)))
        addPath(pathData = addPathNodes("M73.5,58.0H83.5A3.5,3.5 0 0 1 87.0,61.5V61.5A3.5,3.5 0 0 1 83.5,65.0H73.5A3.5,3.5 0 0 1 70.0,61.5V61.5A3.5,3.5 0 0 1 73.5,58.0Z"), fill = SolidColor(Color(0xFFF4F8FF)))
        addPath(pathData = addPathNodes("M16.2,60.0H26.8A1.2,1.2 0 0 1 28.0,61.2V61.3A1.2,1.2 0 0 1 26.8,62.5H16.2A1.2,1.2 0 0 1 15.0,61.3V61.2A1.2,1.2 0 0 1 16.2,60.0Z"), fill = SolidColor(Color(0xFF58AEFF)))
        addPath(pathData = addPathNodes("M73.2,60.0H83.8A1.2,1.2 0 0 1 85.0,61.2V61.3A1.2,1.2 0 0 1 83.8,62.5H73.2A1.2,1.2 0 0 1 72.0,61.3V61.2A1.2,1.2 0 0 1 73.2,60.0Z"), fill = SolidColor(Color(0xFF58AEFF)))
        addPath(pathData = addPathNodes("M40.5,66.0H59.5A3.5,3.5 0 0 1 63.0,69.5V69.5A3.5,3.5 0 0 1 59.5,73.0H40.5A3.5,3.5 0 0 1 37.0,69.5V69.5A3.5,3.5 0 0 1 40.5,66.0Z"), fill = SolidColor(Color(0xFF2A303B)))
        addPath(pathData = addPathNodes("M41 50 L65 30"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF20242C)), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M41 50 L65 30"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFFAEB6C4)), strokeLineWidth = 2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M37.5,50.0A3.5,3.5 0 1 0 44.5,50.0A3.5,3.5 0 1 0 37.5,50.0Z"), fill = SolidColor(Color(0xFF20242C)))
        }.build()
    }

    /** `ic-app` */
    val AppApp: ImageVector by lazy {
        ImageVector.Builder(name = "ic-app", defaultWidth = 48.dp, defaultHeight = 48.dp, viewportWidth = 48f, viewportHeight = 48f).apply {
        addPath(pathData = addPathNodes("M7.0,24.0A17.0,17.0 0 1 0 41.0,24.0A17.0,17.0 0 1 0 7.0,24.0Z"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 4f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M8 24h11M29 24h11M24 29v11"), stroke = SolidColor(Color(0xFFFFFFFF)), strokeLineWidth = 4f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M19.0,24.0A5.0,5.0 0 1 0 29.0,24.0A5.0,5.0 0 1 0 19.0,24.0Z"), fill = SolidColor(Color(0xFFFFFFFF)))
        }.build()
    }

    /** `p-ac` — 선 아이콘, tint 로 색을 입힌다 */
    val LineAc: ImageVector by lazy {
        ImageVector.Builder(name = "p-ac", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M50 10v80M15 30l70 40M15 70l70-40"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50 10l-9 9M50 10l9 9M50 90l-9-9M50 90l9-9"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-accel` — 선 아이콘, tint 로 색을 입힌다 */
    val LineAccel: ImageVector by lazy {
        ImageVector.Builder(name = "p-accel", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M46.0,12.0H54.0A10.0,10.0 0 0 1 64.0,22.0V78.0A10.0,10.0 0 0 1 54.0,88.0H46.0A10.0,10.0 0 0 1 36.0,78.0V22.0A10.0,10.0 0 0 1 46.0,12.0Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M44 30 H56 M44 44 H56 M44 58 H56 M44 72 H56"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color.Black), strokeLineWidth = 4.5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-arrow` — 선 아이콘, tint 로 색을 입힌다 */
    val LineArrow: ImageVector by lazy {
        ImageVector.Builder(name = "p-arrow", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M5 12h14M13 6l6 6-6 6"), stroke = SolidColor(Color.Black), strokeLineWidth = 2.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        }.build()
    }

    /** `p-baby` — 선 아이콘, tint 로 색을 입힌다 */
    val LineBaby: ImageVector by lazy {
        ImageVector.Builder(name = "p-baby", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M8.0,7.0A4.0,4.0 0 1 0 16.0,7.0A4.0,4.0 0 1 0 8.0,7.0Z"), fill = SolidColor(Color.Black))
        addPath(pathData = addPathNodes("M5 21a7 7 0 0 1 14 0z"), fill = SolidColor(Color.Black))
        }.build()
    }

    /** `p-book` — 선 아이콘, tint 로 색을 입힌다 */
    val LineBook: ImageVector by lazy {
        ImageVector.Builder(name = "p-book", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M3 5a2 2 0 0 1 2-2h5a2 2 0 0 1 2 2v15a2 2 0 0 0-2-2H3zM21 5a2 2 0 0 0-2-2h-5a2 2 0 0 0-2 2v15a2 2 0 0 1 2-2h7z"), fill = SolidColor(Color.Black))
        }.build()
    }

    /** `p-brake` — 선 아이콘, tint 로 색을 입힌다 */
    val LineBrake: ImageVector by lazy {
        ImageVector.Builder(name = "p-brake", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M29.0,30.0H71.0A11.0,11.0 0 0 1 82.0,41.0V61.0A11.0,11.0 0 0 1 71.0,72.0H29.0A11.0,11.0 0 0 1 18.0,61.0V41.0A11.0,11.0 0 0 1 29.0,30.0Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M32 44 H68 M32 58 H68"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-bulb` — 선 아이콘, tint 로 색을 입힌다 */
    val LineBulb: ImageVector by lazy {
        ImageVector.Builder(name = "p-bulb", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M9 20h6M10 23h4"), stroke = SolidColor(Color.Black), strokeLineWidth = 2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M12 2a7 7 0 0 0-4 12.7c.6.5 1 1.3 1 2.3h6c0-1 .4-1.8 1-2.3A7 7 0 0 0 12 2z"), fill = SolidColor(Color.Black))
        }.build()
    }

    /** `p-check` — 선 아이콘, tint 로 색을 입힌다 */
    val LineCheck: ImageVector by lazy {
        ImageVector.Builder(name = "p-check", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M4 12.5l5 5L20 7"), stroke = SolidColor(Color.Black), strokeLineWidth = 3f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        }.build()
    }

    /** `p-chev` — 선 아이콘, tint 로 색을 입힌다 */
    val LineChev: ImageVector by lazy {
        ImageVector.Builder(name = "p-chev", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M9 5l7 7-7 7"), stroke = SolidColor(Color.Black), strokeLineWidth = 2.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        }.build()
    }

    /** `p-chevl` — 선 아이콘, tint 로 색을 입힌다 */
    val LineChevl: ImageVector by lazy {
        ImageVector.Builder(name = "p-chevl", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M15 5l-7 7 7 7"), stroke = SolidColor(Color.Black), strokeLineWidth = 2.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        }.build()
    }

    /** `p-child` — 선 아이콘, tint 로 색을 입힌다 */
    val LineChild: ImageVector by lazy {
        ImageVector.Builder(name = "p-child", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M38.0,26.0A12.0,12.0 0 1 0 62.0,26.0A12.0,12.0 0 1 0 38.0,26.0Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M30 86 V60 Q30 44 50 44 Q70 44 70 60 V86"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M43.0,62.0H57.0A3.0,3.0 0 0 1 60.0,65.0V77.0A3.0,3.0 0 0 1 57.0,80.0H43.0A3.0,3.0 0 0 1 40.0,77.0V65.0A3.0,3.0 0 0 1 43.0,62.0Z"), fill = SolidColor(Color.Black))
        }.build()
    }

    /** `p-cold` — 선 아이콘, tint 로 색을 입힌다 */
    val LineCold: ImageVector by lazy {
        ImageVector.Builder(name = "p-cold", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M10 14.5V5a2 2 0 1 1 4 0v9.5a4 4 0 1 1-4 0z"), stroke = SolidColor(Color.Black), strokeLineWidth = 2.2f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M12 10v6"), stroke = SolidColor(Color.Black), strokeLineWidth = 2.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-doorlock` — 선 아이콘, tint 로 색을 입힌다 */
    val LineDoorlock: ImageVector by lazy {
        ImageVector.Builder(name = "p-doorlock", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M18 62 L28 40 Q32 32 42 32 L76 32 Q86 32 86 42 L86 62 Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Round)
        addPath(pathData = addPathNodes("M18 62 H86"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M30.0,66.0H48.0A4.0,4.0 0 0 1 52.0,70.0V84.0A4.0,4.0 0 0 1 48.0,88.0H30.0A4.0,4.0 0 0 1 26.0,84.0V70.0A4.0,4.0 0 0 1 30.0,66.0Z"), fill = SolidColor(Color.Black))
        addPath(pathData = addPathNodes("M31 66 V60 a8 8 0 0 1 16 0 V66"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-down` — 선 아이콘, tint 로 색을 입힌다 */
    val LineDown: ImageVector by lazy {
        ImageVector.Builder(name = "p-down", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M6 9l6 6 6-6"), stroke = SolidColor(Color.Black), strokeLineWidth = 2.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        }.build()
    }

    /** `p-drive` — 선 아이콘, tint 로 색을 입힌다 */
    val LineDrive: ImageVector by lazy {
        ImageVector.Builder(name = "p-drive", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M20.0,50.0A30.0,30.0 0 1 0 80.0,50.0A30.0,30.0 0 1 0 20.0,50.0Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50 50 L66 34"), stroke = SolidColor(Color.Black), strokeLineWidth = 7f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M44.0,50.0A6.0,6.0 0 1 0 56.0,50.0A6.0,6.0 0 1 0 44.0,50.0Z"), fill = SolidColor(Color.Black))
        addPath(pathData = addPathNodes("M22 50 H14M86 50 H78M50 22 V14"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-excl` — 선 아이콘, tint 로 색을 입힌다 */
    val LineExcl: ImageVector by lazy {
        ImageVector.Builder(name = "p-excl", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M2.0,12.0A10.0,10.0 0 1 0 22.0,12.0A10.0,10.0 0 1 0 2.0,12.0Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 2.4f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M12 7v6"), stroke = SolidColor(Color.Black), strokeLineWidth = 2.8f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M10.5,16.5A1.5,1.5 0 1 0 13.5,16.5A1.5,1.5 0 1 0 10.5,16.5Z"), fill = SolidColor(Color.Black))
        }.build()
    }

    /** `p-fan` — 선 아이콘, tint 로 색을 입힌다 */
    val LineFan: ImageVector by lazy {
        ImageVector.Builder(name = "p-fan", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M41.0,50.0A9.0,9.0 0 1 0 59.0,50.0A9.0,9.0 0 1 0 41.0,50.0Z"), fill = SolidColor(Color.Black))
        addPath(pathData = addPathNodes("M50 38 C44 20 60 10 72 20 C66 30 58 36 50 38Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 7f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M62 50 C80 44 90 60 80 72 C70 66 64 58 62 50Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 7f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50 62 C56 80 40 90 28 80 C34 70 42 64 50 62Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 7f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M38 50 C20 56 10 40 20 28 C30 34 36 42 38 50Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 7f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-front` — 선 아이콘, tint 로 색을 입힌다 */
    val LineFront: ImageVector by lazy {
        ImageVector.Builder(name = "p-front", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M14 72 Q50 14 86 72 Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Round)
        addPath(pathData = addPathNodes("M36 90c6-8-6-16 0-24s-6-16 0-24"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50 90c6-8-6-16 0-24s-6-16 0-24"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M64 90c6-8-6-16 0-24s-6-16 0-24"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M29 48l7-10 7 10"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M43 48l7-10 7 10"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M57 48l7-10 7 10"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-gear-n` — 선 아이콘, tint 로 색을 입힌다 */
    val LineGearN: ImageVector by lazy {
        ImageVector.Builder(name = "p-gear-n", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M32.0,18.0H68.0A14.0,14.0 0 0 1 82.0,32.0V68.0A14.0,14.0 0 0 1 68.0,82.0H32.0A14.0,14.0 0 0 1 18.0,68.0V32.0A14.0,14.0 0 0 1 32.0,18.0Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M61.9921875 65.0H56.328125L44.84375 48.3984375H44.6484375V65.0H38.0078125V36.71875H43.75L55.1171875 53.3203125H55.3515625V36.71875H61.9921875Z"), fill = SolidColor(Color.Black))
        }.build()
    }

    /** `p-gear-r` — 선 아이콘, tint 로 색을 입힌다 */
    val LineGearR: ImageVector by lazy {
        ImageVector.Builder(name = "p-gear-r", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M32.0,18.0H68.0A14.0,14.0 0 0 1 82.0,32.0V68.0A14.0,14.0 0 0 1 68.0,82.0H32.0A14.0,14.0 0 0 1 18.0,68.0V32.0A14.0,14.0 0 0 1 32.0,18.0Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M39.35546875 36.71875H50.91796875Q54.08203125 36.71875 56.396484375 37.8515625Q58.7109375 38.984375 59.951171875 41.103515625Q61.19140625 43.22265625 61.19140625 46.09375Q61.19140625 48.984375 59.931640625 51.0546875Q58.671875 53.125 56.30859375 54.19921875L62.20703125 65.0H54.90234375L49.70703125 55.2734375H45.99609375V65.0H39.35546875ZM49.51171875 49.9609375Q54.31640625 49.9609375 54.31640625 46.09375Q54.31640625 44.12109375 53.095703125 43.115234375Q51.875 42.109375 49.51171875 42.109375H45.99609375V49.9609375Z"), fill = SolidColor(Color.Black))
        }.build()
    }

    /** `p-headlamp` — 선 아이콘, tint 로 색을 입힌다 */
    val LineHeadlamp: ImageVector by lazy {
        ImageVector.Builder(name = "p-headlamp", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M58 24 Q86 24 86 50 Q86 76 58 76 Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Round)
        addPath(pathData = addPathNodes("M44 30 L16 40 M44 45 L16 55 M44 60 L16 70"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-highbeam` — 선 아이콘, tint 로 색을 입힌다 */
    val LineHighbeam: ImageVector by lazy {
        ImageVector.Builder(name = "p-highbeam", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M58 24 Q86 24 86 50 Q86 76 58 76 Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Round)
        addPath(pathData = addPathNodes("M44 32 H14 M44 44 H14 M44 56 H14 M44 68 H14"), fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-hud` — 선 아이콘, tint 로 색을 입힌다 */
    val LineHud: ImageVector by lazy {
        ImageVector.Builder(name = "p-hud", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M12 74 Q50 20 88 74"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M31.1767578125 55.775390625Q31.19140625 52.3037109375 32.29736328125 49.7548828125Q33.4033203125 47.2060546875 35.4248046875 45.85107421875Q37.4462890625 44.49609375 40.1416015625 44.49609375Q42.3095703125 44.49609375 44.03076171875 45.33837890625Q45.751953125 46.1806640625 46.78466796875 47.63818359375Q47.8173828125 49.095703125 48.0224609375 50.8828125H43.1005859375Q42.8662109375 49.8720703125 42.0751953125 49.32275390625Q41.2841796875 48.7734375 40.1416015625 48.7734375Q38.1640625 48.7734375 37.14599609375 50.43603515625Q36.1279296875 52.0986328125 36.1279296875 55.072265625H36.2744140625Q36.9482421875 53.6513671875 38.42041015625 52.83837890625Q39.892578125 52.025390625 41.6943359375 52.025390625Q43.583984375 52.025390625 45.078125 52.89697265625Q46.572265625 53.7685546875 47.41455078125 55.3212890625Q48.2568359375 56.8740234375 48.2568359375 58.822265625Q48.2568359375 61.0048828125 47.216796875 62.7041015625Q46.1767578125 64.4033203125 44.30908203125 65.34814453125Q42.44140625 66.29296875 40.0244140625 66.29296875Q37.5634765625 66.29296875 35.5712890625 65.23828125Q33.5791015625 64.18359375 32.3779296875 61.83251953125Q31.1767578125 59.4814453125 31.1767578125 55.775390625ZM43.3935546875 58.96875Q43.408203125 58.001953125 42.97607421875 57.21826171875Q42.5439453125 56.4345703125 41.767578125 55.98779296875Q40.9912109375 55.541015625 40.0244140625 55.541015625Q39.0576171875 55.541015625 38.27392578125 55.9951171875Q37.490234375 56.44921875 37.04345703125 57.240234375Q36.5966796875 58.03125 36.5966796875 58.998046875Q36.5966796875 59.935546875 37.0361328125 60.7265625Q37.4755859375 61.517578125 38.251953125 61.9716796875Q39.0283203125 62.42578125 39.9951171875 62.42578125Q40.9619140625 62.42578125 41.74560546875 61.97900390625Q42.529296875 61.5322265625 42.96875 60.7412109375Q43.408203125 59.9501953125 43.3935546875 58.96875ZM50.9228515625 55.39453125Q50.9228515625 51.9521484375 51.9921875 49.505859375Q53.0615234375 47.0595703125 55.0537109375 45.77783203125Q57.0458984375 44.49609375 59.7998046875 44.49609375Q62.5537109375 44.49609375 64.5458984375 45.77783203125Q66.5380859375 47.0595703125 67.607421875 49.505859375Q68.6767578125 51.9521484375 68.6767578125 55.39453125Q68.6767578125 58.8515625 67.607421875 61.2978515625Q66.5380859375 63.744140625 64.5458984375 65.0185546875Q62.5537109375 66.29296875 59.7998046875 66.29296875Q57.0458984375 66.29296875 55.0537109375 65.01123046875Q53.0615234375 63.7294921875 51.9921875 61.283203125Q50.9228515625 58.8369140625 50.9228515625 55.39453125ZM63.5498046875 55.39453125Q63.5498046875 52.0107421875 62.54638671875 50.27490234375Q61.54296875 48.5390625 59.7998046875 48.5390625Q58.0419921875 48.5390625 57.0458984375 50.30419921875Q56.0498046875 52.0693359375 56.0498046875 55.541015625Q56.0498046875 58.8662109375 57.060546875 60.54345703125Q58.0712890625 62.220703125 59.7998046875 62.220703125Q61.5576171875 62.220703125 62.5537109375 60.51416015625Q63.5498046875 58.8076171875 63.5498046875 55.39453125Z"), fill = SolidColor(Color.Black))
        }.build()
    }

    /** `p-key` — 선 아이콘, tint 로 색을 입힌다 */
    val LineKey: ImageVector by lazy {
        ImageVector.Builder(name = "p-key", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M36.0,14.0H64.0A10.0,10.0 0 0 1 74.0,24.0V76.0A10.0,10.0 0 0 1 64.0,86.0H36.0A10.0,10.0 0 0 1 26.0,76.0V24.0A10.0,10.0 0 0 1 36.0,14.0Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M40.0,42.0A10.0,10.0 0 1 0 60.0,42.0A10.0,10.0 0 1 0 40.0,42.0Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50 52 V72"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-map` — 선 아이콘, tint 로 색을 입힌다. 로드맵 버튼(시안 6.93 홈 헤더) */
    val LineMap: ImageVector by lazy {
        ImageVector.Builder(name = "p-map", defaultWidth = 31.dp, defaultHeight = 31.dp, viewportWidth = 31f, viewportHeight = 31f).apply {
        addPath(pathData = addPathNodes("M19.2779 7.64984L11.3219 4.58984L3.67188 7.34384V25.7038L11.3219 22.9498M11.3219 4.58984V22.9498M11.3219 22.9498L19.2779 26.0098L26.9279 23.2558V4.89584L19.2779 7.64984M19.2779 7.64984V26.0098"), stroke = SolidColor(Color.Black), strokeLineWidth = 1.836f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Round)
        }.build()
    }

    /** `p-mic` — 선 아이콘, tint 로 색을 입힌다 */
    val LineMic: ImageVector by lazy {
        ImageVector.Builder(name = "p-mic", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M50.0,14.0H50.0A12.0,12.0 0 0 1 62.0,26.0V46.0A12.0,12.0 0 0 1 50.0,58.0H50.0A12.0,12.0 0 0 1 38.0,46.0V26.0A12.0,12.0 0 0 1 50.0,14.0Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M26 46 Q26 70 50 70 Q74 70 74 46M50 70 V86M38 86 H62"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-mirror` — 선 아이콘, tint 로 색을 입힌다 */
    val LineMirror: ImageVector by lazy {
        ImageVector.Builder(name = "p-mirror", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M22 34 Q22 24 32 24 H78 Q86 24 86 32 V56 Q86 64 78 64 H40 Q22 64 22 46Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Round)
        addPath(pathData = addPathNodes("M40 64 V80 H52"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M62 74 L70 84 L78 74"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        }.build()
    }

    /** `p-paddle` — 선 아이콘, tint 로 색을 입힌다 */
    val LinePaddle: ImageVector by lazy {
        ImageVector.Builder(name = "p-paddle", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M24.0,52.0A26.0,26.0 0 1 0 76.0,52.0A26.0,26.0 0 1 0 24.0,52.0Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M24 40 Q8 44 8 60 Q8 72 18 78 L26 64 M76 40 Q92 44 92 60 Q92 72 82 78 L74 64"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        }.build()
    }

    /** `p-play` — 선 아이콘, tint 로 색을 입힌다 */
    val LinePlay: ImageVector by lazy {
        ImageVector.Builder(name = "p-play", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M7 4l13 8-13 8z"), fill = SolidColor(Color.Black))
        }.build()
    }

    /** `p-rain` — 선 아이콘, tint 로 색을 입힌다 */
    val LineRain: ImageVector by lazy {
        ImageVector.Builder(name = "p-rain", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M7 15a4 4 0 0 1-.6-7.95A6 6 0 0 1 18 8.5a3.5 3.5 0 0 1-.5 6.5"), fill = SolidColor(Color.Black))
        addPath(pathData = addPathNodes("M8 18l-1 3M12 18l-1 3M16 18l-1 3"), stroke = SolidColor(Color.Black), strokeLineWidth = 2.2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-rear` — 선 아이콘, tint 로 색을 입힌다 */
    val LineRear: ImageVector by lazy {
        ImageVector.Builder(name = "p-rear", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M24.0,22.0H76.0A8.0,8.0 0 0 1 84.0,30.0V64.0A8.0,8.0 0 0 1 76.0,72.0H24.0A8.0,8.0 0 0 1 16.0,64.0V30.0A8.0,8.0 0 0 1 24.0,22.0Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M36 90c6-8-6-16 0-24s-6-16 0-24"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50 90c6-8-6-16 0-24s-6-16 0-24"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M64 90c6-8-6-16 0-24s-6-16 0-24"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M29 48l7-10 7 10"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M43 48l7-10 7 10"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M57 48l7-10 7 10"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-redo` — 선 아이콘, tint 로 색을 입힌다 */
    val LineRedo: ImageVector by lazy {
        ImageVector.Builder(name = "p-redo", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M4 12a8 8 0 1 0 2.3-5.7"), stroke = SolidColor(Color.Black), strokeLineWidth = 2.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M4 3v5h5"), stroke = SolidColor(Color.Black), strokeLineWidth = 2.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        }.build()
    }

    /** `p-search` — 선 아이콘, tint 로 색을 입힌다 */
    val LineSearch: ImageVector by lazy {
        ImageVector.Builder(name = "p-search", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M4.0,11.0A7.0,7.0 0 1 0 18.0,11.0A7.0,7.0 0 1 0 4.0,11.0Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 2.6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M16.5 16.5L21 21"), stroke = SolidColor(Color.Black), strokeLineWidth = 2.6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-seat` — 선 아이콘, tint 로 색을 입힌다 */
    val LineSeat: ImageVector by lazy {
        ImageVector.Builder(name = "p-seat", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M30 20 L36 60 L72 60 L76 78 L24 78"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        addPath(pathData = addPathNodes("M36 60 Q30 40 30 20"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-settings` — 선 아이콘, tint 로 색을 입힌다. 설정 버튼(시안 6.93 홈 헤더) */
    val LineSettings: ImageVector by lazy {
        ImageVector.Builder(name = "p-settings", defaultWidth = 31.dp, defaultHeight = 31.dp, viewportWidth = 31f, viewportHeight = 31f).apply {
        addPath(pathData = addPathNodes("M24.6502 13.701C24.7385 14.221 24.7845 14.7553 24.7845 15.3005C24.7845 15.8456 24.7385 16.3799 24.6502 16.8999M23.0413 9.81883C22.4206 8.9437 21.6553 8.17837 20.7801 7.55768M16.898 5.94873C16.378 5.86043 15.8436 5.81445 15.2985 5.81445C14.7534 5.81445 14.219 5.86043 13.699 5.94873M9.81687 7.55768C8.94174 8.17837 8.17642 8.9437 7.55573 9.81883M5.94677 13.701C5.85848 14.221 5.8125 14.7553 5.8125 15.3005C5.8125 15.8456 5.85848 16.3799 5.94677 16.8999M7.55573 20.7821C8.17642 21.6572 8.94174 22.4225 9.81687 23.0432M13.699 24.6522C14.219 24.7405 14.7534 24.7865 15.2985 24.7865C15.8436 24.7865 16.378 24.7405 16.898 24.6522M20.7801 23.0432C21.6553 22.4225 22.4206 21.6572 23.0413 20.7821"), stroke = SolidColor(Color.Black), strokeLineWidth = 3.672f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M22.3377 15.2997C22.3377 19.1867 19.1867 22.3377 15.2997 22.3377C11.4127 22.3377 8.26172 19.1867 8.26172 15.2997C8.26172 11.4127 11.4127 8.26172 15.2997 8.26172C19.1867 8.26172 22.3377 11.4127 22.3377 15.2997Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 1.836f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M17.7476 15.2996C17.7476 16.6516 16.6516 17.7476 15.2996 17.7476C13.9476 17.7476 12.8516 16.6516 12.8516 15.2996C12.8516 13.9476 13.9476 12.8516 15.2996 12.8516C16.6516 12.8516 17.7476 13.9476 17.7476 15.2996Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 1.836f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-snow` — 선 아이콘, tint 로 색을 입힌다 */
    val LineSnow: ImageVector by lazy {
        ImageVector.Builder(name = "p-snow", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M12 2v20M2 12h20M5 5l14 14M19 5L5 19"), stroke = SolidColor(Color.Black), strokeLineWidth = 2.2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-sun` — 선 아이콘, tint 로 색을 입힌다 */
    val LineSun: ImageVector by lazy {
        ImageVector.Builder(name = "p-sun", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(pathData = addPathNodes("M7.5,12.0A4.5,4.5 0 1 0 16.5,12.0A4.5,4.5 0 1 0 7.5,12.0Z"), fill = SolidColor(Color.Black))
        addPath(pathData = addPathNodes("M12 2v3M12 19v3M2 12h3M19 12h3M4.9 4.9l2.1 2.1M17 17l2.1 2.1M4.9 19.1L7 17M17 7l2.1-2.1"), stroke = SolidColor(Color.Black), strokeLineWidth = 2.2f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-svm` — 선 아이콘, tint 로 색을 입힌다 */
    val LineSvm: ImageVector by lazy {
        ImageVector.Builder(name = "p-svm", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M45.0,28.0H55.0A7.0,7.0 0 0 1 62.0,35.0V65.0A7.0,7.0 0 0 1 55.0,72.0H45.0A7.0,7.0 0 0 1 38.0,65.0V35.0A7.0,7.0 0 0 1 45.0,28.0Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M20 36 A36 36 0 0 1 36 18M80 36 A36 36 0 0 0 64 18M20 64 A36 36 0 0 0 36 82M80 64 A36 36 0 0 1 64 82"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-turn-l` — 선 아이콘, tint 로 색을 입힌다 */
    val LineTurnL: ImageVector by lazy {
        ImageVector.Builder(name = "p-turn-l", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M12 50 L42 22 V38 H84 V62 H42 V78 Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Round)
        }.build()
    }

    /** `p-washer` — 선 아이콘, tint 로 색을 입힌다 */
    val LineWasher: ImageVector by lazy {
        ImageVector.Builder(name = "p-washer", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M10 72 Q50 22 90 72"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50 84 L50 50"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50.000,50.000L49.688,49.610 49.375,49.219 49.063,48.829 48.751,48.438 48.438,48.048 48.126,47.657 47.814,47.267 47.501,46.877M43.128,41.410L42.816,41.020 42.504,40.630 42.191,40.239 41.879,39.849 41.567,39.458 41.254,39.068 40.942,38.677 40.630,38.287M36.257,32.821L35.975,32.468 35.693,32.116 35.410,31.763 35.128,31.410 34.846,31.058 34.564,30.705 34.282,30.353 34.000,30.000M50.000,50.000L50.000,49.500 50.000,49.000 50.000,48.500 50.000,48.000 50.000,47.500 50.000,47.000 50.000,46.500 50.000,46.000M50.000,39.000L50.000,38.500 50.000,38.000 50.000,37.500 50.000,37.000 50.000,36.500 50.000,36.000 50.000,35.500 50.000,35.000M50.000,28.000L50.000,27.500 50.000,27.000 50.000,26.500 50.000,26.000 50.000,25.500 50.000,25.000 50.000,24.500 50.000,24.000M50.000,50.000L50.312,49.610 50.625,49.219 50.937,48.829 51.249,48.438 51.562,48.048 51.874,47.657 52.186,47.267 52.499,46.877M56.872,41.410L57.184,41.020 57.496,40.630 57.809,40.239 58.121,39.849 58.433,39.458 58.746,39.068 59.058,38.677 59.370,38.287M63.743,32.821L64.025,32.468 64.307,32.116 64.590,31.763 64.872,31.410 65.154,31.058 65.436,30.705 65.718,30.353 66.000,30.000"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-window` — 선 아이콘, tint 로 색을 입힌다 */
    val LineWindow: ImageVector by lazy {
        ImageVector.Builder(name = "p-window", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M14 72 L14 38 Q14 26 26 26 L74 26 Q86 26 86 38 L86 72 Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Round)
        addPath(pathData = addPathNodes("M14 52 H86"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50 60 V86 M40 76 L50 86 L60 76"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round)
        }.build()
    }

    /** `p-winlock` — 선 아이콘, tint 로 색을 입힌다 */
    val LineWinlock: ImageVector by lazy {
        ImageVector.Builder(name = "p-winlock", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M14 70 L14 36 Q14 26 24 26 L76 26 Q86 26 86 36 L86 70 Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Round)
        addPath(pathData = addPathNodes("M14 52 H86"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M42.0,58.0H58.0A4.0,4.0 0 0 1 62.0,62.0V76.0A4.0,4.0 0 0 1 58.0,80.0H42.0A4.0,4.0 0 0 1 38.0,76.0V62.0A4.0,4.0 0 0 1 42.0,58.0Z"), fill = SolidColor(Color.Black))
        addPath(pathData = addPathNodes("M43 58 V52 a7 7 0 0 1 14 0 V58"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        }.build()
    }

    /** `p-wiper-f` — 선 아이콘, tint 로 색을 입힌다 */
    val LineWiperF: ImageVector by lazy {
        ImageVector.Builder(name = "p-wiper-f", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M10 70 Q50 18 90 70"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50 78 L62 40"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M40.000,44.000L40.388,43.685 40.780,43.374 41.173,43.066 41.570,42.761 41.970,42.461 42.372,42.164M49.214,38.040L49.667,37.829 50.123,37.623 50.581,37.425 51.043,37.232 51.507,37.047 51.975,36.869M59.750,35.094L60.248,35.057 60.747,35.029 61.247,35.011 61.747,35.001 62.247,35.001 62.747,35.010M70.602,36.376L71.077,36.532 71.550,36.696 72.020,36.867 72.487,37.045 72.951,37.230 73.413,37.422M80.398,41.294L80.809,41.579 81.218,41.868 81.623,42.160 82.025,42.457 82.425,42.758 82.822,43.062"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M44.0,78.0A6.0,6.0 0 1 0 56.0,78.0A6.0,6.0 0 1 0 44.0,78.0Z"), fill = SolidColor(Color.Black))
        }.build()
    }

    /** `p-wiper-r` — 선 아이콘, tint 로 색을 입힌다 */
    val LineWiperR: ImageVector by lazy {
        ImageVector.Builder(name = "p-wiper-r", defaultWidth = 100.dp, defaultHeight = 100.dp, viewportWidth = 100f, viewportHeight = 100f).apply {
        addPath(pathData = addPathNodes("M22.0,26.0H78.0A8.0,8.0 0 0 1 86.0,34.0V68.0A8.0,8.0 0 0 1 78.0,76.0H22.0A8.0,8.0 0 0 1 14.0,68.0V34.0A8.0,8.0 0 0 1 22.0,26.0Z"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Butt, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M50 76 L62 44"), stroke = SolidColor(Color.Black), strokeLineWidth = 6f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M40.000,46.000L40.392,45.690 40.787,45.383 41.185,45.080 41.586,44.782 41.990,44.487 42.397,44.197M49.349,40.269L49.811,40.076 50.275,39.891 50.743,39.714 51.213,39.544 51.686,39.382 52.162,39.229M60.035,38.000L60.535,38.006 61.035,38.021 61.534,38.047 62.033,38.083 62.531,38.128 63.028,38.183M70.716,40.297L71.174,40.497 71.629,40.705 72.080,40.919 72.529,41.140 72.974,41.367 73.417,41.600"), stroke = SolidColor(Color.Black), strokeLineWidth = 5f, strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Miter)
        addPath(pathData = addPathNodes("M44.0,76.0A6.0,6.0 0 1 0 56.0,76.0A6.0,6.0 0 1 0 44.0,76.0Z"), fill = SolidColor(Color.Black))
        }.build()
    }

    /** 전체 목록(미리보기용). */
    val all: List<Pair<String, ImageVector>> by lazy {
        listOf(
            "i3-accel" to I3Accel,
            "i3-bdg-childlock" to I3BdgChildlock,
            "i3-bdg-climate" to I3BdgClimate,
            "i3-bdg-dkey" to I3BdgDkey,
            "i3-bdg-drivemode" to I3BdgDrivemode,
            "i3-bdg-firstdrive" to I3BdgFirstdrive,
            "i3-bdg-nohint" to I3BdgNohint,
            "i3-bdg-rain" to I3BdgRain,
            "i3-bdg-tutorial" to I3BdgTutorial,
            "i3-bell" to I3Bell,
            "i3-brake" to I3Brake,
            "i3-bulb" to I3Bulb,
            "i3-climate" to I3Climate,
            "i3-clock" to I3Clock,
            "i3-defrost" to I3Defrost,
            "i3-dial" to I3Dial,
            "i3-drivemode" to I3Drivemode,
            "i3-expert" to I3Expert,
            "i3-fan" to I3Fan,
            "i3-gear" to I3Gear,
            "i3-headlamp" to I3Headlamp,
            "i3-hud" to I3Hud,
            "i3-key" to I3Key,
            "i3-list" to I3List,
            "i3-map" to I3Map,
            "i3-medal" to I3Medal,
            "i3-mirror" to I3Mirror,
            "i3-nohint" to I3Nohint,
            "i3-novice" to I3Novice,
            "i3-paddle" to I3Paddle,
            "i3-park" to I3Park,
            "i3-press" to I3Press,
            "i3-rain" to I3Rain,
            "i3-rear" to I3Rear,
            "i3-recirc" to I3Recirc,
            "i3-search" to I3Search,
            "i3-seat" to I3Seat,
            "i3-shift" to I3Shift,
            "i3-sprout" to I3Sprout,
            "i3-trophy" to I3Trophy,
            "i3-turn" to I3Turn,
            "i3-wheel" to I3Wheel,
            "i3-winlock" to I3Winlock,
            "i3-wiper" to I3Wiper,
            "ic-app" to AppApp,
            "p-ac" to LineAc,
            "p-accel" to LineAccel,
            "p-arrow" to LineArrow,
            "p-baby" to LineBaby,
            "p-book" to LineBook,
            "p-brake" to LineBrake,
            "p-bulb" to LineBulb,
            "p-check" to LineCheck,
            "p-chev" to LineChev,
            "p-chevl" to LineChevl,
            "p-child" to LineChild,
            "p-cold" to LineCold,
            "p-doorlock" to LineDoorlock,
            "p-down" to LineDown,
            "p-drive" to LineDrive,
            "p-excl" to LineExcl,
            "p-fan" to LineFan,
            "p-front" to LineFront,
            "p-gear-n" to LineGearN,
            "p-gear-r" to LineGearR,
            "p-headlamp" to LineHeadlamp,
            "p-highbeam" to LineHighbeam,
            "p-hud" to LineHud,
            "p-key" to LineKey,
            "p-map" to LineMap,
            "p-mic" to LineMic,
            "p-mirror" to LineMirror,
            "p-paddle" to LinePaddle,
            "p-play" to LinePlay,
            "p-rain" to LineRain,
            "p-rear" to LineRear,
            "p-redo" to LineRedo,
            "p-search" to LineSearch,
            "p-seat" to LineSeat,
            "p-settings" to LineSettings,
            "p-snow" to LineSnow,
            "p-sun" to LineSun,
            "p-svm" to LineSvm,
            "p-turn-l" to LineTurnL,
            "p-washer" to LineWasher,
            "p-window" to LineWindow,
            "p-winlock" to LineWinlock,
            "p-wiper-f" to LineWiperF,
            "p-wiper-r" to LineWiperR,
        )
    }
}
