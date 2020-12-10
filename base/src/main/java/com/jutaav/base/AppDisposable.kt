package com.jutaav.base

import io.reactivex.rxjava3.disposables.CompositeDisposable

/**
 * Created by viking_93 on 10/12/2020
 **/

interface BaseAutoDisposable {
    val compositeDisposable: CompositeDisposable

    fun dispose()
}

class BaseAutoDisposableImplementation() : BaseAutoDisposable {
    override val compositeDisposable: CompositeDisposable by lazy { CompositeDisposable() }
    override fun dispose() {
        if (!compositeDisposable.isDisposed) compositeDisposable.dispose()
    }
}