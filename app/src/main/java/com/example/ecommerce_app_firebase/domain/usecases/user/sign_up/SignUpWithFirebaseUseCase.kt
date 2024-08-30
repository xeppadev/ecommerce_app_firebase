package com.example.ecommerce_app_firebase.domain.usecases.user.sign_up

import com.example.ecommerce_app_firebase.domain.entities.user.DetailsUserEntity

interface SignUpWithFirebaseUseCase {
    operator fun invoke(
        user: DetailsUserEntity,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    )
}