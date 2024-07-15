package domain.entity

data class Todo(
    val id:Long,
    val title: String,
    val body: String,
    val createDate: Long,
)
