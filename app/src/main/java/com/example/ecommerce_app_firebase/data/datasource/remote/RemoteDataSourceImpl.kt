package com.example.ecommerce_app_firebase.data.datasource.remote

import com.example.ecommerce_app_firebase.core.network.NetworkResponseState
import com.example.ecommerce_app_firebase.data.dto.ListProducts
import com.example.ecommerce_app_firebase.data.dto.ProductDetails
import com.example.ecommerce_app_firebase.data.services.ServiceApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RemoteDataSourceImpl  @Inject constructor(
    private val serviceApi: ServiceApi
) : RemoteDataSource {

    override fun getProductsListFromApi(): Flow<NetworkResponseState<ListProducts>> {
        return flow {
            emit(NetworkResponseState.Loading)
            try{
                val response = serviceApi.getProductsListFromApi()
                emit(NetworkResponseState.Success(response))
            }catch (
                e: Exception
            ){
                emit(NetworkResponseState.Error(e))
            }

        }

    }

    override fun getSingleProductByIdFromApi(productId: Int): Flow<NetworkResponseState<ProductDetails>> {
        return flow {
            emit(NetworkResponseState.Loading)
            try{
                val response = serviceApi.getSingleProductByIdFromApi(productId)
                emit(NetworkResponseState.Success(response))
            }catch (
                e: Exception
            ){
                emit(NetworkResponseState.Error(e))
            }

        }

    }

    override fun getProductsListBySearchFromApi(query: String): Flow<NetworkResponseState<ListProducts>> {
        return flow {
            emit(NetworkResponseState.Loading)
            try{
                val response = serviceApi.getProductsListBySearchFromApi(query)
                emit(NetworkResponseState.Success(response))
            }catch (
                e: Exception
            ){
                emit(NetworkResponseState.Error(e))
            }

        }

    }


    override fun getAllCategoriesListFromApi(): Flow<NetworkResponseState<List<String>> > {
        return flow {
            emit(NetworkResponseState.Loading)
            try{
                val response = serviceApi.getAllCategoriesListFromApi()
                emit(NetworkResponseState.Success(response))
            }catch (
                e: Exception
            ){
                emit(NetworkResponseState.Error(e))
            }

        }

    }


    override fun getProductsListByCategoryNameFromApi(categoryName: String): Flow<NetworkResponseState<ListProducts>> {
        return flow {
            emit(NetworkResponseState.Loading)
            try{
                val response = serviceApi.getProductsListByCategoryNameFromApi(categoryName)
                emit(NetworkResponseState.Success(response))
            }catch (
                e: Exception
            ){
                emit(NetworkResponseState.Error(e))
            }

        }

    }


}