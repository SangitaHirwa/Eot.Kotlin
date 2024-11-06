package com.example.myapplication.utility

import android.app.Activity
import android.app.Application
import android.os.Bundle

class EotApp : Application(), Application.ActivityLifecycleCallbacks {


    companion object{
        private lateinit var INSTANCE : EotApp
        @Synchronized
        fun getAppinstance(): EotApp{
            return INSTANCE
        }
    }
    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
      INSTANCE = this
    }

    override fun onActivityStarted(activity: Activity) {
        TODO("Not yet implemented")
    }

    override fun onActivityResumed(activity: Activity) {
        TODO("Not yet implemented")
    }

    override fun onActivityPaused(activity: Activity) {
        TODO("Not yet implemented")
    }

    override fun onActivityStopped(activity: Activity) {
        TODO("Not yet implemented")
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
        TODO("Not yet implemented")
    }

    override fun onActivityDestroyed(activity: Activity) {
        TODO("Not yet implemented")
    }
}