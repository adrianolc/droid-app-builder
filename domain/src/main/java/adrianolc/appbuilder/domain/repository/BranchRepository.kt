package adrianolc.appbuilder.domain.repository

import adrianolc.appbuilder.model.Branch

interface BranchRepository {

    suspend fun loadBranches(page: Int): List<Branch>

    suspend fun getBranch(name: String): Branch
}