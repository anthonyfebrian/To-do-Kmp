import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.AnimatedPane
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffoldRole
import androidx.compose.material3.adaptive.navigation.rememberListDetailPaneScaffoldNavigator
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.resources.M3Theme
import presentation.screen.DetailTodoScreen
import presentation.screen.ListTodoScreen

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Preview
@Composable
fun App() {
    M3Theme {
        val navigator = rememberListDetailPaneScaffoldNavigator()
        ListDetailPaneScaffold(
            directive = navigator.scaffoldDirective,
            value = navigator.scaffoldValue,
            listPane = {
                ListTodoScreen(
                    onClick = {
                        navigator.navigateTo(ListDetailPaneScaffoldRole.Detail)
                    }
                )
            },
            detailPane = {
                AnimatedPane {
                    DetailTodoScreen()
                }
            }
        )
    }
}

@Preview
@Composable
fun preview() {
    Text("Test")
}