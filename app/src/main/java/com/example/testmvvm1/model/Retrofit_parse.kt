package com.example.testmvvm1.model

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testmvvm1.R
import com.example.testmvvm1.view.UsersAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//const val BASE_URL = "https://jsonplaceholder.typicode.com/"

/*class Retrofit_parse() {
    //реализация ретрофита
    val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val api = retrofit.create(ApiService::class.java)

        api.fetchAllData().enqueue(object : Callback<List<data>> {
            override fun onResponse(call: Call<List<data>>, response: Response<List<data>>) {
                showData(response.body()!!)
            }
            override fun onFailure(call: Call<List<data>>, t: Throwable) {
                //при ошибке открывается второе окно
            }
        })

    private fun showData(users: List<data>) {
        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter = UsersAdapter(users)
        //данные передаются в адаптер, для формирования данных
    }


}*/