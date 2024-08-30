package com.example.ecommerce_app_firebase.ui.navigation


sealed class NavItemBottom(
    val title: String,
    val icon: Int,
    val selectedIcon: Int,
    val route: String,
) {
    data object Home : NavItemBottom(
        title = "Home",
        icon = com.example.ecommerce_app_firebase.R.drawable.solar_home_outline,
        selectedIcon = com.example.ecommerce_app_firebase.R.drawable.solar_home_bold,
        route = com.example.ecommerce_app_firebase.ui.navigation.Home.route,
    )

    data object Cart : NavItemBottom(
        title = "Cart",
        icon = com.example.ecommerce_app_firebase.R.drawable.shopping_bag_linear,
        selectedIcon = com.example.ecommerce_app_firebase.R.drawable.shopping_bag__bold,

        route = com.example.ecommerce_app_firebase.ui.navigation.Cart.route,
    )

    data object Favorite : NavItemBottom(
        title = "Favorite",
        icon = com.example.ecommerce_app_firebase.R.drawable.heart_linear,
        selectedIcon = com.example.ecommerce_app_firebase.R.drawable.heart_bold,
        route = com.example.ecommerce_app_firebase.ui.navigation.Favorite.route
    )

     data object Profile : NavItemBottom(
        title = "Profile",
        icon = com.example.ecommerce_app_firebase.R.drawable.profile_linear,
        selectedIcon = com.example.ecommerce_app_firebase.R.drawable.profile_bold,
        route = com.example.ecommerce_app_firebase.ui.navigation.Profile.route
    )

    companion object {
        val items = listOf(Home, Cart, Favorite, Profile)
    }
}