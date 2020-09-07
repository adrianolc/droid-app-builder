package adrianolc.appbuilder.domain.repository

import adrianolc.appbuilder.model.Branch

interface BranchRepository {

    suspend fun loadBranches(): List<Branch>

    suspend fun getBranch(name: String): Branch
}