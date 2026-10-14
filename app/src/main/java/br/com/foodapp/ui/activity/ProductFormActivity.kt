package br.com.foodapp.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.foodapp.ui.screens.ProductFormScreen
import br.com.foodapp.ui.theme.FoodAppTheme

class ProductFormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodAppTheme() {
                ProductForm()
            }
        }
    }
}

@Composable
fun ProductForm(
    modifier: Modifier = Modifier
) {
    Scaffold() { innerPadding ->
        ProductFormScreen(
            modifier = Modifier
                .padding(innerPadding)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductFormPreview() {
    FoodAppTheme() {
        ProductForm()
    }
}