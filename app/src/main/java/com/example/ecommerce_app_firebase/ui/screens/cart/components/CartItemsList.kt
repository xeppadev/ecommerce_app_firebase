package com.example.ecommerce_app_firebase.ui.screens.cart.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable

fun ProductCartList (){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(40.dp)
        ){
        ProductCartItems(
            imagePainter = painterResource(id = com.example.ecommerce_app_firebase.R.drawable.product1),
            title = "Nike Air Max 270",
            price = "$120",
            pricetag = "120",
            count = "1",
            backgroundColor = Color.White
        )
        ProductCartItems(
            imagePainter = painterResource(id =com.example.ecommerce_app_firebase.R.drawable.product2),
            title = "Nike Air Max 270",
            price = "$120",
            pricetag = "120",
            count = "1",
            backgroundColor = Color.White
        )

    }
}




