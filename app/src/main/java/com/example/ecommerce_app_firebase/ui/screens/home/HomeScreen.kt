package com.example.ecommerce_app_firebase.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecommerce_app_firebase.ui.screens.home.components.ListProducts
import com.example.ecommerce_app_firebase.ui.screens.home.components.ProductCategory
import com.example.ecommerce_app_firebase.ui.screens.home.components.SearchBar
import com.example.ecommerce_app_firebase.ui.screens.home.components.TopAppBarHeader


@Composable
fun HomeRoute() {
    HomeScreen()
}


@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(MaterialTheme.colorScheme.onPrimary)
    ) {
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            TopAppBarHeader()
            Spacer(modifier = Modifier.padding(10.dp))
            SearchBar()
            Spacer(modifier = Modifier.padding(10.dp))
            ProductCategory()
            Spacer(modifier = Modifier.padding(10.dp))


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(460.dp)
            ) {
                ListProducts()
            }
        }
    }
}



@Preview
@Composable
fun TopAppBarHeaderPreview() {
    HomeScreen()
}