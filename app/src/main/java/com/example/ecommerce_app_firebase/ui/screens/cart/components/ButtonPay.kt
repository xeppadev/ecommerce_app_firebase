package com.example.ecommerce_app_firebase.ui.screens.cart.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ButtonPay() {
    Column(modifier = Modifier.fillMaxWidth()) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(text = "Total(9 items)", style = TextStyle(fontSize = 16.sp))

            Text(text = "$1200", style = TextStyle(fontSize = 16.sp))


        }
         Spacer(modifier = Modifier.padding(5.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Shipping Fee", style = TextStyle(fontSize = 16.sp))

            Text(text = "$20", style = TextStyle(fontSize = 16.sp))
        }

        Spacer(modifier = Modifier.padding(5.dp))

        Divider(color = androidx.compose.ui.graphics.Color.Gray, thickness = 1.dp)

        Spacer(modifier = Modifier.padding(5.dp))

        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(text = "SubTotal", style = TextStyle(fontSize = 16.sp))

            Text(text = "$1220", style = TextStyle(fontSize = 16.sp))
        }

        Spacer(modifier = Modifier.padding(5.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, bottom = 20.dp)
                .height(50.dp)
                .align(
                    Alignment.CenterHorizontally
                )
        ) {

            Text(text = "Pay", style = TextStyle(fontSize = 16.sp))

        }


    }

}