package adrianolc.appbuilder.app.feature.repo

import adrianolc.appbuilder.databinding.ListActivityBinding
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ListActivity : AppCompatActivity() {

    private val binding: ListActivityBinding by lazy { ListActivityBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    companion object {

        fun  newIntent(context: Context): Intent {
            return Intent(context, ListActivity::class.java)
        }
    }
}