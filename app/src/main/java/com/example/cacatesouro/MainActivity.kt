package com.example.cacatesouro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cacatesouro.objects.charadaPadrao
import com.example.cacatesouro.screen.HomeScreen
import com.example.cacatesouro.screen.Pista1Screen
import com.example.cacatesouro.screen.Pista2Screen
import com.example.cacatesouro.screen.Pista3Screen
import com.example.cacatesouro.screen.TreasureScreen
import com.example.cacatesouro.ui.theme.CacaTesouroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CacaTesouroTheme {
                cacaTesouro()
            }
        }
    }

    @Composable
    fun cacaTesouro(){
        val navController = rememberNavController()
        var charadaAtual by remember { mutableStateOf(charadaPadrao) }

            NavHost(
                navController = navController,
                startDestination = "home"
            ) {
                composable(
                    route = "home",
                    enterTransition = { fadeIn(animationSpec = tween(500)) },
                    exitTransition = { fadeOut(animationSpec = tween(500)) }
                ) {
                    HomeScreen(navController)
                }

                composable(
                    route = "pista1",
                    enterTransition = { fadeIn(animationSpec = tween(500)) },
                    exitTransition = { fadeOut(animationSpec = tween(500)) }
                ){
                    Pista1Screen(navController)

                }
                composable(
                    route = "pista2",
                    enterTransition = { fadeIn(animationSpec = tween(500)) },
                    exitTransition = { fadeOut(animationSpec = tween(500)) }
                ){
                    Pista2Screen(navController)

                }
                composable(
                    route = "pista3",
                    enterTransition = { fadeIn(animationSpec = tween(500)) },
                    exitTransition = { fadeOut(animationSpec = tween(500)) }
                ){
                    Pista3Screen(navController)

                }
                composable(
                    route = "tesouro",
                    enterTransition = { fadeIn(animationSpec = tween(500)) },
                    exitTransition = { fadeOut(animationSpec = tween(500)) }
                ){
                    TreasureScreen(navController)

                }
            }


//        NavHost(navController = navController, startDestination = "home") {
//            composable("home") { HomeScreen(navController) }
//            composable("pista1") { Pista1Screen(navController) }
//            composable("pista2") { Pista2Screen(navController) }
//            composable("pista3") { Pista3Screen(navController) }
//            composable("tesouro") { TreasureScreen(navController) }
//        }
    }
}