package com.example.louis.carsomeandroidkotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.louis.carsomeandroidkotlin.R
import com.example.louis.carsomeandroidkotlin.model.Car

import android.view.LayoutInflater



/**
 * Created by Louis on 29/12/2017.
 */
class CarsAdapter(cars: ArrayList<Car>) : RecyclerView.Adapter<CarsAdapter.CarViewHolder>() {


    var carList: ArrayList<Car> = cars

    override fun getItemCount(): Int { return carList.size }

    override fun onBindViewHolder(holder: CarViewHolder?, position: Int) {
        val car: Car = carList[position]
        holder?.image?.setImageResource(car.pictureID)
        holder?.textName?.text = car.name
        holder?.textPrice?.text = car.price
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CarViewHolder {
        val itemView = LayoutInflater.from(parent?.context)
                .inflate(R.layout.car_item, parent, false)

        return CarViewHolder(itemView)
    }


    class CarViewHolder(view: View): RecyclerView.ViewHolder(view) {

        lateinit var listener: OnItemClickListener
        var image: ImageView = view.findViewById(R.id.car_image)
        var textName: TextView = view.findViewById(R.id.car_name)
        var textPrice: TextView = view.findViewById(R.id.car_price)



    }

    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }

}