package adrianolc.appbuilder.data.mapper

private typealias AuthorDto = adrianolc.appbuilder.data.remote.dto.Author
private typealias AuthorModel = adrianolc.appbuilder.domain.model.Author

fun AuthorDto.toModel() = AuthorModel(
    name = name
)