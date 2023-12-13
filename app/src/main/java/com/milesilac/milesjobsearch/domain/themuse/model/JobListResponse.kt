package com.milesilac.milesjobsearch.domain.themuse.model

data class JobListResponse(
    val responseHeader: TheMuseResponseHeader,
    val jobList: JobList
)