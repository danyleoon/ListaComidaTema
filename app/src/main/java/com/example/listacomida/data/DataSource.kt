package com.example.listacomida_2025_i.data

import android.content.res.Resources
import com.example.listacomida.R
import com.example.listacomida.model.Platillo


class DataSource() {
    fun LoadPlatillos(): List<Platillo>{

        return listOf<Platillo>(
            Platillo( nombreId = R.string.desayuno,
                precio = 250.0,
                ofertasId = R.string.oferta_desayuno,
                drawableResId = R.drawable.desayuno
            ),
            Platillo(nombreId = R.string.hamburguer,
                precio = 150.0,
                ofertasId = R.string.oferta_hamburger,
                drawableResId = R.drawable.hamburger),

            Platillo( nombreId = R.string.pozole,
                precio = 200.0,
                ofertasId = R.string.oferta_pozole,
                drawableResId = R.drawable.pozole
            ),
            Platillo(nombreId = R.string.pizza,
                precio = 180.0,
                ofertasId = R.string.oferta_pizza,
                drawableResId = R.drawable.pizza),

            Platillo(nombreId = R.string.tacos,
                precio = 100.0,
                ofertasId = R.string.oferta_tacos,
                drawableResId = R.drawable.tacos),

            Platillo(nombreId = R.string.postre,
            precio = 120.0,
            ofertasId = R.string.oferta_postre,
            drawableResId = R.drawable.postre)
        )
    }

}