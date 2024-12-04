/*package com.example.module1_kotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.module1_kotlin.ui.theme.Module1KOtlinTheme

@Composable
fun AsyncDataLoader(modifier: Modifier = Modifier)  {
    var data by remember { mutableStateOf("Loading...") }

    LaunchedEffect(Unit) {
        data = fetchData()
    }

    Text(
        text = data,
        style = MaterialTheme.typography.headlineSmall
    )
}

suspend fun fetchData(): String {
    delay(2000) // Simule un temps d'attente
    return "Données chargées"
}


@Preview(showBackground = true)
@Composable
fun AsyncDataLoaderPreview() {
    Tuto6Theme {
        AsyncDataLoader()
    }
}*/