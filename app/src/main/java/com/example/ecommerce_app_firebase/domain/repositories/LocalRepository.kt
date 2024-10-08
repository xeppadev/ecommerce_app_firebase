package com.example.ecommerce_app_firebase.domain.repositories

import com.example.ecommerce_app_firebase.core.network.NetworkResponseState
import com.example.ecommerce_app_firebase.domain.entities.cart.DetailsCartEntity
import com.example.ecommerce_app_firebase.domain.entities.product.FavoritesProductEntity
import kotlinx.coroutines.flow.Flow

interface LocalRepository {

    suspend fun getCartsByUserIdFromDb(userId: String): Flow<NetworkResponseState<List<DetailsCartEntity>>>

    suspend fun insertCartDetailsToDb(detailsCartEntity: DetailsCartEntity)


    suspend fun deleteCartDetails(detailsCartEntity: DetailsCartEntity)

    suspend fun updateCartDetails(detailsCartEntity: DetailsCartEntity)

    suspend fun getFavoriteProductsFromDb(userId: String): Flow<NetworkResponseState<List<FavoritesProductEntity>>>


    suspend fun insertFavoriteProductToDb(favoritesProductEntity: FavoritesProductEntity)


    suspend fun deleteFavoriteProduct(favoritesProductEntity: FavoritesProductEntity)


    suspend fun getBadgeCountFromDb(userId: String): Flow<NetworkResponseState<Int>>

}