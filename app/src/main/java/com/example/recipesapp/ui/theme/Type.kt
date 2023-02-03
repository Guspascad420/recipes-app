package com.example.recipesapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.recipesapp.R

// Set of Material typography styles to start with
val FreeSans = FontFamily(
    Font(R.font.free_sans_bold)
)

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FreeSans,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = FreeSans,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp

    ),
    body2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h2 = TextStyle(
        fontFamily = FreeSans,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
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