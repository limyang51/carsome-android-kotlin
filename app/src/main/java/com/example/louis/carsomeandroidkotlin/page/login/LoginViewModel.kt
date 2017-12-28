package com.example.louis.carsomeandroidkotlin.page.login

import android.databinding.ObservableField
import android.text.TextUtils
import android.widget.TextView
import com.example.louis.carsomeandroidkotlin.APPConfig
import com.example.louis.carsomeandroidkotlin.R
import com.example.louis.carsomeandroidkotlin.base.ViewModel
import com.example.louis.carsomeandroidkotlin.util.EmailValidator
import com.jakewharton.rxbinding2.widget.RxTextView
import kotlinx.android.synthetic.main.activity_login.view.*

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