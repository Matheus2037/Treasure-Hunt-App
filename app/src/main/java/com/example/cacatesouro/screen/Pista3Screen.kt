package com.example.cacatesouro.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Pista3Screen(navController: NavController){

    var resposta by remember { mutableStateOf("") }
    var erro by remember { mutableStateOf(false) }

    val respostaCorreta = "pipa"

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Se me largarem, não subo,\n" +
                    "mas saio ao vento a brincar.",
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = resposta,
            onValueChange = { resposta = it },
            label = { Text("Digite sua resposta") },
            isError = erro,
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(
                capitalization = KeyboardCapitalization.Characters
            )
        )

        if (erro) {
            Text(text = "Resposta incorreta!", color = Color.Red, fontSize = 14.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        )
        {
            Button(onClick = {
                navController.navigate("pista2") },
                modifier = Modifier.weight(1f)) {
                Text("Voltar")
            }
            Button(onClick = {
                    if (resposta.trim().equals("PIPA", ignoreCase = true)) {
                        navController.navigate("tesouro")
                    } else {
                        erro = true
                    }
                },
                modifier = Modifier.weight(1f)) {
                Text("Avançar")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Pista3Preview(){
    Pista3Screen(navController = rememberNavController(), )
}