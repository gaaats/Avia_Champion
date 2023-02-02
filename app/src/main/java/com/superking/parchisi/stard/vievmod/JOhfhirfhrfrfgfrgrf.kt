package com.superking.parchisi.stard.vievmod

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.superking.parchisi.stard.apii.IHhifrggfrryf
import com.superking.parchisi.stard.apii.DevRepo
import com.superking.parchisi.stard.apii.JOIfhuhrrfhrfh
import com.superking.parchisi.stard.apii.hjuuiii
import com.superking.parchisi.stard.conna.Util.gtghtggtd
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class JOhfhirfhrfrfgfrgrf(
    private val gtthyhyhy: IHhifrggfrryf,
    private val dderfrfrf: DevRepo,
    private val ftghyujikikol: SharedPreferences,
    val hyhyhyhy: Application
) : ViewModel() {

    init {
        gttghgtutg()
        gtjtgjgitijgti()
    }

    private fun gttghgtutg() {
        viewModelScope.launch(Dispatchers.IO) {
            gttg2t2t()
        }
    }

    private fun gtjtgjgitijgti() {
        viewModelScope.launch(Dispatchers.Main) {
            hyhjyijyhijhyjiohy()
        }
    }

    private val hyhyyuujjuujuj = MutableLiveData<hjuuiii>()
    val gthyhyyhhy: LiveData<hjuuiii>
        get() = hyhyyuujjuujuj

    private val gtgtigthgti = MutableLiveData<JOIfhuhrrfhrfh>()
    val gtgttggthgthu: LiveData<JOIfhuhrrfhrfh>
        get() = gtgtigthgti

    private val ggtjoitogtjiogtji = MutableLiveData<String>()
    val g2gth6y5hy5hy5: LiveData<String>
        get() = ggtjoitogtjiogtji

    private val gt2hy55hy5hy = MutableLiveData<String?>()
    val gt3hy25hy5hy5: LiveData<String?>
        get() = gt2hy55hy5hy


    suspend fun hyhjyijyhijhyjiohy() {
        hyhyyuujjuujuj.postValue(gtthyhyhy.getDat().body())
        frhirhigtht()
    }

    suspend fun frhirhigtht() {
        gtgtigthgti.postValue(dderfrfrf.getDataDev().body())
    }

    fun gt3hy2hyhy(cont: Context) {
        AppsFlyerLib.getInstance()
            .init(gtghtggtd, frrfhrfhrf, hyhyhyhy)
        AppsFlyerLib.getInstance().start(cont)
    }

    fun gt3gtgtgt5gt5(hy2hyy5y: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            hy2hyy5y
        ) { data: AppLinkData? ->
            data?.let {
                val gtgtgt2 = data.targetUri?.host.toString()
                ftghyujikikol.edit().putString("deepSt", gtgtgt2).apply()
            }
        }
    }

    private val frrfhrfhrf = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val hy2yu5u = data?.get("campaign").toString()
            ggtjoitogtjiogtji.postValue(hy2yu5u)


        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    fun gttg2t2t() {
        val gtyh8yu9 = AdvertisingIdClient(hyhyhyhy)
        gtyh8yu9.start()
        val h2hy8y8 = gtyh8yu9.info.id.toString()
        gt2hy55hy5hy.postValue(h2hy8y8)
    }

}