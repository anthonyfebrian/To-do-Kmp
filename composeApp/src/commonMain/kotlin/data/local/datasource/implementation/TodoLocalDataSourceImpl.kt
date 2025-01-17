package data.local.datasource.implementation

import data.local.dao.TodoDao
import data.local.datasource.TodoLocalDataSource
import data.local.entity.TodoEntity
import kotlinx.coroutines.flow.Flow

class TodoLocalDataSourceImpl(
    private val dao: TodoDao,
) : TodoLocalDataSource {
    override suspend fun insert(todo: TodoEntity) = dao.insert(todo)

    override fun getAll(): Flow<List<TodoEntity>> = dao.getAll()
}