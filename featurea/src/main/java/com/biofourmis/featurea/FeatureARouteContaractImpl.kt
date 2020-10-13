package com.biofourmis.featurea

import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import com.biofourmis.core.FeatureScreenARouteContract

class FeatureARouteContaractImpl : FeatureScreenARouteContract{

    override fun show(dataToPass: String, navController: NavController) {
        navController.navigate(R.id.nav_graph_a, bundleOf("argAValue" to dataToPass))
    }
}