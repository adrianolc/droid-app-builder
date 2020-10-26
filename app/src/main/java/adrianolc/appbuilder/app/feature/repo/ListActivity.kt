package adrianolc.appbuilder.app.feature.repo

import adrianolc.appbuilder.databinding.ListActivityBinding
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.viewmodel.ext.android.viewModel

class ListActivity : AppCompatActivity() {

    private val binding: ListActivityBinding by lazy {
        ListActivityBinding.inflate(layoutInflater)
    }

    private val viewModel: ListViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setObservables()
    }

    private fun setObservables() = with(viewModel){
        branches.observe(this@ListActivity) {

        }
    }

    companion object {

        fun newIntent(context: Context): Intent {
            return Intent(context, ListActivity::class.java)
        }
    }
}