package com.example.realestate.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.goodnotes.ui.theme.screens.about.AboutScreen
import com.example.goodnotes.ui.theme.screens.home.HomeScreen
import com.example.goodnotes.ui.theme.screens.signup.SignupScreen
import com.example.goodnotes.ui.theme.screens.splash.SplashScreen
import com.example.realestate.ui.theme.screens.login.LoginScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }



        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }





        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }

        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }



    }
}

fun propertyScreen(navController: NavHostController) {

}
