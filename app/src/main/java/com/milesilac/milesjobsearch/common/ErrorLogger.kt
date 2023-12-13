package com.milesilac.milesjobsearch.common

import android.util.Log

fun logError(source: String = "UnknownSource", error: Exception) {
    error.printStackTrace()
    Log.e("${source}_Error", error.localizedMessage ?: "Unknown error occurred")
}

fun logError(source: String = "UnknownSource", error: Throwable) {
    error.printStackTrace()
    Log.e("${source}_Error", Log.getStackTraceString(error))
}

fun logError(source: String = "UnknownSource", error: String) {
    Log.e("${source}_Error", error)
}