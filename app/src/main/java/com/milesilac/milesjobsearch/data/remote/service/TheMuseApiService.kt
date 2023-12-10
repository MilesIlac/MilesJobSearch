package com.milesilac.milesjobsearch.data.remote.service

import com.milesilac.milesjobsearch.data.remote.dto.joblist.JobListDto
import retrofit2.http.GET

interface TheMuseApiService {

    @GET("/jobs")
    suspend fun getJobsList(): JobListDto
}