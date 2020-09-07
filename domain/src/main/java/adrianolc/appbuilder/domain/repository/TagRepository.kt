package adrianolc.appbuilder.domain.repository

import adrianolc.appbuilder.model.Tag

interface TagRepository {

    fun loadTags(): List<Tag>

    fun getTag(name: String): Tag
}