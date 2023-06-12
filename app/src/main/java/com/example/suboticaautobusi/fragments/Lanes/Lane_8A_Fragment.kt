package com.example.suboticaautobusi.fragments.Lanes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.suboticaautobusi.R
import com.example.suboticaautobusi.databinding.FragmentLane7Binding
import com.example.suboticaautobusi.databinding.FragmentLane8ABinding
import com.example.suboticaautobusi.databinding.FragmentLane8Binding

class Lane_8A_Fragment : Fragment() {
    private lateinit var binding: FragmentLane8ABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLane8ABinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        //or
        binding.OR1.text = "08:35"
        binding.OR2.text = "09:30"
        binding.OR3.text = "10:30"
        binding.OR4.text = "11:30"
        binding.OR5.text = "12:30"
        binding.OR6.text = "17:15"
        binding.OR7.text = "18:30"
        binding.OR8.text = "19:30"

        //pr
        binding.PR1.text = "08:05"
        binding.PR2.text = "09:00"
        binding.PR3.text = "10:00"
        binding.PR4.text = "11:00"
        binding.PR5.text = "12:00"
        binding.PR6.text = "16:45"
        binding.PR7.text = "18:00"
        binding.PR8.text = "19:00"
        binding.PR9.text = "20:00"
    }
}