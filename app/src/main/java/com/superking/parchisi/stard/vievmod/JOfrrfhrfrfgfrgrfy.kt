package com.superking.parchisi.stard.vievmod

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class JOfrrfhrfrfgfrgrfy(application: Application): ViewModel() {

    fun pushToOSgt2gt2(gt6gt62g: String) {
        OneSignal.setExternalUserId(
            gt6gt62g,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val vfbghhjujuu = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $vfbghhjujuu"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val cfvgbghn =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $cfvgbghn"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val gthyjujujuj = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $gthyjujujuj"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    fun gtjgtigthgthuigt(uri: String): Boolean {
        try {
            pmgtgtgtgt.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }

    val pmgtgtgtgt = application.packageManager
    fun webSetgttg2gt2(webView: WebView): WebSettings{
        val hy2hyyh2 = webView.settings
        hy2hyyh2.javaScriptEnabled = true
        hy2hyyh2.useWideViewPort = true
        hy2hyyh2.loadWithOverviewMode = true
        hy2hyyh2.allowFileAccess = true
        hy2hyyh2.domStorageEnabled = true
        hy2hyyh2.userAgentString = hy2hyyh2.userAgentString.replace("; wv", "")
        hy2hyyh2.javaScriptCanOpenWindowsAutomatically = true
        hy2hyyh2.setSupportMultipleWindows(false)
        hy2hyyh2.displayZoomControls = false
        hy2hyyh2.builtInZoomControls = true
        hy2hyyh2.allowFileAccess = true
        hy2hyyh2.allowContentAccess = true
        hy2hyyh2.setSupportZoom(true)
        hy2hyyh2.pluginState = WebSettings.PluginState.ON
        hy2hyyh2.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        hy2hyyh2.cacheMode = WebSettings.LOAD_DEFAULT
        hy2hyyh2.allowContentAccess = true
        hy2hyyh2.mediaPlaybackRequiresUserGesture = false
        return hy2hyyh2
    }
}