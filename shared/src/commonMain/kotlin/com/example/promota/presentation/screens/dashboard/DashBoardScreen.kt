package com.example.promota.presentation.screens.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.promota.presentation.components.bar.DashboardTitleBar
import com.example.promota.presentation.components.bar.PeriodSelectorBar
import com.example.promota.presentation.screens.dashboard.components.statistics.BestSellerCard
import com.example.promota.presentation.screens.dashboard.components.statistics.StatisticsSection
import com.example.promota.presentation.screens.dashboard.components.statistics.TransactionsCard

@Composable
fun DashboardScreen() {
    Column {
        DashboardTitleBar()
        LazyColumn(
            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.background)
                .padding(6.dp)
        ) {
            item {
                PeriodSelectorBar()
                Spacer(Modifier.height(6.dp))
            }
            item {
                StatisticsSection()
                Spacer(Modifier.height(6.dp))
            }
            item {
                TransactionsCard()
                Spacer(Modifier.height(6.dp))
            }
            item {

                BestSellerCard()
                Spacer(Modifier.height(6.dp))
            }
        }
    }
}

val columnHeaders = listOf("Date", "Reference", "Customer", "Status", "Grand Total")
val tableData = listOf(
    listOf(
        "14/05/2023",
        "posr-20230515-092752",
        "Walk in customer",
        "Completed",
        "6200"
    ),
    listOf(
        "14/05/2023",
        "posr-20230515-092752",
        "Walk in customer",
        "Draft",
        "6003"
    ),
    listOf(
        "14/05/2023",
        "posr-20230515-092752",
        "Walk in customer",
        "Completed",
        "6050"
    ),
    listOf(
        "14/05/2023",
        "posr-20230515-092752",
        "Walk in customer",
        "Draft",
        "6080"
    ),
)
