package com.play.timber_logger

import android.app.Application
import timber.log.Timber

class TimberApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}