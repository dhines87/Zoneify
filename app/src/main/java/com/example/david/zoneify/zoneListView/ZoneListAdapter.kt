package com.example.david.zoneify.zoneListView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.david.zoneify.BR
import com.example.david.zoneify.R
import com.example.david.zoneify.data.Zone


class ZoneListAdapter(zoneListViewModel: ZoneListViewModel) : DataBindingAdapter<Zone>(DiffCallback(), zoneListViewModel) {

    class DiffCallback : DiffUtil.ItemCallback<Zone>() {
        override fun areItemsTheSame(oldItem: Zone, newItem: Zone): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Zone, newItem: Zone): Boolean {
            return oldItem == newItem
        }
    }

    override fun getItemViewType(position: Int) = R.layout.zone_item
}

class DataBindingViewHolder<T>(private val binding: ViewDataBinding, private val zoneListViewModel: ZoneListViewModel) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: T) {
        binding.setVariable(BR.zone, item)
        binding.setVariable(BR.zoneListViewModel, zoneListViewModel)
        binding.executePendingBindings()
    }
}

abstract class DataBindingAdapter<T>(diffCallback: DiffUtil.ItemCallback<T>, private val zoneListViewModel: ZoneListViewModel) :
    ListAdapter<T, DataBindingViewHolder<T>>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataBindingViewHolder<T> {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, viewType, parent, false)
        return DataBindingViewHolder(binding, zoneListViewModel)
    }

    override fun onBindViewHolder(holder: DataBindingViewHolder<T>, position: Int) = holder.bind(getItem(position))
}