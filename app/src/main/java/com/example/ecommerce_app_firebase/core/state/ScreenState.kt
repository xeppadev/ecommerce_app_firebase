package com.example.ecommerce_app_firebase.core.state

sealed class ScreenState<out T : Any> {
    data object Loading : ScreenState<Nothing>()
    data class Error(val message: String) : ScreenState<Nothing>()
    data class Success<out T : Any>(val uiData: T) : ScreenState<T>()
}