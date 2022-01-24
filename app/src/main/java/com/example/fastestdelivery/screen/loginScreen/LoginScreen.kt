package com.example.fastestdelivery.screen.loginScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.fastestdelivery.navigation.Screen
import com.example.fastestdelivery.screen.loginScreen.pagerScreen.PagerScreenOne
import com.example.fastestdelivery.screen.loginScreen.pagerScreen.PagerScreenTwo
import com.example.fastestdelivery.ui.theme.background
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@ExperimentalPagerApi
@Composable
fun LoginScreen(
    navController: NavController
) {
    val pagerState = rememberPagerState(pageCount = 2)

    Box(modifier = Modifier
        .fillMaxSize()
        .background(background)){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalPager(state = pagerState) {
                Box(modifier = Modifier.fillMaxSize()){
                    when(it){
                        0 -> PagerScreenOne()
                        1 -> PagerScreenTwo(navController)
                    }
                }
            }
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalPagerIndicator(pagerState = pagerState)

            Text(
                text = "Skip Authorization",
                modifier = Modifier
                    .padding(10.dp)
                    .clickable {navController.navigate(Screen.MainScreen.route)}
            )

            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(30.dp))
        }

    }

}