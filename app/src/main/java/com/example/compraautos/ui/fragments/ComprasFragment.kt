package com.example.compraautos.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.compraautos.R
import com.example.compraautos.data.model.CarsModel
import com.example.compraautos.databinding.FragmentComprasBinding
import com.example.compraautos.ui.adapters.CarAdapter
import com.example.compraautos.ui.viewmodel.CarViewModel


class ComprasFragment : Fragment() {

    lateinit var binding : FragmentComprasBinding
    private val viewModel : CarViewModel by viewModels()
    private val TAG :String = ComprasFragment::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentComprasBinding.inflate(LayoutInflater.from(activity))
        init()
        return binding.root
    }

    fun init(){
        viewModel.onCreateViewModel()
        viewModel.liveData.observe(viewLifecycleOwner, Observer {

           initRecycler(it)

        })
    }

    fun initRecycler(lits:List<CarsModel>){

        val adapter = CarAdapter(list = lits)
        binding.rvRecivler.layoutManager = LinearLayoutManager(activity)
        binding.rvRecivler.hasFixedSize()
        binding.rvRecivler.computeHorizontalScrollRange()
        binding.rvRecivler.adapter = adapter
    }
}