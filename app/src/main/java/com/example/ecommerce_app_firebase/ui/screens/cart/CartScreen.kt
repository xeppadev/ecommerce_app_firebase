package com.example.ecommerce_app_firebase.ui.screens.cart

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ecommerce_app_firebase.ui.screens.cart.components.ButtonPay
import com.example.ecommerce_app_firebase.ui.screens.cart.components.DeleteCart
import com.example.ecommerce_app_firebase.ui.screens.cart.components.ProductCartList
import com.example.ecommerce_app_firebase.ui.screens.home.components.TopAppBarHeader


@Composable
fun CartRoute(){
    CartScreen()
}



@Composable
fun CartScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)) {
          TopAppBarHeader()
            Spacer(modifier = Modifier.padding(5.dp))
            DeleteCart()
            Spacer(modifier = Modifier.padding(5.dp))
            ProductCartList()
            Spacer(modifier = Modifier.padding(5.dp))
            ButtonPay()
        }
    }

}


