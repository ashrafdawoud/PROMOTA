package com.example.promota.presentation.components.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.promota.presentation.navigation.NavHost
import com.example.promota.presentation.navigation.State
import com.example.promota.presentation.utils.theme.darkBlue
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@Composable
fun BaseDashboardScreen(
    showBottomBar: Boolean = false,
    content: @Composable () -> Unit
) {
    val selectedItem = remember { mutableStateOf(0) }
    Scaffold(
        bottomBar = {
            if (showBottomBar)
                BottomBarWithCircleBar(selectedItem)
        },
    ) {
        content.invoke()
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun BottomBarWithCircleBar(selectedItem: MutableState<Int>) {
    NavigationBar(
        tonalElevation = 20.dp,
        containerColor = Color.Transparent,
        contentColor = Color.Black,
        modifier = Modifier.background(
            shape = MaterialTheme.shapes.large.copy(
                bottomStart = CornerSize(0.dp), bottomEnd = CornerSize(0.dp)
            ),
            color = Color.White
        )
    ) {
        NavigationBarItem(
            icon = {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(vertical = 5.dp)
                ) {
                    Icon(
                        painter = painterResource("drawable/home.png"),
                        contentDescription = null,
                        tint = darkBlue,
                        modifier = Modifier
                            .size(25.dp)
                    )
                    Text(
                        "Home",
                        style = MaterialTheme.typography.bodySmall.copy(fontSize = 12.sp)
                    )
                }
            },
            onClick = {
                selectedItem.value = 0
                NavHost.navigationViewModel.setState(State(NavHost.OpenDashboardScreen))
            },
            selected = selectedItem.value == 0,
            colors = NavigationBarItemDefaults.colors(
                indicatorColor = MaterialTheme.colorScheme.onSecondary,
            ),
        )
        NavigationBarItem(
            icon = {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(5.dp)
                ) {
                    Icon(
                        painter = painterResource("drawable/category.png"),
                        contentDescription = null,
                        tint = darkBlue,
                        modifier = Modifier
                            .size(25.dp)
                    )
                    Text(
                        "Category",
                        style = MaterialTheme.typography.bodySmall.copy(fontSize = 12.sp)
                    )
                }
            },
            onClick = {
                selectedItem.value = 1
                NavHost.navigationViewModel.setState(State(NavHost.OpenCategoryScreen))
            },
            selected = selectedItem.value == 1,
            colors = NavigationBarItemDefaults.colors(
                indicatorColor = MaterialTheme.colorScheme.onSecondary,
            )
        )
        NavigationBarItem(
            icon = {
                Icon(
                    painter = painterResource("drawable/pos.png"),
                    contentDescription = null,
                    tint = darkBlue,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(vertical = 3.dp)
                )
            },
            onClick = { selectedItem.value = 2 },
            selected = selectedItem.value == 2,
            colors = NavigationBarItemDefaults.colors(indicatorColor = MaterialTheme.colorScheme.onSecondary)
        )
        NavigationBarItem(
            icon = {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(5.dp)
                ) {
                    Icon(
                        painter = painterResource("drawable/reports.png"),
                        contentDescription = null,
                        tint = darkBlue,
                        modifier = Modifier
                            .size(25.dp)
                    )
                    Text(
                        "Reports",
                        style = MaterialTheme.typography.bodySmall.copy(fontSize = 12.sp)
                    )
                }
            },
            onClick = { selectedItem.value = 3 },
            selected = selectedItem.value == 3,
            colors = NavigationBarItemDefaults.colors(indicatorColor = MaterialTheme.colorScheme.onSecondary)
        )
        NavigationBarItem(
            icon = {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(5.dp)
                ) {
                    Icon(
                        painter = painterResource("drawable/settings.png"),
                        contentDescription = null,
                        tint = darkBlue,
                        modifier = Modifier
                            .size(25.dp)
                    )
                    Text(
                        "Settings",
                        style = MaterialTheme.typography.bodySmall.copy(fontSize = 12.sp)
                    )
                }
            },
            onClick = { selectedItem.value = 4 },
            selected = selectedItem.value == 4,
            colors = NavigationBarItemDefaults.colors(
                indicatorColor = MaterialTheme.colorScheme.onSecondary,
            )
        )
    }
}
