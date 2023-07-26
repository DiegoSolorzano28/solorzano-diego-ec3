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
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ListViewModel: ViewModel() {
    private val _cerveceriaList = MutableLiveData<List<Cerveceria>?>()
    private val repository:CerveceriaRepository = CerveceriaRepository()
    val cerveceriaList: LiveData<List<Cerveceria>?>
    get() = _cerveceriaList

    fun getCerveceriasFromService(){
        GlobalScope.launch(Dispatchers.IO){

            when(val response = repository.getCervecerias()){

                is ApiResponse.Error -> {

                }
                is ApiResponse.Success -> {
                    _cerveceriaList.postValue(response.data)
                }
            }
        }
    }



}