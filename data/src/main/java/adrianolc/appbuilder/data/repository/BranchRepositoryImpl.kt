package adrianolc.appbuilder.data.repository

import adrianolc.appbuilder.data.mapper.toModel
import adrianolc.appbuilder.data.remote.data_source.BranchDataSource
import adrianolc.appbuilder.domain.model.Branch
import adrianolc.appbuilder.domain.repository.BranchRepository

class BranchRepositoryImpl(
    private val dataSource: BranchDataSource
) : BranchRepository {

    override suspend fun loadBranches(page: Int): List<Branch> {
        return dataSource.getBranches(page).map {
            it.toModel()
        }
    }

    override suspend fun getBranch(name: String): Branch {
        return dataSource.getBranch(name).toModel()
    }
}