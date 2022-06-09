package adrianolc.appbuilder.remote.impl.mapper

private typealias BranchDto = adrianolc.appbuilder.remote.api.dto.Branch
private typealias BranchModel = adrianolc.appbuilder.domain.model.Branch

internal fun BranchDto.toModel() = BranchModel(
    name = name,
    sha = sha,
    author = author.toModel()
)