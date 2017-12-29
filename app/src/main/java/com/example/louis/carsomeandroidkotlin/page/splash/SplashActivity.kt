package com.example.louis.carsomeandroidkotlin.page.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.louis.carsomeandroidkotlin.page.cars.CarListActivity
import com.example.louis.carsomeandroidkotlin.page.login.LoginActivity
import com.example.louis.carsomeandroidkotlin.util.SharedPreferences

class SplashActivity : AppCompatActivity() {

    lateinit var mIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mIntent = if (SharedPreferences.isLogged(this))
            Intent(this, CarListActivity::class.java)
        else
            Intent(this, LoginActivity::class.java)
        startActivity(mIntent)
        finishAffinity()
    }
}
