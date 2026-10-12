package br.com.foodapp.ui.praticando

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.foodapp.ui.theme.grayAtividade
import br.com.foodapp.ui.theme.greenAtividade
import br.com.foodapp.ui.theme.redAtividade

@Composable
fun LayOutAtividade() {
    Column(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Text(
            text = "PROMOÇÃO",
            color = Color.White,
            fontWeight = FontWeight(300),
            modifier = Modifier
                .background(color = redAtividade)
                .padding(3.dp)

        )
        Text(
            text = "Hambúrguer Artesanal",
            fontWeight = FontWeight(600),
            fontSize = 15.sp,
            modifier = Modifier
                .padding(top = 10.dp)
        )
        Text(
            text = "Pão brioche, blend 180g, queijo cheddar e bacon crocante",
            fontSize = 13.sp,
            modifier = Modifier
                .width(260.dp)
                .padding(bottom = 5.dp)
        )
        Row(
            modifier = Modifier
                .background(
                    color = grayAtividade
                )
                .padding(4.dp)
                .padding(3.dp)
                .width(270.dp)
        ) {
            Text(
                text = "R$ 34,90",
                color = Color.White,
                modifier = Modifier
                    .background(
                        color = greenAtividade
                    )
                    .padding(5.dp)
            )
            Text(
                text = "Categoria: Lanches",
                modifier = Modifier
                    .padding(start = 5.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LayOutAtividadePreview() {
    LayOutAtividade()
}