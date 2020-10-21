package adrianolc.appbuilder.domain.use_case.branch

import adrianolc.appbuilder.domain.DomainDispatchers
import adrianolc.appbuilder.domain.Result
import adrianolc.appbuilder.domain.executeToResult
import adrianolc.appbuilder.domain.repository.BranchRepository
import adrianolc.appbuilder.model.Branch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GetBranchUseCase internal constructor(
    private val dispatchers: DomainDispatchers,
    private val branchRepository: BranchRepository
) {
    suspend operator fun invoke(name: String): Result<Branch> {
        return withContext(dispatchers.io) {
            executeToResult { branchRepository.getBranch(name) }
        }
    }
}