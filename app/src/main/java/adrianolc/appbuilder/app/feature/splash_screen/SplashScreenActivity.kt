package adrianolc.appbuilder.app.feature.splash_screen

import adrianolc.appbuilder.feature_repo.impl.ListActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            delay(1000)

            startActivity(
                adrianolc.appbuilder.feature_repo.impl.ListActivity.newIntent(this@SplashScreenActivity)
            )
        }
    }
}