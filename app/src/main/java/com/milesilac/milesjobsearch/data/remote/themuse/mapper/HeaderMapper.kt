package com.milesilac.milesjobsearch.data.remote.themuse.mapper

import com.milesilac.milesjobsearch.common.Constants.THE_MUSE_API_RATE_LIMIT
import com.milesilac.milesjobsearch.common.Constants.THE_MUSE_API_RATE_REMAINING
import com.milesilac.milesjobsearch.common.Constants.THE_MUSE_API_RATE_RESET
import com.milesilac.milesjobsearch.domain.themuse.model.TheMuseResponseHeader
import com.milesilac.milesjobsearch.domain.themuse.model.TheMuseTimeResetUnit
import okhttp3.Headers

fun Headers.toHeaderObject(): TheMuseResponseHeader {
    val headers = this
    val rateRemaining = (headers.get(THE_MUSE_API_RATE_REMAINING) ?: "0").toInt()
    val rateLimit = (headers.get(THE_MUSE_API_RATE_LIMIT) ?: "0").toInt()
    val rateReset = (headers.get(THE_MUSE_API_RATE_RESET) ?: "0").toInt()
    return TheMuseResponseHeader(
        rateRemaining = rateRemaining,
        rateLimit = rateLimit,
        rateReset = rateReset,
        rateResetUnit = when {
            rateReset > 600 -> TheMuseTimeResetUnit.UnitHours
            else -> TheMuseTimeResetUnit.UnitMinutes
        }
    )
}