package com.example.ecommerce_app_firebase.data.datasource.remote

import com.example.ecommerce_app_firebase.core.network.NetworkResponseState
import com.example.ecommerce_app_firebase.data.dto.ListProducts
import com.example.ecommerce_app_firebase.data.dto.ProductDetails
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {

    fun getProductsListFromApi(): Flow<NetworkResponseState<ListProducts>>

    fun getSingleProductByIdFromApi(productId: Int): Flow<NetworkResponseState<ProductDetails>>

    fun getProductsListBySearchFromApi(query: String): Flow<NetworkResponseState<ListProducts>>

    fun getAllCategoriesListFromApi(): Flow<NetworkResponseState<List<String>>>

    fun getProductsListByCategoryNameFromApi(categoryName: String): Flow<NetworkResponseState<ListProducts>>


}