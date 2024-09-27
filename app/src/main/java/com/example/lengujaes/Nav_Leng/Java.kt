package com.example.lengujaes.Nav_Leng

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lengujaes.R


@Composable
fun JavaScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .border(4.dp, Color.Red)
            .padding(16.dp)
    ) {
        item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Java",
                    modifier = Modifier.padding(16.dp),
                    fontFamily = FontFamily.Cursive

                )
                Image(
                    painter = painterResource(id = R.drawable.java),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "Java es un lenguaje de programación multiplataforma orientado a objetos que se ejecuta en miles de millones de dispositivos de todo el mundo. Sustenta aplicaciones, sistemas operativos de smartphones, software empresarial y muchos programas conocidos. A pesar de haberse inventado hace más de 20 años, Java es actualmente el lenguaje de programación más popular para los desarrolladores de aplicaciones.",
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
                    onClick = { navController.navigate("kotlin") },
                ) {
                    Text("Anterior")
                }
                Button(
                    onClick = { navController.navigate("js") },
                ) {
                    Text("Siguiente")
                }
            }
        }
    }
}
