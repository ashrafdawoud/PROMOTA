package com.example.promota.presentation.utils.components

import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun BaseNavigationScreen(
    content: @Composable () -> Unit
) {
    Scaffold(
//        bottomBar = {
//            NavigationBar() {
//                NavigationBarItem(icon = {
//                    Icon(painterResource("drawable/hr.png"), contentDescription = null)
//                },
//                    selected = true, onClick = {})
//                NavigationBarItem(icon = {
//                    Icon(painterResource("drawable/hr.png"), contentDescription = null)
//                },
//                    selected = true, onClick = {})
//                NavigationBarItem(icon = {
//                    Icon(painterResource("drawable/hr.png"), contentDescription = null)
//                },
//                    selected = true, onClick = {})
//                NavigationBarItem(icon = {
//                    Icon(painterResource("drawable/hr.png"), contentDescription = null)
//                },
//                    selected = true, onClick = {})
//            }
//        },
        content = {
            content.invoke()
        }
    )
}