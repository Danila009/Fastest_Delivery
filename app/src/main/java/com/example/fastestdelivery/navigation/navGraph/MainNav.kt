package com.example.fastestdelivery.navigation.navGraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.fastestdelivery.navigation.MAIN_ROUTE
import com.example.fastestdelivery.navigation.Screen
import com.example.fastestdelivery.screen.mainScreen.MainScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
fun  NavGraphBuilder.mainNav(
    navController: NavController
) {
    navigation(
        startDestination = Screen.MainScreen.route,
        route = MAIN_ROUTE,
        builder = {
            composable(Screen.MainScreen.route){
                MainScreen()
            }
        }
    )
}