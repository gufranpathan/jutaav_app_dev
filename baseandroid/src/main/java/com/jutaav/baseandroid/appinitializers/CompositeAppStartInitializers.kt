package com.jutaav.baseandroid.appinitializers

import android.content.Context
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable

/**
 * Created by viking_93 on 10/12/2020
 **/

class CompositeAppStartInitializers(
    private val appInitializers: Set<AppStartInitializer>
) : AppStartInitializer {
    override fun onAppStart(context: Context): Completable {
        return Observable.fromIterable(appInitializers)
            .flatMapCompletable { it.onAppStart(context) }
    }
}