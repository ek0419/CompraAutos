package com.example.compraautos.ui.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.compraautos.R
import com.example.compraautos.databinding.ActivityMainBinding
import com.example.compraautos.ui.fragments.ComprasFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        init()
        setContentView(binding.root)
    }

    fun init(){

        supportFragmentManager.beginTransaction().add(R.id.flContainer,ComprasFragment()).commit()
    }
}