package com.example.ec3_solorzano_diego.data.repository

import com.example.ec3_solorzano_diego.data.db.CerveceriaDao
import com.example.ec3_solorzano_diego.data.response.CerveceriaListResponse
import com.example.ec3_solorzano_diego.data.retrofit.ServiceInstance
import com.example.ec3_solorzano_diego.model.ApiResponse
import com.example.ec3_solorzano_diego.model.Cerveceria

class CerveceriaRepository(val cerveceriaDao: CerveceriaDao? = null) {
    suspend fun getCervecerias() : ApiResponse<List<Cerveceria>?>{
        return try{
            val response = ServiceInstance.getCerveceriasService().getCervecerias()
            ApiResponse.Success(response)
        }catch (e: Exception){
            ApiResponse.Error(e)
        }


    }

    suspend fun addFavorite(cerveceria: Cerveceria){
        cerveceriaDao?.let {
            it.addFavorite(cerveceria)
        } /*?: kotlin.run {
           //para poner un error
        }*/
    }

    suspend fun removeFavorite(cerveceria: Cerveceria){
        cerveceriaDao?.let {
            it.removeFavorite(cerveceria)
        }
    }

    fun getFavorites(): List<Cerveceria>{
        cerveceriaDao?.let {
            return it.getFavorites()
        }?: kotlin.run {
            return listOf()
        }
    }
}