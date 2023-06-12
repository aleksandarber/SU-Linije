package com.example.suboticaautobusi.fragments.Lanes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.suboticaautobusi.R
import com.example.suboticaautobusi.databinding.FragmentLane2Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Lane_2_Fragment : Fragment() {

    private lateinit var binding: FragmentLane2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLane2Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        // ODLAZAK RADNI DAN
        binding.OR1.text = "04:45 od M"
        binding.OR2.text = "05:00"
        binding.OR3.text = "05:30"
        binding.OR4.text = "06:00"
        binding.OR5.text = "06:30"
        binding.OR6.text = "07:05"
        binding.OR7.text = "07:40"
        binding.OR8.text = "08:15"
        binding.OR9.text = "09:25"
        binding.OR10.text = "10:15"
        binding.OR11.text = "10:50"
        binding.OR12.text = "11:25"
        binding.OR13.text = "12:00"
        binding.OR14.text = "12:35"
        binding.OR15.text = "13:10"
        binding.OR16.text = "13:45"
        binding.OR17.text = "14:20"
        binding.OR18.text = "14:55"
        binding.OR19.text = "15:30"
        binding.OR20.text = "16:05"
        binding.OR21.text = "16:55"
        binding.OR22.text = "17:50"
        binding.OR23.text = "18:30"
        binding.OR24.text = "19:10"
        binding.OR25.text = "19:45"
        binding.OR26.text = "20:30"
        binding.OR27.text = "21:35"
        binding.OR28.text = "22:45 do J"

        //ODLAZAK VIKEND
        binding.OV1.text = "05:00"
        binding.OV2.text = "06:00"
        binding.OV3.text = "07:05"
        binding.OV4.text = "08:15"
        binding.OV5.text = "10:20"
        binding.OV6.text = "11:30"
        binding.OV7.text = "12:40"
        binding.OV8.text = "14:00"
        binding.OV9.text = "15:20"
        binding.OV10.text = "16:40"
        binding.OV11.text = "18:30"
        binding.OV12.text = "19:45"

        //POVRATAK RADNI DAN
        binding.PV1.text = "04:45 od J"
        binding.PV2.text = "05:00"
        binding.PV3.text = "05:30"
        binding.PV4.text = "06:00"
        binding.PV5.text = "06:30"
        binding.PV6.text = "07:05"
        binding.PV7.text = "07:40"
        binding.PV8.text = "08:15"
        binding.PV9.text = "09:25"
        binding.PV10.text = "10:15"
        binding.PV11.text = "10:50"
        binding.PV12.text = "11:25"
        binding.PV13.text = "12:00"
        binding.PV14.text = "12:38"
        binding.PV15.text = "13:10"
        binding.PV16.text = "13:45"
        binding.PV17.text = "14:20"
        binding.PV18.text = "14:55"
        binding.PV19.text = "15:30"
        binding.PV20.text = "16:05"
        binding.PV21.text = "16:55"
        binding.PV22.text = "17:50"
        binding.PV23.text = "18:30"
        binding.PV24.text = "19:10"
        binding.PV25.text = "19:45"
        binding.PV26.text = "20:20 do M"
        binding.PV27.text = "21:00"
        binding.PV28.text = "22:15"

        //POVRATAK VIKEND
        binding.PR1.text = "04:45 od J"
        binding.PR2.text = "05:30"
        binding.PR3.text = "06:30"
        binding.PR4.text = "07:40"
        binding.PR5.text = "09:25"
        binding.PR6.text = "10:55"
        binding.PR7.text = "12:05"
        binding.PR8.text = "13:20"
        binding.PR9.text = "14:40"
        binding.PR10.text = "16:00"
        binding.PR11.text = "17:40"
        binding.PR12.text = "19:10"
        binding.PR13.text = "20:20 do M"

    }
}