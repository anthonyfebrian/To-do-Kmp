package presentation.screen

import androidx.compose.material.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI
import presentation.state.ListTodoUiState
import presentation.viewmodel.ListTodoViewModel

@OptIn(KoinExperimentalAPI::class)
@Composable
fun ListTodoScreen(
    vm:ListTodoViewModel = koinViewModel(),
    onClick:()-> Unit,
) {
    val uiState by vm.uiState.collectAsState()

    ListTodoContent(uiState, onClick)
}

@Composable
private fun ListTodoContent(
    uiState:ListTodoUiState,
    onClick:()-> Unit,
) {
    if(uiState.todos.isEmpty()) {
        Text("Empty")
    } else {
    }
    Button(onClick = onClick) {
        Text("Click")
    }
}