package com.example.ecommerce_app_firebase.ui.screens.auth.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.ecommerce_app_firebase.R


@Composable
fun ImageProfile() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier.weight(0.5f)) {

        }
        Box(modifier = Modifier.weight(0.7f)) {
            Text(
                text = "Profile",
                color = androidx.compose.material3.MaterialTheme.colorScheme.primary,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }

    Spacer(modifier = Modifier.height(30.dp))
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        val (image, cameraIcon) = createRefs()
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Profile Image",
            modifier = Modifier
                .height(100.dp)
                .clip(CircleShape)
                .constrainAs(image) {
                    linkTo(start = parent.start, end = parent.end)
                }
        )
        Box(contentAlignment = Alignment.Center, modifier = Modifier.constrainAs(cameraIcon) {
            bottom.linkTo(image.bottom)
            end.linkTo(image.end)

        }) {

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.camera_icon),
                    contentDescription = "Change Picture",
                    modifier = Modifier.background(MaterialTheme.colorScheme.onPrimary)
                )
            }
        }
    }
}