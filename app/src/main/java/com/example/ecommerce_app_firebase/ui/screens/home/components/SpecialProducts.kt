package com.example.ecommerce_app_firebase.ui.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension


@Composable
fun SpecialProducts() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Special for you", fontWeight = FontWeight.Bold, fontSize = 16.sp)
        Text(text = "See More", color =MaterialTheme.colorScheme.onSurface)
    }

    Spacer(modifier = Modifier.height(15.dp))
//special offer cart
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(horizontal = 10.dp)
    ) {
        item {
            ConstraintLayout(
                modifier = Modifier
                    .width(280.dp)
                    .clip(RoundedCornerShape(20.dp))
            ) {
                //constrains
                val (bannerText, bannerImage) = createRefs()
                Image(
                    painter = painterResource(id = com.example.ecommerce_app_firebase.R.drawable.image_banner_2),
                    contentDescription = "",
                    modifier = Modifier.constrainAs(bannerImage) {}
                )
                Column(
                    modifier = Modifier
                        .background(Color(0x8DB3B0B0))
                        .padding(15.dp)
                        .constrainAs(bannerText) {
                            top.linkTo(bannerImage.top)
                            bottom.linkTo(bannerImage.bottom)
                            start.linkTo(bannerImage.start)
                            end.linkTo(bannerImage.end)
                            height = Dimension.fillToConstraints
                            width = Dimension.fillToConstraints
                        }
                ) {
                    Text(
                        text = "Fashion",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    Spacer(modifier = Modifier.heightIn(15.dp))
                    Text(text = "85 Brands", color = Color.White)
                }


            }
        }
        item {
            //second item
            ConstraintLayout(
                modifier = Modifier
                    .width(280.dp)
                    .clip(RoundedCornerShape(20.dp))
            ) {
                //constrains
                val (bannerText2, bannerImage2) = createRefs()
                Image(
                    painter = painterResource(id = com.example.ecommerce_app_firebase.R.drawable.image_banner_3),
                    contentDescription = "",
                    modifier = Modifier.constrainAs(bannerImage2) {}
                )
                Column(
                    modifier = Modifier
                        .background(Color(0x8DB3B0B0))
                        .padding(15.dp)
                        .constrainAs(bannerText2) {
                            top.linkTo(bannerImage2.top)
                            bottom.linkTo(bannerImage2.bottom)
                            start.linkTo(bannerImage2.start)
                            end.linkTo(bannerImage2.end)
                            height = Dimension.fillToConstraints
                            width = Dimension.fillToConstraints
                        }
                ) {
                    Text(
                        text = "Mobile Phone & Gadget",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    Spacer(modifier = Modifier.heightIn(15.dp))
                    Text(text = "15 Brands", color = Color.White)
                }
            }
        }

    }

}