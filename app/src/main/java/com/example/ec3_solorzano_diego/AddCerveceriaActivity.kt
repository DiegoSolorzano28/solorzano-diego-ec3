package com.example.ec3_solorzano_diego

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ec3_solorzano_diego.databinding.ActivityAddCerveceriaBinding
import com.google.firebase.Timestamp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.ktx.storage

class AddCerveceriaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddCerveceriaBinding
    private lateinit var firestore: FirebaseFirestore
    private lateinit var storage: FirebaseStorage
    private var selectedImageUri: Uri? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddCerveceriaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        storage = Firebase.storage

        firestore = Firebase.firestore


        binding.btnRegister.setOnClickListener {
            val name: String = binding.tilName.editText?.text.toString()
            val tipo: String = binding.tilTipo.editText?.text.toString()
            val city: String = binding.tilCity.editText?.text.toString()
            val phone: String = binding.tilPhone.editText?.text.toString()
            if(name.isNotEmpty() && tipo.isNotEmpty() && city.isNotEmpty() && phone.isNotEmpty()){
                uploadImage(name, tipo, city, phone)

            }
            cleanTextFields()


        }
        binding.btnImage.setOnClickListener {
            openImageSelector()
        }


    }

    private fun uploadImage(name: String, tipo: String, city: String, phone: String) {
        val storageRef = storage.reference
        val imageRef = storageRef.child("images/${selectedImageUri?.lastPathSegment}")
        val uploadTask = imageRef.putFile(selectedImageUri!!)

        uploadTask.addOnSuccessListener {
            // Image uploaded successfully, now you can retrieve its download URL
            imageRef.downloadUrl.addOnSuccessListener { downloadUri ->
                val imgUrl = downloadUri.toString()

                // Now you can save the rest of the clothe data along with the image URL to Firestore
                val cerveceria = hashMapOf(
                    "tipo" to  tipo,
                    "name" to name,
                    "ciudad" to city,
                    "phone" to phone,
                    "imgUrl" to imgUrl
                )
                firestore.collection("cerveceria")
                    .add(cerveceria)
                    .addOnSuccessListener {
                        Toast.makeText(this,"Agreado a correctamente con id: ${it.id}", Toast.LENGTH_SHORT).show()
                    }
                    .addOnFailureListener {
                        Toast.makeText(this,"No se agregó el elemento !", Toast.LENGTH_SHORT).show()
                    }
            }
        }.addOnFailureListener {
            Toast.makeText(this,"Error al subir la imagen !", Toast.LENGTH_SHORT).show()
        }
    }

    private fun openImageSelector() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_PICKER_REQUEST)
    }
    companion object {
        private const val IMAGE_PICKER_REQUEST = 123
    }

    private fun cleanTextFields(){
        binding.tilName.editText?.setText("")
        binding.tilTipo.editText?.setText("")
        //binding.tilImgUrl.editText?.setText("")
        binding.tilCity.editText?.setText("")
        binding.tilPhone.editText?.setText("")
        binding.tilName.editText?.requestFocus()
    }



    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_PICKER_REQUEST && resultCode == RESULT_OK) {
            selectedImageUri = data?.data
        }
    }


}

