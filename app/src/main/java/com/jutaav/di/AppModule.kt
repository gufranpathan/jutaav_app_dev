package com.jutaav.di

import com.jutaav.appinitializers.ThreeTenAbpAppStartInitializer
import com.jutaav.appinitializers.TimberAppStartInitializer
import dagger.Module
import dagger.Provides
import dagger.Reusable

/**
 * Created by viking_93 on 30/12/2020
 **/

@Module(includes = [AppModuleBinds::class])
class AppModule {
    @Provides
    @Reusable
    internal fun providesTimberAppStartInitializer(): TimberAppStartInitializer {
        return TimberAppStartInitializer()
    }

    @Provides
    @Reusable
    internal fun providesThreeTenAbpAppStartInitializer(): ThreeTenAbpAppStartInitializer {
        return ThreeTenAbpAppStartInitializer()
    }
}