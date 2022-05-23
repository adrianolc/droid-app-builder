package adrianolc.appbuilder.feature_repo.impl.di

import adrianolc.appbuilder.feature_repo.api.FeatureRepoNavigation
import adrianolc.appbuilder.feature_repo.impl.FeatureRepoNavigationImpl
import adrianolc.appbuilder.feature_repo.impl.domain.use_case.LoadBranchesUseCase
import adrianolc.appbuilder.feature_repo.impl.ui.ListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val viewModels = module {
    viewModel { ListViewModel(get()) }
}

private val navigation = module {
    factory<FeatureRepoNavigation> { FeatureRepoNavigationImpl() }
}

private val useCases = module {
    factory {
        LoadBranchesUseCase(get(), get())
    }
}

val featureRepoModule = listOf(
    viewModels,
    navigation,
    useCases
)