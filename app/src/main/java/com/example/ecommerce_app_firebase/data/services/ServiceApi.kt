package com.example.ecommerce_app_firebase.data.services

import com.example.ecommerce_app_firebase.core.constants.UrlConstants
import com.example.ecommerce_app_firebase.data.dto.ListProducts
import com.example.ecommerce_app_firebase.data.dto.ProductDetails
import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceApi {
    @GET(UrlConstants.PRODUCT_URL)
    suspend fun getProductsListFromApi(): ListProducts
    @GET(UrlConstants.PRODUCT_SEARCH_URL)
    suspend fun getProductsListBySearchFromApi(@Query("q") query: String): ListProducts
    @GET(UrlConstants.PRODUCT_DETAIL_URL)
    suspend fun getSingleProductByIdFromApi(@Query("id") productId: Int): ProductDetails
    @GET(UrlConstants.PRODUCT_LIST_CATEGORY_URL)
    suspend fun getAllCategoriesListFromApi(): List<String>
    @GET(UrlConstants.PRODUCT_CATEGORY_URL)
    suspend fun getProductsListByCategoryNameFromApi(@Query("category") categoryName: String): ListProducts

}