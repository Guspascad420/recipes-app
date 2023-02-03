package com.example.recipesapp.datasource

import com.example.recipesapp.R
import com.example.recipesapp.model.Recipe

// Object to store list of All Recipes data
object Datasource {

    val allRecipes = listOf(
        Recipe(1, R.string.chicken_parm_lasagna, R.drawable.bfv14079_chickenparmlasagna_thumbtextless1080,
            listOf(
                "3 chicken breasts", "salt", "pepper", "1 cup all-purpose flour(125 g)",
                "5 eggs, divided", "2 cups italian bread crumbs(230 g)"
            )
        ),
        Recipe(2, R.string.garlic_parm_pasta, R.drawable.ezgif_com_gif_maker,
            listOf(
                "2 tablespoons unsalted butter", "4 cloves garlic, minced", "2 cups chicken broth(470 mL)",
                "1 cup milk(235 mL)", "8 oz fettuccine(225 g)", "salt", "pepper", "¼ cup grated parmesan cheese(25 g)",
                "2 tablespoons fresh parsley, chopped"
            )
        ),
        Recipe(3, R.string.mac_n_cheese, R.drawable.mac_and_cheese,
            listOf(
                "1 lb. dried elbow pasta", "1/2 cup unsalted butter", "1/2 cup all purpose flour", "1 1/2 cups whole milk",
                "2 1/2 cups half and half", "4 cups shredded medium sharp cheddar cheese divided (measured after shredding)",
                "2 cups shredded Gruyere cheese divided (measured after shredding)", "1/2 Tbsp. salt",
                "1/2 tsp. black pepper", "1/4 tsp. paprika"
            )
        ),
        Recipe(4, R.string.garlic_bread, R.drawable.garlic_bread,
            listOf(
                "1 stick butter, 1 stick, softened", "4 cloves garlic, minced", "⅓ cup parmesan cheese(35 g)", "1 baguette, 8 inch (20 cm)",
                "⅓ cup shredded monterey jack cheese(35 g)", "⅓ cup shredded cheddar cheese(35 g)", "⅓ cup fresh green onion(50 g), sliced"
            )
        ),
        Recipe(5, R.string.teriyaki_chicken, R.drawable.teriyaki_chicken,
            listOf(
                "2 lb chicken thighs(910 g), sliced into chunks", "1 cup soy sauce(240 mL)", "½ cup brown sugar(110 g)"
            )
        ),
        Recipe(6, R.string.creamy_tuscan, R.drawable.creamy_tuscan,
            listOf(
                "4 bone-in, skin-on chicken thighs", "2 teaspoons salt, for the chicken",
                "1 teaspoon pepper, for the chicken", "1 tablespoon oil", "3 cloves garlic, chopped",
                "½ onion, diced", "1 tomato, diced", "2 cups spinach(80 g)", "2 cups heavy cream(480 mL)",
                "1 teaspoon salt", "1 teaspoon pepper", "½ cup grated parmesan cheese(55 g)", "2 tablespoons fresh flat-leaf parsley, chopped"
            )
        ),
        Recipe(7, R.string.honey_garlic_chicken, R.drawable.honey_garlic_chicken,
            listOf(
                "6 bone-in, skin-on chicken thighs", "salt, to taste", "pepper, to taste",
                "1 tablespoon unsalted butter", "3 cloves garlic", "1 tablespoon brown sugar",
                "¼ cup honey(85 g)", "1 teaspoon dried thyme", "1 teaspoon dried oregano", "1 lb green beans(450 g)"
            )
        ),
        Recipe(8, R.string.choco_chip, R.drawable.choco_chip,
            listOf(
                "3 oz chopped pecans, finely chopped", "¾ cup refined coconut oil, melted", "¾ cup dark brown sugar",
                "½ cup granulated sugar", "¼ cup unsweetened non-dairy milk, of choice", "1 teaspoon vanilla extract",
                "1 ½ cups all-purpose flour", "½ teaspoon baking soda", "1 ½ teaspoons kosher salt",
                "3.5 oz dark chocolate, chopped", "½ cup semisweet chocolate chunks"
            )
        )
    )

}