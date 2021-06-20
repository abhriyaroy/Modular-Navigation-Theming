package com.abhriya.featurea

import com.abhriya.core.FeatureScreenARouteContract
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class FeatureAModule {

    @Singleton
    @Provides
    fun providesFeatureARouteContract(): FeatureScreenARouteContract = FeatureARouteContaractImpl()
}