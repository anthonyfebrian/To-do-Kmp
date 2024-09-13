package data.local.db

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import data.local.dao.TodoDao
import data.local.entity.TodoEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO

@Database(entities = [TodoEntity::class], version = 1)
@ConstructedBy(TodoDbCtor::class)
abstract class TodoDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}

const val DATABASE_NAME = "todo"
