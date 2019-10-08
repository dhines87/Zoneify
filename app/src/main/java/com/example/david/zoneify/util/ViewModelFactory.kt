package com.example.david.zoneify.util

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.david.zoneify.ZoneifyApplication
import com.example.david.zoneify.data.ZoneRepository
import com.example.david.zoneify.zoneListView.ZoneListViewModel
import com.example.david.zoneify.zoneView.ZoneViewModel

/**
 * Factory for all ViewModels.
 */
@Suppress("UNCHECKED_CAST")
class ViewModelFactory constructor(
    private val zoneRepository: ZoneRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>) =
        with(modelClass) {
            when {
                isAssignableFrom(ZoneViewModel::class.java) -> ZoneViewModel(zoneRepository)
                isAssignableFrom(ZoneListViewModel::class.java) -> ZoneListViewModel(zoneRepository)
                else ->
                    throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
            }
        } as T
}
fun Fragment.getViewModelFactory(): ViewModelFactory {
    val repository = (requireContext().applicationContext as ZoneifyApplication).zoneRepository
    return ViewModelFactory(repository)
}
