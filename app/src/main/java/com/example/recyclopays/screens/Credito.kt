package com.example.recyclopays.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recyclopays.grafico.GraficoAparencia


@Composable
fun Credito() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color.White)
            .padding(horizontal = 0.dp),

        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            contentAlignment = Alignment.Center


        ) {
            Text(
                text = "Seu histórico de créditos",
                fontSize = 18.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.SemiBold,
                style = TextStyle(com.example.recyclopays.ui.theme.Purple500),
                modifier = Modifier.padding(8.dp)
            )
        }

        Box(
            modifier = Modifier
                .padding(vertical = 8.dp, horizontal = 8.dp)
                .border(width = 2.dp, color = Color.Black),
            contentAlignment = Alignment.Center

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(
                    text = "10/03/2024",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(vertical = 8.dp, horizontal = 10.dp)
                        .align(Alignment.End)

                )
                Text(
                    text = "Você ganhou R\$ 0,10 em créditos.",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "Válido até 25/05/2024",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Gray,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(horizontal = 10.dp, vertical = 8.dp)
                        .align(Alignment.Start)
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp, horizontal = 8.dp)
                .border(width = 2.dp, color = Color.Black),
            contentAlignment = Alignment.Center

        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(
                    text = "10/03/2024",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(vertical = 8.dp, horizontal = 10.dp)
                        .align(Alignment.End)

                )
                Text(
                    text = "Você ganhou R\$ 0,23 em créditos.",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "Válido até 25/05/2024",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Gray,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(horizontal = 10.dp, vertical = 8.dp)
                        .align(Alignment.Start)
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp, horizontal = 8.dp)
                .border(width = 2.dp, color = Color.Black),
            contentAlignment = Alignment.Center

        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(
                    text = "11/03/2024",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(vertical = 8.dp, horizontal = 10.dp)
                        .align(Alignment.End)

                )
                Text(
                    text = "Você ganhou R\$ 0,15 em créditos.",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "Válido até 25/05/2024",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Gray,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(horizontal = 10.dp, vertical = 8.dp)
                        .align(Alignment.Start)
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp, horizontal = 8.dp)
                .border(width = 2.dp, color = Color.Black),
            contentAlignment = Alignment.Center

        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(
                    text = "11/03/2024",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(vertical = 8.dp, horizontal = 10.dp)
                        .align(Alignment.End)

                )
                Text(
                    text = "Você ganhou R\$ 2,21 em créditos.",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "Válido até 25/05/2024",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Gray,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(horizontal = 10.dp, vertical = 8.dp)
                        .align(Alignment.Start)
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp, horizontal = 8.dp)
                .border(width = 2.dp, color = Color.Black),
            contentAlignment = Alignment.Center

        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(
                    text = "12/03/2024",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(vertical = 8.dp, horizontal = 10.dp)
                        .align(Alignment.End)

                )
                Text(
                    text = "Você ganhou R\$ 3,50 em créditos.",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "Válido até 25/05/2024",
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Default,
                    color = Color.Gray,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(horizontal = 10.dp, vertical = 8.dp)
                        .align(Alignment.Start)
                )
            }
        }



        // box com os icones
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
                .background(color = com.example.recyclopays.ui.theme.Purple500),
            contentAlignment = Alignment.BottomCenter
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                ,
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Aqui você pode adicionar seus ícones horizontalmente
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home Icon",
                    modifier = Modifier.size(30.dp),
                    tint = Color.White
                )
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Favorite Icon",
                    modifier = Modifier.size(30.dp),
                    tint = Color.White
                )
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "Settings Icon",
                    modifier = Modifier.size(30.dp),
                    tint = Color.White
                )
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "Settings Icon",
                    modifier = Modifier.size(30.dp),
                    tint = Color.White
                )
            }
        }

        // final das boxes
    }


}



@Preview
@Composable
fun PreviewCredito() {
    Credito()
}



