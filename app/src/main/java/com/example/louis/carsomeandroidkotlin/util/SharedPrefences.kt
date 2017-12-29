package com.example.louis.carsomeandroidkotlin.util

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context


/**
 * Created by Louis on 29/12/2017.
 */
object SharedPrefences {

    @SuppressLint("ApplySharedPref")
    fun edit(activity: Activity, boolean: Boolean){
        val sharedPref = activity.getPreferences(Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean(APPConfig.AuthentivatorString, boolean)
        editor.commit()
    }

    fun read(activity: Activity): Boolean{

        val sharedPref = activity.getPreferences(Context.MODE_PRIVATE)

        val isLogged = sharedPref.getBoolean(APPConfig.AuthentivatorString, false)

        return isLogged
    }

}