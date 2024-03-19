package com.example.recyclopays

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.recyclopays.ui.theme.RecyclopaysTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recyclopays.grafico.GraficoAparencia
import com.example.recyclopays.screens.Credito
import com.example.recyclopays.screens.Metrica
import com.example.recyclopays.screens.LoginScreen
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


                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ) {
                        composable(route = "login"){ LoginScreen(navController) }
                        composable(route = "credito"){ Credito(navController)}
                        composable(route = "metrica"){ Metrica(
                            navController = navController,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(605.dp),
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
                        )}

                    }
                }
            }
        }
    }
}