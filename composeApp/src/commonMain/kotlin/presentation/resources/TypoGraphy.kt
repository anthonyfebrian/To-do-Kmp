package presentation.resources

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun AppTypography() = Typography().run {
    val exoFamily = ExoFamily()
    val nunitoFamily = NunitoFamily()

    copy(
        displayLarge = displayLarge.copy(fontFamily = exoFamily),
        displayMedium = displayMedium.copy(fontFamily = exoFamily),
        displaySmall = displaySmall.copy(fontFamily = exoFamily),
        headlineLarge = headlineLarge.copy(
            fontSize = 24.sp,
            lineHeight = 32.sp,
            letterSpacing = 0.5.sp,
            fontFamily = exoFamily
        ),
        headlineMedium = headlineMedium.copy(
            fontSize = 20.sp,
            lineHeight = 24.sp,
            letterSpacing = (-0.25).sp,
            fontFamily = exoFamily
        ),
        headlineSmall = headlineSmall.copy(
            fontSize = 18.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.sp,
            fontFamily = exoFamily
        ),
        titleLarge = titleLarge.copy(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.sp,
            fontFamily = exoFamily,
            fontWeight = FontWeight.Bold
        ),
        titleMedium = titleMedium.copy(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.sp,
            fontFamily = exoFamily
        ),
        titleSmall = titleSmall.copy(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.sp,
            fontFamily = exoFamily
        ),
        bodyLarge = bodyLarge.copy(
            fontSize = 20.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.5.sp,
            fontFamily = nunitoFamily
        ),
        bodyMedium = bodyMedium.copy(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.75.sp,
            fontFamily = nunitoFamily
        ),
        bodySmall = bodySmall.copy(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 1.sp,
            fontFamily = nunitoFamily
        ),
        labelLarge = labelLarge.copy(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 1.sp,
            fontFamily = exoFamily,
            fontWeight = FontWeight.Bold
        ),
        labelMedium = labelMedium.copy(
            fontSize = 12.sp,
            lineHeight = 20.sp,
            letterSpacing = 1.sp,
            fontFamily = exoFamily
        ),
        labelSmall = labelSmall.copy(
            fontSize = 10.sp,
            lineHeight = 16.sp,
            letterSpacing = 1.25.sp,
            fontFamily = exoFamily,
            fontWeight = FontWeight.Normal
        )
    )
}

@Preview
@Composable
private fun Preview() {
    M3Theme {
        Column {
            Text(text = "displayLarge", style = MaterialTheme.typography.displayLarge)
//            Text(text = "displayMedium", style = AppTypography().displayMedium)
//            Text(text = "displaySmall", style = AppTypography().displaySmall)
//            Text(text = "headlineLarge", style = AppTypography().headlineLarge)
//            Text(text = "headlineMedium", style = AppTypography().headlineMedium)
//            Text(text = "headlineSmall", style = AppTypography().headlineSmall)
//            Text(text = "titleLarge", style = AppTypography().titleLarge)
//            Text(text = "titleMedium", style = AppTypography().titleMedium)
//            Text(text = "titleSmall", style = AppTypography().titleSmall)
//            Text(text = "bodyLarge", style = AppTypography().bodyLarge)
//            Text(text = "bodyMedium", style = AppTypography().bodyMedium)
//            Text(text = "bodySmall", style = AppTypography().bodySmall)
//            Text(text = "labelLarge", style = AppTypography().labelLarge)
//            Text(text = "labelMedium", style = AppTypography().labelMedium)
//            Text(text = "labelSmall", style = AppTypography().labelSmall)
        }
    }
}