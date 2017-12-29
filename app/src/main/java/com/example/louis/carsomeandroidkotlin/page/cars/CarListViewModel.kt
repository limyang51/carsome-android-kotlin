package com.example.louis.carsomeandroidkotlin.page.cars

import com.example.louis.carsomeandroidkotlin.R
import com.example.louis.carsomeandroidkotlin.base.ViewModel
import com.example.louis.carsomeandroidkotlin.model.Car

/**
 * Created by Louis on 28/12/2017.
 */
class CarListViewModel: ViewModel<CarListNavigator>() {

    var carList: ArrayList<Car> = ArrayList()

    fun setupDummyData(){

        var car = Car(R.drawable.audi, "Audi", "RM100,000")
        carList.add(car)

        car = Car(R.drawable.bmw, "BMW", "RM100,000")
        carList.add(car)

        car = Car(R.drawable.honda, "Honda", "RM100,000")
        carList.add(car)

        car = Car(R.drawable.mazada, "Mazada", "RM100,000")
        carList.add(car)

        car = Car(R.drawable.mercedez, "Mercedes Benz", "RM100,000")
        carList.add(car)

        car = Car(R.drawable.bmw, "BMW", "RM100,000")
        carList.add(car)

        car = Car(R.drawable.peugeot, "Peugeot", "RM100,000")
        carList.add(car)

        car = Car(R.drawable.renault, "Renault", "RM100,000")
        carList.add(car)

        car = Car(R.drawable.swift, "Swift", "RM100,000")
        carList.add(car)

        car = Car(R.drawable.tesla, "Tesla", "  RM100,000")
        carList.add(car)
    }




}