package com.jutaav.di

import com.jutaav.appinitializers.ThreeTenAbpAppStartInitializer
import com.jutaav.appinitializers.TimberAppStartInitializer
import com.jutaav.baseandroid.appinitializers.AppStartInitializer
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

/**
 * Created by viking_93 on 30/12/2020
 **/

@Module
abstract class AppModuleBinds {

    @Binds
    @IntoSet
    abstract fun bindsTimberAppStartInitializer(
        appStartInitializer: TimberAppStartInitializer
    ): AppStartInitializer

    @Binds
    @IntoSet
    abstract fun bindsThreeTenAbpAppStartInitializer(
        appStartInitializer: ThreeTenAbpAppStartInitializer
    ): AppStartInitializer
}