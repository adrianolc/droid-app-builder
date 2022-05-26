package adrianolc.appbuilder.domain.repository

import adrianolc.appbuilder.domain.model.Branch

interface BranchRepository {
    suspend fun getBranch(name: String): Branch
}