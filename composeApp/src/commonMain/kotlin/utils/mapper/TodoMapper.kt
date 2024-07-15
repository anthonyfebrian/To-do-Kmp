package utils.mapper

import data.local.entity.TodoEntity
import domain.entity.Todo


fun TodoEntity.toDomain(): Todo {
    return Todo(
        id = id,
        title = title,
        body = body,
        createDate = createDate,
    )
}