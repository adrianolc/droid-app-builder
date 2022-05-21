package adrianolc.appbuilder.feature_repo.api

import android.content.Context
import android.content.Intent

interface FeatureRepoNavigation {
    fun newIntent(context: Context): Intent
}