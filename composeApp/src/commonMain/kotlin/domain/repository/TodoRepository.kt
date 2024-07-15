package domain.repository

import domain.entity.Todo
import kotlinx.coroutines.flow.Flow

interface TodoRepository {
    suspend fun save(
        title:String,
        body:String,
    )
    fun getAllTodos(): Flow<List<Todo>>
}