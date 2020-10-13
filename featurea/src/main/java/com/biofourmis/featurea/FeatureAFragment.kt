package com.biofourmis.featurea

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.biofourmis.core.FeatureScreenBRouteContract
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_feature_a.*
import javax.inject.Inject

@AndroidEntryPoint
class FeatureAFragment : Fragment() {

    @Inject
    lateinit var featureScreenBRouteContract: FeatureScreenBRouteContract

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feature_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("the passed data to fragment a is ${FeatureAFragmentArgs.fromBundle(requireArguments()).argAValue}")
        buttonOpenFeatureScreenB.setOnClickListener {
            featureScreenBRouteContract.show("as", findNavController())
        }
    }

}