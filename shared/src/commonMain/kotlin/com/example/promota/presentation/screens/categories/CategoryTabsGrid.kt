package com.example.promota.presentation.screens.categories

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.promota.presentation.components.bar.DashboardTitleBar
import com.example.promota.presentation.navigation.NavHost
import com.example.promota.presentation.navigation.State
import com.example.promota.presentation.utils.theme.darkBlue
import com.example.promota.presentation.utils.theme.lightBlue
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@Composable
fun CategoryTabsGrid() {
    val categoryItems = listOf(
        Pair("Products", "drawable/product.png"),
        Pair("Sales", "drawable/sales.png"),
        Pair("Purchase", "drawable/purchase.png"),
        Pair("Quotation", "drawable/qutation.png"),
        Pair("Expense", "drawable/expense.png"),
        Pair("Transfer", "drawable/transfer.png"),
        Pair("Return", "drawable/return.png"),
        Pair("Accounting", "drawable/accounting.png"),
        Pair("HRM", "drawable/hr.png"),
        Pair("Reports", "drawable/reports.png"),
        Pair("Settings", "drawable/settings.png"),
    )
    Column {
        DashboardTitleBar()
        LazyVerticalGrid(
            modifier = Modifier.fillMaxWidth(),
            columns = GridCells.Fixed(3),
            userScrollEnabled = false
        ) {
            categoryItems.forEach { item ->
                item {
                    CategoryTab(item.second, item.first)
                }
            }
        }
    }
}


@OptIn(ExperimentalResourceApi::class, ExperimentalMaterial3Api::class)
@Composable
fun CategoryTab(
    image: String,
    title: String
) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .size(90.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onPrimary),
        onClick = {NavHost.navigationViewModel.setState(State(NavHost.ProductsScreen))}
    ) {
        Column(
            modifier = Modifier.padding(5.dp).fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(image),
                contentDescription = null,
                tint = darkBlue,
                modifier = Modifier
                    .size(50.dp)
                    .background(color = lightBlue, shape = MaterialTheme.shapes.medium)
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.size(4.dp))
            Text(
                title,
                style = MaterialTheme.typography.titleLarge.copy(fontSize = 16.sp),
                color = MaterialTheme.colorScheme.surface
            )
        }
    }
}
