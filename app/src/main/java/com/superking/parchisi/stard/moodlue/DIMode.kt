package com.superking.parchisi.stard.moodlue

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.superking.parchisi.stard.apii.frhhrfrfhrf
import com.superking.parchisi.stard.apii.IHhifrggfrryf
import com.superking.parchisi.stard.apii.DevRepo
import com.superking.parchisi.stard.apii.OJdjrfhhfrhrfhrf
import com.superking.parchisi.stard.vievmod.JOfrrfhrfrfgfrgrfy
import com.superking.parchisi.stard.vievmod.JOhfhirfhrfrfgfrgrf
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val frrrfihrfh = module {
    viewModel (named("MainModel")){
        JOhfhirfhrfrfgfrgrf((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        JOfrrfhrfrfgfrgrfy(get())
    }
}

val frrihrfhrfrfrf = module {

    single  <OJdjrfhhfrhrfhrf> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(OJdjrfhhfrhrfhrf::class.java)
    }

    single <frhhrfrfhrf> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(frhhrfrfhrf::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://godsrosetta.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        IHhifrggfrryf(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        DevRepo(get(named("HostInter")))
    }
    single{
        hyujujuu5()
    }
    single (named("SharedPreferences")) {
        hyhhyhyhy5(androidApplication())
    }
}

fun hyhhyhyhy5(hy2hy2hy: Application): SharedPreferences {
    return hy2hy2hy.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun hyujujuu5(): Gson {
    return GsonBuilder().create()
}

