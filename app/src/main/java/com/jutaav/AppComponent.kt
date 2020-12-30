package com.jutaav

import com.jutaav.application.JutaavApp
import com.jutaav.baseandroid.di.BaseAndroidModule
import com.jutaav.di.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by viking_93 on 30/12/2020
 **/

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        BaseAndroidModule::class,
        AppModule::class
    ]
)
interface AppComponent : AndroidInjector<JutaavApp> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: JutaavApp): AppComponent
    }
}