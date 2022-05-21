package adrianolc.appbuilder.feature_repo.impl.di

import adrianolc.appbuilder.feature_repo.impl.ui.ListViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val viewModels = module {
    viewModel { ListViewModel(get()) }
}

val featureRepoModule = listOf(
    viewModels
)