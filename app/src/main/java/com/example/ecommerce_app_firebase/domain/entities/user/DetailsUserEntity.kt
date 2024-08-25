package com.example.ecommerce_app_firebase.domain.entities.user

data class DetailsUserEntity(
    val id: Int,
    val name: String,
    val email: String,
    val phone: String,
    val image: String,
    val password: String,
    val token: String,
)