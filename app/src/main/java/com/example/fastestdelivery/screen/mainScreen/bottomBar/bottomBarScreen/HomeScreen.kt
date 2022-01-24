package com.example.fastestdelivery.screen.mainScreen.bottomBar.bottomBarScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.fastestdelivery.screen.mainScreen.bottomBar.bottomBarScreen.tab.TabData
import com.example.fastestdelivery.screen.mainScreen.bottomBar.bottomBarScreen.tab.TabSelect
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch

@ExperimentalPagerApi
@Composable
fun HomeScreen() {

    val pagerState = rememberPagerState(pageCount = TabData.values().size)
    val scope = rememberCoroutineScope()
    Box(modifier = Modifier.fillMaxSize()){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            

            TabSelect(selectedTabIndex = pagerState.currentPage, onClick = {
                scope.launch {
                    pagerState.animateScrollToPage(it.ordinal)
                }
            })
        }

        Column(Modifier.fillMaxSize()) {
            HorizontalPager(state = pagerState) {
                Box(modifier = Modifier.fillMaxSize()){

                }
            }
        }
    }
}