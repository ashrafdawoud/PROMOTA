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
import com.example.promota.presentation.components.table.CellBackgroundColor
import com.example.promota.presentation.components.table.TableView
import com.example.promota.presentation.screens.dashboard.columnHeaders
import com.example.promota.presentation.components.bar.PeriodSelectorBar
import com.example.promota.presentation.screens.dashboard.tableData

@Composable
fun TransactionsCard() {
    val textStyle = listOf(
        CellBackgroundColor(
            3,
            2,
            MaterialTheme.colorScheme.surface,
            MaterialTheme.colorScheme.onSurface
        )
    )
    Column(
        modifier = Modifier.background(MaterialTheme.colorScheme.onPrimary)
            .padding(top = 10.dp)
    ) {
        Row(modifier = Modifier.padding(horizontal = 5.dp)) {
            Text(
                "Recent Transaction",
                modifier = Modifier.weight(1F),
                color = MaterialTheme.colorScheme.outline
            )
            Text(
                "Last 5",
                modifier = Modifier.background(
                    MaterialTheme.colorScheme.tertiary,
                    shape = MaterialTheme.shapes.large,
                )
                    .padding(horizontal = 15.dp, vertical = 4.dp),
                color = MaterialTheme.colorScheme.onPrimary,
                style = MaterialTheme.typography.bodySmall.copy(fontSize = 12.sp)
            )
        }
        Spacer(modifier = Modifier.size(10.dp))
        PeriodSelectorBar(
            tabs = listOf("Sales", "Purchases", "Quotation", "Payment"),
            backgroundColor = MaterialTheme.colorScheme.onTertiaryContainer,
            textColor = MaterialTheme.colorScheme.outline,
            SelectedBackGroundColor = MaterialTheme.colorScheme.tertiaryContainer.copy(alpha = 0.2f),
            containerShape = ShapeDefaults.ExtraSmall,
            containerElevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
            containerContentColor = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.outline)
        )
        TableView(columnHeaders, tableData, textStyle, onClickEnabled = true) {}
    }
}