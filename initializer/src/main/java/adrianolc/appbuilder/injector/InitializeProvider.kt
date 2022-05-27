package adrianolc.appbuilder.injector

import adrianolc.appbuilder.data.di.dataModules
import adrianolc.appbuilder.domain.di.domainModules
import android.app.Application
import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class InitializeProvider : ContentProvider() {
    override fun onCreate(): Boolean {
        val application = context as? Application ?: return false

        startKoin {
            androidLogger(Level.ERROR)
            androidContext(application)

            modules(domainModules)
            modules(dataModules)
        }

        return true
    }

    override fun query(
        p0: Uri,
        p1: Array<out String>?,
        p2: String?,
        p3: Array<out String>?,
        p4: String?
    ): Cursor? = null

    override fun getType(p0: Uri): String? = null

    override fun insert(p0: Uri, p1: ContentValues?): Uri? = null

    override fun delete(p0: Uri, p1: String?, p2: Array<out String>?): Int = 0

    override fun update(p0: Uri, p1: ContentValues?, p2: String?, p3: Array<out String>?): Int = 0
}