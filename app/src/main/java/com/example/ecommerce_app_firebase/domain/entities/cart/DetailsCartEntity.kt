package com.example.ecommerce_app_firebase.domain.entities.cart

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "details_carts")
data class DetailsCartEntity(
    val userId: String,
    @PrimaryKey
    @ColumnInfo(name = "product_id")
    val productId: Int,
    @ColumnInfo(name = "product_price") val price: Int,
    @ColumnInfo(name = "product_quantity") val quantity: Int,
    @ColumnInfo(name = "product_title") val title: String,
    @ColumnInfo(name = "product_image") val image: String,


    )