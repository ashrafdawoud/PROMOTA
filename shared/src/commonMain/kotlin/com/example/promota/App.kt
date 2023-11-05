package com.example.promota

import androidx.compose.runtime.Composable
import com.example.promota.presentation.navigation.NavHost
import com.example.promota.presentation.utils.components.BaseNavigationScreen
import com.example.promota.presentation.utils.theme.PromotaTheme

@Composable
fun App() {
    PromotaTheme {
        BaseNavigationScreen{
            NavHost.navigate()
        }
    }
}

expect fun userNotificationCenter()

