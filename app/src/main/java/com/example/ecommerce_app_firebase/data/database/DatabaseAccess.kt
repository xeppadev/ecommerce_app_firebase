package com.example.ecommerce_app_firebase.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.ecommerce_app_firebase.domain.entities.cart.DetailsCartEntity
import com.example.ecommerce_app_firebase.domain.entities.product.FavoritesProductEntity

@Dao
interface DatabaseAccess {
 @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUserCart(userCartEntity: DetailsCartEntity)

    @Query("SELECT * FROM details_carts WHERE userId = :userId")
    suspend fun getCartByUserId(userId: String): List<DetailsCartEntity>

    @Update
    suspend fun updateUserCartItem(userCartEntity: DetailsCartEntity
    )
    @Delete
    suspend fun deleteUserCartItem(userCartEntity: DetailsCartEntity)

    @Query("SELECT * FROM favorites_products WHERE userId = :userId")
    suspend fun getFavoriteProducts(userId: String): List<FavoritesProductEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavoriteItem(favoriteProductEntity: FavoritesProductEntity)

    @Delete
    suspend fun deleteFavoriteItem(favoriteProductEntity: FavoritesProductEntity)

    @Query("SELECT COUNT(*) FROM details_carts WHERE userId = :userId")
    suspend fun getBadgeCount(userId: String): Int


}