package com.example.compraautos.data.model

import com.google.gson.annotations.SerializedName

/**
Created by Omy on 26,agosto,2021
 */
data class CarModel(
    @SerializedName("autos")
    val autos :List<CarsModel>

)
