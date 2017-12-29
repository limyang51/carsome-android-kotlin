package com.example.louis.carsomeandroidkotlin.adapter

import android.widget.ImageView

/**
 * Created by Louis on 29/12/2017.
 */
object BindingAdapter {

    @android.databinding.BindingAdapter("android:src")
    @JvmStatic fun setImageViewResource(imageView: ImageView, resource: Int) {
        imageView.setImageResource(resource)
    }
}