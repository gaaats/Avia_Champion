package com.superking.parchisi.stard

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.superking.parchisi.stard.conna.Util
import com.superking.parchisi.stard.conna.Util.codeCode
import com.superking.parchisi.stard.conna.Util.gtigtihgt
import com.superking.parchisi.stard.vievmod.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SeccMFragment : Fragment() {
    val hyhyhyhyh by activityViewModel<ViMod>(named("MainModel"))
    lateinit var frrfrfrfrf: String
    lateinit var hkohyko: String
    lateinit var gtgtngtntgj: String
    private lateinit var hyjuujujuj: Context

    val vfbghyhyhy: SharedPreferences by inject(named("SharedPreferences"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_secc_m, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        hyjuujujuj = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hyhyhyhyh.gt3hy25hy5hy5.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                vfbghyhyhy.edit().putString("mainId", main).apply()
            }
        }

        rfhhrfhrhrfhrf()
    }

    private fun rfhhrfhrhrfhrf() {
        hyhyhyhyh.gtgttggthgthu.observe(viewLifecycleOwner) {
            if (it != null) {

                frrfrfrfrf = it.hyujujuj
                gtgtngtntgj = it.vfbfbhghghgt
                hkohyko = it.hyjuujgfrerrf

                vfbghyhyhy.edit().putString(codeCode, frrfrfrfrf).apply()
                vfbghyhyhy.edit().putString(Util.gjitgjgti, gtgtngtntgj).apply()
                vfbghyhyhy.edit().putString(gtigtihgt, hkohyko).apply()

                findNavController().navigate(R.id.action_seccMFragment_to_beeefffFragment)
            }
        }
    }
}