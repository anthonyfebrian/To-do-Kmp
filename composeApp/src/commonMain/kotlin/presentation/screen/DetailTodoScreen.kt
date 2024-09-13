package presentation.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI
import presentation.viewmodel.ListTodoViewModel

@OptIn(KoinExperimentalAPI::class)
@Composable
fun DetailTodoScreen(
    vm:ListTodoViewModel = koinViewModel()
) {
    Text("Detail Screen¬")
}