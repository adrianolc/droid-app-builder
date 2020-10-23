package adrianolc.appbuilder.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
class Branch(
    val name: String,
    val sha: String,
    val author: Author
)