package com.example.louis.carsomeandroidkotlin.page.car_detail

import com.example.louis.carsomeandroidkotlin.base.ViewModel
import com.example.louis.carsomeandroidkotlin.model.Car
import com.example.louis.carsomeandroidkotlin.util.APPConfig

/**
 * Created by Louis on 28/12/2017.
 */
class CarDetailViewModel: ViewModel<CarDetailNavigator>() {

    lateinit var car: Car
    var position: Int = 0

    fun assignCarData(){
        car = APPConfig.carList[position]

    }


}