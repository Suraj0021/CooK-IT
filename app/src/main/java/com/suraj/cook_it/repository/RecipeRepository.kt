package com.suraj.cook_it.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.google.firebase.firestore.FirebaseFirestore
import com.suraj.cook_it.db.RecipeDao
import com.suraj.cook_it.model.Recipe
import javax.inject.Inject

class RecipeRepository @Inject constructor(private val recipeDao: RecipeDao) {

    fun readRecipesFragment(): MutableLiveData<ArrayList<Recipe>?> {

        var recipes = MutableLiveData<ArrayList<Recipe>?>()

        FirebaseFirestore.getInstance().collection("recipesViewPager")
            .get()
            .addOnSuccessListener { querySnapshot ->
                var recipeList = ArrayList<Recipe>()
                for (document in querySnapshot) {
                    val recipe = document.toObject(Recipe::class.java)
                    recipeList.add(recipe)
                }
                recipes.value = recipeList
            }
            .addOnFailureListener { exception ->
                // Handle any errors that occur during data retrieval
                Log.e("ReadRecipesFragment", "Error getting recipes: ${exception.message}")
            }

        return recipes

    }


    fun readRecipes(): MutableLiveData<ArrayList<Recipe>?> {

        var recipes = MutableLiveData<ArrayList<Recipe>?>()

        FirebaseFirestore.getInstance().collection("recipes")
            .get()
            .addOnSuccessListener { querySnapshot ->
                var recipeList = ArrayList<Recipe>()
                for (document in querySnapshot) {
                    val recipe = document.toObject(Recipe::class.java)
                    recipeList.add(recipe)
                }
                recipes.value = recipeList
            }
            .addOnFailureListener { exception ->
                // Handle any errors that occur during data retrieval
                Log.e("ReadRecipesFragment", "Error getting recipes: ${exception.message}")
            }

        return recipes

    }


    suspend fun saveRecipe(recipe: Recipe) {

    }

    suspend fun getSaveRecipeList() {

    }

    suspend fun deleteRecipe(recipeId : String) {

    }

}