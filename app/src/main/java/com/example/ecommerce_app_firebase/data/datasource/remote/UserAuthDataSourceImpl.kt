package com.example.ecommerce_app_firebase.data.datasource.remote

import android.net.Uri
import com.example.ecommerce_app_firebase.domain.entities.user.DetailsUserEntity
import com.example.ecommerce_app_firebase.domain.entities.user.SignInUserEntity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.userProfileChangeRequest
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.CollectionReference;
import javax.inject.Inject

class UserAuthDataSourceImpl @Inject constructor(private val firebaseAuth: FirebaseAuth,
    firebaseFireStore: FirebaseFirestore
    ):UserAuthDataSource {

    private val collection :CollectionReference = firebaseFireStore.collection("users")

    // This function is used to sign up a user with Firebase
    override fun signUpWithFirebase(
        user: DetailsUserEntity,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        firebaseAuth.createUserWithEmailAndPassword(user.email, user.password)
            .addOnSuccessListener {
                onSuccess()
            }.addOnFailureListener {
                onFailure(it.message ?: "An error occurred")
            }
    }

    // This function is used to sign in a user with Firebase

    override fun signInWithFirebase(
        user: SignInUserEntity,
        onSuccess: (DetailsUserEntity) -> Unit,
        onFailure: (String) -> Unit
    ) {
        firebaseAuth.signInWithEmailAndPassword(user.email, user.password)
            .addOnSuccessListener {
                val firebaseUser = it.user
                onSuccess(
                    DetailsUserEntity(
                        id = firebaseUser?.uid ?: "",
                        name = firebaseUser?.displayName ?: "",
                        email = firebaseUser?.email ?: "",
                        phone = firebaseUser?.phoneNumber ?: "",
                        image = firebaseUser?.photoUrl.toString(),
                        password = "",
                        token = firebaseUser?.getIdToken(false)?.result?.token ?: "" // createJwtTokenForFirebaseUser(
                    ),
                )
            }.addOnFailureListener {
                onFailure(it.message ?: "An error occurred")
            }
    }

    // This function is used to reset the password of a user with Firebase
    override fun forgotPassword(
        email: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        firebaseAuth.sendPasswordResetEmail(email)
            .addOnSuccessListener {
                onSuccess()
            }.addOnFailureListener {
                onFailure(it.message ?: "An error occurred")
            }
    }


    // This function is used to write user data to Firebase firestore
    override fun writeUserDataToFirebase(
        user: DetailsUserEntity,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val firebaseUser = firebaseAuth.currentUser
        val userMap = hashMapOf(
            "id" to firebaseAuth.uid,
            "name" to user.name,
            "email" to user.email,
            "phone" to user.phone,
            "image" to user.image,
        )
        val profileUpdate = userProfileChangeRequest{
            displayName = userMap["name"]
            photoUri = Uri.parse(userMap["image"])
        }

        collection.document(firebaseUser?.uid ?: "").set(userMap)
            .addOnSuccessListener {
                onSuccess()
            }.addOnFailureListener {
                onFailure(it.message ?: "An error occurred")
            }
    }


    // This function is used to read user data from Firebase firestore
    override fun readUserDataFromFirebase(
        userId: String,
        onSuccess: (DetailsUserEntity) -> Unit,
        onFailure: (String) -> Unit
    ) {
        collection.document(userId).get()
            .addOnSuccessListener {
                val user = it.toObject(DetailsUserEntity::class.java)
                if (user != null) {
                    onSuccess(user)
                } else {
                    onFailure("User not found")
                }
            }.addOnFailureListener {
                onFailure(it.message ?: "An error occurred")
            }
    }



//    private fun createJwtTokenForFirebaseUser(): String {
//
//    }

}