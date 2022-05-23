package adrianolc.appbuilder.remote.impl.di

import adrianolc.appbuilder.remote.api.data_source.BranchDataSource
import adrianolc.appbuilder.remote.api.service.BranchService
import adrianolc.appbuilder.remote.impl.data_source.BranchDataSourceImpl
import org.koin.dsl.module
import retrofit2.Retrofit

private val dataSourceModule = module {
    single<BranchDataSource> {
        BranchDataSourceImpl(get())
    }
}

private val serviceModule = module {
    factory<BranchService> {
        get<Retrofit>().create(BranchService::class.java)
    }
}

val remoteModule = listOf(
    dataSourceModule,
    serviceModule
)
