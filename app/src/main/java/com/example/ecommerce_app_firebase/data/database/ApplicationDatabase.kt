package com.example.ecommerce_app_firebase.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ecommerce_app_firebase.domain.entities.cart.DetailsCartEntity
import com.example.ecommerce_app_firebase.domain.entities.product.FavoritesProductEntity

@Database(entities = [DetailsCartEntity::class, FavoritesProductEntity::class], version = 1)
abstract class ApplicationDatabase : RoomDatabase() {
    abstract fun databaseAccess(): DatabaseAccess
}