package com.example.recyclopays

import com.example.recyclopays.screens.Credito
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.recyclopays.ui.theme.RecyclopaysTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.recyclopays.grafico.GraficoAparencia


class CreditoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreditoScreen()
        }
    }
}

@Composable
fun CreditoScreen() {
    Credito()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CreditoScreen()
}