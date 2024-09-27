package com.example.lengujaes.Nav_Leng

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.lenguajes.ui.HomeScreen


@Preview(showBackground = true)
@Composable
fun NaveGraph(navController: NavHostController) {
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("kotlin") { KotlinScreen(navController) }
        composable("java") { JavaScreen(navController) }
        composable("js") { JsScreen(navController) }
        composable("mysql") { MySQLScreen(navController) }
        composable("c++") { CScreen(navController) }
    }
}









