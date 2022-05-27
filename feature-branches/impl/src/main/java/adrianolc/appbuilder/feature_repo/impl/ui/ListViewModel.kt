package adrianolc.appbuilder.feature_repo.impl.ui

import adrianolc.appbuilder.domain.model.Branch
import adrianolc.appbuilder.feature_repo.impl.domain.use_case.LoadBranchesUseCase
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val loadBranches: LoadBranchesUseCase
) : ViewModel() {

    val branches: LiveData<List<Branch>> = liveData {
        loadBranches(1)
    }
}