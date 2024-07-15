package domain.usecase.implementation

import domain.entity.Todo
import domain.repository.TodoRepository
import domain.usecase.GetTodosUseCase
import kotlinx.coroutines.flow.Flow

class GetTodosUseCaseImpl(
    private val repository: TodoRepository,
): GetTodosUseCase {
    override fun invoke(): Flow<List<Todo>> = repository.getAllTodos()
}