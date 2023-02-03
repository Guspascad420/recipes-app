package com.example.recipesapp.routes

sealed class Screen(val route: String) {
    object Recipes: Screen("recipes")
}