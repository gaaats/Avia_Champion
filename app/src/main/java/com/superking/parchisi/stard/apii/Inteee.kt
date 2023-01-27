package com.superking.parchisi.stard.apii

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterfacetgtgtgtg {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun ghy7u7uujuujjuuj(): Response<hjuuiii>
}

interface HostInterfaceyhhyhyhy {
    @GET("typo.json")
    suspend fun hyhyyhyhhyhy(): Response<GeoDev>
}

class CountryRepo(private val hy2hyhy2hyhy: ApiInterfacetgtgtgtg) {
    suspend fun getDat() = hy2hyhy2hyhy.ghy7u7uujuujjuuj()
}

@Keep
data class hjuuiii(
    @SerializedName("countryCode")
    val Ahuujujuj: String,
)


@Keep
data class GeoDev(
    @SerializedName("geo")
    val hyujujuj: String,
    @SerializedName("view")
    val hyjuujgfrerrf: String,
    @SerializedName("appsChecker")
    val vfbfbhghghgt: String,
)

class DevRepo(private val jhyioihyjiohy: HostInterfaceyhhyhyhy) {
    suspend fun getDataDev() = jhyioihyjiohy.hyhyyhyhhyhy()
}

