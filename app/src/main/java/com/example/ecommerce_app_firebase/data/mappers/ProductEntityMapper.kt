package com.example.ecommerce_app_firebase.data.mappers

import com.example.ecommerce_app_firebase.data.dto.ProductDetails
import com.example.ecommerce_app_firebase.domain.entities.product.ProductEntity
import com.example.ecommerce_app_firebase.domain.mappers.ProductListMapper
import javax.inject.Inject

class ProductEntityMapper @Inject constructor() : ProductListMapper<ProductDetails, ProductEntity> {
    override fun map(input: List<ProductDetails>): List<ProductEntity> {
        return input.map {
            ProductEntity(
                id = it.id,
                title = it.title,
                description = it.description,
                price = it.price.toString(),
                imageUrl = it.images[0],
                rating = it.rating,
            )
        }
    }


}