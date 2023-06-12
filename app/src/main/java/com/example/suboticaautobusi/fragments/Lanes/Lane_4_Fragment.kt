package com.example.suboticaautobusi.fragments.Lanes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.suboticaautobusi.R
import com.example.suboticaautobusi.databinding.FragmentLane2Binding
import com.example.suboticaautobusi.databinding.FragmentLane4Binding

class Lane_4_Fragment : Fragment() {

    private lateinit var binding: FragmentLane4Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLane4Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        //or
        binding.OR1.text =  "04:50"
        binding.OR2.text =  "05:50"
        binding.OR3.text =  "06:50"
        binding.OR4.text =  "08:00"
        binding.OR5.text =  "12:30"
        binding.OR6.text =  "13:30"
        binding.OR7.text =  "14:35"
        binding.OR8.text =  "15:50"
        binding.OR9.text =  "19:30"
        binding.OR10.text = "20:40 do G"
        //pr

        binding.PR1.text =  "05:20"
        binding.PR2.text =  "06:20"
        binding.PR3.text =  "13:00"
        binding.PR4.text =  "14:00"
        binding.PR5.text =  "15:22"
        binding.PR6.text =  "16:20"
        binding.PR7.text =  "18:50 Đ"
        binding.PR8.text =  "20:15"
    }
}