package com.suraj.cook_it.ui.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.squareup.picasso.Picasso
import com.suraj.cook_it.R
import com.suraj.cook_it.databinding.ActivityDishDetailBinding
import com.suraj.cook_it.model.Recipe
import com.suraj.cook_it.repository.RecipeRepository
import com.suraj.cook_it.viewmodel.RecipeViewModel
import com.suraj.cook_it.viewmodel.ViewModelFactory
import io.github.inflationx.viewpump.ViewPumpContextWrapper

class DishDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDishDetailBinding

    private var recipe: Recipe? = null


    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase?.let { ViewPumpContextWrapper.wrap(it) })
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDishDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recipe = intent.getSerializableExtra("recipe") as Recipe


        Picasso.get().load(recipe?.imageUrl).into(binding.imgDish)

        // Bind recipe data to the layout using data binding
        binding.recipe = recipe

        // Format ingredients as a bulleted list
        val ingredientsText = recipe?.ingredients?.joinToString("\n\u2022 ", "\n\u2022 ") { it }

        // Format instructions as a numbered list
        val instructionsText =
            recipe?.instructions?.mapIndexed { index, instruction -> "${index + 1}. $instruction" }
                ?.joinToString("\n\n", "\n")

        // Set the formatted texts to their respective TextViews
        binding.textViewIngredients.text = ingredientsText

        binding.textViewInstructions.text = instructionsText


        binding.imgDish.setOnClickListener {


        }


    }


    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

}