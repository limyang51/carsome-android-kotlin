package com.example.louis.carsomeandroidkotlin.page.cars

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.louis.carsomeandroidkotlin.R
import com.example.louis.carsomeandroidkotlin.base.BaseActivity
import com.example.louis.carsomeandroidkotlin.databinding.ActivityCarDetailBinding

class CarListActivity : BaseActivity<ActivityCarDetailBinding, CarListViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDataBinding()
    }

    override fun getViewModel(): CarListViewModel { return CarListViewModel() }

    override fun getContextType(): Any { return this }

    override fun getLayoutId(): Int { return R.layout.activity_car_list }

}
