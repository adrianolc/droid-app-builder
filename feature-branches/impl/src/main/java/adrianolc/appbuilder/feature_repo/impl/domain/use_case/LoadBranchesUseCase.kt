package adrianolc.appbuilder.feature_repo.impl.domain.use_case

import adrianolc.appbuilder.domain.DomainDispatchers
import adrianolc.appbuilder.domain.Result
import adrianolc.appbuilder.domain.executeToResult
import adrianolc.appbuilder.domain.model.Branch
import adrianolc.appbuilder.remote.api.data_source.BranchDataSource
import kotlinx.coroutines.withContext

class LoadBranchesUseCase internal constructor(
    private val dispatchers: DomainDispatchers,
    private val branchDataSource: BranchDataSource
) {
    suspend operator fun invoke(page: Int): Result<List<Branch>> {
        return withContext(dispatchers.io) {
            executeToResult { branchDataSource.loadBranches(page) }
        }
    }
}