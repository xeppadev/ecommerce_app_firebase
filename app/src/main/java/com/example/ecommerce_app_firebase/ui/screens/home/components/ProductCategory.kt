package com.example.ecommerce_app_firebase.ui.screens.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductCategory() {

    val itemList = listOf(
        "All",
        "Clothes",
        "Shoes",
        "Electronics",

        )
    val categoryIconList = listOf<ImageVector>(
        Icons.Default.Home,
        Icons.Default.ShoppingCart,
        Icons.Default.Favorite,
        Icons.Default.AccountCircle,
    )
    val selectedStates = remember { mutableStateListOf(*Array(itemList.size) { false }) }


    LazyRow(
        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)

    ) {
        itemsIndexed(itemList) { index, item ->
            FilterChip(selected = selectedStates[index],
                onClick = { selectedStates[index] = !selectedStates[index] },
                label = { Text(text = item) },
                leadingIcon = {
                    Icon(imageVector = categoryIconList[index], contentDescription = null)
                })
        }

    }
}