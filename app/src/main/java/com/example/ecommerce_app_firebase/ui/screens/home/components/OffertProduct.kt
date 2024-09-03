package com.example.ecommerce_app_firebase.ui.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun OfferProduct() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .background(color = androidx.compose.material3.MaterialTheme.colorScheme.surface, shape = RoundedCornerShape(10.dp))
            .padding(15.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text("Special Offer", color = Color.White)
        Text(
            "Get 20% off on your first order",
            color = Color.White,
            fontSize = 23.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}
