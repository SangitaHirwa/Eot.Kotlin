package com.eot_app.utility

import android.app.Application

open class EotApp : Application() {
    companion object {
        private var INSTANCE: EotApp? = null
        fun getAppinstance(): EotApp? = INSTANCE
    }override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }

}