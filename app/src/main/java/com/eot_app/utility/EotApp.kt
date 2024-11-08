package com.eot_app.utility

import android.app.Application

open class EotApp : Application() {
    companion object {

       private lateinit var INSTANCE : EotApp

        @Synchronized
        fun getAppinstance(): EotApp {
            return INSTANCE
        }
    }
}