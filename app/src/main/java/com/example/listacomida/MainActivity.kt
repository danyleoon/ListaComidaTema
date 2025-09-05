package com.example.listacomida

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.listacomida.ui.theme.theme.ListaComidaTheme
import com.example.listacomida.ui.theme.view.MenuCardList
import com.example.listacomida_2025_i.data.DataSource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListaComidaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MenuApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuApp(modifier: Modifier = Modifier) {
    MenuCardList(
        DataSource().LoadPlatillos(),
        modifier
    )

}