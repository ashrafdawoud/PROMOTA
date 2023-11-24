package com.example.promota.presentation.components.bar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.promota.presentation.utils.theme.darkBlue
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalMaterial3Api::class, ExperimentalResourceApi::class)
@Composable
fun DashboardTitleBar() {
    TopAppBar(
        title = {
            Text(
                "PROMOTA",
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp, start = 5.dp, end = 5.dp)
                    .fillMaxWidth(),
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.primaryContainer,
                textAlign = TextAlign.Center
            )
        },
        modifier = Modifier
            .fillMaxWidth(),
        colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.onPrimary),
        actions = {
            Icon(
                painter = painterResource("drawable/notifications.png"),
                contentDescription = null,
                tint = darkBlue,
                modifier = Modifier
                    .padding(end =10.dp)
                    .size(30.dp)
            )
        }
    )
}