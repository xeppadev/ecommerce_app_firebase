package com.example.ecommerce_app_firebase.ui.screens.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ecommerce_app_firebase.ui.screens.auth.components.ImageProfile
import com.example.ecommerce_app_firebase.ui.screens.auth.components.OptionsAuth


@Composable
    fun AuthRoute() {
        AuthScreen()
    }



@Composable
fun AuthScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
       ImageProfile()
        Spacer(modifier = Modifier.padding(10.dp))
        OptionsAuth()

    }
}

