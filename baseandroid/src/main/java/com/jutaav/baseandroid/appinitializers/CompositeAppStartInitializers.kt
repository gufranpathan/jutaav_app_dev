package com.jutaav.baseandroid.appinitializers

import android.content.Context
import com.jutaav.base.RxSchedulers
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable

/**
 * Created by viking_93 on 10/12/2020
 **/

internal class CompositeAppStartInitializers(
    private val appInitializers: Set<AppStartInitializer>,
    private val rxSchedulers: RxSchedulers
) : AppStartInitializer {
    override fun onAppStart(context: Context): Completable {
        return Observable.fromIterable(appInitializers)
            .flatMapCompletable { it.onAppStart(context) }
            .subscribeOn(rxSchedulers.common)
    }
}