package adrianolc.appbuilder.app.feature.splash_screen

import adrianolc.appbuilder.feature_repo.api.FeatureRepoNavigation
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class SplashScreenActivity : AppCompatActivity() {

    private val navigation: FeatureRepoNavigation by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            delay(1000)

            startActivity(
                navigation.newIntent(this@SplashScreenActivity)
            )
        }
    }
}