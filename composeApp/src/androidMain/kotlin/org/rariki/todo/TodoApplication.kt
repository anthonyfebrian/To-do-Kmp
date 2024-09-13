package org.rariki.todo

import android.app.Application
import data.local.db.getDataBaseBuilder
import data.local.db.getRoomDatabase
import di.initKoin
import org.koin.android.ext.koin.androidContext

class TodoApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin(
            todoDatabase = getRoomDatabase(getDataBaseBuilder(applicationContext))
        ) {
            androidContext(this@TodoApplication)
        }
    }
}