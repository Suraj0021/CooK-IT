package com.suraj.cook_it.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


@Entity(tableName = "recipe")
data class Recipe(
    var title: String = "",
    @PrimaryKey
    var id : String = "",
    var isVeg: String = "",
    var description: String = "",
    var ingredients: List<String> = emptyList(),
    var instructions: List<String> = emptyList(),
    var calorie: String = "",
    var cookTime: String = "",
    var imageUrl: String = ""
) : Serializable
