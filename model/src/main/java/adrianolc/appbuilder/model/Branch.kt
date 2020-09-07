package adrianolc.appbuilder.model

data class Branch(
    val name: String,
    val sha: String,
    val author: Author
)