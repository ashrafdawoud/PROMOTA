package com.example.promota

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import com.example.promota.dashboard.presentaion.DashboardScreen
import com.example.promota.utils.presentation.PromotaTheme
import org.jetbrains.compose.resources.painterResource

@Composable
fun App() {
    PromotaTheme {
        DashboardScreen()
    }
}
