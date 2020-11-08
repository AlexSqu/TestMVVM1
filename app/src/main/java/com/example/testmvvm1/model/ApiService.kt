package com.example.testmvvm1.model

import com.example.testmvvm1.dataclasses.Data
import com.example.testmvvm1.dataclasses.Products
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("5db966c630000075005ee2aa")
    fun fetchAllData(): Call<Products>

}