package com.example.david.zoneify.zoneView

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.david.zoneify.R
import com.example.david.zoneify.data.Zone
import com.example.david.zoneify.util.Constants.Companion.ZONE_ID
import com.example.david.zoneify.util.getViewModelFactory
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.*
import kotlinx.android.synthetic.main.fragment_zone_location.*
import android.location.Location
import com.example.david.zoneify.data.Direction
import com.example.david.zoneify.util.Constants
import com.example.david.zoneify.util.Constants.Companion.ZONE_ACTIVE
import com.example.david.zoneify.util.Constants.Companion.ZONE_DIRECTION
import com.example.david.zoneify.util.Constants.Companion.ZONE_LAT
import com.example.david.zoneify.util.Constants.Companion.ZONE_LONG
import com.example.david.zoneify.util.Constants.Companion.ZONE_MESSAGE
import com.example.david.zoneify.util.Constants.Companion.ZONE_NAME
import com.example.david.zoneify.util.Constants.Companion.ZONE_RADIUS
import com.google.android.gms.location.LocationServices
import kotlinx.android.synthetic.main.zone_item.*

class ZoneLocationFragment :
    Fragment(),
    OnMapReadyCallback,
    GoogleMap.OnMyLocationButtonClickListener,
    GoogleMap.OnMyLocationClickListener {

    private val zoneViewModel by viewModels<ZoneViewModel> { getViewModelFactory() }
    private lateinit var mMap: GoogleMap
    private var zoneId: Int = -1
    private lateinit var zone: Zone
    private var mRoot: View? = null
    private val TAG = ZoneLocationFragment::class.java.simpleName
    private lateinit var circle: Circle

    companion object {
        var mapFragment : SupportMapFragment?=null

        fun newInstance(id: Int,
                        name: String,
                        lat: Double,
                        long: Double,
                        radius: Int,
                        message: String,
                        active: Boolean,
                        direction: Direction): ZoneLocationFragment {

            val args = Bundle()
            args.putInt(ZONE_ID, id)
            args.putString(ZONE_NAME, name)
            args.putDouble(ZONE_LAT, lat)
            args.putDouble(ZONE_LONG, long)
            args.putInt(ZONE_RADIUS, radius)
            args.putSerializable(ZONE_DIRECTION, direction)
            args.putBoolean(ZONE_ACTIVE, active)
            args.putString(ZONE_MESSAGE, message)

            val fragment = ZoneLocationFragment()
            fragment.arguments = args

            return fragment
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        arguments?.getInt(ZONE_ID)?.let { zoneId = it }

        if (zoneId < 1) {
            val lat = arguments?.getDouble(ZONE_LAT)?.let { it }
            val long = arguments?.getDouble(ZONE_LONG)?.let { it }
            val name = arguments?.getString(ZONE_NAME)?.let { it }
            val radius = arguments?.getInt(ZONE_RADIUS)?.let { it }
            val direction: Direction = arguments?.getSerializable(ZONE_DIRECTION)?.let { it } as Direction
            val active = arguments?.getBoolean(ZONE_ACTIVE)?.let { it }
            val message = arguments?.getString(ZONE_MESSAGE)?.let { it }

            zone = Zone(name!!, LatLng(lat!!, long!!), radius!!, direction, message!!, active!!)
        }
    }

    @SuppressLint("MissingPermission")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?  {

        if (mRoot == null) {

            if (zoneId < 1) {
                this.zoneViewModel.setZone(zone)
            }
            else {
                this.zoneViewModel.loadZoneById(zoneId)
            }

            mRoot = inflater.inflate(R.layout.fragment_zone_location, container, false)
        }

        return mRoot
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mapFragment = childFragmentManager.findFragmentById(R.id.zoneLocationMap) as SupportMapFragment?
        mapFragment?.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        mMap = googleMap ?: return // return if map is null

        if (ContextCompat.checkSelfPermission(activity!!.applicationContext, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            mMap.isMyLocationEnabled = true
            mMap.setOnMyLocationButtonClickListener(this)
            mMap.setOnMyLocationClickListener(this)
        }

        radiusText.text = zoneViewModel.zone.value?.radius.toString()
        addZoneMarkerCircle()
        setupObservers()
        setupListeners()
    }

    override fun onMyLocationClick(location: Location) {

    }

    override fun onMyLocationButtonClick(): Boolean {
        return false
    }

    private fun setupListeners() {

        mMap.setOnMapClickListener {
            this.zoneViewModel.zone.value?.latLng = it
            mMap.clear()
            addZoneMarkerCircle()
        }

        addRadiusFab.setOnClickListener {
            val zone: Zone? = zoneViewModel.zone.value

            if (zone != null) {
                zone.radius += 25
                zoneViewModel.zone.value = zone
            }
        }

        minusRadiusFab.setOnClickListener {
            val zone: Zone? = zoneViewModel.zone.value

            if (zone != null) {
                zone.radius -= 25
                zoneViewModel.zone.value = zone
            }
        }
    }

    private fun setupObservers() {
        this.zoneViewModel.zone.observe(this, Observer {
            radiusText.text = it.radius.toString()
            toggleRadiusButtons(it)
            resizeCircle(it.radius)
        })
    }

    private fun resizeCircle(radius: Int) {
        circle.radius = radius.toDouble()
    }

    private fun toggleRadiusButtons(zone: Zone) {
        if (!minusRadiusFab.isEnabled && zone.radius > 75) {
            minusRadiusFab.isEnabled = true
        }

        if (!addRadiusFab.isEnabled && zone.radius < 200) {
            addRadiusFab.isEnabled = true
        }

        if (minusRadiusFab.isEnabled && zone.radius == 75) {
            minusRadiusFab.isEnabled = false
        }

        if (addRadiusFab.isEnabled && zone.radius == 250) {
            addRadiusFab.isEnabled = false
        }
    }

    private fun addZoneMarkerCircle() {

        val zone = this.zoneViewModel.zone.value

        if (!::mMap.isInitialized || zone == null) {
            return
        }

        mMap.clear()

        mMap.addMarker(
            MarkerOptions()
                .position(zone.latLng)
                .icon(bitmapDescriptorFromVector(context!!,R.drawable.map_marker_filled_24))
                .anchor(0.5f, 0.5f)
                .flat(true)
                .draggable(false))

        circle = mMap.addCircle(
            CircleOptions()
                .center(zone.latLng)
                .radius(zone.radius.toDouble())
                .strokeColor(Color.CYAN)
                .fillColor(0x220000FF)
                .clickable(true)
                .strokeWidth(5f))

        circle.tag = zone

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(zone.latLng, 16.0f))
    }

    private fun bitmapDescriptorFromVector(context: Context, vectorResId: Int): BitmapDescriptor {
        val vectorDrawable = ContextCompat.getDrawable(context, vectorResId)
        vectorDrawable!!.setBounds(0, 0, vectorDrawable.intrinsicWidth, vectorDrawable.intrinsicHeight)
        val bitmap =
            Bitmap.createBitmap(vectorDrawable.intrinsicWidth, vectorDrawable.intrinsicHeight, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        vectorDrawable.draw(canvas)
        return BitmapDescriptorFactory.fromBitmap(bitmap)
    }

    fun updateZone(): Boolean {
        return this.zoneViewModel.updateZone()
    }

    fun deleteZone() {
        this.zoneViewModel.deleteZone()
    }
}

