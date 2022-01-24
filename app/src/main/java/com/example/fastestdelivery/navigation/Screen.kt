package com.example.fastestdelivery.navigation

const val ROUTE = "route"
const val LAUNCHER_ROUTE = "launcher_route"
const val LOGIN_ROUTE = "login_route"
const val MAIN_ROUTE = "main_route"

sealed class Screen(val route:String){
    object LauncherScreen:Screen("launcher_screen")
    object LoginScreen:Screen("login_screen")
    object AuthorizationScreen:Screen("authorization_screen")
    object RegistrationScreen:Screen("registration_screen")
    object MainScreen:Screen("main_screen")
}
