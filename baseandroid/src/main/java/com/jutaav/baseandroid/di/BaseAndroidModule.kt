package com.jutaav.baseandroid.di

import com.jutaav.base.RxSchedulers
import com.jutaav.baseandroid.AppRxSchedulers
import com.jutaav.baseandroid.annotation.PerApp
import com.jutaav.baseandroid.appinitializers.AppStartInitializer
import com.jutaav.baseandroid.appinitializers.CompositeAppStartInitializers
import dagger.Module
import dagger.Provides
import dagger.Reusable
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Singleton

/**
 * Created by viking_93 on 30/12/2020
 **/

@Module
class BaseAndroidModule {

    @Provides
    @Singleton
    fun providesAppRxSchedulers(): RxSchedulers = AppRxSchedulers(
        main = AndroidSchedulers.mainThread(),
        common = Schedulers.computation(),
        io = Schedulers.io()
    )

    @PerApp
    @Reusable
    @Provides
    fun providesCompositeAppStartInitializer(
        appStartInitializers: Set<@JvmSuppressWildcards AppStartInitializer>,
        appRxSchedulers: RxSchedulers
    ): AppStartInitializer = CompositeAppStartInitializers(
        appStartInitializers, appRxSchedulers
    )
}