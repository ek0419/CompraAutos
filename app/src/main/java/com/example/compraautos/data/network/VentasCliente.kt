package com.example.compraautos.data.network

import com.example.compraautos.data.model.CarModel
import retrofit2.Response
import retrofit2.http.GET

/**
Created by Omy on 26,agosto,2021
 */
interface VentasCliente {
    @GET("/v3/8d1b1cb0-a8fc-41c1-a7a8-3bf1711c62ec")
    suspend fun getAutos():Response<CarModel>
}