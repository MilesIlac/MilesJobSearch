package com.milesilac.milesjobsearch.data.remote.themuse.dto.job


import com.google.gson.annotations.SerializedName

data class JobDto(
    @SerializedName("categories")
    val categories: List<CategoryDto>,
    @SerializedName("company")
    val company: CompanyDto,
    @SerializedName("contents")
    val contents: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("levels")
    val levels: List<LevelDto>,
    @SerializedName("locations")
    val locations: List<LocationDto>,
    @SerializedName("model_type")
    val modelType: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("publication_date")
    val publicationDate: String,
    @SerializedName("refs")
    val refs: RefsDto,
    @SerializedName("short_name")
    val shortName: String,
    @SerializedName("tags")
    val tags: List<Any>,
    @SerializedName("type")
    val type: String
)