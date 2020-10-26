package adrianolc.appbuilder.app

import adrianolc.appbuilder.app.di.appModules
import android.app.Application
import org.koin.core.context.loadKoinModules

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        loadKoinModules(appModules)
    }
}