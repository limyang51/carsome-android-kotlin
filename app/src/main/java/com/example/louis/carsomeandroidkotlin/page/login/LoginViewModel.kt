package com.example.louis.carsomeandroidkotlin.page.login


import android.widget.TextView
import com.example.louis.carsomeandroidkotlin.util.APPConfig

import com.example.louis.carsomeandroidkotlin.base.ViewModel

/**
 * Created by Louis on 28/12/2017.
 */
class LoginViewModel: ViewModel<LoginNavigator>() {

    var email: String = ""
    var pass: String= ""

    lateinit var emailTextView: TextView
    lateinit var passTextView: TextView

    fun initializeTextView(email: TextView, pass: TextView){
        emailTextView = email
        passTextView =  pass
    }


    fun login(){

        if(email == APPConfig.DUMMY_CREDENTIALS_ID){
            if (pass == APPConfig.DUMMY_CREDENTIALS_PASS)
                getNavigator().toCarListActivity()
            else {
                passTextView.error = "Password is incorrect"
                passTextView.requestFocus()
            }

        }else{
            emailTextView.error = "Email id is incorrect"
            emailTextView.requestFocus()
        }


    }




}