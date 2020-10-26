package adrianolc.appbuilder.data.remote

import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.core.interceptors.LogRequestInterceptor
import com.github.kittinunf.fuel.core.interceptors.LogResponseInterceptor

object RemoteInitializer {

    fun init() = with(FuelManager.instance) {
        basePath = "http://10.0.2.2"
        baseHeaders = mapOf(
            "Content-type" to "application/json"
        )

        addRequestInterceptor(LogRequestInterceptor)
        addResponseInterceptor(LogResponseInterceptor)
    }
}