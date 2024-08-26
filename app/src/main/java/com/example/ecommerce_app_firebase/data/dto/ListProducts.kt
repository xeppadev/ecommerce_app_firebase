package com.example.ecommerce_app_firebase.data.dto

import com.squareup.moshi.JsonClass
import com.squareup.moshi.Json

@JsonClass(generateAdapter = true)
data class ListProducts (
    @Json(name = "products")
    val  products: List<ProductDetails>,
    @Json(name = "total")
    val total: Int,
    @Json(name = "limit")
    val limit: Int,
    @Json(name = "skip")
    val skip: Int,



)