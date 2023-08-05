package com.suraj.cook_it.di

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.room.Room
import com.suraj.cook_it.db.RecipeDao
import com.suraj.cook_it.db.RecipeDatabase
import com.suraj.cook_it.model.Recipe
import com.suraj.cook_it.repository.RecipeRepository
import com.suraj.cook_it.viewmodel.RecipeViewModel
import com.suraj.cook_it.viewmodel.ViewModelFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class NetworkModule(private var context: Context) {

    @Singleton
    @Provides
    fun providesRepository(recipeDao: RecipeDao): RecipeRepository {
        return RecipeRepository(recipeDao)
    }


    @Singleton
    @Provides
    fun provideRecipeDao(recipeDatabase: RecipeDatabase): RecipeDao {
        return recipeDatabase.getRecipeDao()
    }


    @Provides
    @Singleton
    fun provideRecipeDatabase(context: Context): RecipeDatabase {
        return Room.databaseBuilder(context, RecipeDatabase::class.java, "recipeDB")
            .build()
    }

    @Provides
    fun provideApplicationContext(): Context {
        return context.applicationContext
    }

    @Singleton
    @Provides
    fun provideViewModelFactory(repository: RecipeRepository): ViewModelFactory {
        return ViewModelFactory(repository)
    }



}