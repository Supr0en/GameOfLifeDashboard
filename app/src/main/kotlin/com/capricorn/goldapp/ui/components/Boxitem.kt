package com.capricorn.goldapp.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.Dp

@Composable
fun Boxitem(text: String, height: Dp = 75.dp, backgroundColor: Color = Color.Red, modifier: Modifier = Modifier) {
   Box(
      modifier = modifier
         .height(height)
         .background(
            shape = CutCornerShape(topStart = 15.dp, bottomEnd = 15.dp),
            color = backgroundColor
         )
         .padding(16.dp)
      
   ) {
      Text(text, modifier = Modifier.align(Alignment.Center))
   }

} 
