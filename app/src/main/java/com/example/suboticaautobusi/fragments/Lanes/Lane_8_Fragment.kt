package com.example.suboticaautobusi.fragments.Lanes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.suboticaautobusi.R
import com.example.suboticaautobusi.databinding.FragmentLane7Binding
import com.example.suboticaautobusi.databinding.FragmentLane8Binding

class Lane_8_Fragment : Fragment() {
    private lateinit var binding: FragmentLane8Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLane8Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        //or
        binding.OR1.text = "05:05"
        binding.OR2.text = "06:05"
        binding.OR3.text = "07:05"
        binding.OR4.text = "13:00"
        binding.OR5.text = "14:00"
        binding.OR6.text = "14:35"
        binding.OR7.text = "15:45"

        //pr
        binding.PR1.text = "05:35"
        binding.PR2.text = "06:35"
        binding.PR3.text = "07:35"
        binding.PR4.text = "13:30"
        binding.PR5.text = "14:05"
        binding.PR6.text = "15:15 od Ta"
        binding.PR7.text = "16:15"
    }
}