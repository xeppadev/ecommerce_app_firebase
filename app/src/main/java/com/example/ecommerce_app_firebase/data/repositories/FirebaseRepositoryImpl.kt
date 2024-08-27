package com.example.ecommerce_app_firebase.data.repositories

import com.example.ecommerce_app_firebase.core.token.AuthTokenManager
import com.example.ecommerce_app_firebase.data.datasource.remote.UserAuthDataSource
import com.example.ecommerce_app_firebase.domain.entities.user.DetailsUserEntity
import com.example.ecommerce_app_firebase.domain.entities.user.SignInUserEntity
import com.example.ecommerce_app_firebase.domain.repositories.FirebaseRepository
import javax.inject.Inject

class FirebaseRepositoryImpl @Inject constructor(
    private val firebaseDataSource:UserAuthDataSource,
    private val tokenManager: AuthTokenManager,
):FirebaseRepository

{
    override fun signUpWithFirebase(
        user: DetailsUserEntity,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        firebaseDataSource.signUpWithFirebase(user, onSuccess, onFailure)
    }

    override fun signInWithFirebase(
        user: SignInUserEntity,
        onSuccess: (DetailsUserEntity) -> Unit,
        onFailure: (String) -> Unit
    ) {
        firebaseDataSource.signInWithFirebase(
            user,
            onSuccess = { userInformationEntity ->
                tokenManager.saveToken(userInformationEntity.token)
                onSuccess(userInformationEntity)
            },
            onFailure,
        )
    }

    override fun forgotPassword(email: String, onSuccess: () -> Unit, onFailure: (String) -> Unit) {
        firebaseDataSource.forgotPassword(email, onSuccess, onFailure)
    }

    override fun writeNewUserToFirebaseDatabase(
        user: DetailsUserEntity,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        firebaseDataSource.writeUserDataToFirebase(user, onSuccess, onFailure)
    }

    override fun readUserFromFirebaseDatabase(
        userId: String,
        onSuccess: (DetailsUserEntity) -> Unit,
        onFailure: (String) -> Unit
    ) {
        firebaseDataSource.readUserDataFromFirebase(userId, onSuccess, onFailure)
    }

}