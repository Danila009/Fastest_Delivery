package com.example.fastestdelivery.screen.loginScreen.pagerScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.fastestdelivery.R
import com.example.fastestdelivery.ui.theme.background

@Composable
fun PagerScreenOne() {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(background)){
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {

            Image(
                painter = painterResource(id = R.drawable.ililustration),
                contentDescription = null,
                modifier = Modifier.padding(vertical = 50.dp).fillMaxSize()
            )

            Image(
                painter = painterResource(id = R.drawable.test),
                contentDescription = null,
                modifier = Modifier.padding(20.dp)
            )

            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp))
        }
    }
}