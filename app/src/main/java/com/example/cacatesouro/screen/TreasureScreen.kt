package com.example.cacatesouro.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.cacatesouro.R

@Composable
fun TreasureScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Parabéns! Você encontrou o tesouro!",
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 6.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.baudeouro),
            contentDescription = "Imagem do Tesouro",
            modifier = Modifier
                .size(200.dp)
                .padding(16.dp)
        )

        Button(onClick = { navController.navigate("home") }) {
            Text("Recomeçar")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun TesouroPreview(){
    TreasureScreen(navController = rememberNavController())
}