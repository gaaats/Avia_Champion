package com.superking.parchisi.stard.vevvvivev

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.superking.parchisi.stard.conna.Util.aps_id
import com.superking.parchisi.stard.conna.Util.gtgtjgtijgt
import com.superking.parchisi.stard.conna.Util.gtntggt
import com.superking.parchisi.stard.databinding.ActivityViviviivv2Binding
import com.superking.parchisi.stard.vievmod.BeamModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class ViviviivvActivity2 : AppCompatActivity() {


    private val gthyhyhyhy by viewModel<BeamModel>(
        named("BeamModel")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        g5tg6tggt5 = ActivityViviviivv2Binding.inflate(layoutInflater)
        g2hy5yh5y5y5 = WebView(this)
        setContentView(g2hy5yh5y5y5)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(g2hy5yh5y5y5, true)
        gthyhyhyhy.webSetgttg2gt2(g2hy5yh5y5y5)

        g2hy5yh5y5y5.webViewClient = CustomViewhyhyhy()
        g2hy5yh5y5y5.webChromeClient = ChromeClientgttggtgt()
        g2hy5yh5y5y5.loadUrl(bghyhygtfrededed())
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != hy2yh5yh5yh5yh || hyyhuujujikikki5 == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var results: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (hy2hy5hy5yh != null) {
                    results = arrayOf(Uri.parse(hy2hy5hy5yh))
                }
            } else {
                val dataString = data.dataString
                if (dataString != null) {
                    results = arrayOf(Uri.parse(dataString))
                }
            }
        }
        hyyhuujujikikki5!!.onReceiveValue(results)
        hyyhuujujikikki5 = null
        return
    }

    private lateinit var g5tg6tggt5: ActivityViviviivv2Binding
    lateinit var g2hy5yh5y5y5: WebView
    private var hyyhuujujikikki5: ValueCallback<Array<Uri>>? = null
    private var hy2hy5hy5yh: String? = null
    private val hy2yh5yh5yh5yh = 1


    inner class CustomViewhyhyhy : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (gthyhyhyhy.gtjgtigthgthuigt(url)) {

                    val h2yh55yhhy5 = Intent(Intent.ACTION_VIEW)
                    h2yh55yhhy5.data = Uri.parse(url)
                    startActivity(h2yh55yhhy5)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            hyhy26yh2hy2(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@ViviviivvActivity2, description, Toast.LENGTH_SHORT).show()
        }
    }


    inner class ChromeClientgttggtgt : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            hyyhuujujikikki5?.onReceiveValue(null)
            hyyhuujujikikki5 = filePath
            var ghyfddd: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (ghyfddd!!.resolveActivity(packageManager) != null) {
                var vfbfdfdf: File? = null
                try {
                    vfbfdfdf = gthyjuikik()
                    ghyfddd.putExtra("PhotoPath", hy2hy5hy5yh)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (vfbfdfdf != null) {
                    hy2hy5hy5yh = "file:" + vfbfdfdf.absolutePath
                    ghyfddd.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(vfbfdfdf)
                    )
                } else {
                    ghyfddd = null
                }
            }
            val vfbggded = Intent(Intent.ACTION_GET_CONTENT)
            vfbggded.addCategory(Intent.CATEGORY_OPENABLE)
            vfbggded.type = "image/*"
            val vfbuiklo: Array<Intent?> =
                ghyfddd?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val nhjuujk = Intent(Intent.ACTION_CHOOSER)
            nhjuujk.putExtra(Intent.EXTRA_INTENT, vfbggded)
            nhjuujk.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            nhjuujk.putExtra(Intent.EXTRA_INITIAL_INTENTS, vfbuiklo)
            startActivityForResult(nhjuujk, hy2yh5yh5yh5yh)
            return true
        }

        fun gthyjuikik(): File? {
            val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val imageFileName = "JPEG_" + timeStamp + "_"
            val storageDir = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                imageFileName,
                ".jpg",
                storageDir
            )
        }
    }

    private fun bghyhygtfrededed(): String {

        val vfgtthyhyujuj = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val hyjuuikikol = getSharedPreferences(
            "SHARED_PREF",
            Context.MODE_PRIVATE
        )

        val link = hyjuuikikol.getString(gtgtjgtijgt, null)
        Log.d("Lololol", link.toString())
        val hyhy = hyjuuikikol.getString(gtntggt, null)
        val afIdhy2yh2 = hyjuuikikol.getString(aps_id, null)



        when (hyjuuikikol.getString("WebInt", null)) {
            "campaign" -> {
                gthyhyhyhy.pushToOSgt2gt2(afIdhy2yh2.toString())
            }
            "deepLink" -> {
                gthyhyhyhy.pushToOSgt2gt2(afIdhy2yh2.toString())
            }
            "deepLinkNOApps" -> {
                Log.d("lolo", "deepLinkNOApps")
                gthyhyhyhy.pushToOSgt2gt2(hyhy.toString())
            }
            "geo" -> {
                gthyhyhyhy.pushToOSgt2gt2(hyhy.toString())
            }
        }
        return vfgtthyhyujuj.getString("SAVED_URL", link).toString()
    }

    var urlfififif = ""
    fun hyhy26yh2hy2(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val g2tg5t5g5 = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val gtgtjgtgtjgt = g2tg5t5g5.edit()
                gtgtjgtgtjgt.putString("SAVED_URL", lurlurlurlurlur)
                gtgtjgtgtjgt.apply()
            }
        }
    }

    private var gt2t5tg5tg = false
    override fun onBackPressed() {

        if (g2hy5yh5y5y5.canGoBack()) {
            if (gt2t5tg5tg) {
                g2hy5yh5y5y5.stopLoading()
                g2hy5yh5y5y5.loadUrl(urlfififif)
            }
            this.gt2t5tg5tg = true
            g2hy5yh5y5y5.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                gt2t5tg5tg = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }
}

