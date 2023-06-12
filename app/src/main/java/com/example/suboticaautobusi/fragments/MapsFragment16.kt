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

class MapsFragment16 : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->



        val zoom = 12.6f
        val subotica = LatLng(46.1050, 19.6656)
        //starting camera posiont
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(subotica,zoom))

        //16
        val sixteen1 = MarkerOptions().position(LatLng(46.113069, 19.685503))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen2 = MarkerOptions().position(LatLng(46.109841, 19.687346))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen3 = MarkerOptions().position(LatLng(46.107423, 19.688677))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen4 = MarkerOptions().position(LatLng(46.106100, 19.689587))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen5 = MarkerOptions().position(LatLng(46.101508, 19.691875))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen6 = MarkerOptions().position(LatLng(46.100929, 19.691177))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen7 = MarkerOptions().position(LatLng(46.100283, 19.688023))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen8 = MarkerOptions().position(LatLng(46.099930, 19.686195))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen9 = MarkerOptions().position(LatLng(46.099789, 19.682650))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen10 = MarkerOptions().position(LatLng(46.099911, 19.680621))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen11 = MarkerOptions().position(LatLng(46.100090, 19.675358))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen12 = MarkerOptions().position(LatLng(46.099494, 19.669920))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen13 = MarkerOptions().position(LatLng(46.097224, 19.664380))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen14 = MarkerOptions().position(LatLng(46.096206, 19.661651))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen15 = MarkerOptions().position(LatLng(46.095057, 19.660553))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen16 = MarkerOptions().position(LatLng(46.094376, 19.659947))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen17 = MarkerOptions().position(LatLng(46.090208, 19.664942))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen18 = MarkerOptions().position(LatLng(46.089472, 19.665911))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen19 = MarkerOptions().position(LatLng(46.087508, 19.668412))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen20 = MarkerOptions().position(LatLng(46.086684, 19.669315))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen21 = MarkerOptions().position(LatLng(46.084751, 19.671690))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen22 = MarkerOptions().position(LatLng(46.082026, 19.673962))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen23 = MarkerOptions().position(LatLng(46.075877, 19.677707))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen24 = MarkerOptions().position(LatLng(46.072216, 19.679522))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen25 = MarkerOptions().position(LatLng(46.066276, 19.681262))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val sixteen26 = MarkerOptions().position(LatLng(46.066069, 19.687440))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))

        //placing markers
        googleMap.addMarker(sixteen1)
        googleMap.addMarker(sixteen2)
        googleMap.addMarker(sixteen3)
        googleMap.addMarker(sixteen4)
        googleMap.addMarker(sixteen5)
        googleMap.addMarker(sixteen6)
        googleMap.addMarker(sixteen7)
        googleMap.addMarker(sixteen8)
        googleMap.addMarker(sixteen9)
        googleMap.addMarker(sixteen10)
        googleMap.addMarker(sixteen11)
        googleMap.addMarker(sixteen12)
        googleMap.addMarker(sixteen13)
        googleMap.addMarker(sixteen14)
        googleMap.addMarker(sixteen15)
        googleMap.addMarker(sixteen16)
        googleMap.addMarker(sixteen17)
        googleMap.addMarker(sixteen18)
        googleMap.addMarker(sixteen19)
        googleMap.addMarker(sixteen20)
        googleMap.addMarker(sixteen21)
        googleMap.addMarker(sixteen22)
        googleMap.addMarker(sixteen23)
        googleMap.addMarker(sixteen24)
        googleMap.addMarker(sixteen25)
        googleMap.addMarker(sixteen26)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps16, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}