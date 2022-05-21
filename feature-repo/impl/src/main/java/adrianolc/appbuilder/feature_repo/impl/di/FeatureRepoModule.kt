package adrianolc.appbuilder.feature_repo.impl.di

import adrianolc.appbuilder.feature_repo.impl.FeatureRepoNavigationImpl
import adrianolc.appbuilder.feature_repo.impl.ui.ListViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val viewModels = module {
    viewModel { ListViewModel(get()) }
}

private val navigation = module {
    factory { FeatureRepoNavigationImpl() }
}

val featureRepoModule = listOf(
    viewModels,
    navigation
)