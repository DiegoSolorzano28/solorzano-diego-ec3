package com.example.ec3_solorzano_diego.data.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceInstance {
    //https://api.openbrewerydb.org/v1/breweries
    //https://api.openbrewerydb.org/v1/breweries/b54b16e1-ac3b-4bff-a11f-f7ae9ddc27e0
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.openbrewerydb.org/v1/")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getCerveceriasService(): CerveceriaService = retrofit.create(CerveceriaService::class.java)
}