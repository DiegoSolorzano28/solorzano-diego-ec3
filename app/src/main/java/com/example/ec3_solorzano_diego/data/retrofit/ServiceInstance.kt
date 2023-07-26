package com.example.ec3_solorzano_diego.data.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceInstance {
    //https://api.openbrewerydb.org/v1/breweries
    //https://run.mocky.io/v3/11c4b2cd-f622-41ff-92e6-5eedc1068b7f
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://run.mocky.io/v3/")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getCerveceriasService(): CerveceriaService = retrofit.create(CerveceriaService::class.java)
}