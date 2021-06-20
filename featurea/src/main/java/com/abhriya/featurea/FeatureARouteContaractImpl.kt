package com.abhriya.featurea

import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import com.abhriya.core.FeatureScreenARouteContract

class FeatureARouteContaractImpl : FeatureScreenARouteContract{

    override fun show(dataToPass: String, navController: NavController) {
        navController.navigate(R.id.nav_graph_a, bundleOf("argAValue" to dataToPass))
    }
}