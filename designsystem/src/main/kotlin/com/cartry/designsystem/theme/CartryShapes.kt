package com.cartry.designsystem.theme

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

/** 모서리. 카드·말풍선·타일·모달은 전부 24 하나다. 버튼·배지는 알약, 원형 버튼은 원. */
@Immutable
data class CartryShapes(
    /** 카드·말풍선·타일·상태 막대·모달 24 */
    val card: Shape = RoundedCornerShape(24.dp),
    /** 버튼·배지·진행 칸 (높이의 절반) */
    val pill: Shape = RoundedCornerShape(percent = 50),
    /** 뒤로·더보기 원형 버튼, 번호 동그라미, 상태 점 */
    val circle: Shape = CircleShape,
    /** 헤더의 앱 아이콘 16 (Pleos 앱 아이콘 모양) */
    val appIcon: Shape = RoundedCornerShape(16.dp),
)
