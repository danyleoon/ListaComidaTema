package com.example.listacomida.ui.theme.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listacomida.R
import com.example.listacomida.model.Platillo

@Composable
fun MenuCard(
    platillo: Platillo,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth().padding(10.dp).fillMaxWidth(),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(20.dp)
        ) {

            Image(
                painter = painterResource(id = platillo.drawableResId),
                contentDescription = stringResource(id = platillo.nombreId),
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(25.dp))

            Column {

                Text(
                    text = stringResource(id = platillo.nombreId),
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )


                Text(
                    text = "$${platillo.precio}",
                    style = MaterialTheme.typography.bodyMedium
                )


                Text(
                    text = stringResource(id = platillo.ofertasId),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Blue,
                    fontWeight = FontWeight.Medium


                )
            }
        }
    }
}
