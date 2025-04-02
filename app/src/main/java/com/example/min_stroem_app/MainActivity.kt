package com.example.min_stroem_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.min_stroem_app.ui.theme.MinstroemappTheme
import com.example.min_stroem_app.ui.component.CreateColourButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MinstroemappTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var backgroundColor by remember { mutableStateOf(Color.White) }

    Column (modifier = Modifier.fillMaxSize().background(backgroundColor)) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        CreateColourButton(
            backgroundColor = backgroundColor,
            onColorChange = {newColor -> backgroundColor = newColor}
            )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MinstroemappTheme {
        Greeting("Android")
    }
}