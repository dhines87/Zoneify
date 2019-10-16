package com.example.david.zoneify.zoneView

import androidx.lifecycle.*
import com.example.david.zoneify.R
import com.example.david.zoneify.data.Direction
import com.example.david.zoneify.data.Zone
import com.example.david.zoneify.data.ZoneRepository
import com.example.david.zoneify.util.NavigationManager
import kotlinx.coroutines.launch

class ZoneViewModel(
    private val zoneRepository: ZoneRepository
): ViewModel() {
    val zone = MutableLiveData<Zone>()
    var _active = MutableLiveData<Boolean>()
    var direction = MutableLiveData<Direction>()
    var nameErrorText = MutableLiveData<String>("")
    var messageErrorText = MutableLiveData<String>("")
    var _validZone = MutableLiveData<Boolean>()
    var navigationManager = NavigationManager.instance

    var activeImageResource: LiveData<Int> = Transformations.map(this._active) { it ->
        it?.let {
            if (it) R.drawable.zone_on_form else R.drawable.zone_off_form
        }
    }

    var activeText: LiveData<String> = Transformations.map(this._active) { it ->
        it?.let{
            "Zone is " + if (it) "active." else "not active."
        }
    }

    private fun isZoneValid(zone: Zone?): Boolean {
        return !zone?.name.isNullOrBlank() && !zone?.message.isNullOrBlank()
    }

    fun setZone(zone: Zone?) {
        this.zone.value = zone
        this.direction.value = zone?.direction
        this._active.value = zone?.active
        this._validZone.value = isZoneValid(zone)
    }

    fun getZone() : Zone? {
        return this.zone.value
    }

    fun loadZoneById(id: Int) {
        if (id > 0) {
            viewModelScope.launch {
                setZone(zoneRepository.getZoneById(id))
            }
        }
    }

    fun deleteZone() {
        viewModelScope.launch {
            if(zone.value?.id != null ) {
                zoneRepository.deleteZone(zone.value?.id!!)
                navigationManager.navigateBackToRoot()
            }
        }
    }

    fun updateZone(): Boolean {
        if (this.isZoneValid(this.zone.value)) {
            viewModelScope.launch {
                val zone = zone.value
                if (zone != null) {

                    if (zone.id < 1) {
                        zoneRepository.insertZone(zone)
                    }
                    else {
                        zoneRepository.updateZone(zone)
                    }
                }
            }
            return true
        }
        else {
            return false
        }
    }

    fun activeOnCheckedChanged() {
        this.zone.value?.active?.not()
        this._active.value = this.zone.value?.active
    }

    fun toggleDirection() {
        val zone = this.zone.value
        if (zone != null) {
            zone.direction = if (zone.direction == Direction.ENTERING) Direction.LEAVING else Direction.ENTERING
            this.direction.value = zone.direction
            this.zone.value = zone
        }
    }

    fun validateName() {
        this.nameErrorText.value = if (this.zone.value?.name.isNullOrBlank()) "* Name is required." else ""
    }

    fun validateMessage() {
        this.messageErrorText.value = if (this.zone.value?.message.isNullOrBlank()) "* Message is required." else ""
    }
}