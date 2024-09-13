package presentation.state

import domain.entity.Todo

data class ListTodoUiState(
    val todos:List<Todo> = listOf(),
)