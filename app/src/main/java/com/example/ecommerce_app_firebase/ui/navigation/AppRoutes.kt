package com.example.ecommerce_app_firebase.ui.navigation
import androidx.navigation.NavType
import androidx.navigation.navArgument

interface AppRoutes{
    val route: String
}

object Home : AppRoutes {
    override val route = "home"
}

object ProductDetail : AppRoutes {
    override val route = "productDetail"

    private const val PRODUCT_ID = "productId"
    val routeWithArgs = "$route/{$PRODUCT_ID}"
    val arguments = listOf(
        navArgument(PRODUCT_ID) { type = NavType.IntType },
    )
}


object Splash : AppRoutes {
    override val route = "splash"
}


object Cart : AppRoutes {
    override val route = "cart"
}

object Profile : AppRoutes {
    override val route = "profile"
}


object SignUp : AppRoutes {
    override val route = "signUp"
}


object SignIn : AppRoutes {
    override val route = "signIn"
}

object Favorite : AppRoutes {
    override val route = "favorite"
}

object Payment : AppRoutes {
    override val route = "payment"
}



