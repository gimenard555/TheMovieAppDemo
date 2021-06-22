package com.jimenard.themovieapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TheMoviesApp : Application() {

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){

        }
    }
}