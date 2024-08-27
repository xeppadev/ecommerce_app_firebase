package com.example.ecommerce_app_firebase.data.repositories

import com.example.ecommerce_app_firebase.core.network.NetworkResponseState
import com.example.ecommerce_app_firebase.data.datasource.local.LocalDataSource
import javax.inject.Inject
import com.example.ecommerce_app_firebase.di.coroutine.IoDispatcher
import com.example.ecommerce_app_firebase.domain.entities.cart.DetailsCartEntity
import com.example.ecommerce_app_firebase.domain.entities.product.FavoritesProductEntity
import com.example.ecommerce_app_firebase.domain.repositories.LocalRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext

class LocalRepositoryImpl @Inject constructor(
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO,
    private val localDataSource: LocalDataSource,
) :LocalRepository {

    override suspend fun getCartsByUserIdFromDb(userId: String): Flow<NetworkResponseState<List<DetailsCartEntity>>> {
        return flow {
            emit(NetworkResponseState.Success(localDataSource.getCartByUserIdFromDb(userId)))
        }.flowOn(ioDispatcher)
    }

    override suspend fun insertCartDetailsToDb(detailsCartEntity: DetailsCartEntity) {
        withContext(ioDispatcher) {
            localDataSource.insertCartDetailsToDb(detailsCartEntity)
        }
    }

    override suspend fun deleteCartDetails(detailsCartEntity: DetailsCartEntity) {
        withContext(ioDispatcher) {
            localDataSource.deleteCartDetailsItemFromDb(detailsCartEntity)
        }
    }

    override suspend fun updateCartDetails(detailsCartEntity: DetailsCartEntity) {
        withContext(ioDispatcher) {
            localDataSource.updateCartDetailsItemFromDb(detailsCartEntity)
        }
    }


    override suspend fun getFavoriteProductsFromDb(userId: String): Flow<NetworkResponseState<List<FavoritesProductEntity>>> {
        return flow {
            emit(NetworkResponseState.Success(localDataSource.getFavoriteProductsFromDb(userId)))
        }.flowOn(ioDispatcher)
    }

    override suspend fun insertFavoriteProductToDb(favoritesProductEntity: FavoritesProductEntity) {
        withContext(ioDispatcher) {
            localDataSource.insertFavoriteItemToDb(favoritesProductEntity)
        }
    }

    override suspend fun deleteFavoriteProduct(favoritesProductEntity: FavoritesProductEntity) {
        withContext(ioDispatcher) {
            localDataSource.deleteFavoriteItemFromDb(favoritesProductEntity)
        }
    }

    override suspend fun getBadgeCountFromDb(userId: String): Flow<NetworkResponseState<Int>> {
        return flow {
            emit(NetworkResponseState.Success(localDataSource.getBadgeCountFromDb(userId)))
        }.flowOn(ioDispatcher)
    }



}