package com.milesilac.milesjobsearch.data.remote.themuse.mapper

import com.milesilac.milesjobsearch.data.remote.themuse.dto.job.JobDto
import com.milesilac.milesjobsearch.domain.themuse.model.CompanyData
import com.milesilac.milesjobsearch.domain.themuse.model.Job
import com.milesilac.milesjobsearch.domain.themuse.model.JobCategory
import com.milesilac.milesjobsearch.domain.themuse.model.JobLevel
import com.milesilac.milesjobsearch.domain.themuse.model.Location
import com.milesilac.milesjobsearch.domain.themuse.model.Refs

fun JobDto.toJob() : Job {
    return Job(
        contents = contents,
        name = name,
        type = type,
        publicationDate = publicationDate,
        shortName = shortName,
        id = id,
        locations = locations.map { Location(name = it.name) },
        categories = categories.map { JobCategory(name = it.name) },
        levels = levels.map { JobLevel(name = it.name, shortName = it.shortName) },
        refs = Refs(landingPage = refs.landingPage),
        company = company.let { CompanyData(id = it.id, name = it.name, shortName = it.shortName) }
    )
}