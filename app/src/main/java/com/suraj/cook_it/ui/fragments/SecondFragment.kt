package com.suraj.cook_it.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.squareup.picasso.Picasso
import com.suraj.cook_it.app.MyApplication
import com.suraj.cook_it.databinding.FragmentFirstBinding
import com.suraj.cook_it.model.Recipe
import com.suraj.cook_it.repository.RecipeRepository
import com.suraj.cook_it.ui.activity.DishDetailActivity
import com.suraj.cook_it.viewmodel.RecipeViewModel
import com.suraj.cook_it.viewmodel.ViewModelFactory
import javax.inject.Inject


class SecondFragment : Fragment() {

    private lateinit var binding : FragmentFirstBinding

    private lateinit var recipeViewModel: RecipeViewModel

    private  var recipe : Recipe? = null

    @Inject
    lateinit var repository: RecipeRepository

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =  FragmentFirstBinding.inflate(inflater)

        (requireActivity().application as MyApplication).recipeComponent.inject(this)

        initViews()

        initData()

        binding.root.setOnClickListener {

            setOnClick()
        }

        return binding.root

     }



    private fun initViews() {
        recipeViewModel = ViewModelProvider(this, viewModelFactory).get(
            RecipeViewModel::class.java
        )
    }


    private fun initData(){
        recipeViewModel.recipeListViewPager.observe(viewLifecycleOwner){
            binding.txtFirstFragment.text = it?.get(0)?.title
            Picasso.get().load(it?.get(0)?.imageUrl).into(binding.imgFirstFragment)
            recipe = it?.get(0)
        }
    }
    private fun setOnClick(){
        var intent = Intent(requireContext(), DishDetailActivity::class.java)
        intent.putExtra("recipe",recipe)
        startActivity(intent)
    }

}