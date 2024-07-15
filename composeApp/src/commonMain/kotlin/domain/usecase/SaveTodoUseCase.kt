package domain.usecase

interface SaveTodoUseCase {
    suspend operator fun invoke(
        title:String,
        body:String,
    )
}