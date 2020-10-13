package com.biofourmis.featureb

import androidx.core.os.bundleOf
import androidx.navigation.NavController
import com.biofourmis.core.FeatureScreenBRouteContract

class FeatureBRouteContractImpl : FeatureScreenBRouteContract{

    override fun show(dataToPass: String, navController: NavController) {
        navController.navigate(R.id.nav_graph_b, bundleOf("argBValue" to dataToPass))
    }
}