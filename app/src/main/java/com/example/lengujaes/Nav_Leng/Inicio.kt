package com.example.lenguajes.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lengujaes.R





@Composable
fun HomeScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .border(4.dp, Color.Yellow)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(
                text = "Lenguajes De Programación",
                modifier = Modifier.padding(16.dp),
                fontFamily = FontFamily.Cursive
            )

            Image(
                painter = painterResource(id = R.drawable.fondo3),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)

            )

            Spacer(modifier = Modifier.height(16.dp))
        }

        // Botones para navegar entre pantallas de lenguajes
        item {
            Button(
                onClick = { navController.navigate("kotlin") },
            ) {
                Text("Kotlin")
            }
        }

        item {
            Button(
                onClick = { navController.navigate("java") },

            ) {
                Text("Java")
            }
        }

        item {
            Button(
                onClick = { navController.navigate("js") },

            ) {
                Text("JavaScript")
            }
        }

        item {
            Button(
                onClick = { navController.navigate("mysql") },

            ) {
                Text("MySQL")
            }
        }

        item {
            Button(
                onClick = { navController.navigate("c++") },
            ) {
                Text("C++")
            }
        }
    }
}



