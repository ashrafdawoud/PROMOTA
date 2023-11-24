package com.example.promota.presentation.screens.addproduct

import androidx.compose.runtime.Composable
import com.example.promota.presentation.components.bar.CenteredTitleBar
import com.example.promota.presentation.components.bottomsheet.BottomSheetOverlay

@Composable
fun AddProductScreenRoute() {
    BottomSheetOverlay(
        toolbarContent = { CenteredTitleBar("Add new product") },
    ) {
        AddProductScreen()
    }
}

@Composable
private fun AddProductScreen() {

}