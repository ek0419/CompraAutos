package com.example.compraautos.data.network

import android.util.Log
import com.example.compraautos.core.RetrofitHelper
import com.example.compraautos.data.model.CarModel
import com.example.compraautos.data.model.CarsModel

/**
Created by Omy on 26,agosto,2021
 */
class CardService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun executeSerive(): List<CarsModel> {
        val response =  retrofit.create(VentasCliente::class.java).getAutos()

        Log.i("->>>",response.body()?.autos.toString())
        if(response.isSuccessful)
           return (response.body()?.autos?: emptyList()) as List<CarsModel>
        return emptyList()
    }
}