package adrianolc.appbuilder.domain

sealed class Result<out T> {

    class Success<out T>(val data: T) : Result<T>()

    class Error(val throwable: Throwable?) : Result<Nothing>()
}