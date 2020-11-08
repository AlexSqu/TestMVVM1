package com.example.testmvvm1.viewmodel

import android.app.Activity
import android.os.CountDownTimer
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testmvvm1.dataclasses.Products
import com.example.testmvvm1.model.ApiService
import com.example.testmvvm1.view.BASE_URL
import com.example.testmvvm1.view.MainActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ViewModelMain : ViewModel() {

    val livedata = MutableLiveData<Products>()

init {
    retrofitstart()
}


fun retrofitstart(){
    val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    val api = retrofit.create(ApiService::class.java)

    api.fetchAllData().enqueue(object : Callback<Products> {
        override fun onResponse(call: Call<Products>, response: Response<Products>) {
            //   val k = response.body()!!.data[0].name
            //   val p = response.body()!!.data[0].attributes.boxing
            //   Toast.makeText(applicationContext, k[0].offers.data[0].deliveryInfo.nearestDeliveryDate, Toast.LENGTH_LONG).show()
            //   Toast.makeText(applicationContext, k,  Toast.LENGTH_LONG).show()
            //showData(response.body()!!)
            livedata.value = response.body()!!
        }
        override fun onFailure(call: Call<Products>, t: Throwable) {

        }
    })
}

}