package adrianolc.appbuilder.app

import adrianolc.appbuilder.feature_repo.impl.di.featureRepoModule
import android.app.Application
import org.koin.core.context.loadKoinModules

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        loadKoinModules(featureRepoModule)
    }
}