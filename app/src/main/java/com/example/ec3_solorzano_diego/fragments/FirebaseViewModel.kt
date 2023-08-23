package com.example.ec3_solorzano_diego.fragments

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.ec3_solorzano_diego.model.CerveceriaFirebase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log

class FirebaseViewModel(application: Application) : AndroidViewModel(application) {
    private val firestore: FirebaseFirestore = Firebase.firestore
    private val _cervecerias: MutableLiveData<List<CerveceriaFirebase>> = MutableLiveData()
    val cervecerias: LiveData<List<CerveceriaFirebase>> = _cervecerias

    fun getFirebaseList() {
        firestore.collection("cerveceria").get()
            .addOnSuccessListener { result ->
                val cerveceriasList = mutableListOf<CerveceriaFirebase>()
                for (document in result.documents) {
                    val cerveceriaFirebase = CerveceriaFirebase(
                        name = document.getString("name") ?: "",
                        tipo = document.getString("tipo") ?: "",
                        city = document.getString("ciudad") ?: "",
                        phone = document.getString("phone") ?: "",
                        imgUrl = document.getString("imgUrl")?: ""
                    )
                    cerveceriasList.add(cerveceriaFirebase)
                }
                _cervecerias.value = cerveceriasList
            }
            .addOnFailureListener { exception ->
                Log.e(TAG, "Error getting documents: ", exception)
            }
    }



}