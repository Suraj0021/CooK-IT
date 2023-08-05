package com.suraj.cook_it.di

import com.suraj.cook_it.ui.fragments.ExploreFragment
import com.suraj.cook_it.ui.fragments.FirstFragment
import com.suraj.cook_it.ui.fragments.HomeFragment
import com.suraj.cook_it.ui.fragments.SecondFragment
import com.suraj.cook_it.ui.fragments.ThirdFragment
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class])
interface RecipeComponent {

    abstract fun inject(exploreFragment: ExploreFragment)

    abstract fun inject(firstFragment: FirstFragment)

    abstract fun inject(homeFragment: HomeFragment)

    abstract fun inject(secondFragment: SecondFragment)
    abstract fun inject(thirdFragment: ThirdFragment)


}