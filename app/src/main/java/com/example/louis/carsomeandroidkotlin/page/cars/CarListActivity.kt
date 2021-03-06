package com.example.louis.carsomeandroidkotlin.page.cars

import android.content.Intent

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.example.louis.carsomeandroidkotlin.R
import com.example.louis.carsomeandroidkotlin.adapter.CarsAdapter
import com.example.louis.carsomeandroidkotlin.base.BaseActivity
import com.example.louis.carsomeandroidkotlin.databinding.ActivityCarDetailBinding
import kotlinx.android.synthetic.main.activity_car_list.*
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.DefaultItemAnimator
import android.view.Menu
import android.view.MenuItem
import com.example.louis.carsomeandroidkotlin.page.car_detail.CarDetailActivity
import com.example.louis.carsomeandroidkotlin.page.login.LoginActivity
import com.example.louis.carsomeandroidkotlin.util.APPConfig
import com.example.louis.carsomeandroidkotlin.util.SharedPreferences


class CarListActivity : BaseActivity<ActivityCarDetailBinding, CarListViewModel>(), CarListNavigator {

    private lateinit var recyclerView: RecyclerView
    private lateinit var carAdapter: CarsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDataBinding()
        setupRecycleView()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.action_logout -> {
                SharedPreferences.edit(this, false)
                pageTransistor(LoginActivity::class.java)
                finishAffinity()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


    override fun getViewModel(): CarListViewModel { return CarListViewModel() }

    override fun getContextType(): Any { return this }

    override fun getLayoutId(): Int { return R.layout.activity_car_list }

    override fun toCarDetailActivity(int: Int) {
        mIntent = Intent(this, CarDetailActivity::class.java)
        mIntent.putExtra(APPConfig.CarDetailString, int)
        startActivity(mIntent)

    }

    private fun setupRecycleView(){
        carAdapter = CarsAdapter(mViewModel.carList, mViewModel)
        recyclerView = cars_recycle_view
        val mLayoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = mLayoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = carAdapter
    }

}
