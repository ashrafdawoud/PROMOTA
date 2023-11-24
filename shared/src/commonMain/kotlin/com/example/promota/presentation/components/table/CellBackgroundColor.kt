package com.example.promota.presentation.components.table

import androidx.compose.ui.graphics.Color

data class CellBackgroundColor(
    val column:Int,
    val row:Int,
    val backgroundColor: Color,
    val textColor: Color,
)
