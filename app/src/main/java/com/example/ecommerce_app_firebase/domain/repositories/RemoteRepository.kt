package com.example.ecommerce_app_firebase.domain.repositories;

import com.example.ecommerce_app_firebase.core.network.NetworkResponseState;
import com.example.ecommerce_app_firebase.domain.entities.product.DetailsProductEntity;
import com.example.ecommerce_app_firebase.domain.entities.product.ProductEntity


import kotlinx.coroutines.flow.Flow;

 interface RemoteRepository {

   fun getProductsListFromApi(): Flow<NetworkResponseState<List<ProductEntity>>>

    fun getSingleProductByIdFromApi(productId: Int): Flow<NetworkResponseState<DetailsProductEntity>>

    fun getProductsListBySearchFromApi(query: String): Flow<NetworkResponseState<List<ProductEntity>>>


    fun getAllCategoriesListFromApi(): Flow<NetworkResponseState<List<String>>>


    fun getProductsListByCategoryNameFromApi(categoryName: String): Flow<NetworkResponseState<List<ProductEntity>>>

}
