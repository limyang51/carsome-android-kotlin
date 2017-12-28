package com.example.louis.carsomeandroidkotlin.page.login

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.annotation.TargetApi

import android.support.v7.app.AppCompatActivity
import android.os.Build
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView

import com.example.louis.carsomeandroidkotlin.R
import com.example.louis.carsomeandroidkotlin.base.BaseActivity
import com.example.louis.carsomeandroidkotlin.databinding.ActivityLoginBinding
import com.example.louis.carsomeandroidkotlin.page.cars.CarListActivity

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

    override fun toCarListActivity() { pageTransistor(CarListActivity::class.java) }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    private fun showProgress(show: Boolean) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            val shortAnimTime = resources.getInteger(android.R.integer.config_shortAnimTime).toLong()

            login_form.visibility = if (show) View.GONE else View.VISIBLE
            login_form.animate()
                    .setDuration(shortAnimTime)
                    .alpha((if (show) 0 else 1).toFloat())
                    .setListener(object : AnimatorListenerAdapter() {
                        override fun onAnimationEnd(animation: Animator) {
                            login_form.visibility = if (show) View.GONE else View.VISIBLE
                        }
                    })

            login_progress.visibility = if (show) View.VISIBLE else View.GONE
            login_progress.animate()
                    .setDuration(shortAnimTime)
                    .alpha((if (show) 1 else 0).toFloat())
                    .setListener(object : AnimatorListenerAdapter() {
                        override fun onAnimationEnd(animation: Animator) {
                            login_progress.visibility = if (show) View.VISIBLE else View.GONE
                        }
                    })
        } else {

            login_progress.visibility = if (show) View.VISIBLE else View.GONE
            login_form.visibility = if (show) View.GONE else View.VISIBLE
        }
    }



}
