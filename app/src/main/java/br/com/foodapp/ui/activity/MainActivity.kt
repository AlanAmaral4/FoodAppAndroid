package br.com.foodapp.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.foodapp.ui.screens.HomeScreen
import br.com.foodapp.ui.theme.FoodAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodAppTheme {
                App(
                    // Estudar isso
                    onFabClick = {
                        val intent = Intent(this, ProductFormActivity::class.java)
                        startActivity(intent)
                    }
                )
            }
        }
    }
}

@Composable
fun App(
    onFabClick: () -> Unit = {}
) {
    Scaffold(
        // Define o espaço que o componente vai ficar
        floatingActionButton = {

            // Esse é o componente
            FloatingActionButton(
                onClick = onFabClick
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null
                )
            }
        }
    ) { paddingValues ->
        HomeScreen(
            Modifier.padding(paddingValues)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AppPreview() {
    FoodAppTheme {
        App()
    }
}