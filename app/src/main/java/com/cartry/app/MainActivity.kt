package com.cartry.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cartry.designsystem.preview.CartryComponentGallery
import com.cartry.designsystem.theme.CartryTheme

/** 프로젝트 틀 확인용 첫 화면: 디자인 시스템 컴포넌트 모음을 띄운다. */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartryTheme {
                Box(
                    Modifier
                        .verticalScroll(rememberScrollState())
                        .horizontalScroll(rememberScrollState())
                ) {
                    CartryComponentGallery()
                }
            }
        }
    }
}

@Preview(widthDp = 2560, heightDp = 3200)
@Composable
fun GalleryPreview() = CartryTheme { CartryComponentGallery() }
