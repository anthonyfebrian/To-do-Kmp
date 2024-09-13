package di

import data.local.db.TodoDatabase
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(
    todoDatabase: TodoDatabase,
    config: KoinAppDeclaration? = null,
) {
    startKoin {
        config?.invoke(this)
        modules(TodoModules.modules(todoDatabase))
    }
}