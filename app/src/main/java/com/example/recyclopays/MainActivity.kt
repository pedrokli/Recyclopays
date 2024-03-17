package com.example.recyclopays

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
import com.example.recyclopays.screens.Metrica
import com.example.recyclopays.ui.theme.RecyclopaysTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecyclopaysTheme {
                val yStep = 50
                val random = Random
                // utilizando pontos aleatórios
                /*val points = (0..9).map {
                    var num = random.nextInt(350)
                    if (num <= 50)
                        num += 100
                    num.toFloat()
                }
                 */
                //usando pontos fixos de métricas somente front end
                val points = listOf(250f,100f,250f,200f,200f,150f,220f);

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.DarkGray)
                ) {
                    Metrica(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(600.dp),
                        xValues = listOf("Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "     Domingo"),
                        yValues = (0..6).map { (it + 1) * yStep },
                        points = points,
                        paddingSpace = 16.dp,
                        verticalStep = yStep,
                        graphAppearance = GraficoAparencia(
                            Color.White,
                            MaterialTheme.colors.primary,
                            1f,
                            true,
                            Color.Green,
                            false,
                            MaterialTheme.colors.secondary,
                            MaterialTheme.colors.background
                        )
                    )
                }
            }
        }
    }
}