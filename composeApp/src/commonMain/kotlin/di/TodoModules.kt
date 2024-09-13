package di

import org.koin.compose.viewmodel.dsl.viewModel
import org.koin.dsl.module
import presentation.viewmodel.DetailTodoViewModel
import presentation.viewmodel.ListTodoViewModel

object TodoModules {
    fun modules() = module {

        viewModel { ListTodoViewModel() }
        viewModel { DetailTodoViewModel() }
    }
}