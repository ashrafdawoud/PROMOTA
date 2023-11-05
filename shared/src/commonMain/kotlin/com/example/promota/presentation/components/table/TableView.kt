package com.example.promota.presentation.components.table

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScrollableTable(
    columnHeaders: List<String>,
    tableData: List<List<String>>,
    textStyle: List<CellBackgroundColor> = listOf(),
    onClickEnabled: Boolean,
    onclick: (String) -> Unit,
) {
    val state = rememberScrollState()
    Column {
        HeaderItem(columnHeaders , state)
        TableItems(tableData = tableData, state)
    }
}

@Composable
fun HeaderItem(columnHeaders: List<String>, state: ScrollState) {
    Row(
        modifier = Modifier
            .horizontalScroll(state)
            .background(color = MaterialTheme.colorScheme.onTertiaryContainer)
            .drawBehind {
                drawLine(
                    color = Color.Gray,
                    start = Offset(0f, size.height),
                    end = Offset(size.width, size.height),
                    strokeWidth = 1f
                )
            },
    ) {
        columnHeaders.forEach {
            Text(
                text = it,
                modifier = Modifier.width(140.dp).padding(8.dp),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                color = MaterialTheme.colorScheme.outline
            )
        }
    }
}

@Composable
fun TableItems(tableData: List<List<String>>, state: ScrollState) {
    val mCustomTextSelectionColors = TextSelectionColors(
        handleColor = Color.Red,
        backgroundColor = Color.Yellow,
    )
    Column(
        modifier = Modifier
            .horizontalScroll(state)
            .background(color = MaterialTheme.colorScheme.onPrimary)
    ) {
        tableData.forEach {
            Row {
                it.forEach { it1 ->
                    SelectionContainer {
                        CompositionLocalProvider(LocalTextSelectionColors provides mCustomTextSelectionColors) {
                            Text(
                                text = it1,
                                modifier = Modifier
                                    .width(140.dp)
                                    .padding(vertical = 5.dp, horizontal = 5.dp)
                                    .align(Alignment.CenterVertically),
                                textAlign = TextAlign.Center,
                                style = MaterialTheme.typography.bodySmall.copy(fontSize = 14.sp),
                                color = MaterialTheme.colorScheme.outline
                            )
                        }
                    }
                }
            }
        }
    }
}