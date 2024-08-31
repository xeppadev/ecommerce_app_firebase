package com.example.ecommerce_app_firebase.ui.screens.cart.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

@Composable
fun DeleteCart(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(buildAnnotatedString {
            withStyle(style = ParagraphStyle(lineHeight = 30.sp)) {
                withStyle(
                    style = SpanStyle(
                        color = Color(0xFF787676),
                        fontSize = 24.sp
                    )
                ) {
                    append("Shopping\n")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color(0xFF121111),
                        fontSize = 24.sp
                    )
                ) {
                    append("Cart")
                }
            }
        }
        )

        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector =
            Icons.Outlined.Delete,
                contentDescription = "",
                tint = MaterialTheme.colorScheme.error
            )

        }


    }
}
