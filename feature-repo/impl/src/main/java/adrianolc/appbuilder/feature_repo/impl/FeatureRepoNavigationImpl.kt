package adrianolc.appbuilder.feature_repo.impl

import adrianolc.appbuilder.feature_repo.api.FeatureRepoNavigation
import adrianolc.appbuilder.feature_repo.impl.ui.ListActivity
import android.content.Context
import android.content.Intent

internal class FeatureRepoNavigationImpl : FeatureRepoNavigation {
    override fun newIntent(context: Context): Intent {
        return Intent(context, ListActivity::class.java)
    }
}