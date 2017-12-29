package com.example.louis.carsomeandroidkotlin.util

import android.app.Activity
import android.content.Context


/**
 * Created by Louis on 29/12/2017.
 */
object SharedPreferences {

    fun edit(context: Context, boolean: Boolean){
        val sharedPref = context.getSharedPreferences("MyPref",Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean(APPConfig.AuthenticatorString, boolean)
        editor.commit()

    }

    fun isLogged(context: Context): Boolean{

        val sharedPref = context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)

        return sharedPref.getBoolean(APPConfig.AuthenticatorString, false)
    }

}