package adrianolc.appbuilder.feature_repo.impl.domain.use_case

import adrianolc.appbuilder.domain.Result
import adrianolc.appbuilder.domain.executeToResult
import adrianolc.appbuilder.domain.model.Branch
import adrianolc.appbuilder.remote.api.data_source.BranchDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LoadBranchesUseCase @Inject constructor(
    private val branchDataSource: BranchDataSource
) {
    suspend operator fun invoke(page: Int): Result<List<Branch>> {
        return withContext(Dispatchers.IO) {
            executeToResult { branchDataSource.loadBranches(page) }
        }
    }
}