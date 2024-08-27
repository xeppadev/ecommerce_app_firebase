package com.example.ecommerce_app_firebase.domain.repositories

import com.example.ecommerce_app_firebase.domain.entities.user.DetailsUserEntity
import com.example.ecommerce_app_firebase.domain.entities.user.SignInUserEntity


interface FirebaseRepository {

    fun signUpWithFirebase(
        user: DetailsUserEntity,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    )

    fun signInWithFirebase(
        user: SignInUserEntity,
        onSuccess: (DetailsUserEntity) -> Unit,
        onFailure: (String) -> Unit
    )

    fun forgotPassword(email: String, onSuccess: () -> Unit, onFailure: (String) -> Unit)


    fun writeNewUserToFirebaseDatabase(
        user: DetailsUserEntity,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    )


    fun readUserFromFirebaseDatabase(
        userId: String,
        onSuccess: (DetailsUserEntity) -> Unit,
        onFailure: (String) -> Unit
    )

}