package com.example.promota.presentation.components.dropdown

import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun FlexTransferDropDownList(
    rangeListState: List<DropDownListModel>,
    onTriggerEvent: (DropDownListModel) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    var selectedItem by remember { mutableStateOf(0) }

    DropdownMenu(
        expanded = expanded,
        onDismissRequest = {}
    ) {
        rangeListState.forEachIndexed { index, model ->
            DropdownMenuItem(
                onClick = { selectedItem = index },
                text = { Text(text = model.option) }
            )
        }
    }
}