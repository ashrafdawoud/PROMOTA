package com.example.promota.presentation.screens.dashboard.components.statistics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun StatisticsCard(
     iconRes:String,
     value:String,
     type:String,
     tint:Color,
     iconBackground:Color,
) {
    Card(
        modifier = Modifier
            .padding(
                end = 5.dp,
                top = 5.dp,
                bottom = 5.dp
            ).size(80.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onPrimary)
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Icon(
                painterResource(iconRes),
                contentDescription = null,
                tint = tint,
                modifier = Modifier.size(50.dp)
                    .background(color = iconBackground, shape = MaterialTheme.shapes.medium)
                    .padding(12.dp)
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.size(10.dp))
            Column(
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Text(
                    value,
                    style = MaterialTheme.typography.titleLarge.copy(fontSize = 18.sp),
                    color = MaterialTheme.colorScheme.outline
                )
                Text(
                    type,
                    style = MaterialTheme.typography.bodySmall.copy(fontSize = 15.sp),
                    color = MaterialTheme.colorScheme.surface,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}