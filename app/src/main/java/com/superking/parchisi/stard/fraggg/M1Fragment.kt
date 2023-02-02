package com.superking.parchisi.stard.fraggg

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.superking.parchisi.stard.R
import com.superking.parchisi.stard.vievmod.JOhfhirfhrfrfgfrgrf
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class M1Fragment : Fragment() {
    private lateinit var hyhyhyhy: Context

    val yhhyhyhyhy by activityViewModel<JOhfhirfhrfrfgfrgrf>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_m1, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        hyhyhyhy=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        yhhyhyhyhy.gt3gtgtgt5gt5(hyhyhyhy)

        ghgtithigthtghgt()

    }

    private fun ghgtithigthtghgt() {
        findNavController().navigate(R.id.action_m1Fragment_to_coonnnyFragment)
    }
}