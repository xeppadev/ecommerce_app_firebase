package com.example.ecommerce_app_firebase.ui.screens.auth.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.ecommerce_app_firebase.R


@Composable
fun OptionsAuth() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)

            .background(MaterialTheme.colorScheme.onPrimaryContainer, shape = RoundedCornerShape(20.dp))
            .clip(RoundedCornerShape(10.dp))
            .clickable {

            }
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.user_icon),
            contentDescription = null,
            modifier = Modifier.weight(0.05f), tint =androidx.compose.material3.MaterialTheme.colorScheme.primary
        )
        Text("Profile Picture", modifier = Modifier.weight(0.2f))
        Icon(
            painter = painterResource(id = R.drawable.arrow_right),
            contentDescription = null,
            modifier = Modifier.weight(0.05f),
            tint =  androidx.compose.material3.MaterialTheme.colorScheme.primary
        )
    }

    Spacer(modifier = Modifier.height(15.dp))


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)

            .background(MaterialTheme.colorScheme.onPrimaryContainer , shape = RoundedCornerShape(20.dp))
            .clip(RoundedCornerShape(10.dp))
            .clickable {

            }
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.bell),
            contentDescription = null,
            modifier = Modifier.weight(0.05f), tint = androidx.compose.material3.MaterialTheme.colorScheme.primary
        )
        Text("Notification", modifier = Modifier.weight(0.2f))
        Icon(
            painter = painterResource(id = R.drawable.arrow_right),
            contentDescription = null,
            modifier = Modifier.weight(0.05f),
            tint = androidx.compose.material3.MaterialTheme.colorScheme.primary
        )
    }


    Spacer(modifier = Modifier.height(15.dp))


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)

            .background(MaterialTheme.colorScheme.onPrimaryContainer, shape = RoundedCornerShape(20.dp))
            .clip(RoundedCornerShape(10.dp))
            .clickable {

            }
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.settings),
            contentDescription = null,
            modifier = Modifier.weight(0.05f), tint = androidx.compose.material3.MaterialTheme.colorScheme.primary
        )
        Text("Settings", modifier = Modifier.weight(0.2f))
        Icon(
            painter = painterResource(id = R.drawable.arrow_right),
            contentDescription = null,
            modifier = Modifier.weight(0.05f),
            tint = androidx.compose.material3.MaterialTheme.colorScheme.primary
        )
    }


    Spacer(modifier = Modifier.height(15.dp))


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)

            .background(MaterialTheme.colorScheme.onPrimaryContainer, shape = RoundedCornerShape(20.dp))
            .clip(RoundedCornerShape(10.dp))
            .clickable {

            }
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.question_mark),
            contentDescription = null,
            modifier = Modifier.weight(0.05f), androidx.compose.material3.MaterialTheme.colorScheme.primary
        )
        Text("Help Center", modifier = Modifier.weight(0.2f))
        Icon(
            painter = painterResource(id = R.drawable.arrow_right),
            contentDescription = null,
            modifier = Modifier.weight(0.05f),
            tint = androidx.compose.material3.MaterialTheme.colorScheme.primary
        )
    }

    Spacer(modifier = Modifier.height(15.dp))


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(MaterialTheme.colorScheme.onPrimaryContainer, shape = RoundedCornerShape(20.dp))
            .clip(RoundedCornerShape(10.dp))
            .clickable {

            }
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.log_out),
            contentDescription = null,
            modifier = Modifier.weight(0.05f), tint = androidx.compose.material3.MaterialTheme.colorScheme.primary
        )
        Text("Logout", modifier = Modifier.weight(0.2f))
        Icon(
            painter = painterResource(id = R.drawable.arrow_right),
            contentDescription = null,
            modifier = Modifier.weight(0.05f),
            tint = androidx.compose.material3.MaterialTheme.colorScheme.primary
        )
    }

}

