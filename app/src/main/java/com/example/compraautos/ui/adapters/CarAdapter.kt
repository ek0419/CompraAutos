package com.example.compraautos.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.compraautos.data.model.CarsModel
import com.example.compraautos.databinding.ItemCarBinding

/**
Created by Omy on 26,agosto,2021
 */
class CarAdapter(private val list: List<CarsModel>) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {


    inner class ViewHolder(binding: ItemCarBinding) : RecyclerView.ViewHolder(binding.root) {
        val bindigg = binding
    }

    override fun onCreateViewHolder(group: ViewGroup, viewType: Int): ViewHolder {
      return   ViewHolder(ItemCarBinding.inflate(LayoutInflater.from(group.context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val car = list[position]
        holder.bindigg.tvID.text = car.id
        holder.bindigg.tvMarca.text = car.marca
        holder.bindigg.tvModelo.text = car.modelo
        holder.bindigg.tvPrecio.text = car.precio
    }

    override fun getItemCount(): Int {
       return list.size
    }


}




