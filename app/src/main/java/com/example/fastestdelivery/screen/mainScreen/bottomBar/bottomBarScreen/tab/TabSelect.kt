package com.example.fastestdelivery.screen.mainScreen.bottomBar.bottomBarScreen.tab

import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.fastestdelivery.ui.theme.background

@Composable
fun TabSelect(selectedTabIndex:Int, onClick:(TabData)-> Unit) {

    TabRow(
        selectedTabIndex = selectedTabIndex,
        contentColor = background,
        backgroundColor = Color.White
    ) {
        TabData.values().forEachIndexed { index, tabData ->
            Tab(
                selected = selectedTabIndex == index,
                onClick = {
                    onClick(tabData)
                }, text = { Text(text = tabData.name, color = background)}
            )
        }
    }
}