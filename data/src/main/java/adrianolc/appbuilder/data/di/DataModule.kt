package adrianolc.appbuilder.data.di

import adrianolc.appbuilder.data.repository.TagRepositoryImpl
import adrianolc.appbuilder.domain.repository.TagRepository
import org.koin.dsl.module

private val repositories = module {
    single<TagRepository> {
        TagRepositoryImpl()
    }
}

val dataModules = listOf(
    repositories
)