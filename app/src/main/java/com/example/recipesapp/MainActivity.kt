package com.example.recipesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recipesapp.datasource.Datasource
import com.example.recipesapp.model.Recipe
import com.example.recipesapp.routes.Screen
import com.example.recipesapp.ui.theme.RecipesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipesAppTheme {
                // A surface container using the 'background' color from the theme
                MainNavigation()
            }
        }
    }
}

// Composable function to create the App Navigation (Similar feature to Intent)
@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screen.Recipes.route) {
        composable(route = Screen.Recipes.route) {
            RecipesGrid(navController = navController)
        }
        composable(route = Screen.Recipes.route + "/{id}") { navBackStackEntry ->
            //Extracting the Parameter
            val recipeId = navBackStackEntry.arguments?.getString("id")
            recipeId?.let {
                RecipeDesc(filterRecipeById(id = recipeId.toInt()))
            }
        }
    }
}

// Composable function to create the scrollable Recipe Grid
@Composable
fun RecipesGrid(navController: NavController) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.padding(top = 8.dp)
    ) {
        // Loop through each Datasource item, then pass into the function parameter
        items(Datasource.allRecipes) {
            RecipeCard(it, navController = navController)
        }
    }
}

// Composable function to create the Card Recipe
@Composable
fun RecipeCard(recipe: Recipe, navController: NavController) {
    Column(
        modifier = Modifier.padding(8.dp).clickable { navController.navigate(Screen.Recipes.route + "/${recipe.id}") }
    ) {
        Image(
            painter = painterResource(recipe.image),
            contentDescription = null,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .size(190.dp)
        )
        Text(text = stringResource(recipe.name), style = MaterialTheme.typography.body1)
    }
}

//Function to filter Recipes by id that passed into the parameter
fun filterRecipeById(recipes: List<Recipe> = Datasource.allRecipes, id: Int): Recipe {
    val result = recipes.filter {
        it.id == id
    }
    return result[0]
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    RecipesAppTheme {
        val navController = rememberNavController()
        RecipesGrid(navController)
    }
}