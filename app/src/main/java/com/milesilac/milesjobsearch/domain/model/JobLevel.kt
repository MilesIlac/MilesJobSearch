package com.milesilac.milesjobsearch.domain.model

import com.google.gson.annotations.SerializedName

data class JobLevel(
    val name: String = "",
    @SerializedName("short_name") val shortName: String = ""
)
