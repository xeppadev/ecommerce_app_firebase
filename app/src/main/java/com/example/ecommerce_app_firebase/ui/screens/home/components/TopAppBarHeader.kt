package com.example.ecommerce_app_firebase.ui.screens.home.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.ecommerce_app_firebase.R

@Composable
fun TopAppBarHeader() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Top
    ) {
        Card(
            modifier = Modifier.width(48.dp),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),

            shape = CircleShape,
            colors = CardDefaults.cardColors(MaterialTheme.colorScheme.onPrimary)
        ) {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Outlined.Menu, contentDescription = ""
                )

            }
        }

        Card(
            modifier = Modifier
                .width(56.dp)

                .height(56.dp)
                .padding(2.dp)

                .background(MaterialTheme.colorScheme.onPrimary),
            shape = CircleShape,

            colors = CardDefaults.cardColors(
                Color.Black.copy(alpha = 0.05f)
            )
        ) {
            Image(

                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Logo",
                modifier = Modifier.size(50.dp),
                alignment = Alignment.Center

            )
        }

    }

}