package com.example.louis.carsomeandroidkotlin.base

import android.content.Intent
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import com.example.louis.carsomeandroidkotlin.BR


/**
 * Created by Louis on 28/12/2017.
 */
abstract class BaseActivity<T: ViewDataBinding, V: ViewModel<*>>: AppCompatActivity() {

    lateinit var mViewDataBinding: T
    lateinit var mViewModel: V
    lateinit var mIntent: Intent


    fun performDataBinding(){
        mViewModel = getViewModel()
        mViewModel.assignInterface(getContextType())
        mViewDataBinding = DataBindingUtil.setContentView(this, getLayoutId())
        mViewDataBinding.setVariable(BR.vm, mViewModel)

    }

    fun<T> pageTransistor(toActivity: Class<T>) {
        mIntent = Intent(this, toActivity)
        startActivity(mIntent)
    }


    abstract fun getViewModel(): V

    abstract fun getContextType(): Any

    @LayoutRes
    abstract fun getLayoutId(): Int




}