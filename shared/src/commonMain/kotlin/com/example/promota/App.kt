package com.example.promota

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.promota.presentation.components.dashboard.BaseDashboardScreen
import com.example.promota.presentation.navigation.NavHost
import com.example.promota.presentation.screens.addproduct.AddProductScreenRoute
import com.example.promota.presentation.screens.categories.CategoryTabsGrid
import com.example.promota.presentation.screens.dashboard.DashboardScreen
import com.example.promota.presentation.screens.product.ProductScreenRoute
import com.example.promota.presentation.utils.theme.PromotaTheme

@Composable
fun App() {
    PromotaTheme {
        val state = NavHost.navigationViewModel.state.collectAsState()
        val showBottomBarState = remember { mutableStateOf(false) }
        BaseDashboardScreen(showBottomBar = showBottomBarState.value) {
            when (state.value.screen) {
                is NavHost.OpenDashboardScreen -> {
                    showBottomBarState.value = true
                    AddProductScreenRoute()
                }

                is NavHost.OpenCategoryScreen -> {
                    showBottomBarState.value = true
                    CategoryTabsGrid()
                }

                is NavHost.ProductsScreen -> {
                    showBottomBarState.value = false
                    ProductScreenRoute()
                }
                is NavHost.AddProductScreenRoute -> {
                    showBottomBarState.value = false
                    AddProductScreenRoute()
                }
            }
        }
    }
}

