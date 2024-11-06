package com.example.myapplication.utility;

import android.content.SharedPreferences
import com.example.myapplication.utility.util_interfaces.Sp_model;

 class App_preference : Sp_model {
     private lateinit var sp: SharedPreferences
     private lateinit var editor: SharedPreferences.Editor


     companion object{
         fun getSharedprefInstance():Sp_model {
             val INSTANCE: Sp_model = App_preference()
             return INSTANCE;
         }

     }


     override fun getLoginRes() {
     }
 }

