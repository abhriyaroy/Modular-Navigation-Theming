package com.biofourmis.core

import android.app.Activity
import androidx.navigation.NavController

interface FeatureScreenBRouteContract {
    fun show(dataToPass: String, navController: NavController)
}