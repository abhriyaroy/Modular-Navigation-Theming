package com.biofourmis.core

import android.app.Activity
import androidx.navigation.NavController

interface FeatureScreenARouteContract {
    fun show(dataToPass: String, navController: NavController)
}