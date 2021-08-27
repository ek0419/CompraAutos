package com.example.compraautos.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
Created by Omy on 26,agosto,2021
 */
object RetrofitHelper {

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://run.mocky.io")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}