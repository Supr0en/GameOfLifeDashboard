package com.capricorn.goldapp.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment

@Composable
fun AnimatedLottie(navController: NavController) {
   LaunchedEffect(true) {
      delay(2000L)
      navController.navigate("dashboard")
   }
   Column(
      modifier = Modifier.fillMaxSize(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally
   ) {
      Text( text = "Welcome to Game of Life Dashboard" )
   }
}
