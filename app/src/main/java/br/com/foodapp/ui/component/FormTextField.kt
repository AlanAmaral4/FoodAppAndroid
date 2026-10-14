package br.com.foodapp.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.foodapp.ui.theme.FoodAppTheme

@Composable
fun FormTextField(
    modifier: Modifier = Modifier,
    text: String,
    onTextChange: (String) -> Unit,
    textPlaceholder: String,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default
) {
    TextField(
        modifier = modifier
            .fillMaxWidth(),
        value = text,
        onValueChange = { newText ->
            onTextChange(newText)
        },
        placeholder = {
            Text(
                text = textPlaceholder
            )
        },
        keyboardOptions = keyboardOptions
    )
}

@Preview
@Composable
private fun FormTextFieldPreview() {
    FoodAppTheme() {
        FormTextField(
            text = "",
            onTextChange = {},
            textPlaceholder = "Url"
        )
    }
}