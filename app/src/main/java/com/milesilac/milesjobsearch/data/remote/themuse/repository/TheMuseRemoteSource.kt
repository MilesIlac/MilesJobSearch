package com.milesilac.milesjobsearch.data.remote.themuse.repository

import com.milesilac.milesjobsearch.data.remote.themuse.TheMuseApiService
import com.milesilac.milesjobsearch.data.remote.themuse.mapper.toJobList
import com.milesilac.milesjobsearch.domain.themuse.TheMuseRepository
import com.milesilac.milesjobsearch.domain.themuse.model.JobList
import javax.inject.Inject

class TheMuseRemoteSource @Inject constructor(
    private val apiService: TheMuseApiService
) : TheMuseRepository {

    override suspend fun getJobsList(): JobList {
        return apiService.getJobsList().toJobList()
    }
}