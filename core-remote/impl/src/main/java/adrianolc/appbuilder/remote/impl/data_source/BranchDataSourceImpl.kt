package adrianolc.appbuilder.remote.impl.data_source

import adrianolc.appbuilder.domain.model.Branch
import adrianolc.appbuilder.remote.api.data_source.BranchDataSource
import adrianolc.appbuilder.remote.api.service.BranchService
import adrianolc.appbuilder.remote.impl.mapper.toModel

class BranchDataSourceImpl(
    private val service: BranchService
) : BranchDataSource {
    override suspend fun loadBranches(page: Int): List<Branch> {
        return service.getBranches(page).map {
            it.toModel()
        }
    }

    override suspend fun getBranch(name: String): Branch {
        return service.getBranch(name).toModel()
    }
}