package adrianolc.appbuilder.remote.impl.mapper

private typealias AuthorDto = adrianolc.appbuilder.remote.api.dto.Author
private typealias AuthorModel = adrianolc.appbuilder.domain.model.Author

fun AuthorDto.toModel() = AuthorModel(
    name = name
)