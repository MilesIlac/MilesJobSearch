package com.milesilac.milesjobsearch.ui.feature

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.milesilac.milesjobsearch.domain.themuse.usecase.GetJobsListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getJobsListUseCase: GetJobsListUseCase
): ViewModel() {

    private val mutableMainState: MutableSharedFlow<MainState> = MutableSharedFlow()
    val mainState = mutableMainState.asSharedFlow()

    fun getJobsList() {
        viewModelScope.launch {
            getJobsListUseCase.getTest()
            val resultResponse = getJobsListUseCase.getJobList()
            val header = resultResponse.responseHeader
            val list = resultResponse.jobList
            if (header != null && list != null) {
                mutableMainState.emit(
                    MainState.GetJobsList(
                        responseHeader = header,
                        jobList = list
                    )
                )
            }
        }
    }
}