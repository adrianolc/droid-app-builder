package adrianolc.appbuilder.feature_repo.impl

import adrianolc.appbuilder.feature_repo.api.FeatureRepoNavigation
import adrianolc.appbuilder.feature_repo.impl.ui.BranchesFragment
import android.content.Context
import android.content.Intent
import javax.inject.Inject

class FeatureRepoNavigationImpl @Inject constructor() : FeatureRepoNavigation {
    override fun newIntent(context: Context): Intent {
        return Intent(context, BranchesFragment::class.java)
    }
}