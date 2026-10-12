package br.com.foodapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.foodapp.sampledata.sampleProducts
import br.com.foodapp.sampledata.sampleSections
import br.com.foodapp.ui.component.ProductItemCard
import br.com.foodapp.ui.component.ProductSection
import br.com.foodapp.ui.component.SearchTextField
import br.com.foodapp.ui.theme.FoodAppTheme

@Composable
fun HomeScreen(modifier: Modifier) {
    var productSearchText by remember { mutableStateOf("") }

    val filteredProducts = remember(productSearchText) {
        sampleProducts.filter { product ->
            product.name.contains(productSearchText, ignoreCase = true) ||
                    product.description?.contains(productSearchText, ignoreCase = true) ?: false
        }
    }

    Column(
        modifier = modifier
    ) {
        SearchTextField(
            text = productSearchText,
            onTextChange = { newText ->
                productSearchText = newText
            }
        )
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {
            if (productSearchText.isBlank()) {
                for (section in sampleSections) {
                    val title = section.key
                    val products = section.value
                    item {
                        ProductSection(
                            title = title,
                            prods = products
                        )
                    }
                }
            } else {
                items(filteredProducts) { product ->
                    ProductItemCard(
                        product = product,
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    FoodAppTheme() {
        Scaffold { paddingValues ->
            HomeScreen(
                Modifier.padding(paddingValues)
            )
        }

    }
}