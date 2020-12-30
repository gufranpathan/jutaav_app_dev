package com.jutaav.application

import android.app.Application
import com.jutaav.DaggerAppComponent
import com.jutaav.baseandroid.annotation.PerApp
import com.jutaav.baseandroid.appinitializers.AppStartInitializer
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Inject

class JutaavApp : DaggerApplication() {
    @Inject
    @PerApp
    lateinit var compositeAppInitializer: AppStartInitializer

    init {
        mInstance = this
    }

    override fun onCreate() {
        super.onCreate()

        compositeAppInitializer.onAppStart(this).subscribe()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }

    companion object {
        private lateinit var mInstance: JutaavApp

        fun getInstance() = mInstance
    }
}