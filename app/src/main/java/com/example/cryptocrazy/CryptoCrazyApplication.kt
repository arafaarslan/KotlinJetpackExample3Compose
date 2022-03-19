package com.example.cryptocrazy

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by aarslan on 13/03/2022.
 */
@HiltAndroidApp
class CryptoCrazyApplication : Application(){
    override fun onCreate() {
        super.onCreate()
    }
}