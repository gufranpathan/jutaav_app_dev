package com.jutaav.appinitializers

import android.content.Context
import com.jakewharton.threetenabp.AndroidThreeTen
import com.jutaav.baseandroid.appinitializers.AppStartInitializer
import io.reactivex.rxjava3.core.Completable

/**
 * Created by viking_93 on 10/12/2020
 **/

class ThreeTenAbpAppStartInitializer : AppStartInitializer {
    override fun onAppStart(context: Context): Completable = Completable.fromCallable {
        AndroidThreeTen.init(context)
    }
}