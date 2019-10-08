package com.example.david.zoneify.zoneListView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.david.zoneify.R
import com.example.david.zoneify.util.NavigationManager
import com.example.david.zoneify.util.getViewModelFactory
import kotlinx.android.synthetic.main.fragment_zone_list.*

class ZoneListFragment : Fragment() {

    private lateinit var zoneListAdapter: ZoneListAdapter
    private val navigationManager = NavigationManager.instance
    private val zoneListViewModel by viewModels<ZoneListViewModel> { getViewModelFactory() }
    private var mRootView: View? = null
    private val TAG = ZoneListFragment::class.java.simpleName

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?  {

        if (mRootView == null) {
            mRootView = inflater.inflate(R.layout.fragment_zone_list, container, false)
        }

        return mRootView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupObservers()

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (!this::zoneListAdapter.isInitialized) {
            zoneListAdapter = ZoneListAdapter(zoneListViewModel)

            zoneListRecyclerView.layoutManager = LinearLayoutManager(context)
            zoneListRecyclerView.setHasFixedSize(true)
            zoneListRecyclerView.isNestedScrollingEnabled = true
            zoneListRecyclerView.adapter = zoneListAdapter
        }

        zoneListViewModel.loadZones()
    }

    private fun setupObservers() {
        zoneListViewModel.selectedZoneId.observe(this, Observer {
            navigationManager.startZoneFragment(it)
        })

        zoneListViewModel.zones.observe(this, Observer {
            zoneListAdapter.submitList(it)
            zoneListAdapter.notifyDataSetChanged()
        })
    }
}