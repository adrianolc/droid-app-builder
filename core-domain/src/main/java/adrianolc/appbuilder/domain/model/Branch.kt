package adrianolc.appbuilder.domain.model


data class Branch(
    val name: String,
    val sha: String,
    val author: Author
)