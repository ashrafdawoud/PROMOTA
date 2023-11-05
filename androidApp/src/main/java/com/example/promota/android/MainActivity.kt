package com.example.promota.android

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.WindowInsetsController
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.promota.MainView


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStatusBarColorToDarkerShadeOfBackgroundColor()
        setContent {
            MainView()
        }
    }

    private fun setStatusBarColorToDarkerShadeOfBackgroundColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val windowInsetsController = window.insetsController
            windowInsetsController?.setSystemBarsAppearance(
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
            )
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.statusBarColor = Color.WHITE
        } else {

        }
    }
}
