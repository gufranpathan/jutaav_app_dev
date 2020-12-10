package com.jutaav.appinitializers

import android.content.Context
import com.jutaav.BuildConfig
import com.jutaav.baseandroid.appinitializers.AppStartInitializer
import io.reactivex.rxjava3.core.Completable
import timber.log.Timber

/**
 * Created by viking_93 on 10/12/2020
 **/

class TimberAppStartInitializer : AppStartInitializer {
    override fun onAppStart(context: Context): Completable = Completable.fromCallable {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}