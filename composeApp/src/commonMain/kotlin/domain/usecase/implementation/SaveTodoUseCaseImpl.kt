package domain.usecase.implementation

import domain.repository.TodoRepository
import domain.usecase.SaveTodoUseCase

class SaveTodoUseCaseImpl(
    private val repository: TodoRepository,
) : SaveTodoUseCase {
    override suspend fun invoke(title: String, body: String) =
        repository.save(title, body)
}