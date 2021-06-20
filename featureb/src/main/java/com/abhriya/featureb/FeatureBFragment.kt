package com.abhriya.featureb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.abhriya.core.FeatureScreenARouteContract
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_feature_b.*
import javax.inject.Inject

@AndroidEntryPoint
class FeatureBFragment : Fragment() {
    
    @Inject lateinit var featureScreenARouteContract: FeatureScreenARouteContract

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feature_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("the passed data to fragment b is ${FeatureBFragmentArgs.fromBundle(requireArguments()).argBValue}")
        buttonOpenFeatureScreenA.setOnClickListener {
            featureScreenARouteContract.show("asa", findNavController())
        }
    }

}