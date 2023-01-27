package com.superking.parchisi.stard

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.superking.parchisi.stard.conna.Util.gjitgjgti
import com.superking.parchisi.stard.vievmod.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class BeeefffFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_beeefff, container, false)
    }


    val gt2gt2gt5tg by activityViewModel<ViMod>(named("MainModel"))
    val g2tg5tg5: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var gfgtgthgt: String
    private lateinit var frrhrhrfgfry: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        frrhrhrfgfry = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gtgt2gt5tg = g2tg5tg5.getString(gjitgjgti, null)
        val gt25y8uu8u8 = g2tg5tg5.getString("appCamp", null)

        if (gtgt2gt5tg=="1" &&gt25y8uu8u8 == null) {
            gt2gt2gt5tg.gt3hy2hyhy(frrhrhrfgfry)
            gt2gt2gt5tg.g2gth6y5hy5hy5.observe(viewLifecycleOwner) {
                if (it != null) {
                    gfgtgthgt = it.toString()
                    g2tg5tg5.edit().putString("appCamp", gfgtgthgt).apply()
                    fhrhrfiurfhrfhrf()
                }
            }
        } else {
            fhrhrfiurfhrfhrf()
        }
    }

    private fun fhrhrfiurfhrfhrf() {
        findNavController().navigate(R.id.action_beeefffFragment_to_fillloFragment)
    }

}