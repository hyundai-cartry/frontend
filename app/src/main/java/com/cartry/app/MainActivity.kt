package com.cartry.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.cartry.app.navigation.CartryNavHost
import com.cartry.designsystem.preview.CartryComponentGallery
import com.cartry.designsystem.theme.CartryTheme

/** 앱 시작점. 화면 이동은 CartryNavHost 가 맡는다. */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartryTheme {
                CartryNavHost()
            }
        }
    }
}

/** 디자인 시스템 컴포넌트 모음. 미리보기 창에서만 본다. */
@Preview(widthDp = 1700, heightDp = 3320)
@Composable
fun GalleryPreview() = CartryTheme { CartryComponentGallery() }
