package domain.usecase

import domain.entity.Todo
import kotlinx.coroutines.flow.Flow

interface GetTodosUseCase {
    operator fun invoke(): Flow<List<Todo>>
}