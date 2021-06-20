package com.abhriya.featureb

import com.abhriya.core.FeatureScreenARouteContract
import com.abhriya.core.FeatureScreenBRouteContract
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class FeatureBModule {

    @Singleton
    @Provides
    fun providesFeatureBRouteContract(): FeatureScreenBRouteContract = FeatureBRouteContractImpl()
}