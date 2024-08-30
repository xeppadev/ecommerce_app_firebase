package com.example.ecommerce_app_firebase



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.ecommerce_app_firebase.ui.navigation.BottomNavBar
import com.example.ecommerce_app_firebase.ui.navigation.NavigationHost
import com.example.ecommerce_app_firebase.ui.navigation.SignIn
import com.example.ecommerce_app_firebase.ui.navigation.SignUp
import com.example.ecommerce_app_firebase.ui.navigation.Splash
import com.example.ecommerce_app_firebase.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Main()

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Main( modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        val navController = rememberNavController()
        val bottomBarState = rememberSaveable {
            mutableStateOf(true)

        }
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        when (navBackStackEntry?.destination?.route) {
            SignIn.route, SignUp.route, Splash.route -> bottomBarState.value = false
            else -> bottomBarState.value = true
        }

        Scaffold(

            bottomBar = {
                if (bottomBarState.value) {
                    BottomNavBar(
                        navController = navController,
                        bottomBarState = bottomBarState,


                        )
                }
            }
        ) { paddingValues ->
            NavigationHost(
                modifier= Modifier.padding(paddingValues),
                navController = navController,

            )


        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        Main()

    }
}