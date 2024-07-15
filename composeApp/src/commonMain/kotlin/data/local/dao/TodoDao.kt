package data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import data.local.entity.TodoEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {
    @Insert
    suspend fun insert(todo: TodoEntity)

    @Query("SELECT * FROM todo WHERE id = :id")
    fun get(id: Int): Flow<TodoEntity?>

    @Query("SELECT * FROM todo")
    fun getAll(): Flow<List<TodoEntity>>
}