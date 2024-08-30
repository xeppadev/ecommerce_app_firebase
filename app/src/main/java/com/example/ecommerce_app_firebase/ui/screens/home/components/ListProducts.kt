package com.example.ecommerce_app_firebase.ui.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


data class Product(
    val id: String,
    val imageRes: Int,
    val name: String,
    val price: String,
    val trending: String,
    val priceTag: String
)

@Composable
fun ListProducts() {
    val products = listOf(
        Product(
            "1",
            com.example.ecommerce_app_firebase.R.drawable.product1,
            "Modern Light Clothes",
            "120",
            "Trending Now",
            "$"
        ),
        Product(
            "2",
            com.example.ecommerce_app_firebase.R.drawable.product2,
            "Light Dress Bless",
            "100",
            "New Arrival",
            "$"
        ),
        Product(
            "3",
            com.example.ecommerce_app_firebase.R.drawable.product1,
            "Modern Light Clothes",
            "120",
            "Trending Now",
            "$"
        ),
        Product(
            "4",
            com.example.ecommerce_app_firebase.R.drawable.product2,
            "Light Dress Bless",
            "100",
            "New Arrival",
            "$"
        ),
        Product(
            "5",
            com.example.ecommerce_app_firebase.R.drawable.product1,
            "Modern Light Clothes",
            "120",
            "Trending Now",
            "$"
        ),
        Product(
            "6",
            com.example.ecommerce_app_firebase.R.drawable.product2,
            "Light Dress Bless",
            "100",
            "New Arrival",
            "$"
        ),
    )

    val listState = rememberLazyGridState()

    LazyVerticalGrid(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        contentPadding = PaddingValues(horizontal = 5.dp),
        state = listState,

        columns = GridCells.Fixed(2),
    ) {

        items(products.size, key = { products[it].id }) {
            ProductCard(
                product = products[it]
            )
        }


    }

}


@Composable
fun ProductCard(
    product : Product
) {
    Card(
        modifier = Modifier
            .width(160.dp)
            .wrapContentHeight(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.onPrimary)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(260.dp)
            ) {
                Image(
                    painter = painterResource(id = product.imageRes),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(16.dp)),
                    contentScale = ContentScale.Crop
                )

                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp)

                        .background(
                            MaterialTheme.colorScheme.primary, shape = (CircleShape)
                        )
                ) {
                    Icon(
                        painter = painterResource(id = com.example.ecommerce_app_firebase.R.drawable.heart_linear),

                        contentDescription = "", tint = MaterialTheme.colorScheme.onPrimary
                    )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(12.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = product.name,
                    style = TextStyle(
                        fontWeight = FontWeight(700),
                        fontSize = 15.sp,
                    ),
                    maxLines = 2,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                )
                Text(
                    text = product.trending,
                    style = TextStyle(
                        fontWeight = FontWeight(500),
                        color = MaterialTheme.colorScheme.outline,
                        fontSize = 14.sp,
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = product.priceTag,
                        style = TextStyle(
                            fontWeight = FontWeight(500),

                            fontSize = 14.sp,
                        ),
                    )
                    Text(
                        text = product.price,
                        style = TextStyle(
                            fontWeight = FontWeight(500),
                            fontSize = 14.sp,
                        ),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun ProductCardPreview() {
    ListProducts()
}
