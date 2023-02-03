package com.example.recipesapp.model

import androidx.annotation.StringRes

// Recipe Entity Model
data class Recipe(
    val id: Int,
    @StringRes val name: Int,
    val image: Int,
    val ingredients: List<String>
)