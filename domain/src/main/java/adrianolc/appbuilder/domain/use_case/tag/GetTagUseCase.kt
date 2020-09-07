package adrianolc.appbuilder.domain.use_case.tag

import adrianolc.appbuilder.domain.Result
import adrianolc.appbuilder.domain.executeToResult
import adrianolc.appbuilder.domain.repository.TagRepository
import adrianolc.appbuilder.model.Tag
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GetTagUseCase internal constructor(
    private val tagRepository: TagRepository
) {
    suspend operator fun invoke(name: String): Result<Tag> {
        return withContext(Dispatchers.IO) {
            executeToResult { tagRepository.getTag(name) }
        }
    }
}