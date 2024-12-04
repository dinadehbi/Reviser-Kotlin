package com.example.module1_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.module1_kotlin.ui.theme.Module1KOtlinTheme
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.*

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Module1KOtlinTheme {
                AsyncDataLoader()  // Utilisation de AsyncDataLoader
            }
        }
    }
}

@Composable
fun AsyncDataLoader(modifier: Modifier = Modifier) {
    val data = remember { mutableStateOf("Loading...") }

    LaunchedEffect(Unit) {
        delay(5000)  // Simuler un délai de 5 secondes
        data.value = fetchData()
    }

    Text(
        text = data.value,
        style = MaterialTheme.typography.headlineSmall,
        modifier = modifier.fillMaxSize()  // Remplir tout l'écran
    )
}

suspend fun fetchData(): String {
    val currentTime = Calendar.getInstance()
    val formatter = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    return "Date et heure actuelles : ${formatter.format(currentTime.time)}"
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Module1KOtlinTheme {
        AsyncDataLoader()  // Utilisation dans la prévisualisation aussi
    }
}
