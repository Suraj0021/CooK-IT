package com.suraj.cook_it.app

import android.app.Application
import com.suraj.cook_it.di.DaggerRecipeComponent
import com.suraj.cook_it.di.NetworkModule
import com.suraj.cook_it.di.RecipeComponent
import io.github.inflationx.calligraphy3.CalligraphyConfig
import io.github.inflationx.calligraphy3.CalligraphyInterceptor
import io.github.inflationx.calligraphy3.R
import io.github.inflationx.viewpump.ViewPump

class MyApplication : Application() {

    lateinit var recipeComponent: RecipeComponent

    override fun onCreate() {
        super.onCreate()

        recipeComponent =
            DaggerRecipeComponent.builder().networkModule(NetworkModule(applicationContext)).build()


        initFont()

    }


    fun initFont() {
        ViewPump.init(
            ViewPump.builder()
                .addInterceptor(
                    CalligraphyInterceptor(
                        CalligraphyConfig.Builder()
                            .setDefaultFontPath("fonts/FrankRuhlLibre-Bold.ttf")
                            .setFontAttrId(R.attr.fontPath)
                            .build()
                    )
                )
                .build()
        )
    }

}
