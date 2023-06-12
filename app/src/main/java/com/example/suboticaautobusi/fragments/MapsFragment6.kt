package com.example.suboticaautobusi.fragments

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.suboticaautobusi.R

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsFragment6 : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->

        val zoom = 12.6f
        val subotica = LatLng(46.1050, 19.6656)
        //starting camera posiont
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(subotica,zoom))

        //markers

        val six1 = MarkerOptions().position(LatLng(46.075245, 19.636079))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six2 = MarkerOptions().position(LatLng(46.078033, 19.632803))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six3 = MarkerOptions().position(LatLng(46.080014, 19.635712))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six4 = MarkerOptions().position(LatLng(46.082974, 19.636383))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six5 = MarkerOptions().position(LatLng(46.086403, 19.641251))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six6 = MarkerOptions().position(LatLng(46.088909, 19.644688))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six7 = MarkerOptions().position(LatLng(46.091493, 19.648482))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six8 = MarkerOptions().position(LatLng(46.093186, 19.651239))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six9 = MarkerOptions().position(LatLng(46.094711, 19.653831))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six10 = MarkerOptions().position(LatLng(46.096400, 19.656675))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six11 = MarkerOptions().position(LatLng(46.098342, 19.660004))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six12 = MarkerOptions().position(LatLng(46.097395, 19.662289))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six13 = MarkerOptions().position(LatLng(46.097236, 19.664401))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six14 = MarkerOptions().position(LatLng(46.099484, 19.669972))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six15 = MarkerOptions().position(LatLng(46.100101, 19.675394))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six16 = MarkerOptions().position(LatLng(46.099883, 19.680651))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six17 = MarkerOptions().position(LatLng(46.099805, 19.682633))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six18 = MarkerOptions().position(LatLng(46.099903, 19.686150))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six19 = MarkerOptions().position(LatLng(46.100279, 19.688041))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six20 = MarkerOptions().position(LatLng(46.100963, 19.691490))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six21 = MarkerOptions().position(LatLng(46.101370, 19.694616))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six22 = MarkerOptions().position(LatLng(46.101891, 19.699314))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six23 = MarkerOptions().position(LatLng(46.103431, 19.713093))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six24 = MarkerOptions().position(LatLng(46.105030, 19.728697))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six25 = MarkerOptions().position(LatLng(46.103794, 19.742793))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six26 = MarkerOptions().position(LatLng(46.102941, 19.752418))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six27 = MarkerOptions().position(LatLng(46.102320, 19.758711))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six28 = MarkerOptions().position(LatLng(46.102227, 19.760819))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six29 = MarkerOptions().position(LatLng(46.102067, 19.762316))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six30 = MarkerOptions().position(LatLng(46.099675, 19.764530))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six31 = MarkerOptions().position(LatLng(46.094170, 19.766487))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val six32 = MarkerOptions().position(LatLng(46.088535, 19.768128))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))


        //placing markers
        googleMap.addMarker(six1)
        googleMap.addMarker(six2)
        googleMap.addMarker(six3)
        googleMap.addMarker(six4)
        googleMap.addMarker(six5)
        googleMap.addMarker(six6)
        googleMap.addMarker(six7)
        googleMap.addMarker(six8)
        googleMap.addMarker(six9)
        googleMap.addMarker(six10)
        googleMap.addMarker(six11)
        googleMap.addMarker(six12)
        googleMap.addMarker(six13)
        googleMap.addMarker(six14)
        googleMap.addMarker(six15)
        googleMap.addMarker(six16)
        googleMap.addMarker(six17)
        googleMap.addMarker(six18)
        googleMap.addMarker(six19)
        googleMap.addMarker(six20)
        googleMap.addMarker(six21)
        googleMap.addMarker(six22)
        googleMap.addMarker(six23)
        googleMap.addMarker(six24)
        googleMap.addMarker(six25)
        googleMap.addMarker(six26)
        googleMap.addMarker(six27)
        googleMap.addMarker(six28)
        googleMap.addMarker(six29)
        googleMap.addMarker(six30)
        googleMap.addMarker(six31)
        googleMap.addMarker(six32)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps6, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}