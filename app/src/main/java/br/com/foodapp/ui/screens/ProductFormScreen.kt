package br.com.foodapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.foodapp.model.Product
import br.com.foodapp.ui.component.FormTextField
import br.com.foodapp.ui.theme.FoodAppTheme
import coil3.compose.AsyncImage
import java.math.BigDecimal

@Composable
fun ProductFormScreen(
    modifier: Modifier = Modifier,
    onSave: (Product) -> Unit = {}
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(
                state = rememberScrollState()
            ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        Text(
            fontSize = 28.sp,
            text = "Criando o produto"
        )

        var url by remember { mutableStateOf("") }

        if (url.isNotBlank()) {
            AsyncImage(
                model = url,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
        }

        FormTextField(
            text = url,
            onTextChange = { newText ->
                url = newText
            },
            textPlaceholder = "Url da imagem",
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Next
            )
        )

        var name by remember { mutableStateOf("") }

        FormTextField(
            text = name,
            onTextChange = { newText ->
                name = newText
            },
            textPlaceholder = "Nome",
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words,
                imeAction = ImeAction.Next
            )
        )

        var price by remember { mutableStateOf("") }

        FormTextField(
            text = price,
            onTextChange = { newText ->
                price = newText
            },
            textPlaceholder = "Preço",
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal,
                imeAction = ImeAction.Next
            )
        )

        var description by remember { mutableStateOf("") }

        FormTextField(
            modifier = Modifier
                .heightIn(min = 100.dp),
            text = description,
            onTextChange = { newText ->
                description = newText
            },
            textPlaceholder = "Descrição"
        )

        Button(
            onClick = {
                val newProduct = Product(
                    image = url,
                    name = name,
                    price = BigDecimal(price),
                    description = description
                )
                onSave(newProduct)
            },
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(4.dp)
        ) {
            Text(
                fontSize = 14.sp,
                text = "Salvar"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductFormScreenPreview() {
    FoodAppTheme() {
        ProductFormScreen()
    }
}