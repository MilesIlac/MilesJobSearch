package com.milesilac.milesjobsearch.domain.themuse.model

data class TheMuseResponseHeader(
    val rateRemaining: Int = 0,
    val rateLimit: Int = 0,
    val rateReset: Int = 0,
    val rateResetUnit: TheMuseTimeResetUnit
)

sealed class TheMuseTimeResetUnit {
    data object UnitHours: TheMuseTimeResetUnit()
    data object UnitMinutes: TheMuseTimeResetUnit()
}