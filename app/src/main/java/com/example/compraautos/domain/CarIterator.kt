package com.example.compraautos.domain

import com.example.compraautos.data.repository.CarRepository

/**
Created by Omy on 26,agosto,2021
 */
class CarIterator {
    val repository = CarRepository()
    suspend operator fun invoke() = repository.getDataRepository()

}
