package com.example.louis.carsomeandroidkotlin.util

import com.example.louis.carsomeandroidkotlin.R
import com.example.louis.carsomeandroidkotlin.model.Car

/**
 * Created by Louis on 28/12/2017.
 */
object APPConfig {

    const val AuthenticatorString: String = "Logging"
    const val CarDetailString: String = "CarDetail"

    const val DUMMY_CREDENTIALS_ID = "test@carsome.com"
    const val DUMMY_CREDENTIALS_PASS = "qwerqwer"

    val carList: ArrayList<Car> = arrayListOf(
            Car(R.drawable.audi, "Audi", "RM100,000"),
            Car(R.drawable.bmw, "BMW", "RM100,000"),
            Car(R.drawable.honda, "Honda", "RM100,000"),
            Car(R.drawable.mazada, "Mazada", "RM100,000"),
            Car(R.drawable.mercedez, "Mercedes Benz", "RM100,000"),
            Car(R.drawable.bmw, "BMW", "RM100,000"),
            Car(R.drawable.peugeot, "Peugeot", "RM100,000"),
            Car(R.drawable.renault, "Renault", "RM100,000"),
            Car(R.drawable.swift, "Swift", "RM100,000"),
            Car(R.drawable.tesla, "Tesla", "  RM100,000")
            )

}