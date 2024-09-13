package presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import domain.usecase.GetTodosUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import presentation.state.ListTodoUiState

class ListTodoViewModel(
    private val useCase: GetTodosUseCase,
): ViewModel() {
    private val _uiState = MutableStateFlow(ListTodoUiState())
    val uiState: StateFlow<ListTodoUiState> get() = _uiState

    init {
        viewModelScope.launch {
            useCase()
                .collect {
                    _uiState.update {
                        it.copy(todos = it.todos)
                    }
                }
        }
    }
}