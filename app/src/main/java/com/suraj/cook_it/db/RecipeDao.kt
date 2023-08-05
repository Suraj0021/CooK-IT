package com.suraj.cook_it.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.suraj.cook_it.model.Recipe

@Dao
interface RecipeDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addRecipeData(recipe: Recipe)


    @Query("SELECT * FROM recipe")
    fun getRecipe(): LiveData<List<Recipe>>


    @Query("DELETE FROM recipe WHERE id = :recipeId")
    suspend fun deleteMovieById(recipeId: Int)


}