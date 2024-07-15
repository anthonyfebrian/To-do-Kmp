package data.local.db

import androidx.room.Room
import androidx.room.RoomDatabase
import platform.Foundation.NSHomeDirectory


fun getDataBaseBuilder(): RoomDatabase.Builder<TodoDatabase> {
    val dbFilePath = NSHomeDirectory() + "/${DATABASE_NAME}.db"
    return Room.databaseBuilder<TodoDatabase>(
        name = dbFilePath,
        factory =  { TodoDatabase::class.instantiateImpl() }
    )
}