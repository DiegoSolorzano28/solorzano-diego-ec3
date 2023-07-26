package com.example.ec3_solorzano_diego.model

data class Cerveceria(
    val name: String,
    val brewery_type: String,
    val city: String,
    val country: String,
    val phone: String,
    val website_url: String,
)

fun getData(): List<Cerveceria> =
    listOf(
        Cerveceria("MadTree Brewing 2.0","regional","Cincinnati", "United States","5138368733", "http://www.madtreebrewing.com")


    )