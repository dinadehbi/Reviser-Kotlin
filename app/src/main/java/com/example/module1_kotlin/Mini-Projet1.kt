package com.example.module1_kotlin


import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.module1_kotlin.ui.theme.Module1KOtlinTheme
import android.net.Uri
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp


class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Module1KOtlinTheme {
                // App Content
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    CartVisite()
                }
            }
        }
    }

    @Composable
    fun CartVisite(){


    }


    @Composable
    fun WebSite() {
        val context = LocalContext.current // Récupérer le contexte actuel

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Dina Dehbi",
                style = TextStyle(fontSize = 24.sp)
            )
            Text(
                text = "My web site"
            )
            Button(
                onClick = {
                    val WebSiteIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
                    context.startActivity(WebSiteIntent) // Utiliser context.startActivity
                }
            ) {
                Text("Open Website")
            }
        }
    }



    @Preview(showBackground = true)
    @Composable
    fun PreviewFunction(){
          CartVisite()
    }
}