package com.milesilac.milesjobsearch.domain.themuse.model

import com.milesilac.milesjobsearch.domain.themuse.model.job.Job

data class JobList(
    val jobList: List<Job> = emptyList()
)
