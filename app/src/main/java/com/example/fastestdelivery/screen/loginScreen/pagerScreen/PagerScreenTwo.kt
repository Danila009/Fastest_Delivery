package com.example.fastestdelivery.screen.loginScreen.pagerScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.fastestdelivery.R
import com.example.fastestdelivery.navigation.Screen
import com.example.fastestdelivery.ui.theme.background

@Composable
fun PagerScreenTwo(
    navController: NavController
) {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(background)){
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {

            Image(
                painter = painterResource(id = R.drawable.illustration),
                contentDescription = null,
                modifier = Modifier
                    .padding(vertical = 50.dp)
                    .fillMaxWidth()
                    .height(480.dp)
            )

            Row(modifier = Modifier.padding(bottom = 80.dp)) {
               Button(
                   onClick = { navController.navigate(Screen.AuthorizationScreen.route) },
                   shape = AbsoluteRoundedCornerShape(20.dp),
                   colors = ButtonDefaults.buttonColors(
                       Color.White,
                   ),
                   modifier = Modifier.padding(end = 5.dp)
               ) {
                    Text(text = "Sign In")
               }
                Button(
                    onClick = { navController.navigate(Screen.RegistrationScreen.route) },
                    shape = AbsoluteRoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(
                        Color.White
                    ),
                    modifier = Modifier.padding(start = 5.dp)
                ) {
                    Text(text = "Sign Up")
                }
            }

            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp))
        }
    }


}