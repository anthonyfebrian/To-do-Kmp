package presentation.resources

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.ui.tooling.preview.Preview
import todo.composeapp.generated.resources.Res
import todo.composeapp.generated.resources.exo_black
import todo.composeapp.generated.resources.exo_black_italic
import todo.composeapp.generated.resources.exo_bold
import todo.composeapp.generated.resources.exo_bold_italic
import todo.composeapp.generated.resources.exo_extra_bold
import todo.composeapp.generated.resources.exo_extra_bold_italic
import todo.composeapp.generated.resources.exo_extra_light
import todo.composeapp.generated.resources.exo_extra_light_italic
import todo.composeapp.generated.resources.exo_italic
import todo.composeapp.generated.resources.exo_light
import todo.composeapp.generated.resources.exo_light_italic
import todo.composeapp.generated.resources.exo_medium
import todo.composeapp.generated.resources.exo_medium_italic
import todo.composeapp.generated.resources.exo_regular
import todo.composeapp.generated.resources.exo_semi_bold
import todo.composeapp.generated.resources.exo_semi_bold_italic
import todo.composeapp.generated.resources.nunito_black
import todo.composeapp.generated.resources.nunito_black_italic
import todo.composeapp.generated.resources.nunito_bold
import todo.composeapp.generated.resources.nunito_bold_italic
import todo.composeapp.generated.resources.nunito_extra_bold
import todo.composeapp.generated.resources.nunito_extra_bold_italic
import todo.composeapp.generated.resources.nunito_extra_light
import todo.composeapp.generated.resources.nunito_extra_light_italic
import todo.composeapp.generated.resources.nunito_italic
import todo.composeapp.generated.resources.nunito_light
import todo.composeapp.generated.resources.nunito_light_italic
import todo.composeapp.generated.resources.nunito_medium
import todo.composeapp.generated.resources.nunito_medium_italic
import todo.composeapp.generated.resources.nunito_regular
import todo.composeapp.generated.resources.nunito_semi_bold
import todo.composeapp.generated.resources.nunito_semi_bold_italic
import todo.composeapp.generated.resources.open_sans_regular

@Composable
fun DefaultFamily() = FontFamily(
    Font(Res.font.nunito_black, weight = FontWeight.Black),
    Font(Res.font.nunito_black_italic, FontWeight.Black, FontStyle.Italic),
    Font(Res.font.exo_bold, FontWeight.Bold),
    Font(Res.font.exo_bold_italic, FontWeight.Bold, FontStyle.Italic),
    Font(Res.font.exo_extra_bold, FontWeight.ExtraBold),
    Font(Res.font.exo_extra_bold_italic, FontWeight.ExtraBold, FontStyle.Italic),
    Font(Res.font.nunito_extra_light, FontWeight.ExtraLight),
    Font(Res.font.nunito_extra_light_italic, FontWeight.ExtraLight, FontStyle.Italic),
    Font(Res.font.nunito_italic, FontWeight.Normal, FontStyle.Italic),
    Font(Res.font.nunito_light, FontWeight.Light),
    Font(Res.font.nunito_light_italic, FontWeight.Light, FontStyle.Italic),
    Font(Res.font.nunito_medium, FontWeight.Medium),
    Font(Res.font.nunito_medium_italic, FontWeight.Medium, FontStyle.Italic),
    Font(Res.font.nunito_regular, FontWeight.Normal),
    Font(Res.font.exo_semi_bold, FontWeight.SemiBold),
    Font(Res.font.exo_semi_bold_italic, FontWeight.SemiBold, FontStyle.Italic),
)

@Composable
fun NunitoFamily() = FontFamily(
    Font(Res.font.nunito_black, FontWeight.Black),
    Font(Res.font.nunito_black_italic, FontWeight.Black, FontStyle.Italic),
    Font(Res.font.nunito_bold, FontWeight.Bold),
    Font(Res.font.nunito_bold_italic, FontWeight.Bold, FontStyle.Italic),
    Font(Res.font.nunito_extra_bold, FontWeight.ExtraBold),
    Font(Res.font.nunito_extra_bold_italic, FontWeight.ExtraBold, FontStyle.Italic),
    Font(Res.font.nunito_extra_light, FontWeight.ExtraLight),
    Font(Res.font.nunito_extra_light_italic, FontWeight.ExtraLight, FontStyle.Italic),
    Font(Res.font.nunito_italic, FontWeight.Normal, FontStyle.Italic),
    Font(Res.font.nunito_light, FontWeight.Light),
    Font(Res.font.nunito_light_italic, FontWeight.Light, FontStyle.Italic),
    Font(Res.font.nunito_medium, FontWeight.Medium),
    Font(Res.font.nunito_medium_italic, FontWeight.Medium, FontStyle.Italic),
    Font(Res.font.nunito_regular, FontWeight.Normal),
    Font(Res.font.nunito_semi_bold, FontWeight.SemiBold),
    Font(Res.font.nunito_semi_bold_italic, FontWeight.SemiBold, FontStyle.Italic),
)

@Composable
fun ExoFamily() = FontFamily(
    Font(Res.font.exo_black, FontWeight.Black),
    Font(Res.font.exo_black_italic, FontWeight.Black, FontStyle.Italic),
    Font(Res.font.exo_bold, FontWeight.Bold),
    Font(Res.font.exo_bold_italic, FontWeight.Bold, FontStyle.Italic),
    Font(Res.font.exo_extra_bold, FontWeight.ExtraBold),
    Font(Res.font.exo_extra_bold_italic, FontWeight.ExtraBold, FontStyle.Italic),
    Font(Res.font.exo_extra_light, FontWeight.ExtraLight),
    Font(Res.font.exo_extra_light_italic, FontWeight.ExtraLight, FontStyle.Italic),
    Font(Res.font.exo_italic, FontWeight.Normal, FontStyle.Italic),
    Font(Res.font.exo_light, FontWeight.Light),
    Font(Res.font.exo_light_italic, FontWeight.Light, FontStyle.Italic),
    Font(Res.font.exo_medium, FontWeight.Medium),
    Font(Res.font.exo_medium_italic, FontWeight.Medium, FontStyle.Italic),
    Font(Res.font.exo_regular, FontWeight.Normal),
    Font(Res.font.exo_semi_bold, FontWeight.SemiBold),
    Font(Res.font.exo_semi_bold_italic, FontWeight.SemiBold, FontStyle.Italic),
)

@Composable
fun OpenSansFamily() = FontFamily(
    Font(Res.font.open_sans_regular, FontWeight.Normal)
)

@Composable
@Preview
private fun Preview() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "Remitansi", fontFamily = DefaultFamily())
        Text(text = "Remitansi", fontFamily = ExoFamily())
        Text(text = "Remitansi", fontFamily = NunitoFamily())

        Text(text = "Remitansi", fontFamily = DefaultFamily(), fontWeight = FontWeight.Bold)
        Text(text = "Remitansi", fontFamily = ExoFamily(), fontWeight = FontWeight.Bold)
        Text(text = "Remitansi", fontFamily = NunitoFamily(), fontWeight = FontWeight.Bold)
    }
}