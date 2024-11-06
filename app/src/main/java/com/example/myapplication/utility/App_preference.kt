package com.example.myapplication.utility;

import android.content.Context
import android.content.SharedPreferences
import com.example.myapplication.login_next.login_next_model.ResLoginData
import com.example.myapplication.utility.util_interfaces.Sp_model
import com.google.gson.Gson

class App_preference : Sp_model {
     private lateinit var sp: SharedPreferences
     private lateinit var editor: SharedPreferences.Editor
     private val LOGIN_RESPONSE = "login_response"
     val PREF_NAME : String = "eot_pref"

     constructor(){
         sp = EotApp.getAppinstance().getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
         editor = sp.edit()
     }


     companion object{
         fun getSharedprefInstance():Sp_model {
             val INSTANCE: Sp_model = App_preference()
             return INSTANCE;
         }

     }


     override fun getLoginRes():ResLoginData {
         val gson = Gson()
         return gson.fromJson(sp.getString(LOGIN_RESPONSE, null), ResLoginData::class.java)
     }
 }

