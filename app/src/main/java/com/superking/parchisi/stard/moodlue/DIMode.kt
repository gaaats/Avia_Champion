package com.superking.parchisi.stard.moodlue

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.superking.parchisi.stard.apii.ApiInterfacetgtgtgtg
import com.superking.parchisi.stard.apii.CountryRepo
import com.superking.parchisi.stard.apii.DevRepo
import com.superking.parchisi.stard.apii.HostInterfaceyhhyhyhy
import com.superking.parchisi.stard.vievmod.BeamModel
import com.superking.parchisi.stard.vievmod.ViMod
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val frrrfihrfh = module {
    viewModel (named("MainModel")){
        ViMod((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        BeamModel(get())
    }
}

val appModuleg22hy6hy = module {

    single  <HostInterfaceyhhyhyhy> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(HostInterfaceyhhyhyhy::class.java)
    }

    single <ApiInterfacetgtgtgtg> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(ApiInterfacetgtgtgtg::class.java)
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
        CountryRepo(get(named("ApiInter")))
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

