package com.milesilac.milesjobsearch.data.remote.repository.mapper

import com.milesilac.milesjobsearch.data.remote.dto.job.JobDto
import com.milesilac.milesjobsearch.domain.model.CompanyData
import com.milesilac.milesjobsearch.domain.model.Job
import com.milesilac.milesjobsearch.domain.model.JobCategory
import com.milesilac.milesjobsearch.domain.model.JobLevel
import com.milesilac.milesjobsearch.domain.model.Location
import com.milesilac.milesjobsearch.domain.model.Refs

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