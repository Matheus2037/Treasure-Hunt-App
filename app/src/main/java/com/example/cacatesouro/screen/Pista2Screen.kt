package com.example.cacatesouro.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Pista2Screen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Não tenho asas, mas sei voar",
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        )
        {
            Button(onClick = {
                navController.navigate("pista1") },
                modifier = Modifier.weight(1f)) {
                Text("Voltar")
            }
            Button(onClick = {
                navController.navigate("pista3") },
                modifier = Modifier.weight(1f)) {
                Text("Avançar")
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun PistaPreview2(){
//    PistaScreen(navController = rememberNavController())
//}