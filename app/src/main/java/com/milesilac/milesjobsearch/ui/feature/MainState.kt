package com.milesilac.milesjobsearch.ui.feature

import com.milesilac.milesjobsearch.domain.themuse.model.JobList
import com.milesilac.milesjobsearch.domain.themuse.model.TheMuseResponseHeader

sealed class MainState {
    data class GetJobsList(
        val responseHeader: TheMuseResponseHeader, val jobList: JobList
    ) : MainState()
}