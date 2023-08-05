package com.suraj.cook_it.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.suraj.cook_it.ui.fragments.FirstFragment
import com.suraj.cook_it.ui.fragments.SecondFragment
import com.suraj.cook_it.ui.fragments.ThirdFragment

class ViewPagerFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 3 // The total number of pages
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            // Add more cases for additional pages
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}
