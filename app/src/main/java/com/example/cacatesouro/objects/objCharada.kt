package com.example.cacatesouro.objects

import com.example.cacatesouro.R

val charadas = listOf(
    Charada(
        id = 1,
        pista1 = "Teste",
        pista2 = "Teste",
        pista3 = "Teste",
        imagemDir = R.drawable.baudeouro,
        resposta = "Teste",
        dificuldade = 1
    ),
    Charada(
        id = 2,
        pista1 = "Teste2",
        pista2 = "Teste2",
        pista3 = "Teste2",
        imagemDir = R.drawable.bauepico,
        resposta = "Teste2",
        dificuldade = 2
    ),
    Charada(
        id = 3,
        pista1 = "Teste3",
        pista2 = "Teste3",
        pista3 = "Teste3",
        imagemDir = R.drawable.baulendario,
        resposta = "Teste3",
        dificuldade = 3
    )
)

val charadaPadrao = charadas.first()