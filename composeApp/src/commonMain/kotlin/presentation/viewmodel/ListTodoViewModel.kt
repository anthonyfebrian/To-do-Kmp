package presentation.viewmodel

import androidx.lifecycle.ViewModel
import domain.usecase.GetTodosUseCase

class ListTodoViewModel(
    private val useCase: GetTodosUseCase,
): ViewModel() {
}