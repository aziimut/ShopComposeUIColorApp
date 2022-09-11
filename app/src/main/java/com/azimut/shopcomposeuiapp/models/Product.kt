package com.azimut.shopcomposeuiapp.models

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter

data class Product(
    val id: Int,
    val title: String,
    val price: Int,
    val size: Int,
    val description: String,
    val image: Painter,
    val color: Color
)