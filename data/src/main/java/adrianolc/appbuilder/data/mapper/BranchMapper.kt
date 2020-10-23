package adrianolc.appbuilder.data.mapper

private typealias BranchDto = adrianolc.appbuilder.data.remote.dto.Branch
private typealias BranchModel = adrianolc.appbuilder.domain.model.Branch

fun BranchDto.toModel() = BranchModel(
    name = name,
    sha = sha,
    author = author.toModel()
)