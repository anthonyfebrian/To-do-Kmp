package di

import data.local.datasource.TodoLocalDataSource
import data.local.datasource.implementation.TodoLocalDataSourceImpl
import data.local.db.TodoDatabase
import data.repository.TodoRepositoryImpl
import domain.repository.TodoRepository
import domain.usecase.GetTodosUseCase
import domain.usecase.SaveTodoUseCase
import domain.usecase.implementation.GetTodosUseCaseImpl
import domain.usecase.implementation.SaveTodoUseCaseImpl
import org.koin.compose.viewmodel.dsl.viewModel
import org.koin.dsl.module
import presentation.viewmodel.DetailTodoViewModel
import presentation.viewmodel.ListTodoViewModel

object TodoModules {
    fun modules(
        todoDatabase: TodoDatabase,
    ) = module {
        /**
         * Data
         */
        single { todoDatabase.todoDao() }
        single<TodoLocalDataSource> { TodoLocalDataSourceImpl(get()) }

        /**
         * Domain
         */
        single<TodoRepository> { TodoRepositoryImpl(get()) }
        factory<GetTodosUseCase> { GetTodosUseCaseImpl(get()) }
        factory<SaveTodoUseCase> { SaveTodoUseCaseImpl(get()) }

        /**
         * Presentation
         */
        viewModel { ListTodoViewModel(get()) }
        viewModel { DetailTodoViewModel() }
    }
}