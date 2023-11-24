package com.example.promota.presentation.components.bottomsheet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.promota.presentation.utils.localization.stringResource

@Composable
fun ProductControlBottomSheet() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Button(
            modifier = Modifier.fillMaxWidth()
                .padding(vertical = 5.dp, horizontal = 20.dp),
            colors = ButtonDefaults.buttonColors(containerColor =MaterialTheme.colorScheme.primaryContainer ),
            onClick = {}) {
            Text(text = stringResource("edit") )
        }
        Button(
            modifier = Modifier.fillMaxWidth()
                .padding(vertical = 5.dp, horizontal = 20.dp),
            colors = ButtonDefaults.buttonColors(containerColor =MaterialTheme.colorScheme.primaryContainer ),
            onClick = {}) {
            Text(stringResource("history"))
        }
        Button(
            modifier = Modifier.fillMaxWidth()
                .padding(vertical = 5.dp, horizontal = 20.dp),
            colors = ButtonDefaults.buttonColors(containerColor =MaterialTheme.colorScheme.surfaceVariant ),
            onClick = {}) {
            Text(stringResource("remove"))
        }
    }
}
