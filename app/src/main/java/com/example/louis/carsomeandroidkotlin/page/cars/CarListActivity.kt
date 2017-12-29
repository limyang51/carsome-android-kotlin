package com.example.louis.carsomeandroidkotlin.page.cars

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.example.louis.carsomeandroidkotlin.R
import com.example.louis.carsomeandroidkotlin.adapter.CarsAdapter
import com.example.louis.carsomeandroidkotlin.base.BaseActivity
import com.example.louis.carsomeandroidkotlin.databinding.ActivityCarDetailBinding
import com.example.louis.carsomeandroidkotlin.model.Car
import kotlinx.android.synthetic.main.activity_car_list.*
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.DefaultItemAnimator





class CarListActivity : BaseActivity<ActivityCarDetailBinding, CarListViewModel>() {

    lateinit var recyclerView: RecyclerView
    lateinit var carAdapter: CarsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDataBinding()
        mViewModel.setupDummyData()
        setupRecycleView()

    }

    override fun getViewModel(): CarListViewModel { return CarListViewModel() }

    override fun getContextType(): Any { return this }

    override fun getLayoutId(): Int { return R.layout.activity_car_list }

    private fun setupRecycleView(){
        carAdapter = CarsAdapter(mViewModel.carList)
        recyclerView = cars_recycle_view
        val mLayoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = mLayoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = carAdapter
    }

}
