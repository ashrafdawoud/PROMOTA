package com.example.promota.dashboard.presentaion.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DashboardTitleBar() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                shape = RoundedCornerShape(bottomEnd = 15.dp , bottomStart = 15.dp),
                color = MaterialTheme.colorScheme.primary
            )
            .padding(10.dp)
    ) {
        //Text(text = stringResource(id = SharedRes.strings.hello_world))
        Text("Dawoud")
    }
}