package com.example.ecommerce_app_firebase.core.token

import android.content.SharedPreferences
import arrow.core.getOrElse
import com.example.ecommerce_app_firebase.core.constants.TokenConstants
import io.github.nefilim.kjwt.JWT

import javax.inject.Inject

class AuthTokenManager @Inject constructor(private val sharedPreferences: SharedPreferences) {

    fun saveToken(token: String) {
        sharedPreferences.edit().putString(TokenConstants.USER_TOKEN, token).putLong(
            TokenConstants.USER_TOKEN_EXPIRATION_TIME,
            extractExpirationTimeFromToken(token)
        ).apply()
    }

    fun getToken(): String? {
        return sharedPreferences.getString(TokenConstants.USER_TOKEN, null)
    }

    private fun getTokenExpirationTime(): Long {
        return sharedPreferences.getLong(TokenConstants.USER_TOKEN_EXPIRATION_TIME, 0)
    }

    fun isTokenValid(): Boolean {
        val expirationTime = getTokenExpirationTime()
        return (System.currentTimeMillis() / 1000) < expirationTime
    }

    fun deleteToken() {
        sharedPreferences.edit().remove(TokenConstants.USER_TOKEN).apply()
        sharedPreferences.edit().remove(TokenConstants.USER_TOKEN_EXPIRATION_TIME).apply()
    }

    private fun extractExpirationTimeFromToken(token: String): Long {
        var expirationTime = 0L
        JWT.decode(
            token,
        ).also {
            it.tap { decodedJWT ->
                expirationTime = decodedJWT.claimValueAsLong("exp").getOrElse { 0L }
            }
        }
        return expirationTime
    }
}