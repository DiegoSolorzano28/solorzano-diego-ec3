package com.example.ec3_solorzano_diego.model

data class Cerveceria(
    val name: String,
    val brewery_type: String,
    val city: String,
    val website_url: String,
)

fun getData(): List<Cerveceria> =
    listOf(
        Cerveceria("Cerveceria 1","clasico","Lima", "example.com"),
        Cerveceria("Cerveceria 2","clasico","Lima", "example.com")

    )