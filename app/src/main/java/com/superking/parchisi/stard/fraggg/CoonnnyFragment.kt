package com.superking.parchisi.stard.fraggg

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.superking.parchisi.stard.R
import com.superking.parchisi.stard.conna.Util.frrfrfhhfrhurfhurfh
import com.superking.parchisi.stard.vievmod.JOhfhirfhrfrfgfrgrf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class CoonnnyFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_coonnny, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    private lateinit var mContext: Context


    val gttggtgt: SharedPreferences by inject(named("SharedPreferences"))
    val viewMainModel by activityViewModel<JOhfhirfhrfrfgfrgrf>(named("MainModel"))

    lateinit var ghyujjuujuj: String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewMainModel.gthyhyyhhy.observe(viewLifecycleOwner) {
            if (it!=null) {
                ghyujjuujuj = it.Ahuujujuj
                gttggtgt.edit().putString(frrfrfhhfrhurfhurfh, ghyujjuujuj).apply()
                ghtihgtihgthugt()
            }
        }
    }

    private fun ghtihgtihgthugt() {
        findNavController().navigate(R.id.action_coonnnyFragment_to_seccMFragment)
    }
}