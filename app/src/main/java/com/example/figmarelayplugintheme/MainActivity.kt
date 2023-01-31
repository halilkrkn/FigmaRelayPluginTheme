package com.example.figmarelayplugintheme

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.figmarelayplugintheme.actionbutton.ActionButton
import com.example.figmarelayplugintheme.background.Background
import com.example.figmarelayplugintheme.figma.Figma
import com.example.figmarelayplugintheme.figma.IconFigma
import com.example.figmarelayplugintheme.hellorelay.HelloRelay
import com.example.figmarelayplugintheme.socialmedia.Design
import com.example.figmarelayplugintheme.socialmedia.SocialMedia
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
                        .padding(36.dp)
                ) {
                    Row {
                        HelloRelay(text = "Selam Ben Relay, Naber?", textColor = Color.Black)
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 36.dp),
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        Background(text = "Background", textColor = Color.Magenta)
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 36.dp),
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        Figma(
                            iconImageContent = painterResource(id = R.drawable.figma_icon_figma),
                            text = "Figma",
                            textColor = Color.Black
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 24.dp, bottom = 36.dp),
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        ActionButton(
                            text = "Hello Relay",
                            onClick = {
                                Toast.makeText(this@MainActivity,
                                    "Hello Relay, Tıklandı!!",
                                    Toast.LENGTH_SHORT).show()
                            }

                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 24.dp),
                        horizontalArrangement = Arrangement.Center,
                    ) {

                        SocialMedia(
                            modifier = Modifier.padding(end = 16.dp),
                            design = Design.Facebook,
                            icon = painterResource(id = R.drawable.social_media_icon_facebook),
                            text = "Facebook",
                            textColor = Color.Blue,
                            onClick = {
                                Toast.makeText(this@MainActivity,
                                    "Facebook, Tıklandı!!",
                                    Toast.LENGTH_SHORT).show()
                            }
                        )

                        SocialMedia(
                            modifier = Modifier.padding(end = 16.dp),
                            design = Design.Google,
                            icon = painterResource(id = R.drawable.social_media_icon_google),
                            text = "Google",
                            textColor = Color.Green,
                            onClick = {
                                Toast.makeText(this@MainActivity,
                                    "Google, Tıklandı!!",
                                    Toast.LENGTH_SHORT).show()
                            }
                        )

                        SocialMedia(
                            modifier = Modifier.padding(end = 16.dp),
                            design = Design.Linkedin,
                            icon = painterResource(id = R.drawable.social_media_icon_linkedin),
                            text = "Linkedin",
                            textColor = Color.Yellow,
                            onClick = {
                                Toast.makeText(this@MainActivity,
                                    "Linkedin, Tıklandı!!",
                                    Toast.LENGTH_SHORT).show()
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
}