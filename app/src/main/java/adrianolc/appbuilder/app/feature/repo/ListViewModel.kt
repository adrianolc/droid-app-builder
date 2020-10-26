package adrianolc.appbuilder.app.feature.repo

import adrianolc.appbuilder.domain.model.Branch
import adrianolc.appbuilder.domain.use_case.branch.LoadBranchesUseCase
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData

class ListViewModel(
    private val loadBranches: LoadBranchesUseCase
) : ViewModel() {

    val branches: LiveData<List<Branch>> = liveData {
        loadBranches(1)
    }
}