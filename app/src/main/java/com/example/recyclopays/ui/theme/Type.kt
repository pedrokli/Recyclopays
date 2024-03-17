package com.example.recyclopays.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.staticCompositionLocalOf

// Set of Material typography styles to start with
val Typography = Typography(
        body1 = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
        )
        /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)

data class YChartsTypography(
        val header: TextStyle = TextStyle(
                fontWeight = FontWeight.Medium,
                fontSize = 24.sp,
                letterSpacing = 0.15.sp
        ),
        val button: TextStyle = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                letterSpacing = 0.25.sp
        )
)

internal val LocalTypography = staticCompositionLocalOf { YChartsTypography() }
