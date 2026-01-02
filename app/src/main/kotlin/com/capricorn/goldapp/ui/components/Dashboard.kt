package com.capricorn.goldapp.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.capricorn.goldapp.ui.components.Boxitem

@Composable
fun Dashboard() {
   Column (
      modifier = Modifier.fillMaxWidth()
   ) {
      Row(
         modifier = Modifier.fillMaxWidth()
      ) {
         Box(
            modifier = Modifier
            .weight(1.00f)
            .height(45.dp)
            .background(Color.Green)
         ) {
            Text("Welcome to Dashboard", modifier = Modifier.align(Alignment.Center))
         }
      }
      Row (
         modifier = Modifier.fillMaxWidth()
      ) {
         Boxitem(
            text = "Account name",
            backgroundColor = Color.Red,
            modifier = Modifier.weight(0.75f)
         )
         Boxitem(
            text = "Level",
            backgroundColor = Color.Blue,
            modifier = Modifier.weight(0.25f)
         )
      }
      Row (
         modifier = Modifier.fillMaxWidth()
      ) {
         Boxitem(
            text = "Skills/stats",
            height = 200.dp,
            backgroundColor = Color.Green,
            modifier = Modifier.weight(1.00f)
         )
      }
   }
}
