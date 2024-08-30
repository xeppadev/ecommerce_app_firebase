package com.example.ecommerce_app_firebase.domain.usecases.user.sign_up

import com.example.ecommerce_app_firebase.domain.entities.user.DetailsUserEntity
import com.example.ecommerce_app_firebase.domain.repositories.FirebaseRepository
import javax.inject.Inject


class SignUpWithFirebaseUseCaseImpl @Inject constructor(
    private val firebaseRepository: FirebaseRepository
) :SignUpWithFirebaseUseCase {
    override fun invoke(
        user: DetailsUserEntity,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        firebaseRepository.signUpWithFirebase(user, onSuccess, onFailure)
    }
}