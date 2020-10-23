package adrianolc.appbuilder.data.remote

import com.github.kittinunf.fuel.core.FuelManager

object RemoteInitializer {

    fun init() = with(FuelManager.instance) {
        basePath = "http://localhost"
    }
}