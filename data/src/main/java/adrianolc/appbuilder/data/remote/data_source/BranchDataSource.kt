package adrianolc.appbuilder.data.remote.data_source

import adrianolc.appbuilder.data.remote.dto.Branch
import com.github.kittinunf.fuel.coroutines.awaitObjectResponseResult
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.serialization.kotlinxDeserializerOf

class BranchDataSource {

    suspend fun getBranches(page: Int): List<Branch> {
        val (_, _, result) = "/repo/branches"
            .httpGet(
                parameters = listOf(
                    Pair("page", page)
                )
            )
            .awaitObjectResponseResult<List<Branch>>(kotlinxDeserializerOf())

        return result.fold(
            { data -> data },
            { error -> throw error.exception }
        )
    }

    suspend fun getBranch(name: String): Branch {
        val (_, _, result) = "/branches/$name"
            .httpGet()
            .awaitObjectResponseResult<Branch>(kotlinxDeserializerOf())

        return result.fold(
            { data -> data },
            { error -> throw error.exception }
        )
    }
}