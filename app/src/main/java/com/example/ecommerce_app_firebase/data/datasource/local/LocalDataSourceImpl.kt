package com.example.ecommerce_app_firebase.data.datasource.local

import com.example.ecommerce_app_firebase.data.database.ApplicationDatabase
import com.example.ecommerce_app_firebase.data.database.DatabaseAccess
import com.example.ecommerce_app_firebase.domain.entities.cart.DetailsCartEntity
import com.example.ecommerce_app_firebase.domain.entities.product.FavoritesProductEntity
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor( private val databaseAccess: DatabaseAccess) : LocalDataSource {

    override suspend fun getCartByUserIdFromDb(userId: String): List<DetailsCartEntity> {
        return databaseAccess.getCartByUserId(userId)
    }

    override suspend fun insertUserCartToDb(userCartEntity: DetailsCartEntity) {
        return  databaseAccess.insertUserCart(userCartEntity)
    }

    override suspend fun deleteUserCartItemFromDb(userCartEntity: DetailsCartEntity) {
        return  databaseAccess.deleteUserCartItem(userCartEntity)
    }

    override suspend fun updateUserCartItemFromDb(userCartEntity: DetailsCartEntity) {
        return databaseAccess.updateUserCartItem(userCartEntity)
    }

    override suspend fun getFavoriteProductsFromDb(userId: String): List<FavoritesProductEntity> {
        return databaseAccess.getFavoriteProducts(userId)
    }

    override suspend fun insertFavoriteItemToDb(favoriteProductEntity: FavoritesProductEntity) {
        return databaseAccess.insertFavoriteItem(favoriteProductEntity)
    }

    override suspend fun deleteFavoriteItemFromDb(favoriteProductEntity: FavoritesProductEntity) {
        return databaseAccess.deleteFavoriteItem(favoriteProductEntity)
    }

    override suspend fun getBadgeCountFromDb(userId: String): Int {
        return databaseAccess.getBadgeCount(userId)
    }
}