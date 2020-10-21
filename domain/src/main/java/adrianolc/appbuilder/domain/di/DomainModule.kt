package adrianolc.appbuilder.domain.di

import adrianolc.appbuilder.domain.DomainDispatchers
import adrianolc.appbuilder.domain.use_case.branch.GetBranchUseCase
import adrianolc.appbuilder.domain.use_case.branch.LoadBranchesUseCase
import adrianolc.appbuilder.domain.use_case.tag.GetTagUseCase
import adrianolc.appbuilder.domain.use_case.tag.LoadTagsUseCase
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

private val useCases = module {
    factory {
        LoadBranchesUseCase(get(), get())
    }

    factory {
        GetBranchUseCase(get(), get())
    }

    factory {
        LoadTagsUseCase(get(), get())
    }

    factory {
        GetTagUseCase(get(), get())
    }
}

private val mainModule = module {
    single<DomainDispatchers> {
        object : DomainDispatchers{
            override val io: CoroutineDispatcher
                get() = Dispatchers.IO

            override val main: CoroutineDispatcher
                get() = Dispatchers.Main

            override val default: CoroutineDispatcher
                get() = Dispatchers.Default
        }
    }
}

val domainModules = listOf(
    mainModule,
    useCases
)