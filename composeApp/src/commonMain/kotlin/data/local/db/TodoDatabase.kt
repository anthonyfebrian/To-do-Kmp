package data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import data.local.dao.TodoDao
import data.local.entity.TodoEntity

@Database(entities = [TodoEntity::class], version = 1)
abstract class TodoDatabase : RoomDatabase(), DB {
    abstract fun todoDao(): TodoDao
    override fun clearAllTables() {
        super.clearAllTables()
    }
}

// FIXME: Added a hack to resolve below issue:
// https://issuetracker.google.com/issues/342905180
interface DB {
    fun clearAllTables() {}
}

const val DATABASE_NAME = "todo"