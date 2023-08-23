package com.example.ec3_solorzano_diego.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "cerveceria")
@Parcelize
data class Cerveceria(
    @PrimaryKey
    val id: String,
    val name: String,
    val brewery_type: String,
    val city: String,
    val country: String,
    val phone: String,
    val website_url: String,
    var isFavorite: Boolean = false
): Parcelable

fun getData(): List<Cerveceria> =
    listOf(
        Cerveceria("123","MadTree Brewing 2.0","regional","Cincinnati", "United States","5138368733", "http://www.madtreebrewing.com")


    )