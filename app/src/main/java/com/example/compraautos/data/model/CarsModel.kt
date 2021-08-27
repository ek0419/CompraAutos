package com.example.compraautos.data.model

import com.google.gson.annotations.SerializedName

/**
Created by Omy on 26,agosto,2021
 */
data class CarsModel(
    @SerializedName("id")
    val id : String,
    @SerializedName("marca")
    val marca : String,
    @SerializedName("modelo")
    val modelo : String,
    @SerializedName("precio")
    val precio : String
)
