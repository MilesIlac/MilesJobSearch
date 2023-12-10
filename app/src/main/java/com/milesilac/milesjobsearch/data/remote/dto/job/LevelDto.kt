package com.milesilac.milesjobsearch.data.remote.dto.job


import com.google.gson.annotations.SerializedName

data class LevelDto(
    @SerializedName("name")
    val name: String,
    @SerializedName("short_name")
    val shortName: String
)