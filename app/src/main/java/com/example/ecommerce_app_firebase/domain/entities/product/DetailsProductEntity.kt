package com.example.ecommerce_app_firebase.domain.entities.product

data class DetailsProductEntity(
    val id: Int,
    val title: String,
    val price: Int,
    val description: String,
    val category: String,
    val image: String

)