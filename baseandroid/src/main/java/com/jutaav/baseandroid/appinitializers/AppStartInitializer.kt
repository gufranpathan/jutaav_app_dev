package com.jutaav.baseandroid.appinitializers

import android.content.Context
import io.reactivex.rxjava3.core.Completable

/**
 * Created by viking_93 on 10/12/2020
 **/

interface AppStartInitializer {
    fun onAppStart(context: Context): Completable
}