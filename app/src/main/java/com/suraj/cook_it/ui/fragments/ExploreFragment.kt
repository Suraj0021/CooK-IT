package com.suraj.cook_it.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.suraj.cook_it.app.MyApplication
import com.suraj.cook_it.databinding.FragmentExploreBinding
import com.suraj.cook_it.model.Recipe
import com.suraj.cook_it.repository.RecipeRepository
import com.suraj.cook_it.ui.activity.DishDetailActivity
import com.suraj.cook_it.ui.adapter.RecipeAdapter
import com.suraj.cook_it.viewmodel.RecipeViewModel
import com.suraj.cook_it.viewmodel.ViewModelFactory
import javax.inject.Inject

class ExploreFragment : Fragment() {

    private lateinit var binding: FragmentExploreBinding

    @Inject
    lateinit var repository: RecipeRepository

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var recipeAdapter: RecipeAdapter

    private var recipeList = ArrayList<Recipe>()

    private lateinit var recipeViewModel: RecipeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentExploreBinding.inflate(inflater)

        (requireActivity().application as MyApplication  ).recipeComponent.inject(this)

        initViews()

        setUpRecyclerView()

        return binding.root

    }


    private fun initViews() {
        recipeViewModel = ViewModelProvider(this, viewModelFactory).get(
            RecipeViewModel::class.java
        )
    }


    private fun setUpRecyclerView() {

        binding.rvRecipeList.layoutManager = GridLayoutManager(requireContext(), 2)

        recipeAdapter = RecipeAdapter(recipeList)

        binding.rvRecipeList.adapter = recipeAdapter

        recipeAdapter.setOnClickListener = SetOnClickListener()

        recipeViewModel.recipeList.observe(viewLifecycleOwner) { list ->

            if (list != null) {
                recipeAdapter.addAll(list)
            }
        }

    }

    inner class SetOnClickListener : RecipeAdapter.SetOnClickListener {
        override fun setOnClick(position: Int, recipe: Recipe) {
            var intent = Intent(requireContext(), DishDetailActivity::class.java)
            intent.putExtra("recipe", recipe)
            startActivity(intent)
        }

    }


}