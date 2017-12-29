package com.example.louis.carsomeandroidkotlin.page.login

import android.os.Bundle

import com.example.louis.carsomeandroidkotlin.R
import com.example.louis.carsomeandroidkotlin.base.BaseActivity
import com.example.louis.carsomeandroidkotlin.databinding.ActivityLoginBinding
import com.example.louis.carsomeandroidkotlin.page.cars.CarListActivity
import com.example.louis.carsomeandroidkotlin.util.SharedPreferences

import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>(), LoginNavigator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDataBinding()
        mViewModel.initializeTextView(email, password)
        supportActionBar?.title = "CarSome"

    }

    override fun getViewModel(): LoginViewModel { return LoginViewModel() }

    override fun getContextType(): Any { return this }

    override fun getLayoutId(): Int { return R.layout.activity_login }

    override fun toCarListActivity() {
        SharedPreferences.edit(this, true)
        pageTransistor(CarListActivity::class.java)
        finishAffinity()
    }





}
