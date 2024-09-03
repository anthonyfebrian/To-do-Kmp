package presentation.resources

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

internal val AppLightColorScheme = lightColorScheme(
    primary = Primary70,
    onPrimary = Primary10,
    secondary = Secondary50,
    onSecondary = Secondary100,
    error = Error40,
    onError = Error100,
    background = Neutral100,
    onBackground = Neutral20,
    secondaryContainer = Primary70,
    onSecondaryContainer = Primary10,
    surface = Neutral100,
    onSurface = Neutral20,
    surfaceVariant = Neutral100,
    onSurfaceVariant = Neutral40,
    surfaceTint = Neutral100,
    surfaceContainerLow = Neutral100,
    outline = Neutral80,
    outlineVariant = Neutral95
)

@Composable
fun M3Theme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = AppLightColorScheme,
        typography = AppTypography(),
        shapes = shapes,
        content = content
    )
}

@Composable
fun EzeepasarTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = AppLightColorScheme,
        typography = AppTypography(),
        shapes = shapes,
        content = content
    )
}