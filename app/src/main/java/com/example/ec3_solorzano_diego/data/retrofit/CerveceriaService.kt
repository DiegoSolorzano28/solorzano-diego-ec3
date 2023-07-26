package com.example.ec3_solorzano_diego.data.retrofit

import com.example.ec3_solorzano_diego.data.response.CerveceriaListResponse
import retrofit2.http.GET

interface CerveceriaService {
    @GET("8c263766-5216-4fbf-aae0-4c45e5aeb4f8")
    suspend fun getCervecerias() : CerveceriaListResponse
}