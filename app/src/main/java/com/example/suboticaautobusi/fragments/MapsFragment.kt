package com.example.suboticaautobusi.fragments

import android.content.Context
import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.suboticaautobusi.MainActivity
import com.example.suboticaautobusi.R
import com.example.suboticaautobusi.mapsLine.DataParser
import com.example.suboticaautobusi.mapsLine.FetchURL
import com.example.suboticaautobusi.mapsLine.TaskLoadedCallback

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapFragment
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.Polyline
import com.google.android.gms.maps.model.PolylineOptions
import java.util.concurrent.Executors

class MapsFragment : Fragment(), TaskLoadedCallback {

    private lateinit var googleMap: GoogleMap
    private lateinit var currentPolyline: Polyline

    private val callback = OnMapReadyCallback { googleMap ->
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */

        //subotica marker
        val zoom = 12.6f
        val subotica = LatLng(46.1050, 19.6656)

        //starting camera posiont
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(subotica,zoom))

        //markers

        //3
        val three1 = MarkerOptions().position(LatLng(46.150162, 19.672327))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three2 = MarkerOptions().position(LatLng(46.145374, 19.676321))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three3 = MarkerOptions().position(LatLng(46.139813, 19.681610))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three4 = MarkerOptions().position(LatLng(46.133940, 19.677872))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three5 = MarkerOptions().position(LatLng(46.130683, 19.674501))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three6 = MarkerOptions().position(LatLng(46.125610, 19.676869))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three7 = MarkerOptions().position(LatLng(46.118673, 19.673934))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three8 = MarkerOptions().position(LatLng(46.114854, 19.672640))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three9 = MarkerOptions().position(LatLng(46.111081, 19.669966))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three10 = MarkerOptions().position(LatLng(46.107598, 19.670159))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three11 = MarkerOptions().position(LatLng(46.101776, 19.673271))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three12 = MarkerOptions().position(LatLng(46.099436, 19.669743))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three13 = MarkerOptions().position(LatLng(46.097230, 19.664456))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three14 = MarkerOptions().position(LatLng(46.097438, 19.662228))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three15 = MarkerOptions().position(LatLng(46.098337, 19.659976))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three16 = MarkerOptions().position(LatLng(46.097580, 19.656698))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three17 = MarkerOptions().position(LatLng(46.099624, 19.653070))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three18 = MarkerOptions().position(LatLng(46.100506, 19.648017))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three19 = MarkerOptions().position(LatLng(46.101540, 19.643613))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three20 = MarkerOptions().position(LatLng(46.102700, 19.639266))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three21 = MarkerOptions().position(LatLng(46.102689, 19.634492))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three22 = MarkerOptions().position(LatLng(46.102665, 19.631289))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))
        val three23 = MarkerOptions().position(LatLng(46.101690, 19.624384))
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_blue48))


        //placing markers

        //3
        googleMap.addMarker(three1)
        googleMap.addMarker(three2)
        googleMap.addMarker(three3)
        googleMap.addMarker(three4)
        googleMap.addMarker(three5)
        googleMap.addMarker(three6)
        googleMap.addMarker(three7)
        googleMap.addMarker(three8)
        googleMap.addMarker(three9)
        googleMap.addMarker(three10)
        googleMap.addMarker(three11)
        googleMap.addMarker(three12)
        googleMap.addMarker(three13)
        googleMap.addMarker(three14)
        googleMap.addMarker(three15)
        googleMap.addMarker(three16)
        googleMap.addMarker(three17)
        googleMap.addMarker(three18)
        googleMap.addMarker(three19)
        googleMap.addMarker(three20)
        googleMap.addMarker(three21)
        googleMap.addMarker(three22)
        googleMap.addMarker(three23)


        //line
        //FetchURL(context).execute(getUrl(three1.position,three2.position,"driving"),"driving")


        //subotica marker
        //googleMap.addMarker(MarkerOptions().position(subotica).title("SUBOTICA"))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        /*
        //spinner (dropdown)
        val spinner: Spinner? = activity?.findViewById(R.id.lane_dropdown)

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.linije,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner?.adapter = adapter
        }*/

        //end
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }

    private fun getUrl(origin: LatLng, dest: LatLng, directionMode: String): String? {
        // Origin of route
        val str_origin = "origin=" + origin.latitude + "," + origin.longitude
        // Destination of route
        val str_dest = "destination=" + dest.latitude + "," + dest.longitude
        // Mode
        val mode = "mode=$directionMode"
        // Building the parameters to the web service
        val parameters = "$str_origin&$str_dest&$mode"
        // Output format
        val output = "json"
        // Building the url to the web service
        return "https://maps.googleapis.com/maps/api/directions/$output?$parameters&key=" + getString(R.string.API_KEY)
    }

    override fun onTaskDone(vararg values: Any?) {
        if (currentPolyline != null)
            currentPolyline.remove()
        currentPolyline = googleMap.addPolyline(values[0] as PolylineOptions)
    }

}