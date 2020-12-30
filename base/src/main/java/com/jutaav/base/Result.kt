package com.jutaav.base

/**
 * Created by viking_93 on 30/12/2020
 **/

sealed class Result<T> {
    fun getOrThrow(): T = when (this) {
        is Success -> get()
        is ErrorResult -> throw throwable
    }
}

data class Success<T>(val data: T) : Result<T>() {
    fun get(): T = data
}

data class ErrorResult<T>(val throwable: Throwable) : Result<T>()