package com.example.david.zoneify.zoneListView

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.david.zoneify.data.Zone
import com.example.david.zoneify.data.ZoneRepository
import kotlinx.coroutines.launch

class ZoneListViewModel (private val zoneRepository: ZoneRepository) : ViewModel() {
    val zones = MutableLiveData<List<Zone>>()
    var selectedZoneId = MutableLiveData<Int>()

    fun loadZones() {
        viewModelScope.launch {
            setZones(zoneRepository.getAllZones())
        }
    }

    private fun setZones(zones: List<Zone>) {
        this.zones.value = zones
    }

    fun openZone(id: Int) {
        this.selectedZoneId.value = id
    }
}