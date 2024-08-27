package com.example.ecommerce_app_firebase.data.repositories

import com.example.ecommerce_app_firebase.core.network.NetworkResponseState
import com.example.ecommerce_app_firebase.data.datasource.remote.RemoteDataSource
import com.example.ecommerce_app_firebase.data.dto.ProductDetails

import com.example.ecommerce_app_firebase.di.coroutine.IoDispatcher
import com.example.ecommerce_app_firebase.domain.entities.product.DetailsProductEntity
import com.example.ecommerce_app_firebase.domain.entities.product.ProductEntity
import com.example.ecommerce_app_firebase.domain.mappers.ProductBaseMapper
import com.example.ecommerce_app_firebase.domain.mappers.ProductListMapper
import com.example.ecommerce_app_firebase.domain.repositories.RemoteRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class RemoteRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO,
    private val allProductsMapper: ProductListMapper<ProductDetails,ProductEntity>,
    private val singleProductMapper: ProductBaseMapper<ProductDetails,DetailsProductEntity>


):RemoteRepository {

    override fun getProductsListFromApi(): Flow<NetworkResponseState<List<ProductEntity>>> {
        return remoteDataSource.getProductsListFromApi().map {
            when(it){
                is NetworkResponseState.Loading -> NetworkResponseState.Loading
                is NetworkResponseState.Success -> NetworkResponseState.Success(allProductsMapper.map(it.result.products))
                is NetworkResponseState.Error -> NetworkResponseState.Error(it.exception)
            }
        }.flowOn(ioDispatcher)
    }

    override fun getSingleProductByIdFromApi(productId: Int): Flow<NetworkResponseState<DetailsProductEntity>> {
        return remoteDataSource.getSingleProductByIdFromApi(productId).map {
            when(it){
                is NetworkResponseState.Loading -> NetworkResponseState.Loading
                is NetworkResponseState.Success -> NetworkResponseState.Success(singleProductMapper.map(it.result))
                is NetworkResponseState.Error -> NetworkResponseState.Error(it.exception)
            }
        }.flowOn(ioDispatcher)



    }

    override fun getProductsListBySearchFromApi(query: String): Flow<NetworkResponseState<List<ProductEntity>>> {
        return remoteDataSource.getProductsListBySearchFromApi(query).map {
            when(it){
                is NetworkResponseState.Loading -> NetworkResponseState.Loading
                is NetworkResponseState.Success -> NetworkResponseState.Success(allProductsMapper.map(it.result.products))
                is NetworkResponseState.Error -> NetworkResponseState.Error(it.exception)
            }
        }.flowOn(ioDispatcher)
    }

    override fun getAllCategoriesListFromApi(): Flow<NetworkResponseState<List<String>>> {
        return remoteDataSource.getAllCategoriesListFromApi().map {
            when(it){
                is NetworkResponseState.Loading -> NetworkResponseState.Loading
                is NetworkResponseState.Success -> NetworkResponseState.Success(it.result)
                is NetworkResponseState.Error -> NetworkResponseState.Error(it.exception)
            }
        }.flowOn(ioDispatcher)
    }


    override fun getProductsListByCategoryNameFromApi(categoryName: String): Flow<NetworkResponseState<List<ProductEntity>>>
    {
        return remoteDataSource.getProductsListByCategoryNameFromApi(categoryName).map {
            when(it){
                is NetworkResponseState.Loading -> NetworkResponseState.Loading
                is NetworkResponseState.Success -> NetworkResponseState.Success(allProductsMapper.map(it.result.products))
                is NetworkResponseState.Error -> NetworkResponseState.Error(it.exception)
            }
        }.flowOn(ioDispatcher)
    }



}