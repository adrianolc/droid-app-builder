package adrianolc.appbuilder.data.repository

import adrianolc.appbuilder.data.mapper.toModel
import adrianolc.appbuilder.data.remote.service.BranchService
import adrianolc.appbuilder.domain.model.Branch
import adrianolc.appbuilder.domain.repository.BranchRepository

class BranchRepositoryDataSource(
    private val service: BranchService
) {

    suspend fun loadBranches(page: Int): List<Branch> {
        return service.getBranches(page).map {
            it.toModel()
        }
    }

    suspend fun getBranch(name: String): Branch {
        return service.getBranch(name).toModel()
    }
}