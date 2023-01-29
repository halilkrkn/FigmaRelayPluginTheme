package com.example.figmarelayplugintheme

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.figmarelayplugintheme.actionbutton.ActionButton
import com.example.figmarelayplugintheme.actionbutton.Design
import com.example.figmarelayplugintheme.ui.theme.FigmaRelayPluginThemeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FigmaRelayPluginThemeTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    ActionButton(
                        modifier = Modifier
                            .fillMaxWidth(),
                        design = Design.Primary,
                        text ="Heello World",
                        onClick = {
                            Toast.makeText(applicationContext, "Hello World", Toast.LENGTH_SHORT).show()
                        }
                    )
                    Spacer(modifier = Modifier.padding(16.dp))
                    ActionButton(
                        modifier = Modifier
                            .fillMaxWidth(),
                        design = Design.Secondary,
                        text ="Merhaba Dünya",
                        onClick = {
                            Toast.makeText(applicationContext, "Merhaba Dünya", Toast.LENGTH_SHORT).show()
                        }
                    )
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FigmaRelayPluginThemeTheme {
        Greeting("Android")
    }
}