package com.example.suboticaautobusi.fragments.Lanes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.suboticaautobusi.R
import com.example.suboticaautobusi.databinding.FragmentLane1ABinding
import com.example.suboticaautobusi.databinding.FragmentLane3Binding

class Lane_3_Fragment : Fragment() {

    private lateinit var binding: FragmentLane3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLane3Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        //OR
        binding.OR1.text = "05:00 od P"
        binding.OR2.text = "05:05"
        binding.OR3.text = "05:25"
        binding.OR4.text = "06:00"
        binding.OR5.text = "06:25"
        binding.OR6.text = "06:45 Đ"
        binding.OR7.text = "07:10"
        binding.OR8.text = "07:30 do L"
        binding.OR9.text = "08:00"
        binding.OR10.text = "08:40"
        binding.OR11.text = "09:20"
        binding.OR12.text = "10:00"
        binding.OR13.text = "10:40"
        binding.OR14.text = "11:20"
        binding.OR15.text = "12:00"
        binding.OR16.text = "12:40"
        binding.OR17.text = "13:00 do LĐ"
        binding.OR18.text = "13:20"
        binding.OR19.text = "14:05"
        binding.OR20.text = "14:45"
        binding.OR21.text = "15:20"
        binding.OR22.text = "16:05"
        binding.OR23.text = "17:00"
        binding.OR24.text = "17:40"
        binding.OR25.text = "18:20"
        binding.OR26.text = "19:00"
        binding.OR27.text = "19:40"
        binding.OR28.text = "20:20"
        binding.OR29.text = "21:00"
        binding.OR30.text = "22:00"
        binding.OR31.text = "22:45 do R"

        //OV
        binding.OV1.text = "05:00"
        binding.OV2.text = "06:00"
        binding.OV3.text = "06:25"
        binding.OV4.text = "07:10"
        binding.OV5.text = "07:45"
        binding.OV6.text = "08:30"
        binding.OV7.text = "09:15"
        binding.OV8.text = "10:00"
        binding.OV9.text = "10:45"
        binding.OV10.text = "11:30"
        binding.OV11.text = "12:15"
        binding.OV12.text = "13:00"
        binding.OV13.text = "13:45"
        binding.OV14.text = "14:30"
        binding.OV15.text = "15:15"
        binding.OV16.text = "16:00"
        binding.OV17.text = "16:45"
        binding.OV18.text = "17:30"
        binding.OV19.text = "18:15"
        binding.OV20.text = "19:00"
        binding.OV21.text = "20:00"
        binding.OV22.text = "21:00"
        binding.OV23.text = "22:45 do R"

        //PR
        binding.PR1.text =  "04:50 od R"
        binding.PR2.text =  "05:10 od R"
        binding.PR3.text =  "05:20 "
        binding.PR4.text =  "05:40 "
        binding.PR5.text =  "05:55 "
        binding.PR6.text =  "06:35 "
        binding.PR7.text =  "07:00 "
        binding.PR8.text =  "07:35 Đ"
        binding.PR9.text =  "08:00 "
        binding.PR10.text = "08:40 "
        binding.PR11.text = "09:20 "
        binding.PR12.text = "10:00 "
        binding.PR13.text = "10:40 "
        binding.PR14.text = "11:20 "
        binding.PR15.text = "12:00 "
        binding.PR16.text = "12:40 "
        binding.PR17.text = "13:20 "
        binding.PR18.text = "14:10 od LĐ"
        binding.PR19.text = "14:15 "
        binding.PR20.text = "14:40 "
        binding.PR21.text = "15:25 "
        binding.PR22.text = "16:10 "
        binding.PR23.text = "17:05 "
        binding.PR24.text = "17:45 "
        binding.PR25.text = "18:20 "
        binding.PR26.text = "19:05 "
        binding.PR27.text = "19:40 "
        binding.PR28.text = "20:20 "
        binding.PR29.text = "21:15 "
        binding.PR30.text = "22:15 "
        binding.PR31.text = "22:30 do O"

        //PV
        binding.PV1.text = "04:50 od R"
        binding.PV2.text = "05:30"
        binding.PV3.text = "05:50 od R"
        binding.PV4.text = "06:40"
        binding.PV5.text = "07:00"
        binding.PV6.text = "07:45"
        binding.PV7.text = "08:30"
        binding.PV8.text = "09:15"
        binding.PV9.text = "10:00"
        binding.PV10.text = "10:45"
        binding.PV11.text = "11:30"
        binding.PV12.text = "12:15"
        binding.PV13.text = "13:00"
        binding.PV14.text = "13:45"
        binding.PV15.text = "14:30"
        binding.PV16.text = "15:15"
        binding.PV17.text = "16:00"
        binding.PV18.text = "16:45"
        binding.PV19.text = "17:30"
        binding.PV20.text = "18:15"
        binding.PV21.text = "19:00"
        binding.PV22.text = "20:00"
        binding.PV23.text = "20:40"
        binding.PV24.text = "22:15"
    }
}