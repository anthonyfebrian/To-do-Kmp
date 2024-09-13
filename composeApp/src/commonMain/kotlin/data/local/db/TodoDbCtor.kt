package data.local.db

import androidx.room.RoomDatabaseConstructor

expect object TodoDbCtor: RoomDatabaseConstructor<TodoDatabase>
