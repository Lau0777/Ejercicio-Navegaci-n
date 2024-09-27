package com.example.lengujaes.Nav_Leng

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lengujaes.R


@Composable
fun CScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .border(4.dp, Color.Blue)
            .padding(16.dp)
    ) {
        item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "C++",
                    modifier = Modifier.padding(16.dp),
                    fontFamily = FontFamily.Cursive
                )
                Image(
                    painter = painterResource(id = R.drawable.c),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "C++ es un lenguaje de programación de propósito general que extiende las capacidades de C al agregar nuevas características como la programación orientada a objetos. Desarrollado en 1979 por Bjarne Stroustrup, C++ fue diseñado para ofrecer un mayor control sobre los recursos del sistema, combinando la eficiencia de C con las ventajas de los lenguajes modernos.\n" +
                            "\n" +
                            "C++ permite a los programadores crear aplicaciones que van desde software de sistemas hasta videojuegos y aplicaciones de alto rendimiento, gracias a su capacidad para gestionar memoria y su flexibilidad.",
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = { navController.navigate("mysql") },
                ) {
                    Text("Anterior")
                }
                Button(
                    onClick = { navController.navigate("home") },
                ) {
                    Text("Inicio")
                }
            }
        }
    }
}