package adrianolc.appbuilder.remote.api.data_source

import adrianolc.appbuilder.domain.model.Branch

interface BranchDataSource {
    suspend fun loadBranches(page: Int): List<Branch>

    suspend fun getBranch(name: String): Branch
}