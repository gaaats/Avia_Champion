package com.superking.parchisi.stard.fraggg

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.superking.parchisi.stard.R
import com.superking.parchisi.stard.conna.Util.frorirfhrfhrf
import com.superking.parchisi.stard.conna.Util.gjitgjgti
import com.superking.parchisi.stard.conna.Util.frrfhihfrhrfu
import com.superking.parchisi.stard.conna.Util.hrfuhhrfhrf
import com.superking.parchisi.stard.conna.Util.frrfrfhhfrhurfhurfh
import com.superking.parchisi.stard.conna.Util.frrfhrfhfrhrfhu
import com.superking.parchisi.stard.conna.Util.ffrrfhrfrfhurf
import com.superking.parchisi.stard.conna.Util.gtgtjgtijgt
import com.superking.parchisi.stard.conna.Util.gtntggt
import com.superking.parchisi.stard.conna.Util.frrfhirfhrfhurfh
import com.superking.parchisi.stard.conna.Util.gtjgthtghugt
import com.superking.parchisi.stard.conna.Util.hyhyy5h5
import com.superking.parchisi.stard.conna.Util.frhrfhrfhrfurf
import com.superking.parchisi.stard.conna.Util.gtjtgitutg
import com.superking.parchisi.stard.conna.Util.gtoijjgtjgti
import com.superking.parchisi.stard.conna.Util.subSixgttg
import com.superking.parchisi.stard.conna.Util.vfbfygrfrfy
import com.superking.parchisi.stard.conna.Util.gtigtihgt
import com.superking.parchisi.stard.gaamamam.GaaammmmuActivity2
import com.superking.parchisi.stard.vevvvivev.ViviviivvActivity2
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FillloFragment : Fragment() {
    private lateinit var gtgthyhyhy: Context
    val shareP: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtgthyhyhy = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_filllo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val hyhyujikkiik = shareP.getString(frrfrfhhfrhurfhurfh, null)
        val frgthybvvvffv = shareP.getString("appCamp", null)
        val vgthyhyhy = shareP.getString("deepSt", null)
        val gtgkpgtgtj = shareP.getString(hrfuhhrfhrf, null)
        val gtgtjtgjigt = shareP.getString(gjitgjgti, null)
        val wvgttggt = shareP.getString(gtigtihgt, null)
        val mainId = shareP.getString("mainId", null)
        val pack = hyhyy5h5
        val gigthugt = Build.VERSION.RELEASE
        val vfbvedfedfed = shareP.getString(gtntggt, null)
        val frnrfrfrf: String? = shareP.getString(frrfhrfhfrhrfhu, null)

        val gtgthigduegfde = Intent(activity, ViviviivvActivity2::class.java)
        val rfbrfbbrf = Intent(activity, GaaammmmuActivity2::class.java)

        val cdvdcvgcdvg = AppsFlyerLib.getInstance().getAppsFlyerUID(gtgthyhyhy)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        shareP.edit().putString(frrfhihfrhrfu, cdvdcvgcdvg).apply()

        val frgfrgfr =
            "$wvgttggt$gtoijjgtjgti$frgthybvvvffv&$gtjgthtghugt$cdvdcvgcdvg&$frorirfhrfhrf$mainId&$gtjtgitutg$pack&$frhrfhrfhrfurf$gigthugt&$subSixgttg$frrfhirfhrfhurfh"
        val fryugrfgrfy = "$wvgttggt$gtjgthtghugt$vfbvedfedfed&$frorirfhrfhrf$frnrfrfrf&$gtjtgitutg$pack&$frhrfhrfhrfurf$gigthugt&$subSixgttg$frrfhirfhrfhurfh"
        val hgtgthugt =
            "$wvgttggt$gtoijjgtjgti$vgthyhyhy&$gtjgthtghugt$cdvdcvgcdvg&$frorirfhrfhrf$mainId&$gtjtgitutg$pack&$frhrfhrfhrfurf$gigthugt&$subSixgttg$vfbfygrfrfy"
        val rfhhrfhrfrhf =
            "$wvgttggt$gtoijjgtjgti$vgthyhyhy&$gtjgthtghugt$vfbvedfedfed&$frorirfhrfhrf$frnrfrfrf&$gtjtgitutg$pack&$frhrfhrfhrfurf$gigthugt&$subSixgttg$vfbfygrfrfy"


        when (gtgtjtgjigt) {
            "1" ->
                if (frgthybvvvffv!!.contains(ffrrfhrfrfhurf)) {
                    shareP.edit().putString(gtgtjgtijgt, frgfrgfr).apply()
                    shareP.edit().putString("WebInt", "campaign").apply()
                    startActivity(gtgthigduegfde)
                    activity?.finish()
                } else if (vgthyhyhy != null || gtgkpgtgtj!!.contains(hyhyujikkiik.toString())) {
                    shareP.edit().putString(gtgtjgtijgt, hgtgthugt).apply()
                    shareP.edit().putString("WebInt", "deepLink").apply()
                    startActivity(gtgthigduegfde)
                    activity?.finish()
                } else {
                    startActivity(rfbrfbbrf)
                    activity?.finish()
                }
            "0" ->
                if (vgthyhyhy != null) {
                    shareP.edit().putString(gtgtjgtijgt, rfhhrfhrfrhf).apply()
                    shareP.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(gtgthigduegfde)
                    activity?.finish()
                } else if (gtgkpgtgtj!!.contains(hyhyujikkiik.toString())) {
                    shareP.edit().putString(gtgtjgtijgt, fryugrfgrfy).apply()
                    shareP.edit().putString("WebInt", "geo").apply()
                    startActivity(gtgthigduegfde)
                    activity?.finish()
                } else {
                    startActivity(rfbrfbbrf)
                    activity?.finish()
                }
        }
    }
}
