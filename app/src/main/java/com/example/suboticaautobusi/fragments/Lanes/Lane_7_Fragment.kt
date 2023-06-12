package com.example.suboticaautobusi.fragments.Lanes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.suboticaautobusi.R
import com.example.suboticaautobusi.databinding.FragmentLane2Binding
import com.example.suboticaautobusi.databinding.FragmentLane7Binding

class Lane_7_Fragment : Fragment() {

    private lateinit var binding: FragmentLane7Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLane7Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        //ov
        binding.OV1.text = "00:00"
        binding.OV2.text = "01:30"
        binding.OV3.text = "02:30"

        //pv
        binding.PV1.text = "00:45"
        binding.PV2.text = "02:15"
        binding.PV3.text = "02:50"

        //pr
        binding.PR1.text = "23:15"
    }
}