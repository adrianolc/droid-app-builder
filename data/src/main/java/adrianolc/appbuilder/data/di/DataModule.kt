package adrianolc.appbuilder.data.di

import adrianolc.appbuilder.data.remote.service.BranchService
import adrianolc.appbuilder.data.repository.BranchDataSource
import adrianolc.appbuilder.data.repository.TagRepositoryImpl
import adrianolc.appbuilder.domain.repository.TagRepository
import org.koin.dsl.module
import retrofit2.Retrofit

private val repositories = module {
    single {
        BranchDataSource(get())
    }

    single<TagRepository> {
        TagRepositoryImpl()
    }
}

private val serviceModule = module {
    factory<BranchService> {
        get<Retrofit>().create(BranchService::class.java)
    }
}

val dataModules = listOf(
    repositories,
    serviceModule
)