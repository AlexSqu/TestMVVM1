package com.example.testmvvm1.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testmvvm1.R
import com.example.testmvvm1.model.ApiService
import com.example.testmvvm1.dataclasses.Products
import com.example.testmvvm1.viewmodel.ViewModelMain
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
//import kotlinx.android.synthetic.main.activity_main.*

const val BASE_URL = "http://www.mocky.io/v2/"

class MainActivity : AppCompatActivity() {

    lateinit var mViewModel: ViewModelMain



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewModel = ViewModelProvider(this).get(ViewModelMain::class.java)

        
    }

    override fun onStart() {
        super.onStart()
        mViewModel.livedata.observe(this, Observer { showData(it) })
    }

    private fun showData(users: Products) {
        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter = UsersAdapter(users)
        //данные передаются в адаптер, для формирования данных
    }



}