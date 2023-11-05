package com.example.promota.presentation.navigation

import androidx.compose.runtime.Composable
import com.example.promota.presentation.screens.dashboard.DashboardScreen

sealed class NavHost {
    object OpenDashboardScreen:NavHost()
    object OpenCategoryScreen:NavHost()
    companion object{
        @Composable
        fun navigate(event:NavHost = OpenDashboardScreen){
            when(event){
                is OpenDashboardScreen ->{
                    DashboardScreen()
                }
                is OpenCategoryScreen ->{

                }
            }
        }
    }
}