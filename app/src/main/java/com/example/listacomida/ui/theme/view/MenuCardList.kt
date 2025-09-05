package com.example.listacomida.ui.theme.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.listacomida.model.Platillo

@Composable
fun MenuCardList(platillos: List<Platillo>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(platillos) { platillo ->
            MenuCard(platillo = platillo)
        }
    }
}