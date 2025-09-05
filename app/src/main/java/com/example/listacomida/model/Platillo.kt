package com.example.listacomida.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Platillo(
    @StringRes val nombreId: Int, val precio: Double,
    @StringRes val ofertasId:Int,
    @DrawableRes val drawableResId: Int,
)
