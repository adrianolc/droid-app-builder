package adrianolc.appbuilder.app.di

import adrianolc.appbuilder.app.feature.repo.ListViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val viewModels = module {
    viewModel { ListViewModel(get()) }
}

internal val appModules = listOf(
    viewModels
)