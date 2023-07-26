package com.example.ec3_solorzano_diego.data.repository

import com.example.ec3_solorzano_diego.data.response.CerveceriaListResponse
import com.example.ec3_solorzano_diego.data.retrofit.ServiceInstance
import com.example.ec3_solorzano_diego.model.ApiResponse

class CerveceriaRepository {
    suspend fun getCervecerias() : ApiResponse<CerveceriaListResponse>{
        return try{
            val response = ServiceInstance.getCerveceriasService().getCervecerias()
            ApiResponse.Success(response)
        }catch (e: Exception){
            ApiResponse.Error(e)
        }


    }
}