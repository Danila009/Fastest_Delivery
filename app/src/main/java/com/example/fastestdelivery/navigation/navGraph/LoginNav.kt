package com.example.fastestdelivery.navigation.navGraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.fastestdelivery.navigation.LOGIN_ROUTE
import com.example.fastestdelivery.navigation.Screen
import com.example.fastestdelivery.screen.loginScreen.AuthorizationScreen
import com.example.fastestdelivery.screen.loginScreen.LoginScreen
import com.example.fastestdelivery.screen.loginScreen.RegistrationScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
fun NavGraphBuilder.loginNav(
    navController: NavController
) {
    navigation(
        startDestination = Screen.LoginScreen.route,
        route = LOGIN_ROUTE,
        builder = {
            composable(Screen.LoginScreen.route){
                LoginScreen(navController)
            }
            composable(Screen.AuthorizationScreen.route){
                AuthorizationScreen(navController)
            }
            composable(Screen.RegistrationScreen.route){
                RegistrationScreen(navController)
            }
        }
    )
}