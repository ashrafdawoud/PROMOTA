package com.example.promota.presentation.screens.dashboard.components.statistics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.promota.presentation.components.table.ScrollableTable
import com.example.promota.presentation.screens.dashboard.components.PeriodSelectorBar

@Composable
fun BestSellerCard() {
    Column(
        modifier = Modifier.background(MaterialTheme.colorScheme.onPrimary)
            .padding(top = 10.dp)
    ) {
        Row(modifier = Modifier.padding(horizontal = 5.dp)) {
            Text("Best Seller", modifier = Modifier.weight(1F))
            Text(
                "Top 5",
                modifier = Modifier.background(
                    MaterialTheme.colorScheme.tertiary,
                    shape = MaterialTheme.shapes.large
                )
                    .padding(horizontal = 15.dp, vertical = 4.dp),
                color = MaterialTheme.colorScheme.onPrimary,
                style = MaterialTheme.typography.bodySmall.copy(fontSize = 12.sp)
            )
        }
        Spacer(modifier = Modifier.size(10.dp))
        PeriodSelectorBar(
            tabs = listOf("Qty", "Price"),
            backgroundColor = MaterialTheme.colorScheme.onTertiaryContainer,
            textColor = MaterialTheme.colorScheme.outline,
            SelectedBackGroundColor = MaterialTheme.colorScheme.tertiaryContainer.copy(alpha = 0.2f),
            containerShape = ShapeDefaults.ExtraSmall,
            containerElevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
            containerContentColor = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onPrimary)
        )
        ScrollableTable(
            columnHeader,
            tableDate,
            onClickEnabled = true,
        ) {}
    }
}

val columnHeader = listOf("Product Details", "Qty")
val tableDate = listOf(
    listOf("apple", "15"),
    listOf("oarnge", "15"),
    listOf("android", "17"),
    listOf("google", "15")
)
