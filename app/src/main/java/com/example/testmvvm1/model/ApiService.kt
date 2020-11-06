package com.example.testmvvm1.model

import com.example.testmvvm1.dataclasses.Data
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    fun fetchAllData(): Call<List<data>>


}