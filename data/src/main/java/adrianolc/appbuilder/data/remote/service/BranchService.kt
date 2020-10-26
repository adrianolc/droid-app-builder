package adrianolc.appbuilder.data.remote.service

import adrianolc.appbuilder.data.remote.dto.Branch
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BranchService {

    @GET("/repo/branches")
    suspend fun getBranches(@Query("page") page: Int): List<Branch>

    @GET("/repos/branches/{name}")
    suspend fun getBranch(@Path("name") name: String): Branch
}