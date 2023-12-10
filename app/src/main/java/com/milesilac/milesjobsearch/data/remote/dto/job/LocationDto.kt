package com.milesilac.milesjobsearch.data.remote.dto.job


import com.google.gson.annotations.SerializedName

data class LocationDto(
    @SerializedName("name")
    val name: String
)