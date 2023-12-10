package com.milesilac.milesjobsearch.common

import android.util.Log

fun logError(error: Exception, source: String = "Unknown Source") {
    Log.e(source, error.localizedMessage ?: "Unknown error occurred")
    error.printStackTrace()
}