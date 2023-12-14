package com.milesilac.milesjobsearch.data.remote.themuse.repository

import android.util.Log
import com.milesilac.milesjobsearch.common.Constants.TEST_CATEGORY
import com.milesilac.milesjobsearch.common.Constants.TEST_LOCATION
import com.milesilac.milesjobsearch.data.remote.themuse.TheMuseApiService
import com.milesilac.milesjobsearch.data.remote.themuse.mapper.toHeaderObject
import com.milesilac.milesjobsearch.data.remote.themuse.mapper.toJobList
import com.milesilac.milesjobsearch.domain.themuse.TheMuseRepository
import com.milesilac.milesjobsearch.domain.themuse.model.JobList
import com.milesilac.milesjobsearch.domain.themuse.model.JobListResponse
import com.milesilac.milesjobsearch.domain.themuse.model.TheMuseResponseHeader
import javax.inject.Inject

class TheMuseRemoteSource @Inject constructor(
    private val apiService: TheMuseApiService
) : TheMuseRepository {

    override suspend fun getJobsList(): JobListResponse {
        var header: TheMuseResponseHeader? = null
        var list: JobList? = null
        val response = apiService.getJobsList(
            page = 1,
            category = TEST_CATEGORY,
            location = TEST_LOCATION
        )
        if (response.isSuccessful) {
            response.body()?.let {
                header = response.headers().toHeaderObject()
                list = it.toJobList()
            }
        }
        return JobListResponse(
            responseHeader = header,
            jobList = list
        )
    }

    override suspend fun getTest() {
        Log.e("getTestCall", "Testing!")
    }

//    override suspend fun getJobsList(): Flow<Resource<JobListResponse>> = flow {
//        try {
//            val response = apiService.getJobsList(
//                page = 1,
//                category = TEST_CATEGORY,
//                location = TEST_LOCATION
//            )
//            if (response.isSuccessful) {
//                response.body()?.let { jobListDto ->
//                    val header = response.headers().toHeaderObject()
//                    val jobList = jobListDto.toJobList()
//                    emit(
//                        Resource.Success(
//                            JobListResponse(responseHeader = header, jobList = jobList)
//                        )
//                    )
//                    return@flow
//                }
//                when {
//                    response.errorBody() != null -> {
//                        logError("getJobsListCall", response.errorBody().toString())
//                        emit(Resource.Error(response.errorBody().toString()))
//                    }
//                    else -> {
//                        logError("getJobsListCall", "Response body is null.")
//                        emit(Resource.Error("Response body is null."))
//                    }
//                }
//            } else {
//                when {
//                    response.errorBody() != null -> {
//                        logError("getJobsListCall", response.errorBody().toString())
//                        emit(Resource.Error(response.errorBody().toString()))
//                    }
//                    else -> {
//                        logError("getJobsListCall", "Response failed.")
//                        emit(Resource.Error("Response failed."))
//                    }
//                }
//            }
//        } catch (error: HttpException) {
//            logError("getJobsListCall", error)
//            emit(Resource.Error(error.localizedMessage ?: "Unexpected error occurred"))
//        } catch (error: IOException) {
//            logError("getJobsListCall", error)
//            emit(Resource.Error("Network problem, please check internet connection"))
//        }
//    }
}