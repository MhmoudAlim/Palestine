package mahmoud.alim.palestine.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import mahmoud.alim.palestine.ui.theme.Green
import mahmoud.alim.palestine.ui.theme.PalestineTheme
import mahmoud.alim.palestine.ui.theme.Red

/**
 * @author Mahmoud Alim on 17/10/2023.
 */

@Composable
fun PalestineFlag(text: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = Modifier
            .background(Color.Black)
            .weight(1f)
            .fillMaxWidth())
        Box(modifier = Modifier
            .background(Color.White)
            .weight(1f)
            .fillMaxWidth())
        Box(modifier = Modifier
            .background(Green)
            .weight(1f)
            .fillMaxWidth()){
            Text(
                text = text,
                modifier = Modifier.align(Alignment.Center),
                color = Color.White,
                fontSize = 22.sp
            )
        }
    }
    Spacer(modifier = Modifier
        .fillMaxSize()
        .drawBehind {
           val path = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width / 3f , size.height /2f)
                lineTo(0f, size.height)
            }
            drawPath(path , color = Red , style = Fill)
        })

}



@Preview
@Composable
fun PalestineFlagPreview() {
    PalestineTheme {
        PalestineFlag("Free Palestine")
    }
}