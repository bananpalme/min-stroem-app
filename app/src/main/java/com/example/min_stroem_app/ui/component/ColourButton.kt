package com.example.min_stroem_app.ui.component

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


@Composable
fun CreateColourButton(backgroundColor: Color, onColorChange: (Color) -> Unit) {

    Button(onClick = {onColorChange(Color.Red)}) {
        Text("colour")
    }
}
