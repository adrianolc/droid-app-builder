package adrianolc.appbuilder.data.repository

import adrianolc.appbuilder.domain.model.Branch
import adrianolc.appbuilder.domain.repository.BranchRepository

class BranchRepositoryImpl : BranchRepository {

    override suspend fun loadBranches(page: Int): List<Branch> {
        return emptyList()
    }

    override suspend fun getBranch(name: String): Branch {
        TODO()
    }
}