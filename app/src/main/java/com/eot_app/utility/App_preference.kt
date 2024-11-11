package com.eot_app.utility

import android.content.Context
import android.content.SharedPreferences
import com.eot_app.utility.util_interfaces.Sp_model

open class App_preference : Sp_model {


    companion object {

        val PREF_NAME: String = "eot_pref"
        private lateinit var sp: SharedPreferences
        private lateinit var editor: SharedPreferences.Editor
         private val INSTANCE : Sp_model = App_preference()
        private val IS_LAUNCH = "is_launch"
        fun getSharedprefInstance(): Sp_model {
            return INSTANCE
        }
    }
      constructor(){
          sp = EotApp.getAppinstance()!!.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
          editor = sp.edit()
      }

        override fun setLaunchFirst() {
            editor.putBoolean(IS_LAUNCH, false)
            editor.commit()
        }

        override fun isLaunchFirst(): Boolean {
            return sp.getBoolean(IS_LAUNCH, true)
        }

}