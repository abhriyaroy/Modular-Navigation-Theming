package com.biofourmis.featureb

import com.biofourmis.core.FeatureScreenARouteContract
import com.biofourmis.core.FeatureScreenBRouteContract
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