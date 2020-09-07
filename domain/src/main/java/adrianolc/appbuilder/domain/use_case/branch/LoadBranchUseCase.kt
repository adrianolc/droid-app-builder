package adrianolc.appbuilder.domain.use_case.branch

import adrianolc.appbuilder.domain.Result
import adrianolc.appbuilder.domain.executeToResult
import adrianolc.appbuilder.domain.repository.BranchRepository
import adrianolc.appbuilder.model.Branch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoadBranchUseCase internal constructor(
    private val branchRepository: BranchRepository
) {
    suspend operator fun invoke(): Result<List<Branch>> {
        return withContext(Dispatchers.IO) {
            executeToResult { branchRepository.loadBranches() }
        }
    }
}