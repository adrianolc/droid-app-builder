package adrianolc.appbuilder.feature_repo.impl.ui

import adrianolc.appbuilder.feature_repo.impl.databinding.ListActivityBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BranchesFragment : Fragment() {

    private lateinit var binding: ListActivityBinding

    private val viewModel: ListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ListActivityBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setObservables()
    }

    private fun setObservables() = with(viewModel){
        branches.observe(viewLifecycleOwner) {

        }
    }
}