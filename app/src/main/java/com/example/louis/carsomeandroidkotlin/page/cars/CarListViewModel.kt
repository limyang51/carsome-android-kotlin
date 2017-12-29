package com.example.louis.carsomeandroidkotlin.page.cars

import android.util.Log
import android.view.View
import com.example.louis.carsomeandroidkotlin.R
import com.example.louis.carsomeandroidkotlin.adapter.CarsAdapter
import com.example.louis.carsomeandroidkotlin.base.ViewModel
import com.example.louis.carsomeandroidkotlin.model.Car
import com.example.louis.carsomeandroidkotlin.util.APPConfig

/**
 * Created by Louis on 28/12/2017.
 */
class CarListViewModel: ViewModel<CarListNavigator>(), CarsAdapter.OnItemClickListener {

    var carList: ArrayList<Car> = APPConfig.carList


    override fun onItemClick(view: View, position: Int) {
        Log.d("RecycleViewClick", "position at $position name: " + carList[position].name)
        getNavigator().toCarDetailActivity(position)
    }





}