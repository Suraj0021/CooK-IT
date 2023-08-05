package com.suraj.cook_it.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.suraj.cook_it.model.Recipe


@Database(entities = [Recipe::class], version = 1)
@TypeConverters(Converters::class)
abstract class RecipeDatabase : RoomDatabase() {

abstract fun getRecipeDao() : RecipeDao

}