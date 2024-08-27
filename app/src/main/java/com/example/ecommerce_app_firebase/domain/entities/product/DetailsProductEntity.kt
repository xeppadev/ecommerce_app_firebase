package com.example.ecommerce_app_firebase.domain.entities.product

data class DetailsProductEntity(
    val id: Int,
    val title: String,
    val price: String,
    val description: String,
    val imageUrl: List<String>,
    val rating: String,

)