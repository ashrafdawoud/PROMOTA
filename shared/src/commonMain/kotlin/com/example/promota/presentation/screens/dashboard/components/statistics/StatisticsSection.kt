package com.example.promota.presentation.screens.dashboard.components.statistics

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.promota.presentation.utils.theme.darkBlue
import com.example.promota.presentation.utils.theme.darkMove
import com.example.promota.presentation.utils.theme.darkOrange
import com.example.promota.presentation.utils.theme.green
import com.example.promota.presentation.utils.theme.lightBlue
import com.example.promota.presentation.utils.theme.lightGreen
import com.example.promota.presentation.utils.theme.lightMove
import com.example.promota.presentation.utils.theme.lightOrange

@Composable
fun StatisticsSection() {
    LazyVerticalGrid(
        modifier = Modifier.fillMaxWidth().height(180.dp),
        columns = GridCells.Fixed(2),
    ) {
        item {
            StatisticsCard(
                iconRes = "drawable/revenew.png",
                value = "1000 EG",
                type = "Revenue",
                tint = green,
                iconBackground = lightGreen,
            )
        }
        item {
            StatisticsCard(
                iconRes = "drawable/profit.png",
                value = "3500 k",
                type = "Profit",
                tint = darkMove,
                iconBackground = lightMove,
            )
        }
        item {
            StatisticsCard(
                iconRes = "drawable/sale_return.png",
                value = "987 EG",
                type = "Sales Returns",
                tint = darkBlue,
                iconBackground = lightBlue,
            )
        }
        item {
            StatisticsCard(
                iconRes = "drawable/repurchace_return.png",
                value = "876 EG",
                type = "Purchase Return",
                tint = darkOrange,
                iconBackground = lightOrange,
            )
        }
    }
}