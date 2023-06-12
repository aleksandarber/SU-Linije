package com.example.suboticaautobusi.fragments

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.suboticaautobusi.R
import com.google.android.gms.maps.CameraUpdateFactory

import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsFragment1a : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->



        val zoom = 12.6f
        val subotica = LatLng(46.1050, 19.6656)
        //starting camera posiont
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(subotica,zoom))

        //markers

        //3
        val oneA1 = MarkerOptions().position(LatLng(46.124121, 19.611471))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA2 = MarkerOptions().position(LatLng(46.119185, 19.622046))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA3 = MarkerOptions().position(LatLng(46.119185, 19.622046))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA4 = MarkerOptions().position(LatLng(46.113778, 19.632766))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA5 = MarkerOptions().position(LatLng(46.111341, 19.636898))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA6 = MarkerOptions().position(LatLng(46.107139, 19.643758))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA7 = MarkerOptions().position(LatLng(46.104009, 19.648080))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA8 = MarkerOptions().position(LatLng(46.100045, 19.653454))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA9 = MarkerOptions().position(LatLng(46.097617, 19.656691))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA10 = MarkerOptions().position(LatLng(46.098370, 19.660073))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA11 = MarkerOptions().position(LatLng(46.101285, 19.660550))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA12 = MarkerOptions().position(LatLng(46.103204, 19.664095))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA13 = MarkerOptions().position(LatLng(46.103746, 19.665603))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA14 = MarkerOptions().position(LatLng(46.104257, 19.667693))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA15 = MarkerOptions().position(LatLng(46.102801, 19.668327))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA16 = MarkerOptions().position(LatLng(46.100639, 19.669492))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA17 = MarkerOptions().position(LatLng(46.101642, 19.669032))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA18 = MarkerOptions().position(LatLng(46.097598, 19.670971))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA19 = MarkerOptions().position(LatLng(46.094634, 19.674365))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA20 = MarkerOptions().position(LatLng(46.091139, 19.680306))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA21 = MarkerOptions().position(LatLng(46.088248, 19.683521))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA22 = MarkerOptions().position(LatLng(46.085719, 19.678830))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA23 = MarkerOptions().position(LatLng(46.083897, 19.673733))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA24 = MarkerOptions().position(LatLng(46.082684, 19.672582))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA25 = MarkerOptions().position(LatLng(46.078270, 19.666625))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA26 = MarkerOptions().position(LatLng(46.079024, 19.666536))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA27 = MarkerOptions().position(LatLng(46.075550, 19.670334))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA28 = MarkerOptions().position(LatLng(46.071546, 19.674043))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA29 = MarkerOptions().position(LatLng(46.069131, 19.670736))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA30 = MarkerOptions().position(LatLng(46.067686, 19.668590))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA31 = MarkerOptions().position(LatLng(46.066104, 19.670197))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val oneA32 = MarkerOptions().position(LatLng(46.066229, 19.674806))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))


        //placing markers
        googleMap.addMarker(oneA1)
        googleMap.addMarker(oneA2)
        googleMap.addMarker(oneA3)
        googleMap.addMarker(oneA4)
        googleMap.addMarker(oneA5)
        googleMap.addMarker(oneA6)
        googleMap.addMarker(oneA7)
        googleMap.addMarker(oneA8)
        googleMap.addMarker(oneA9)
        googleMap.addMarker(oneA10)
        googleMap.addMarker(oneA11)
        googleMap.addMarker(oneA12)
        googleMap.addMarker(oneA13)
        googleMap.addMarker(oneA14)
        googleMap.addMarker(oneA15)
        googleMap.addMarker(oneA16)
        googleMap.addMarker(oneA17)
        googleMap.addMarker(oneA18)
        googleMap.addMarker(oneA19)
        googleMap.addMarker(oneA20)
        googleMap.addMarker(oneA21)
        googleMap.addMarker(oneA22)
        googleMap.addMarker(oneA23)
        googleMap.addMarker(oneA24)
        googleMap.addMarker(oneA25)
        googleMap.addMarker(oneA26)
        googleMap.addMarker(oneA27)
        googleMap.addMarker(oneA28)
        googleMap.addMarker(oneA29)
        googleMap.addMarker(oneA30)
        googleMap.addMarker(oneA31)
        googleMap.addMarker(oneA32)
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_maps_fragment1a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}