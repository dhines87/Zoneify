package com.example.david.zoneify.zoneView

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.david.zoneify.util.getViewModelFactory
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.david.zoneify.activity.MainActivity
import com.example.david.zoneify.R
import com.example.david.zoneify.data.Direction
import com.example.david.zoneify.data.Zone
import com.example.david.zoneify.databinding.FragmentZoneBinding
import com.example.david.zoneify.util.Constants.Companion.ZONE_ID
import com.example.david.zoneify.util.FragmentViewEnum
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.synthetic.main.fragment_zone.*

class ZoneFragment : Fragment() {

    companion object {

        fun newInstance(id: Int): ZoneFragment {
            val args = Bundle()
            args.putSerializable(ZONE_ID, id)
            val fragment = ZoneFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private val zoneViewModel by viewModels<ZoneViewModel> { getViewModelFactory() }
    private lateinit var binding: FragmentZoneBinding
    private var zoneId: Int = -1
    private val TAG = ZoneFragment::class.java.simpleName
    private lateinit var fusedLocationClient: FusedLocationProviderClient

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        editLocationButton.setOnClickListener{
            val zone = zoneViewModel.zone.value
            (activity as MainActivity).navigationManager.startZoneLocationFragment(zone!!.id,
                zone.name,
                zone.latLng.latitude,
                zone.latLng.longitude,
                zone.radius,
                zone.message,
                zone.active,
                zone.direction)
        }
    }

    override fun onDetach() {
        super.onDetach()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        arguments?.getInt(ZONE_ID)?.let {
            zoneId = it
        }
    }

    private fun setTitle(zone: Zone?) {
        val title = if (zone?.name.isNullOrBlank()) "New - Zone" else "Edit - " + zone?.name
        //(activity as MainActivity).setViewToolbar(FragmentViewEnum.ZONE, title)
    }

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            setupObservers()
            if (zoneId < 1) {

                fusedLocationClient = LocationServices.getFusedLocationProviderClient(activity!!.applicationContext)
                val locationResult = fusedLocationClient.lastLocation

                locationResult.addOnCompleteListener {
                    if (it.isSuccessful) {

                        val latLng = it.result

                        val zone: Zone = Zone("",
                            if (latLng != null) LatLng(latLng.latitude, latLng.longitude) else LatLng(42.984924, -81.245277),
                            100,
                            Direction.ENTERING,
                            "",
                            true)

                        enteringButton.isEnabled = true

                        this.zoneViewModel.setZone(zone)
                    }
                }
            }
            else {
                this.zoneViewModel.loadZoneById(zoneId)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_zone, container, false)
        binding.lifecycleOwner = this.viewLifecycleOwner
        val view = binding.root
        binding.zoneViewModel = this.zoneViewModel

        return view
    }

    private fun setupObservers() {

        this.zoneViewModel.direction.observe(this, Observer {
            if (it != null) {
                this.toggleDirectionButtons(it)
            }
        })

        this.zoneViewModel.nameErrorText.observe(this, Observer {
            if (it != null) {
                textInputLayoutZoneName.error = zoneViewModel.nameErrorText.value
            }
        })

        this.zoneViewModel.messageErrorText.observe(this, Observer {
            if (it != null) {
                textInputLayoutZoneMessage.error = zoneViewModel.messageErrorText.value
            }
        })

        this.zoneViewModel.zone.observe(this, Observer {
            if (it != null) {
                setTitle(it)
            }
        })
    }

    private fun toggleDirectionButtons(direction: Direction) {
        if (direction == Direction.ENTERING) {
            enteringButton.isEnabled = false
            leavingButton.isEnabled = true
        }
        else {
            enteringButton.isEnabled = true
            leavingButton.isEnabled = false
        }
    }

    fun updateZone(): Boolean {
        return this.zoneViewModel.updateZone()
    }

    fun deleteZone() {
        this.zoneViewModel.deleteZone()
    }
}