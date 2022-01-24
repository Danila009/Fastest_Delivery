package com.example.fastestdelivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.fastestdelivery.navigation.navGraph.Host
import com.example.fastestdelivery.ui.theme.FastestDeliveryTheme
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FastestDeliveryTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Host(navHostController = rememberNavController())
                }
            }
        }
    }
}
