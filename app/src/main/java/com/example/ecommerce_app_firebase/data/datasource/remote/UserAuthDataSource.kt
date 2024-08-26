package com.example.ecommerce_app_firebase.data.datasource.remote

import com.example.ecommerce_app_firebase.domain.entities.user.DetailsUserEntity
import com.example.ecommerce_app_firebase.domain.entities.user.SignInUserEntity

interface UserAuthDataSource {

    fun signUpWithFirebase(
        user:DetailsUserEntity,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit,
    )

    fun signInWithFirebase(
        user: SignInUserEntity,
        onSuccess: (DetailsUserEntity) -> Unit,
        onFailure: (String) -> Unit,
    )

    fun forgotPassword(
        email: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit,
    )

    fun writeUserDataToFirebase(
        user: DetailsUserEntity,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit,
    )

    fun readUserDataFromFirebase(
        userId: String,
        onSuccess: (DetailsUserEntity) -> Unit,
        onFailure: (String) -> Unit,
    )

}