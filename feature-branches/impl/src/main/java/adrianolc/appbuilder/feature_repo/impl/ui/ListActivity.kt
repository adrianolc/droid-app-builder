package adrianolc.appbuilder.feature_repo.impl.ui

import adrianolc.appbuilder.feature_repo.impl.databinding.ListActivityBinding
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
}