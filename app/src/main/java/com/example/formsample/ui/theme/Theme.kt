package com.example.formsample.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.BlendMode.Companion.Color

private val DarkColorPalette = darkColors(
    primary = Orange2,
    primaryVariant = Orange3,
    secondary = Orange
)

private val LightColorPalette = lightColors(
    primary = Orange,
    primaryVariant = Orange4,
    secondary = Orange,
    //background = androidx.compose.ui.graphics.Color.Black
    /* Other default colors to override
   ,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun FormSampleTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}