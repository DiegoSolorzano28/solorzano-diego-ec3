package com.example.ec3_solorzano_diego.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ec3_solorzano_diego.data.repository.CerveceriaRepository
import com.example.ec3_solorzano_diego.model.ApiResponse
import com.example.ec3_solorzano_diego.model.Cerveceria
import com.example.ec3_solorzano_diego.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ListViewModel: ViewModel() {
    val cerveceriaList: MutableLiveData<List<Cerveceria>> = MutableLiveData<List<Cerveceria>>()
    val repository = CerveceriaRepository()

    fun getCouponList(){
        val data = getData()
        cerveceriaList.value = data
    }

    fun getCerveceriasFromService(){
        viewModelScope.launch(Dispatchers.IO){
            val response = repository.getCervecerias()
            when(response){

                is ApiResponse.Error -> {

                }
                is ApiResponse.Success -> {
                    cerveceriaList.postValue(response.data.cervecerias)
                }
            }
        }
    }

}