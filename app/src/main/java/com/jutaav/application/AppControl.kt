package com.jutaav.application

import android.app.Application

class AppControl : Application() {

    init {
        mInstance = this
    }

    companion object {
        private lateinit var mInstance: AppControl

        fun getInstance() = mInstance
    }
}