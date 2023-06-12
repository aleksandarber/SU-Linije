package com.example.suboticaautobusi.fragments.Lanes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.suboticaautobusi.R
import com.example.suboticaautobusi.databinding.FragmentLane10Binding
import com.example.suboticaautobusi.databinding.FragmentLane2Binding
import com.example.suboticaautobusi.databinding.FragmentLane4Binding
import com.example.suboticaautobusi.databinding.FragmentLane9Binding

class Lane_10_Fragment : Fragment() {

    private lateinit var binding: FragmentLane10Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLane10Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        //or
        binding.OR1.text =  "06:15"

        //pr
        binding.PR1.text =  "14:05"
    }
}