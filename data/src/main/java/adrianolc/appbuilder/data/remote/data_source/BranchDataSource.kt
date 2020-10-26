package adrianolc.appbuilder.data.remote.data_source

import adrianolc.appbuilder.data.remote.executeHttpGet
import adrianolc.appbuilder.data.remote.dto.Branch

class BranchDataSource {

    suspend fun getBranches(page: Int): Array<Branch> {
        return executeHttpGet(
            path = "/repo/branches",
            params = listOf(
                Pair("page", page)
            )
        )
    }

    suspend fun getBranch(name: String): Branch {
        return executeHttpGet("/branches/$name")
    }
}