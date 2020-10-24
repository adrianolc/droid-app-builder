package adrianolc.appbuilder.app.feature.splash_screen

import adrianolc.appbuilder.app.feature.repo.ListActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            delay(200)

            startActivity(
                ListActivity.newIntent(this@SplashScreenActivity)
            )
        }
    }
}