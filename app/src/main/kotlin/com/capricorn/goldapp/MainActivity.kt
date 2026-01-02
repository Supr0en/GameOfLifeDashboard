package com.capricorn.goldapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.capricorn.goldapp.ui.theme.GOLDappTheme
import com.capricorn.goldapp.ui.components.Dashboard
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.capricorn.goldapp.ui.components.AnimatedLottie

class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      enableEdgeToEdge()
      setContent {
         Surface(color = Color.White, modifier = Modifier.fillMaxSize()) {
            Navigation()
         }
      }    
   }
}
@Composable
fun Navigation() {
   val navController = rememberNavController()
   NavHost(navController = navController, startDestination = "animated_lottie") {
      composable("animated_lottie") {
         AnimatedLottie(navController)
      }
      composable("dashboard") {
         Dashboard()
      }
   }
}
