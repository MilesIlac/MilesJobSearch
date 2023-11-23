package com.milesilac.milesjobsearch.model

import com.google.gson.annotations.SerializedName

data class JobLevel(
    val name: String = "",
    @SerializedName("short_name") val shortName: String = ""
)
