package com.example.fastestdelivery.navigation.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.fastestdelivery.navigation.LAUNCHER_ROUTE
import com.example.fastestdelivery.navigation.ROUTE
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun Host(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = LAUNCHER_ROUTE,
        route = ROUTE,
        builder ={
            launcherNav(navHostController)
            loginNav(navHostController)
            mainNav(navHostController)
        }
    )
}