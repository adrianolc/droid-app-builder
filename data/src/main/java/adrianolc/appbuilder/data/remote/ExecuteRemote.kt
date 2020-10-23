package adrianolc.appbuilder.data.remote


import com.github.kittinunf.fuel.coroutines.awaitObjectResponseResult
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.serialization.kotlinxDeserializerOf

suspend inline fun <reified T : Any> executeHttpGet(
    path: String,
    params: List<Pair<String, Any?>>? = null
): T {
    val (_, _, result) = path
        .httpGet(params)
        .awaitObjectResponseResult<T>(kotlinxDeserializerOf())

    return result.fold(
        { data -> data },
        { error -> throw error.exception }
    )
}