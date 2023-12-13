package com.milesilac.milesjobsearch.domain.themuse

import com.milesilac.milesjobsearch.common.Resource
import com.milesilac.milesjobsearch.domain.themuse.model.JobListResponse
import kotlinx.coroutines.flow.Flow

interface TheMuseRepository {

    suspend fun getJobsList(): Flow<Resource<JobListResponse>>
}