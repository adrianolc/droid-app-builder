package adrianolc.appbuilder.data.repository

import adrianolc.appbuilder.domain.model.Tag
import adrianolc.appbuilder.domain.repository.TagRepository

class TagRepositoryImpl : TagRepository {

    override fun loadTags(): List<Tag> {
        return emptyList()
    }

    override fun getTag(name: String): Tag {
        TODO()
    }
}