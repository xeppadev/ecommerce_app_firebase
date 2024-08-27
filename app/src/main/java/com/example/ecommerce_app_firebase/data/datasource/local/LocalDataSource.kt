package com.example.ecommerce_app_firebase.data.datasource.local

import com.example.ecommerce_app_firebase.domain.entities.cart.DetailsCartEntity
import com.example.ecommerce_app_firebase.domain.entities.product.FavoritesProductEntity

interface LocalDataSource {
    suspend fun getCartByUserIdFromDb(userId: String): List<DetailsCartEntity>

    suspend fun insertCartDetailsToDb(userCartEntity: DetailsCartEntity)

    suspend fun deleteCartDetailsItemFromDb(userCartEntity: DetailsCartEntity)

    suspend fun updateCartDetailsItemFromDb(userCartEntity: DetailsCartEntity)

    suspend fun getFavoriteProductsFromDb(userId: String): List<FavoritesProductEntity>

    suspend fun insertFavoriteItemToDb(favoriteProductEntity: FavoritesProductEntity)

    suspend fun deleteFavoriteItemFromDb(favoriteProductEntity: FavoritesProductEntity)

    suspend fun getBadgeCountFromDb(userId: String): Int
}