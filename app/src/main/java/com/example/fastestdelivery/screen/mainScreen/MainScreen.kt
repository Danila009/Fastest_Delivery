package com.example.fastestdelivery.screen.mainScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.fastestdelivery.screen.mainScreen.bottomBar.BottomBarData
import com.example.fastestdelivery.screen.mainScreen.bottomBar.bottomBarScreen.HomeScreen
import com.example.fastestdelivery.screen.mainScreen.bottomBar.listBottomBar
import com.example.fastestdelivery.ui.theme.background
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun MainScreen() {

    val idBottomBar = remember { mutableStateOf("home") }


    Scaffold(
        bottomBar = {
            BottomNavigation(backgroundColor = Color.White) {
                listBottomBar.forEach {  data ->
                    BottomNavigationItem(
                        selected = data.id == idBottomBar.value,
                        onClick = {
                            idBottomBar.value = data.id

                           when(idBottomBar.value){
                               "home" -> {
                                   BottomBarData.Home.color = background
                                   BottomBarData.Basket.color = Color.Gray
                                   BottomBarData.Profile.color = Color.Gray
                                   BottomBarData.History.color = Color.Gray
                               }
                               "basket" -> {
                                   BottomBarData.Home.color = Color.Gray
                                   BottomBarData.Basket.color = background
                                   BottomBarData.Profile.color = Color.Gray
                                   BottomBarData.History.color = Color.Gray
                               }
                               "profile" -> {
                                   BottomBarData.Home.color = Color.Gray
                                   BottomBarData.Basket.color = Color.Gray
                                   BottomBarData.Profile.color = background
                                   BottomBarData.History.color = Color.Gray
                               }
                               "history" -> {
                                   BottomBarData.Home.color = Color.Gray
                                   BottomBarData.Basket.color = Color.Gray
                                   BottomBarData.Profile.color = Color.Gray
                                   BottomBarData.History.color = background
                               }

                           }

                        }, label = {
                            Text(text = data.title, color = data.color)
                        }, icon = {
                            Icon(
                                painter = painterResource(id = data.icon),
                                contentDescription = null,
                                tint = data.color,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    )
                }
            }
        }, content = {
            LazyColumn(content = {
                item{
                    when(idBottomBar.value){
                        "home" -> HomeScreen()
                        "basket" -> {}
                        "profile" -> {}
                        "history" -> {}
                    }
                }
            })
        }
    )
}