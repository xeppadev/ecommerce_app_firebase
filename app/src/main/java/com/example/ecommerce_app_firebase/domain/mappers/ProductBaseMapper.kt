package com.example.ecommerce_app_firebase.domain.mappers

interface ProductBaseMapper<I, O> {
    fun map(input: I): O
}