package com.milesilac.milesjobsearch.data.remote.themuse.dto.job


import com.google.gson.annotations.SerializedName

data class LevelDto(
    @SerializedName("name")
    val name: String,
    @SerializedName("short_name")
    val shortName: String
)