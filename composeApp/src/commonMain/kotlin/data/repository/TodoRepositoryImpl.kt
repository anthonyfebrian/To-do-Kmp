package data.repository

import data.local.datasource.TodoDataSource
import data.local.entity.TodoEntity
import domain.entity.Todo
import domain.repository.TodoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.datetime.Clock
import utils.mapper.toDomain

class TodoRepositoryImpl(
    private val dataSource: TodoDataSource,
) : TodoRepository {
    override suspend fun save(title: String, body: String) {
        val currentInstant = Clock.System.now()
        val todo = TodoEntity(
            id = 0,
            title = title,
            body = body,
            createDate = currentInstant.toEpochMilliseconds(),
        )

        dataSource.insert(todo)
    }

    override fun getAllTodos(): Flow<List<Todo>> = dataSource.getAll()
        .map { list ->
            list.map { it.toDomain() }
        }
}