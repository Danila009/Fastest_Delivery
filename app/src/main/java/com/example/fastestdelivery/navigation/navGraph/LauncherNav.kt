package com.example.fastestdelivery.navigation.navGraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.fastestdelivery.navigation.LAUNCHER_ROUTE
import com.example.fastestdelivery.navigation.Screen
import com.example.fastestdelivery.screen.launcherScreen.LauncherScreen

fun NavGraphBuilder.launcherNav(
    navController: NavController
) {
    navigation(
        startDestination = Screen.LauncherScreen.route,
        route = LAUNCHER_ROUTE,
        builder = {
            composable(Screen.LauncherScreen.route){
                LauncherScreen(navController)
            }
        }
    )
}