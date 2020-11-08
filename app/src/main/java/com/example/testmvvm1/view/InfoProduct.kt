package com.example.testmvvm1.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.testmvvm1.R
import com.example.testmvvm1.dataclasses.Products
import com.example.testmvvm1.viewmodel.ViewModelMain
import kotlinx.android.synthetic.main.activity_info_product.*
import java.text.FieldPosition

class InfoProduct() : AppCompatActivity() {

    lateinit var mViewModel: ViewModelMain


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_product)

        mViewModel = ViewModelProvider(this).get(ViewModelMain::class.java)

    }


    override fun onStart() {
        super.onStart()
        val position = intent.extras?.getInt("position")
        mViewModel.livedata.observe(this, Observer { textViewName.text = "Name " + it.data[position!!].name })
        mViewModel.livedata.observe(this, Observer { textViewPrice.text = "Price " + it.data[position!!].price })
        mViewModel.livedata.observe(this, Observer { textViewBox.text = "Box " + it.data[position!!].attributes.boxing})
        mViewModel.livedata.observe(this, Observer { textViewDate.text = "Delivery Date " + it.data[position!!].offers.data[0].deliveryInfo.nearestDeliveryDate})
    }

}