package com.example.recipesapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recipesapp.datasource.Datasource
import com.example.recipesapp.model.Recipe
import com.example.recipesapp.ui.theme.RecipesAppTheme

//Composable function to show the Recipe Descriptions, including Image and Ingredients (The instructions is not yet implemented)
@Composable
fun RecipeDesc(recipe: Recipe) {
    var isFavorite by remember { mutableStateOf( false ) }
    val iconImg = when(isFavorite) {
        false -> R.drawable.ic_baseline_favorite_border_24
        else -> R.drawable.ic_baseline_favorite_24
    }
    val iconTint = when(isFavorite) {
        false -> Color.Black
        else -> Color.Red
    }

    Column(modifier = Modifier.padding(top = 10.dp)) {
        Text(
            text = stringResource(recipe.name),
            style = MaterialTheme.typography.h1,
            modifier = Modifier.padding(start = 12.dp)
        )
        Image(
            painter = painterResource(recipe.image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .size(410.dp)
        )
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    "Ingredients",
                    style = MaterialTheme.typography.h2,
                    modifier = Modifier.padding(top = 7.dp)
                )
                // Heart Icon button to toggle the Favorite Recipe, but the Favorite Activity is not yet implemented
                IconButton(onClick = { isFavorite = !isFavorite }) {
                    Icon(
                        painter = painterResource(iconImg),
                        contentDescription = null,
                        tint = iconTint
                    )
                }
            }
            // Loop through each ingredients to show all of the Ingredients text
            recipe.ingredients.forEach {
                Text(it, style = MaterialTheme.typography.body2)
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview2() {
    RecipesAppTheme {
        RecipeDesc(Datasource.allRecipes[1])
    }
}