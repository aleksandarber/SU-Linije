package com.example.suboticaautobusi.fragments.Lanes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.suboticaautobusi.R
import com.example.suboticaautobusi.databinding.FragmentLane1ABinding
import com.example.suboticaautobusi.databinding.FragmentLane2Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Lane_1A_Fragment : Fragment() {

    private lateinit var binding: FragmentLane1ABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLane1ABinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        //OR
        binding.OR1.text = "04:45 od M"
        binding.OR2.text = "05:10"
        binding.OR3.text = "05:10 od M"
        binding.OR4.text = "05:30"
        binding.OR5.text = "06:00"
        binding.OR6.text = "06:30"
        binding.OR7.text = "06:55"
        binding.OR8.text = "07:25"
        binding.OR9.text = "07:55"
        binding.OR10.text = "08:25"
        binding.OR11.text = "08:55"
        binding.OR12.text = "09:25"
        binding.OR13.text = "09:55"
        binding.OR14.text = "10:25"
        binding.OR15.text = "10:55"
        binding.OR16.text = "11:25"
        binding.OR17.text = "11:55"
        binding.OR18.text = "12:25"
        binding.OR19.text = "12:55"
        binding.OR20.text = "13:25"
        binding.OR21.text = "14:00"
        binding.OR22.text = "14:25"
        binding.OR23.text = "14:55"
        binding.OR24.text = "15:25"
        binding.OR25.text = "15:50"
        binding.OR26.text = "16:25"
        binding.OR27.text = "16:55"
        binding.OR28.text = "17:25"
        binding.OR29.text = "17:55"
        binding.OR30.text = "18:40"
        binding.OR31.text = "19:00"
        binding.OR32.text = "19:25"
        binding.OR33.text = "20:05"
        binding.OR34.text = "21:00"
        binding.OR35.text = "22:10"
        binding.OR36.text = "22:45 do J"

        //OV
        binding.OV1.text = "04:55 od M"
        binding.OV2.text = "05:20"
        binding.OV3.text = "06:00"
        binding.OV4.text = "06:15 od M"
        binding.OV5.text = "06:40"
        binding.OV6.text = "07:10"
        binding.OV7.text = "07:45"
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
        binding.OV21.text = "15:05"
        binding.OV22.text = "16:00"
        binding.OV23.text = "17:00"
        binding.OV24.text = "18:00"
        binding.OV25.text = "19:00"
        binding.OV26.text = "20:00"
        binding.OV27.text = "21:00"
        binding.OV28.text = "22:10"
        binding.OV29.text = "22:40 do J"

        //PR
        binding.PR1.text = "04:45 od J"
        binding.PR2.text = "05:05"
        binding.PR3.text = "05:15 od J"
        binding.PR4.text = "05:30"
        binding.PR5.text = "06:00"
        binding.PR6.text = "06:30"
        binding.PR7.text = "06:55"
        binding.PR8.text = "07:10"
        binding.PR9.text = "07:40"
        binding.PR10.text = "08:10"
        binding.PR11.text = "08:40"
        binding.PR12.text = "09:10"
        binding.PR13.text = "09:40"
        binding.PR14.text = "10:10"
        binding.PR15.text = "10:40"
        binding.PR16.text = "11:10"
        binding.PR17.text = "11:40"
        binding.PR18.text = "12:10"
        binding.PR19.text = "12:40"
        binding.PR20.text = "13:10"
        binding.PR21.text = "13:40"
        binding.PR22.text = "14:05"
        binding.PR23.text = "14:40"
        binding.PR24.text = "15:10"
        binding.PR25.text = "15:40"
        binding.PR26.text = "16:10"
        binding.PR27.text = "16:40"
        binding.PR28.text = "17:10"
        binding.PR29.text = "17:40"
        binding.PR30.text = "18:15"
        binding.PR31.text = "18:40"
        binding.PR32.text = "19:20"
        binding.PR33.text = "19:40"
        binding.PR34.text = "20:10"
        binding.PR35.text = "21:00"
        binding.PR36.text = "22:10"
        binding.PR37.text = "22:40 do M"

        //PV
        binding.PV1.text = "05:05 od J"
        binding.PV2.text = "05:10"
        binding.PV3.text = "06:00"
        binding.PV4.text = "06:30"
        binding.PV5.text = "07:00"
        binding.PV6.text = "07:35"
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
        binding.PV19.text = "14:20"
        binding.PV20.text = "15:05"
        binding.PV21.text = "16:00"
        binding.PV22.text = "17:00"
        binding.PV23.text = "18:00"
        binding.PV24.text = "19:00"
        binding.PV25.text = "20:00"
        binding.PV26.text = "21:00"
        binding.PV27.text = "22:05"
        binding.PV28.text = "22:45 do M"
    }
}