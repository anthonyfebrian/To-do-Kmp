package data.local.datasource.implementation

import data.local.dao.TodoDao
import data.local.datasource.TodoDataSource
import data.local.entity.TodoEntity
import kotlinx.coroutines.flow.Flow

class TodoDataSourceImplementation(
    private val dao: TodoDao,
) : TodoDataSource {
    override suspend fun insert(todo: TodoEntity) = dao.insert(todo)

    override fun getAll(): Flow<List<TodoEntity>> = dao.getAll()
}