package com.example.ecommerce_app_firebase.ui.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecommerce_app_firebase.R


@Composable
fun RowProducts() {

        val products = listOf(
            Product(
                "1",
                R.drawable.image1,
                "Modern Light Clothes",
                "120",

                ),
            Product(
                "2",
                R.drawable.image2,
                "Modern Light Clothes",
                "120",

                ),
            Product(
                "3",
                R.drawable.image3,
                "Modern Light Clothes",
                "120",

                ),
            Product(
                "4",
                R.drawable.image1,
                "Modern Light Clothes",
                "120",
            ),
        )





    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Popular Product", fontWeight = FontWeight.Bold, fontSize = 16.sp)
        Text(text = "See More", color = androidx.compose.material3.MaterialTheme.colorScheme.primary)
    }

    Spacer(modifier = Modifier.height(8.dp))


    //popular product
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(horizontal = 10.dp)
    ) {
        items( products.size) {
            ProductCard(product = products[it])
        }
    }

}


data class Product(
    val id: String,
    val imageRes: Int,
    val name: String,
    val price: String,

)









@Composable
fun ProductCard(
    product : Product,
) {
    Column {
        Box(
            modifier = Modifier
                .size(150.dp)
                .background(Color.LightGray, shape = RoundedCornerShape(10.dp))
                .clip(RoundedCornerShape(10.dp))
                .clickable {

                },
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = product.imageRes),
                contentDescription = "Product Image",
            )


            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(8.dp)
                    .size(24.dp)
                    .background(androidx.compose.material3.MaterialTheme.colorScheme.primary, shape = CircleShape)
                    .clickable {

                    },
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.heart_bold),
                    contentDescription = "Favorite Icon",
                    modifier = Modifier.size(16.dp),
                    colorFilter = ColorFilter.tint(MaterialTheme.colors.onPrimary)
                )
            }
        }

        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = product.name,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.width(150.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))

        Row(
            modifier = Modifier
                .width(150.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "$ ${product.price}",
                fontWeight = FontWeight.Bold,
                color = androidx.compose.material3.MaterialTheme.colorScheme.primary,
            )

        }
    }
}


