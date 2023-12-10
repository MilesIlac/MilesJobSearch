package com.milesilac.milesjobsearch.domain.themuse

import com.milesilac.milesjobsearch.domain.themuse.model.JobList

interface TheMuseRepository {

    suspend fun getJobsList(): JobList
}