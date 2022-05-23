package adrianolc.appbuilder.data.di

import adrianolc.appbuilder.data.repository.BranchRepositoryImpl
import adrianolc.appbuilder.data.repository.TagRepositoryImpl
import adrianolc.appbuilder.domain.repository.BranchRepository
import adrianolc.appbuilder.domain.repository.TagRepository
import org.koin.dsl.module

private val repositories = module {
    single<BranchRepository> {
        BranchRepositoryImpl(get())
    }

    single<TagRepository> {
        TagRepositoryImpl()
    }
}

val dataModules = listOf(
    repositories
)