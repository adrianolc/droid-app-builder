package adrianolc.appbuilder.domain.repository

import adrianolc.appbuilder.model.Branch

interface BranchRepository {

    fun loadBranches(): List<Branch>

    fun getBranch(name: String): Branch
}