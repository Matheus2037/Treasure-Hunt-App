package com.example.cacatesouro.objects

import androidx.annotation.DrawableRes

data class Charada(
    val id: Int,
    val pista1: String,
    val pista2: String,
    val pista3: String,
    val resposta: String,
    @DrawableRes val imagemDir: Int,
    val dificuldade: Int
)
