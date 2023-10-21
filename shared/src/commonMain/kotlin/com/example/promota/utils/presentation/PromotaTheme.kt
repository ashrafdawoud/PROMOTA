package com.example.promota.utils.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

@Composable
fun PromotaTheme(
    useDarkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme =
        if (!useDarkTheme) {
            LightColorScheme
        } else {
            DarkColorScheme
        }
    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )

}

private val LightColorScheme = lightColorScheme(
    primary = white,
    onPrimary = black,
    primaryContainer = blue,
    onPrimaryContainer = white,
    surface = gray
)
private val DarkColorScheme = darkColorScheme(
    primary = white,
    onPrimary = black,
    primaryContainer = blue,
    onPrimaryContainer = white,
    surface = gray
)
