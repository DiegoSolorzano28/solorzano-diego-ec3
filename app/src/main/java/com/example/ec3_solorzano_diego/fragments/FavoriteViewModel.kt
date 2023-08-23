package com.example.ec3_solorzano_diego.fragments

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.ec3_solorzano_diego.data.db.CerveceriaDataBase
import com.example.ec3_solorzano_diego.data.repository.CerveceriaRepository
import com.example.ec3_solorzano_diego.model.ApiResponse
import com.example.ec3_solorzano_diego.model.Cerveceria
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FavoriteViewModel(application: Application): AndroidViewModel(application) {
    private val repository: CerveceriaRepository
    private val _favorites: MutableLiveData<List<Cerveceria>> = MutableLiveData()
    val favorites: LiveData<List<Cerveceria>> = _favorites

    init{
        val db= CerveceriaDataBase.getDatabase(application)
        repository = CerveceriaRepository(db.CerveceriaDao())
    }


    fun getFavorites(){
        viewModelScope.launch(Dispatchers.IO) {
            val data = repository.getFavorites()
            _favorites.postValue(data)
        }

    }
}