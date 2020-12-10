package com.jutaav.application

import android.app.Application
import com.jutaav.appinitializers.ThreeTenAbpAppStartInitializer
import com.jutaav.appinitializers.TimberAppStartInitializer
import com.jutaav.baseandroid.appinitializers.AppStartInitializer
import com.jutaav.baseandroid.appinitializers.CompositeAppStartInitializers

class AppControl : Application() {

    private val appInitializers: Set<AppStartInitializer> by lazy {
        setOf(TimberAppStartInitializer(), ThreeTenAbpAppStartInitializer())
    }

    private val compositeAppInitializer = CompositeAppStartInitializers(appInitializers)

    init {
        mInstance = this
    }

    override fun onCreate() {
        super.onCreate()

        compositeAppInitializer.onAppStart(this).subscribe()
    }

    companion object {
        private lateinit var mInstance: AppControl

        fun getInstance() = mInstance
    }
}