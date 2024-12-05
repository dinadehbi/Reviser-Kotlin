package com.example.module1_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.module1_kotlin.ui.theme.Module1KOtlinTheme

/*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Module1KOtlinTheme {
                // App Content
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    InteractiveForm()
                }
            }
        }
    }
}

@Composable
fun InteractiveForm() {
    var name by remember { mutableStateOf("") }
    var isSubscribed by remember { mutableStateOf(false) }
    var message by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Votre nom") },
            modifier = Modifier.fillMaxWidth()
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = isSubscribed, onCheckedChange = { isSubscribed = it })
            Spacer(modifier = Modifier.width(8.dp))
            Text("Recevoir des notifications")
        }
        Button(
            onClick = {
                message = if (isSubscribed) "Bienvenue, $name !" else "Merci $name, cochez pour des notifications."
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Valider")
        }
        if (message.isNotEmpty()) {
            Text(
                text = message,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewFunction() {
        Module1KOtlinTheme {
            InteractiveForm()
        }
}
*/


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Module1KOtlinTheme {
                // App Content
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                        NameForm()
                }
            }
        }
    }

    @Composable
    fun NameForm(){
        Text(
            text = "Form"
        )

    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewFunction(){
        NameForm()
    }
}



