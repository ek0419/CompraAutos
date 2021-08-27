package com.example.compraautos.data.repository

import com.example.compraautos.data.model.CarsModel
import com.example.compraautos.data.network.CardService

/**
Created by Omy on 26,agosto,2021
 */
class CarRepository {
    private val api = CardService()

    suspend fun getDataRepository(): List<CarsModel> {
        return api.executeSerive()
    }
}