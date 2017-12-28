package com.example.louis.carsomeandroidkotlin.base

import android.databinding.BaseObservable

/**
 * Created by Louis on 28/12/2017.
 */
abstract class ViewModel<N>: BaseObservable() {

    private var mNavigator: N? = null


    open fun assignInterface(context: Any){
        this.mNavigator = context as N
    }

    fun getNavigator(): N {
        return this.mNavigator!!
    }
}