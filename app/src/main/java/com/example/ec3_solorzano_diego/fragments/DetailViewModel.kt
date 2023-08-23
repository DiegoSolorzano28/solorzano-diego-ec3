package com.example.ec3_solorzano_diego.fragments

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.ec3_solorzano_diego.data.db.CerveceriaDataBase
import com.example.ec3_solorzano_diego.data.repository.CerveceriaRepository
import com.example.ec3_solorzano_diego.model.Cerveceria
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailViewModel (application: Application): AndroidViewModel(application){

    private val repository: CerveceriaRepository
    init {
        val db = CerveceriaDataBase.getDatabase(application)
        repository = CerveceriaRepository(db.CerveceriaDao())
    }

    fun addFavorite(cerveceria: Cerveceria){
        viewModelScope.launch(Dispatchers.IO){
            repository.addFavorite(cerveceria)
        }
    }

    fun removeFavorite(cerveceria: Cerveceria){
        viewModelScope.launch(Dispatchers.IO){
            repository.removeFavorite(cerveceria)
        }
    }
}