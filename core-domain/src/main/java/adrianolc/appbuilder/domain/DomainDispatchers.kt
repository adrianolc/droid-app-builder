package adrianolc.appbuilder.domain

import kotlinx.coroutines.CoroutineDispatcher

interface DomainDispatchers {

    val io: CoroutineDispatcher

    val main: CoroutineDispatcher

    val default: CoroutineDispatcher
}