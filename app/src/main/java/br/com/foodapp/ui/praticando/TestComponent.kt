package br.com.foodapp.ui.praticando

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.foodapp.ui.theme.FoodAppTheme

@Composable
fun PrimeiroCompose() {

    Column {
        Text(
            text = "Hello World!",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(
                    all = 16.dp
                )
                .background(
                    color = Color.Red
                )
        )

        Text(
            text = "Amaral",
            fontSize = 15.sp,
            modifier = Modifier
                .background(
                    color = Color.Yellow
                )
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun PrimeiroComposePrev() {
    PrimeiroCompose()
}


@Composable
fun ExemploLayoutLinha() {
    Row {
        Text(
            text = "Bem Vindo"
        )
        Text(
            text = "Alan"
        )
    }

}

@Preview(
    showBackground = true
)
@Composable
private fun ExemploLayoutLinhaPrev() {
    FoodAppTheme() {
        ExemploLayoutLinha()
    }
}