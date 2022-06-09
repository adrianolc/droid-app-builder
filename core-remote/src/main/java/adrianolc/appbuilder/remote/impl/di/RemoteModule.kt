package adrianolc.appbuilder.remote.impl.di

import adrianolc.appbuilder.remote.api.data_source.BranchDataSource
import adrianolc.appbuilder.remote.api.service.BranchService
import adrianolc.appbuilder.remote.impl.data_source.BranchDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteModule {
    @Binds
    abstract fun bindBranchDataSource(branchDataSourceImpl: BranchDataSourceImpl): BranchDataSource

    companion object {
        @Provides
        fun provideBranchService(retrofit: Retrofit): BranchService {
            return retrofit.create()
        }
    }
}

