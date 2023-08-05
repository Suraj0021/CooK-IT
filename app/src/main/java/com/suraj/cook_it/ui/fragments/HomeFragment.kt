package com.suraj.cook_it.ui.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.suraj.cook_it.app.MyApplication
import com.suraj.cook_it.databinding.FragmentHomeBinding
import com.suraj.cook_it.model.Recipe
import com.suraj.cook_it.repository.RecipeRepository
import com.suraj.cook_it.ui.activity.DishDetailActivity
import com.suraj.cook_it.ui.adapter.RecipeAdapter
import com.suraj.cook_it.ui.adapter.ViewPagerFragmentAdapter
import com.suraj.cook_it.viewmodel.RecipeViewModel
import com.suraj.cook_it.viewmodel.ViewModelFactory
import javax.inject.Inject

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private lateinit var recipeAdapter: RecipeAdapter

    private lateinit var recipeAdapter2: RecipeAdapter

    private var recipeList = ArrayList<Recipe>()

    private var recipeList2 = ArrayList<Recipe>()

    private lateinit var recipeViewModel: RecipeViewModel

    @Inject
    lateinit var repository: RecipeRepository

    @Inject
    lateinit var viewModelFactory: ViewModelFactory




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)

        (requireActivity().application as MyApplication).recipeComponent.inject(this)

        recipeViewModel = ViewModelProvider(this, viewModelFactory).get(RecipeViewModel::class.java)


        setUpPageViewer()

        setUpRecyclerView()

        return binding.root
    }




    private fun setUpPageViewer() {
        val viewPagerFragmentAdapter = ViewPagerFragmentAdapter(parentFragmentManager, lifecycle)
        binding.viewPager.adapter = viewPagerFragmentAdapter
        binding.dotsIndicator.setViewPager2(binding.viewPager)

        // Set the OnPageChangeListener to the ViewPager
        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                // You can leave this empty as we don't need to do anything specific here.
            }
        })

        // Set click listeners for the mainViewPagerContainer based on the selected fragment
        binding.mainViewPagerContainer.setOnClickListener {
            val currentPosition = binding.viewPager.currentItem
            handleViewPagerClick(currentPosition)
        }

    }


    // Handle the ViewPager click event based on the current fragment position
    private fun handleViewPagerClick(position: Int) {
        when (position) {
            0 -> Toast.makeText(requireContext(), "First Fragment", Toast.LENGTH_SHORT).show()
            1 -> Toast.makeText(requireContext(), "Second Fragment", Toast.LENGTH_SHORT).show()
            2 -> Toast.makeText(requireContext(), "Third Fragment", Toast.LENGTH_SHORT).show()
        }
    }


    private fun setUpRecyclerView() {

        binding.rvRecipeList.layoutManager = GridLayoutManager(requireContext(), 2)

        recipeAdapter = RecipeAdapter(recipeList)

        binding.rvRecipeList.adapter = recipeAdapter


        recipeAdapter.setOnClickListener = SetOnClickListener()

        recipeViewModel.recipeList.observe(viewLifecycleOwner) { list ->

            var list2 = ArrayList<Recipe>()


            if (list != null && list.size >= 5) {
                for ( i in 0..5){
                    list2.add(list[i])
                }
                recipeAdapter.addAll(list2)

            } else if (list != null) {
                recipeAdapter.addAll(list)
            }
        }



        binding.rvRecipeList2.layoutManager = GridLayoutManager(requireContext(), 2)

        recipeAdapter2 = RecipeAdapter(recipeList2)

        binding.rvRecipeList2.adapter = recipeAdapter2

        recipeAdapter2.setOnClickListener = SetOnClickListener()

        recipeViewModel.recipeList.observe(viewLifecycleOwner) { list ->


            var list2 = ArrayList<Recipe>()


            if (list != null) {
                for ( i in 10..15){
                    list2.add(list[i])
                }
                recipeAdapter2.addAll(list2)

            }


        }
    }



    inner class SetOnClickListener : RecipeAdapter.SetOnClickListener{
        override fun setOnClick(position: Int,recipe: Recipe) {
            var intent = Intent(requireContext(), DishDetailActivity::class.java)
            intent.putExtra("recipe",recipe)
            startActivity(intent)
        }

    }

}
