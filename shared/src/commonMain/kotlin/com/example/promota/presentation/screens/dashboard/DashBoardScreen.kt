package com.example.promota.presentation.screens.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import com.example.promota.presentation.components.table.CellBackgroundColor
import com.example.promota.presentation.components.table.ScrollableTable
import com.example.promota.presentation.screens.dashboard.components.DashboardTitleBar
import com.example.promota.presentation.screens.dashboard.components.PeriodSelectorBar
import com.example.promota.presentation.screens.dashboard.components.statistics.BestSellerCard
import com.example.promota.presentation.screens.dashboard.components.statistics.StatisticsSection
import com.example.promota.presentation.screens.dashboard.components.statistics.TransactionsCard
import kotlin.math.log

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
                val textStyle = listOf(CellBackgroundColor(3, 2, MaterialTheme.colorScheme.surface))
                ScrollableTable(columnHeaders, tableData, textStyle, onClickEnabled = true,{})
               //TransactionsCard()
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
