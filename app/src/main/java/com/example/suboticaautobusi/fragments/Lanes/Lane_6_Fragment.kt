package com.example.suboticaautobusi.fragments.Lanes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.suboticaautobusi.R
import com.example.suboticaautobusi.databinding.FragmentLane1ABinding
import com.example.suboticaautobusi.databinding.FragmentLane2Binding
import com.example.suboticaautobusi.databinding.FragmentLane6Binding

class Lane_6_Fragment : Fragment() {

    private lateinit var binding: FragmentLane6Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLane6Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        //OR
        binding.OR1.text = "04:45 od G"
        binding.OR2.text = "05:00"
        binding.OR3.text = "05:20"
        binding.OR4.text = "05:20 od G"
        binding.OR5.text = "05:45"
        binding.OR6.text = "06:00"
        binding.OR7.text = "06:20"
        binding.OR8.text = "06:40"
        binding.OR9.text = "07:00 A"
        binding.OR10.text = "07:20"
        binding.OR11.text = "07:40"
        binding.OR12.text = "08:00"
        binding.OR13.text = "08:25"
        binding.OR14.text = "08:40"
        binding.OR15.text = "09:00"
        binding.OR16.text = "09:30"
        binding.OR17.text = "10:00"
        binding.OR18.text = "10:30"
        binding.OR19.text = "11:00"
        binding.OR20.text = "11:30"
        binding.OR21.text = "12:00"
        binding.OR22.text = "12:20"
        binding.OR23.text = "12:40"
        binding.OR24.text = "13:00"
        binding.OR25.text = "13:20"
        binding.OR26.text = "13:40"
        binding.OR27.text = "14:10"
        binding.OR28.text = "14:20"
        binding.OR29.text = "14:45"
        binding.OR30.text = "15:15"
        binding.OR31.text = "15:20 A"
        binding.OR32.text = "15:40"
        binding.OR33.text = "16:05"
        binding.OR34.text = "16:20"
        binding.OR35.text = "16:50"
        binding.OR36.text = "17:25"
        binding.OR37.text = "17:55"
        binding.OR38.text = "18:25"
        binding.OR39.text = "18:55"
        binding.OR40.text = "19:25"
        binding.OR41.text = "20:15"
        binding.OR42.text = "20:45"
        binding.OR43.text = "21:30"
        binding.OR44.text = "22:15"
        binding.OR45.text = "22:40 do G"
        //OV
        binding.OV1.text = "05:00 od G"
        binding.OV2.text = "05:25"
        binding.OV3.text = "06:10"
        binding.OV4.text = "06:55 od G"
        binding.OV5.text = "07:00"
        binding.OV6.text = "07:25"
        binding.OV7.text = "07:55"
        binding.OV8.text = "08:25"
        binding.OV9.text = "08:55"
        binding.OV10.text = "09:25"
        binding.OV11.text = "09:55"
        binding.OV12.text = "10:25"
        binding.OV13.text = "10:55"
        binding.OV14.text = "11:25"
        binding.OV15.text = "11:55"
        binding.OV16.text = "12:25"
        binding.OV17.text = "12:55"
        binding.OV18.text = "13:25"
        binding.OV19.text = "13:55"
        binding.OV20.text = "14:20"
        binding.OV21.text = "14:55"
        binding.OV22.text = "15:25"
        binding.OV23.text = "15:55"
        binding.OV24.text = "16:25"
        binding.OV25.text = "16:55"
        binding.OV26.text = "17:25"
        binding.OV27.text = "17:55"
        binding.OV28.text = "18:25"
        binding.OV29.text = "18:55"
        binding.OV30.text = "19:20"
        binding.OV31.text = "19:45"
        binding.OV32.text = "20:30"
        binding.OV33.text = "20:50 do G"
        binding.OV34.text = "21:15"
        binding.OV35.text = "22:15"
        binding.OV36.text = "22:35 do G"
        //PR
        binding.PR1.text = "04:40 od G"
        binding.PR2.text = "05:00 od G"
        binding.PR3.text = "05:05 "
        binding.PR4.text = "05:20 od G"
        binding.PR5.text = "05:35 "
        binding.PR6.text = "05:50 "
        binding.PR7.text = "06:00 A"
        binding.PR8.text = "06:30 "
        binding.PR9.text = "06:50 "
        binding.PR10.text = "07:10"
        binding.PR11.text = "07:30"
        binding.PR12.text = "07:50"
        binding.PR13.text = "08:10"
        binding.PR14.text = "08:30"
        binding.PR15.text = "08:50"
        binding.PR16.text = "09:10"
        binding.PR17.text = "09:45"
        binding.PR18.text = "10:15"
        binding.PR19.text = "10:45"
        binding.PR20.text = "11:15"
        binding.PR21.text = "11:45"
        binding.PR22.text = "12:15"
        binding.PR23.text = "12:43"
        binding.PR24.text = "13:10"
        binding.PR25.text = "13:30"
        binding.PR26.text = "13:50"
        binding.PR27.text = "14:10"
        binding.PR28.text = "14:30 A"
        binding.PR29.text = "14:55"
        binding.PR30.text = "15:10"
        binding.PR31.text = "15:30"
        binding.PR32.text = "16:00"
        binding.PR33.text = "16:20"
        binding.PR34.text = "16:40"
        binding.PR35.text = "17:10"
        binding.PR36.text = "17:40"
        binding.PR37.text = "18:10"
        binding.PR38.text = "18:40"
        binding.PR39.text = "19:10"
        binding.PR40.text = "19:40"
        binding.PR41.text = "20:10"
        binding.PR42.text = "20:55"
        binding.PR43.text = "21:30"
        binding.PR44.text = "22:05"
        binding.PR45.text = "22:45 do G"
        //PV
        binding.PV1.text = "05:05 od G"
        binding.PV2.text = "05:10"
        binding.PV3.text = "06:00"
        binding.PV4.text = "06:45"
        binding.PV5.text = "07:10"
        binding.PV6.text = "07:40"
        binding.PV7.text = "08:10"
        binding.PV8.text = "08:40"
        binding.PV9.text = "09:10"
        binding.PV10.text = "09:40"
        binding.PV11.text = "10:10"
        binding.PV12.text = "10:40"
        binding.PV13.text = "11:10"
        binding.PV14.text = "11:40"
        binding.PV15.text = "12:10"
        binding.PV16.text = "12:40"
        binding.PV17.text = "13:10"
        binding.PV18.text = "13:40"
        binding.PV19.text = "14:10"
        binding.PV20.text = "14:40"
        binding.PV21.text = "15:10"
        binding.PV22.text = "15:40"
        binding.PV23.text = "16:10"
        binding.PV24.text = "16:40"
        binding.PV25.text = "17:10"
        binding.PV26.text = "17:40"
        binding.PV27.text = "18:10"
        binding.PV28.text = "18:40"
        binding.PV29.text = "19:10"
        binding.PV30.text = "19:45"
        binding.PV31.text = "20:10"
        binding.PV32.text = "20:30"
        binding.PV33.text = "21:15"
        binding.PV34.text = "22:03"
        binding.PV35.text = "22:40 do G"
    }

}