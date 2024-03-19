package com.example.recyclopays.screens

import android.graphics.Paint
import android.graphics.PointF
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.asAndroidPath
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.recyclopays.R
import com.example.recyclopays.grafico.GraficoAparencia

@Composable
fun Metrica(navController: NavHostController,
    modifier : Modifier,
    xValues: List<String> = diasDaSemana,
    yValues: List<Int>,
    points: List<Float>,
    paddingSpace: Dp,
    verticalStep: Int,
    graphAppearance: GraficoAparencia
) {
    val controlPoints1 = mutableListOf<PointF>()
    val controlPoints2 = mutableListOf<PointF>()
    val coordinates = mutableListOf<PointF>()
    val density = LocalDensity.current
    val textPaint = remember(density) {
        Paint().apply {
            color = graphAppearance.graphAxisColor.toArgb()
            textAlign = Paint.Align.CENTER
            textSize = density.run { 12.sp.toPx() }
        }
    }
    Column(
        modifier = Modifier

            .background(color = Color.White)
            .padding(horizontal = 0.dp),

        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Box(
            modifier = modifier
                .background(graphAppearance.backgroundColor)
                .padding(horizontal = 7.dp, vertical = 12.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            // Adicionando o texto superior
            Text(
                text = "Sua métrica semanal de reciclagem",
                style = TextStyle(color = graphAppearance.graphAxisColor, fontSize = 20.sp),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Canvas(
                modifier = Modifier.fillMaxSize().offset(y = 30.dp),
            ) {
                val xAxisSpace = (size.width - paddingSpace.toPx()) / (xValues.size + 1)
                val yAxisSpace = (size.height - 30.dp.toPx()) / yValues.size

                // Eixo x posicionamento e texto
                for (i in xValues.indices) {
                    drawContext.canvas.nativeCanvas.drawText(
                        xValues[i],
                        xAxisSpace * (i + 1),
                        size.height - 30.dp.toPx(),
                        textPaint
                    )
                }
                // Eixo y posicionamento e texto
                for (i in yValues.indices) {
                    drawContext.canvas.nativeCanvas.drawText(
                        "${yValues[i]}",
                        paddingSpace.toPx() / 2f,
                        size.height - yAxisSpace * (i + 1),
                        textPaint
                    )
                }
                // Posiciona as referencias do gráfico
                for (i in points.indices) {
                    val x1 = xAxisSpace * (i + 1)

                    val y1 = size.height - (yAxisSpace * (points[i] / verticalStep.toFloat()))
                    coordinates.add(PointF(x1, y1))
                    if (graphAppearance.isCircleVisible) {
                        drawCircle(
                            color = graphAppearance.circleColor,
                            radius = 10f,
                            center = Offset(x1, y1)
                        )
                    }
                }
                // Conecta os pontos
                for (i in 1 until coordinates.size) {
                    controlPoints1.add(
                        PointF(
                            (coordinates[i].x + coordinates[i - 1].x) / 2,
                            coordinates[i - 1].y
                        )
                    )
                    controlPoints2.add(
                        PointF(
                            (coordinates[i].x + coordinates[i - 1].x) / 2,
                            coordinates[i].y
                        )
                    )
                }
                // Faz o caminho do grafico
                val stroke = Path().apply {
                    reset()
                    moveTo(coordinates.first().x, coordinates.first().y)
                    for (i in 0 until coordinates.size - 1) {
                        cubicTo(
                            controlPoints1[i].x, controlPoints1[i].y,
                            controlPoints2[i].x, controlPoints2[i].y,
                            coordinates[i + 1].x, coordinates[i + 1].y
                        )
                    }
                }
                // faz com que a area embaixo do caminha seja preenchida com uma cor
                val fillPath = android.graphics.Path(stroke.asAndroidPath())
                    .asComposePath()
                    .apply {
                        lineTo(xAxisSpace * (xValues.size + 1), size.height - yAxisSpace)
                        lineTo(xAxisSpace, size.height - yAxisSpace)
                        close()
                    }
                if (graphAppearance.iscolorAreaUnderChart) {
                    drawPath(
                        fillPath,
                        brush = Brush.verticalGradient(
                            listOf(
                                graphAppearance.colorAreaUnderChart,
                                Color.Transparent,
                            ),
                            endY = size.height - yAxisSpace
                        ),
                    )
                }
                drawPath(
                    stroke,
                    color = graphAppearance.graphColor,
                    style = Stroke(
                        width = graphAppearance.graphThickness,
                        cap = StrokeCap.Round
                    )
                )
            }
        }

        // box com os icones
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
                .background(color = Color(0xFF13CB26)),
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
                    modifier = Modifier
                        .size(30.dp)
                        .clickable { navController.navigate("login") },
                    tint = Color.White
                )
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu Icon",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable { navController.navigate("metrica") },
                    tint = Color.White
                )
                Icon(
                    painter = painterResource(id = R.drawable.baseline_qr_code_scanner_24),
                    contentDescription = "Qr Code",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable { navController.navigate("qrcode") },
                    tint = Color.White
                )
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Account Circle",
                    modifier = Modifier.size(30.dp),
                    tint = Color.White
                )
            }
        }
    }
}


val diasDaSemana = listOf(
    "Domingo",
    "Segunda",
    "Terça",
    "Quarta",
    "Quinta",
    "Sexta",
    "Sábado"
)


