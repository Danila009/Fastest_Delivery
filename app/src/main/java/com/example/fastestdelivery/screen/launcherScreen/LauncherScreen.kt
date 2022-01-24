package com.example.fastestdelivery.screen.launcherScreen

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.CountDownTimer
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fastestdelivery.R
import com.example.fastestdelivery.navigation.LOGIN_ROUTE
import com.example.fastestdelivery.ui.theme.background

@Composable
fun LauncherScreen(
    navController: NavController
) {
    val width = LocalConfiguration.current.screenWidthDp
    val height = LocalConfiguration.current.screenHeightDp

    val bitmap = BitmapFactory.decodeResource(LocalContext.current.resources,R.drawable.launcher)
    val scaledBitmap = Bitmap.createScaledBitmap(bitmap,width,height,false)

    val time = object: CountDownTimer(3000,3000){
        override fun onTick(p0: Long) {

        }

        override fun onFinish() {
            navController.navigate(LOGIN_ROUTE)
        }

    }

    time.start()

    Box(
        modifier = Modifier.fillMaxSize(),
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                bitmap = scaledBitmap.asImageBitmap(),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.ellipse),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.cooking),
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(15.dp),
                    )
                    Text(
                        text = "WSR Food",
                        fontSize = 32.sp,
                        modifier = Modifier.padding(10.dp),
                    )
                    CircularProgressIndicator( color = background)
                }
            }
        }
    }
}