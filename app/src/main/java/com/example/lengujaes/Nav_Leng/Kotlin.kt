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
fun KotlinScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .border(2.dp, Color.Gray)
            .padding(16.dp)
    ) {
        item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Kotlin",
                    modifier = Modifier.padding(16.dp),
                    fontFamily  = FontFamily.Cursive
                )
                Image(
                    painter = painterResource(id = R.drawable.kotlin),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "Kotlin es un lenguaje de programación de código abierto creado por JetBrains que se ha popularizado gracias a que se puede utilizar para programar aplicaciones Android.\n" +
                            "\n" +
                            "Este lenguaje es de tipado estático, ya que se puede desarrollar sobre JVM o JavaScript; o desde hace unos meses, incluso sin necesidad de ninguna de ellas, ya que paralelamente se está desarrollando en nativo con LLVM. Gracias a eso, es totalmente interoperable con código Java, lo que permite migrar de una forma gradual nuestros proyectos.",
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
                    onClick = { navController.navigate("home") },
                ) {
                    Text("Inicio")
                }
                Button(
                    onClick = { navController.navigate("java") },
                ) {
                    Text("Siguiente")
                }
            }
        }
    }
}




