package com.example.promota.presentation.screens.dashboard.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Composable
fun PeriodSelectorBar(
    tabs: List<String> = listOf("Today", "Last 7 Days", "This Month", "This Year"),
    backgroundColor: Color = MaterialTheme.colorScheme.primaryContainer,
    textColor: Color = MaterialTheme.colorScheme.onPrimary,
    SelectedTextColor: Color = MaterialTheme.colorScheme.onPrimary,
    SelectedBackGroundColor: Color = Color.Transparent,
    containerShape: Shape = MaterialTheme.shapes.medium,
    containerElevation: CardElevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
    containerContentColor: CardColors = CardDefaults.cardColors(contentColor = backgroundColor)
) {
    var position by remember { mutableStateOf(0) }
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = containerShape,
        elevation = containerElevation,
        colors = containerContentColor
    ) {
        TabRow(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = backgroundColor,
                    shape = MaterialTheme.shapes.medium
                ),
            selectedTabIndex = position,
            containerColor = backgroundColor,
            contentColor = textColor,
        ) {
            tabs.forEachIndexed { index, day ->
                Tab(
                    content = { Text(day, modifier = Modifier.padding(vertical = 10.dp)) },
                    selected = index == position,
                    modifier = Modifier
                        .background(color = if (index == position) SelectedBackGroundColor else Color.Transparent),
                    onClick = { position = index }
                )
            }
        }
    }
}
