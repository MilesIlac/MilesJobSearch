package com.milesilac.milesjobsearch.common

sealed class Resource<T>(val data: T? = null, val message: String? = null) {
}