package data.local.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

fun getDataBaseBuilder(context: Context): RoomDatabase.Builder<TodoDatabase> {
    val appContext = context.applicationContext
    val dbFile = appContext.getDatabasePath("${DATABASE_NAME}.db")
    return Room.databaseBuilder<TodoDatabase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}