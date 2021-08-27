package com.example.compraautos.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.compraautos.data.model.CarsModel
import com.example.compraautos.domain.CarIterator
import kotlinx.coroutines.launch

/**
Created by Omy on 26,agosto,2021
 */
class CarViewModel:ViewModel() {
    val liveData = MutableLiveData<List<CarsModel>>()
    val interator = CarIterator()

    fun onCreateViewModel(){
        viewModelScope.launch {
            val result = interator()
            if (!result.isNullOrEmpty())
            {
                liveData.postValue(result)
            }
        }

    }

}