package adrianolc.appbuilder.feature_repo.impl.di

import adrianolc.appbuilder.feature_repo.api.FeatureRepoNavigation
import adrianolc.appbuilder.feature_repo.impl.FeatureRepoNavigationImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
interface FeatureRepoModule {
    @Binds
    fun bindFeatureRepoNavigation(navigationImpl: FeatureRepoNavigationImpl): FeatureRepoNavigation
}