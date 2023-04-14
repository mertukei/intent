package com.example.morningintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.morningintent.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val Nairobi = LatLng(-1.2258426, 36.5584304)
        mMap.addMarker(MarkerOptions().position(Nairobi).title("Marker in Nairobi"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nairobi))

        val kisumu = LatLng(-4.0348342, 39.5261735)
        mMap.addMarker(MarkerOptions().position(kisumu).title("Marker in kisumu"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kisumu))

        val mombasa = LatLng(-0.0749726, 34.5980818)
        mMap.addMarker(MarkerOptions().position(mombasa).title("Marker in mombasa"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mombasa))
    }
}