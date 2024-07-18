package com.jeady.compose.ui.text

import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@androidx.compose.runtime.Composable
fun Tip(text: String, modifier: Modifier = Modifier, color: Color= Color.Gray) {
    Text(text, modifier, color=color)
}