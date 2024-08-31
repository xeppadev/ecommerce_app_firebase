package com.example.ecommerce_app_firebase.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ecommerce_app_firebase.ui.screens.cart.CartRoute
import com.example.ecommerce_app_firebase.ui.screens.home.HomeRoute


@Composable
fun NavigationHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(navController, startDestination = Home.route, modifier = modifier) {
        composable(Home.route) {
            HomeRoute()

        }
        composable(Cart.route) {
            CartRoute()
        }
        composable(Favorite.route) {

        }
        composable(Profile.route) {

        }
    }
}