package com.example.promota.dashboard.presentaion

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.promota.dashboard.presentaion.components.DashboardTitleBar

@Composable
fun DashboardScreen() {
    Column(
        modifier = Modifier
            .background(color = MaterialTheme.colorScheme.surface)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        DashboardTitleBar()
    }
}