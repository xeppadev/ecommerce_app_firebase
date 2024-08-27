package com.example.ecommerce_app_firebase.data.mappers

import com.example.ecommerce_app_firebase.data.dto.ProductDetails
import com.example.ecommerce_app_firebase.domain.entities.product.DetailsProductEntity
import com.example.ecommerce_app_firebase.domain.mappers.ProductBaseMapper
import javax.inject.Inject

class SingleProductEntityMapper @Inject constructor() :
    ProductBaseMapper<ProductDetails, DetailsProductEntity> {
    override fun map(input: ProductDetails): DetailsProductEntity {
        return DetailsProductEntity(
            id = input.id,
            title = input.title,
            description = input.description,
            price = input.price.toString(),
            imageUrl = input.images,
            rating = input.rating.toString(),
        )
    }
}