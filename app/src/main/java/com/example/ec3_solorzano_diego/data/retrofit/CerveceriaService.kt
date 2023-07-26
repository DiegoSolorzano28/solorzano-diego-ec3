package com.example.ec3_solorzano_diego.data.retrofit

import com.example.ec3_solorzano_diego.data.response.CerveceriaListResponse
import com.example.ec3_solorzano_diego.model.Cerveceria
import retrofit2.http.GET

interface CerveceriaService {
    @GET("breweries?per_page=10")
    suspend fun getCervecerias() : List<Cerveceria>

}