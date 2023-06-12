package com.example.suboticaautobusi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.suboticaautobusi.databinding.ActivityMainBinding
import com.example.suboticaautobusi.fragments.*
import com.example.suboticaautobusi.fragments.Lanes.*

class MainActivity : AppCompatActivity()  {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("UseSwitchCompatOrMaterialCode", "WrongViewCast", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        //nav bar
        val homeFragment = HomeFragment()

        makeCurentFragmentStart(homeFragment)

    }

    private fun makeCurentFragment(fragment: Fragment) =
       supportFragmentManager.beginTransaction().apply {
           replace(R.id.container,fragment)
           commit()

           addToBackStack(null)
       }

    private fun makeCurentFragmentStart(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container,fragment)
            commit()
        }

    fun BtnClick(view: View) {

        val lane_1A_Frament = Lane_1A_Fragment()
        val lane_2_Frament = Lane_2_Fragment()
        val lane_3_Frament = Lane_3_Fragment()
        val lane_4_Frament = Lane_4_Fragment()
        val lane_7_Frament = Lane_7_Fragment()
        val lane_8_Frament = Lane_8_Fragment()
        val lane_8A_Frament = Lane_8A_Fragment()
        val lane_9_Frament = Lane_9_Fragment()
        val lane_10_Frament = Lane_10_Fragment()
        val lane_6_Frament = Lane_6_Fragment()
        val lane_16_Frament = Lane_16_Fragment()


        when(view.id){
            R.id.Lane1A -> {makeCurentFragment(lane_1A_Frament)
                val btn = findViewById<TextView>(R.id.lane1a_text)
                btn.translationZ = 100f
            }
            R.id.Lane2 -> makeCurentFragment(lane_2_Frament)
            R.id.Lane3 -> makeCurentFragment(lane_3_Frament)
            R.id.Lane4 -> makeCurentFragment(lane_4_Frament)
            R.id.Lane7 -> makeCurentFragment(lane_7_Frament)
            R.id.Lane8 -> makeCurentFragment(lane_8_Frament)
            R.id.Lane8A -> makeCurentFragment(lane_8A_Frament)
            R.id.Lane9 -> makeCurentFragment(lane_9_Frament)
            R.id.Lane10 -> makeCurentFragment(lane_10_Frament)
            R.id.Lane6 -> makeCurentFragment(lane_6_Frament)
            R.id.Lane16 -> makeCurentFragment(lane_16_Frament)
        }

    }

    fun OpenMapClick(view: View){
        val mapsFragmentThree = MapsFragment()
        val mapsFragment1A = MapsFragment1a()
        val mapsFragment16 = MapsFragment16()
        val mapsFragment6 = MapsFragment6()

        when(view.id){
            R.id.Btn3 -> makeCurentFragment(mapsFragmentThree)
            R.id.Btn1A -> makeCurentFragment(mapsFragment1A)
            R.id.Btn16 -> makeCurentFragment(mapsFragment16)
            R.id.Btn6 -> makeCurentFragment(mapsFragment6)
        }
    }

}