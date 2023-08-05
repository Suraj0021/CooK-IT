package com.suraj.cook_it.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.suraj.cook_it.R
import com.suraj.cook_it.databinding.RecipeViewBinding
import com.suraj.cook_it.model.Recipe

class RecipeAdapter(val recipeList: ArrayList<Recipe>) :
    RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {





    interface SetOnClickListener {
        fun setOnClick(position: Int,recipe: Recipe)
//
//        fun deleteRecipe(id: Int)
//
//        fun addRecipe(recipe: Recipe)

    }

    var setOnClickListener: SetOnClickListener? = null

    fun setOnClickListener(listener: SetOnClickListener) {
        setOnClickListener = listener
    }




    inner class RecipeViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val binding: RecipeViewBinding = RecipeViewBinding.bind(view)

        init {
            view.setOnClickListener {
                setOnClickListener?.setOnClick(adapterPosition,recipeList[adapterPosition])
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {

        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recipe_view,parent,false))

    }

    override fun getItemCount() = recipeList.size


    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {

        val data = recipeList.get(position)

        Picasso.get().load(data?.imageUrl).into(holder.binding.imgRecipe)

        holder.binding.txtRecipeName.text = data.title




    }


    fun addAll(recipeList2 : ArrayList<Recipe>){
        recipeList.clear()
        recipeList.addAll(recipeList2)
        notifyDataSetChanged()
    }


}