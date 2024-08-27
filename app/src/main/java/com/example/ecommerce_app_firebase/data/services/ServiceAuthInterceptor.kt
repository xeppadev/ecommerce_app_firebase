package com.example.ecommerce_app_firebase.data.services

import com.example.ecommerce_app_firebase.core.token.AuthTokenManager
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class ServiceAuthInterceptor @Inject constructor(private val tokenManager: AuthTokenManager) : Interceptor {

    override fun intercept(chain:Interceptor.Chain):Response {
        val request = chain.request().newBuilder()

        if (tokenManager.isTokenValid()) {
            val token = tokenManager.getToken()
            request.addHeader("Authorization", "Bearer $token")
        } else {
            tokenManager.deleteToken()
        }

        return chain.proceed(request.build())
    }
}