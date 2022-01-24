package com.example.fastestdelivery.screen.mainScreen.bottomBar

import androidx.compose.ui.graphics.Color
import com.example.fastestdelivery.R
import com.example.fastestdelivery.ui.theme.background

sealed class BottomBarData(
    val id:String,
    val title:String,
    val icon:Int,
    var color:Color
) {
    object Home:BottomBarData("home","Home", R.drawable.img, background)
    object Basket:BottomBarData("basket","Basket", R.drawable.shopping, Color.Gray)
    object Profile:BottomBarData("profile","Profile", R.drawable.user, Color.Gray)
    object History:BottomBarData("history","History", R.drawable.history, Color.Gray)
}

val listBottomBar = listOf(
    BottomBarData.Home,
    BottomBarData.Basket,
    BottomBarData.Profile,
    BottomBarData.History
)