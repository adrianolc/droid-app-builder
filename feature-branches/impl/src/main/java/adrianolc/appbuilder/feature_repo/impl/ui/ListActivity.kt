package adrianolc.appbuilder.feature_repo.impl.ui

import adrianolc.appbuilder.feature_repo.impl.databinding.ListActivityBinding
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListActivity : AppCompatActivity() {

    private val binding: ListActivityBinding by lazy {
        ListActivityBinding.inflate(layoutInflater)
    }

    private val viewModel: ListViewModel by viewModels()

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