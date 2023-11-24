package com.example.promota.presentation.screens.product

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.promota.presentation.components.bar.CenteredTitleBar
import com.example.promota.presentation.components.bottomsheet.BottomSheetOverlay
import com.example.promota.presentation.components.bottomsheet.ProductControlBottomSheet
import com.example.promota.presentation.components.product.ProductItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@Composable
fun ProductScreenRoute() {
    val showBottomSheet = remember { mutableStateOf(false) }

    BottomSheetOverlay(
        expand = showBottomSheet.value,
        toolbarContent = { CenteredTitleBar("Products List") },
        bottomSheetContent = {
            ProductControlBottomSheet()
        },
    ) {
        ProductsScreen(showBottomSheet)
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ProductsScreen(showBottomSheet: MutableState<Boolean>) {
    Column(
        modifier = Modifier.background(color = MaterialTheme.colorScheme.background)
    ) {
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(15.dp)
                .background(
                    color = MaterialTheme.colorScheme.onPrimary,
                    shape = MaterialTheme.shapes.extraLarge.copy(all = CornerSize(20.dp))
                ),
            value = "hello",
            onValueChange = {},
            colors = TextFieldDefaults.colors(
                focusedContainerColor = MaterialTheme.colorScheme.onPrimary,
                unfocusedContainerColor = MaterialTheme.colorScheme.onPrimary,
                focusedTextColor = MaterialTheme.colorScheme.outline,
                unfocusedTextColor = MaterialTheme.colorScheme.outline,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            textStyle = MaterialTheme.typography.titleSmall.copy(fontSize = 14.sp),
            trailingIcon = {
                Icon(
                    painterResource("drawable/barcode.png"), contentDescription = null,
                    modifier = Modifier.size(40.dp).padding(horizontal = 5.dp)
                )
            }
        )
        LazyColumn {
            items(10) {
                ProductItem {
                    CoroutineScope(Dispatchers.Main).launch {
                        showBottomSheet.value = false // reset state
                        delay(100) // Delay for one second
                        showBottomSheet.value = true
                    }
                }
            }
        }
    }
}