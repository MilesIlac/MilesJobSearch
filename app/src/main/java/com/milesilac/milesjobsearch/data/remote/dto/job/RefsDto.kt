package com.milesilac.milesjobsearch.data.remote.dto.job


import com.google.gson.annotations.SerializedName

data class RefsDto(
    @SerializedName("landing_page")
    val landingPage: String
)