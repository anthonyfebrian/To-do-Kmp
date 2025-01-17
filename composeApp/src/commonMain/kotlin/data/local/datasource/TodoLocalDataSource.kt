package data.local.datasource

import data.local.entity.TodoEntity
import kotlinx.coroutines.flow.Flow

interface TodoLocalDataSource {
    suspend fun insert(todo: TodoEntity)

    fun getAll(): Flow<List<TodoEntity>>
}