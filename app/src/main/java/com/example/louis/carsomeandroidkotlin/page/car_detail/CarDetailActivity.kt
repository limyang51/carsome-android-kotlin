package com.example.louis.carsomeandroidkotlin.page.car_detail

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.louis.carsomeandroidkotlin.R
import com.example.louis.carsomeandroidkotlin.base.BaseActivity
import com.example.louis.carsomeandroidkotlin.databinding.ActivityCarDetailBinding

class CarDetailActivity : BaseActivity<ActivityCarDetailBinding, CarDetailViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDataBinding()
    }

    override fun getViewModel(): CarDetailViewModel { return CarDetailViewModel()}

    override fun getContextType(): Any { return this }

    override fun getLayoutId(): Int { return R.layout.activity_car_detail }
}
