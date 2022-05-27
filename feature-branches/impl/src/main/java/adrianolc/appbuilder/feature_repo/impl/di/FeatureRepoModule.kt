package adrianolc.appbuilder.feature_repo.impl.di

import adrianolc.appbuilder.feature_repo.api.FeatureRepoNavigation
import adrianolc.appbuilder.feature_repo.impl.FeatureRepoNavigationImpl
import adrianolc.appbuilder.feature_repo.impl.domain.use_case.LoadBranchesUseCase
import adrianolc.appbuilder.feature_repo.impl.ui.ListViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

@Module
@InstallIn(ActivityComponent::class)
interface FeatureRepoModule {
    @Binds
    fun bindFeatureRepoNavigation(navigationImpl: FeatureRepoNavigationImpl): FeatureRepoNavigation
}