package com.suraj.cook_it.ui.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.navigation.NavigationBarView
import com.suraj.cook_it.R
import com.suraj.cook_it.databinding.ActivityHomeBinding
import com.suraj.cook_it.ui.fragments.HomeFragment
import io.github.inflationx.viewpump.ViewPumpContextWrapper

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding


    private lateinit var navController: NavController


    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase?.let { ViewPumpContextWrapper.wrap(it) })
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)




        binding.bottomNavigation.labelVisibilityMode = NavigationBarView.LABEL_VISIBILITY_LABELED


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        navController = navHostFragment.navController





        binding. bottomNavigation.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_home -> {
                    navController.popBackStack()
                    navController.navigate(R.id.homeFragment)
                    true
                }

                R.id.navigation_explore -> {
                    navController.popBackStack()
                    navController.navigate(R.id.exploreFragment)
                    true
                }

                R.id.navigation_favourite -> {
                    navController.popBackStack()
                    navController.navigate(R.id.favouriteFragment)
                    true
                }

                else -> false

            }
        }


        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, HomeFragment())
        fragmentTransaction.commit()

    }
}