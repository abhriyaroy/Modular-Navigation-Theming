package com.biofourmis.samplemodularapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.biofourmis.core.FeatureScreenARouteContract
import com.biofourmis.core.FeatureScreenBRouteContract
import com.biofourmis.featureb.FeatureBRouteContractImpl
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment() {

    @Inject lateinit var featureARouteContractImpl: FeatureScreenARouteContract
    @Inject lateinit var featureBRouteContractImpl: FeatureScreenBRouteContract

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonNavigateFeatureA.setOnClickListener {
            featureARouteContractImpl.show("abc", findNavController())
        }
        buttonNavigateFeatureB.setOnClickListener {
            featureBRouteContractImpl.show("abc", findNavController())
        }
    }

}