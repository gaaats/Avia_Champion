package com.superking.parchisi.stard.apppclaaas

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.superking.parchisi.stard.conna.Util.hhyjiohyjiohyjiohy
import com.superking.parchisi.stard.conna.Util.instId
import com.superking.parchisi.stard.conna.Util.gjihgthgt
import com.superking.parchisi.stard.conna.Util.gtntggt
import com.superking.parchisi.stard.moodlue.appModuleg22hy6hy
import com.superking.parchisi.stard.moodlue.frrrfihrfh
import io.branch.referral.Branch
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class ArttttClas:Application() {


    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(hhyjiohyjiohyjiohy)
        jgtjogtojgtjgtotgjitgji()
        Branch.getAutoInstance(this)

        val hyyuui = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val gbghhyhyhyyh = getSharedPreferences("PREFS_NAME", 0)

        val hyhyjuujujujuj = MyTracker.getTrackerParams()
        val yhyjuujuj2ujuj2 = MyTracker.getTrackerConfig()
        val ghyyhhyjuukiik = MyTracker.getInstanceId(this)
        yhyjuujuj2ujuj2.isTrackingLaunchEnabled = true
        val hyjujuujuj = UUID.randomUUID().toString()

        if (gbghhyhyhyyh.getBoolean("my_first_time", true)) {
            hyhyjuujujujuj.setCustomUserId(hyjujuujuj)
            hyyuui.edit().putString(gtntggt, hyjujuujuj).apply()
            hyyuui.edit().putString(instId, ghyyhhyjuukiik).apply()
            gbghhyhyhyyh.edit().putBoolean("my_first_time", false).apply()
        } else {
            val hyhyjuujuj = hyyuui.getString(gtntggt, hyjujuujuj)
            hyhyjuujujujuj.setCustomUserId(hyhyjuujuj)
        }
        MyTracker.initTracker(gjihgthgt, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@ArttttClas)
            modules(
                listOf(
                    frrrfihrfh, appModuleg22hy6hy
                )
            )
        }
    }

    private fun jgtjogtojgtjgtotgjitgji() {
        Branch.enableTestMode()
    }
}