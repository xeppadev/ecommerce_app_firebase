package com.example.ecommerce_app_firebase.domain.entities.product


data class ProductEntity
    (
    val id: Int,
    val title: String,
    val description: String,
    val price: String,
    val imageUrl: String,
    val rating: Double,
)