package com.example.suboticaautobusi.fragments.Lanes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.suboticaautobusi.R
import com.example.suboticaautobusi.databinding.FragmentLane2Binding
import com.example.suboticaautobusi.databinding.FragmentLane4Binding
import com.example.suboticaautobusi.databinding.FragmentLane9Binding

class Lane_9_Fragment : Fragment() {

    private lateinit var binding: FragmentLane9Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLane9Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        //or
        binding.OR1.text =  "06:20"
        binding.OR2.text =  "07:25"

        //pr
        binding.PR1.text =  "15:15"
        binding.PR2.text =  "16:15"
    }
}