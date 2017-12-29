package com.example.louis.carsomeandroidkotlin.util

import android.app.Activity
import android.content.Context


/**
 * Created by Louis on 29/12/2017.
 */
object SharedPreferences {

    fun edit(activity: Activity, boolean: Boolean){
        val sharedPref = activity.getPreferences(Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean(APPConfig.AuthenticatorString, boolean)
        editor.apply()
    }

    fun isLogged(activity: Activity): Boolean{

        val sharedPref = activity.getPreferences(Context.MODE_PRIVATE)

        return sharedPref.getBoolean(APPConfig.AuthenticatorString, true)
    }

}