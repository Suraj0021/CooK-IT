package com.suraj.cook_it.viewmodel

import androidx.lifecycle.ViewModel
import com.suraj.cook_it.model.Recipe
import com.suraj.cook_it.repository.RecipeRepository

class RecipeViewModel(private val recipeRepository: RecipeRepository) : ViewModel() {

     var recipeListViewPager = recipeRepository.readRecipesFragment()


     var recipeList = recipeRepository.readRecipes()


     suspend fun saveRecipe(recipe: Recipe){
          recipeRepository.saveRecipe(recipe)
     }


}