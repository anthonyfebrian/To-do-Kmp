package org.rariki.todo

import android.app.Application
import di.initKoin
import org.koin.android.ext.koin.androidContext

class TodoApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@TodoApplication)
        }
    }
}