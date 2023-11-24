package com.example.promota.presentation.components.bottomsheet

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetOverlay(
    expand: Boolean = false,
    toolbarContent: @Composable () -> Unit,
    bottomSheetContent: @Composable () -> Unit = {},
    content: @Composable () -> Unit,
) {
    val bottomSheetScaffoldState = rememberBottomSheetScaffoldState()

    if (expand)
        LaunchedEffect(Unit) {
            bottomSheetScaffoldState.bottomSheetState.expand()
        }
    BottomSheetScaffold(
        topBar = { toolbarContent.invoke() },
        scaffoldState = bottomSheetScaffoldState,
        sheetPeekHeight = 0.dp,
        sheetContent = {
            bottomSheetContent()
        },
        sheetContainerColor = MaterialTheme.colorScheme.onSecondary,
        sheetShape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
        sheetSwipeEnabled = true
    ) {
        content.invoke()
    }
}