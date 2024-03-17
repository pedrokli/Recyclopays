package com.example.recyclopays.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(4.dp),
        large = RoundedCornerShape(0.dp)
)

data class YChartsShapes(
        val small: RoundedCornerShape = RoundedCornerShape(4.dp),
        val medium: RoundedCornerShape = RoundedCornerShape(8.dp),
        val large: RoundedCornerShape = RoundedCornerShape(0.dp)
)

internal val LocalShapes = staticCompositionLocalOf { YChartsShapes() }