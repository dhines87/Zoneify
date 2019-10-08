package com.example.david.zoneify.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.david.zoneify.R
import android.app.Activity
import com.example.david.zoneify.data.Direction
import com.example.david.zoneify.zoneListView.ZoneListFragment
import com.example.david.zoneify.zoneView.ZoneFragment
import com.example.david.zoneify.zoneView.ZoneLocationFragment

class NavigationManager {

    companion object {
        val instance = NavigationManager()

        fun newInstance() : NavigationManager {
            return instance
        }
    }

    interface NavigationListener {
        fun onBackstackChanged()
    }

    private var mFragmentManager: FragmentManager? = null
    private var mNavigationListener: NavigationListener? = null

    fun init(fragmentManager: FragmentManager) {
        mFragmentManager = fragmentManager

        mFragmentManager!!.addOnBackStackChangedListener {
            mNavigationListener?.onBackstackChanged()
        }
    }

    private fun open(fragment: Fragment) {
        mFragmentManager
            ?.beginTransaction()
            ?.replace(R.id.content_frame_layout, fragment)
            ?.addToBackStack(fragment.toString())
            ?.commit()
    }

    private fun openAsRoot(fragment: Fragment) {
        popEveryFragment()
        open(fragment)
    }

    private fun popEveryFragment() {
        // Clear all back stack.
        val backStackCount = mFragmentManager?.backStackEntryCount
        for (i in 0 until backStackCount!!) {

            // Get the back stack fragment id.
            val backStackId = mFragmentManager
                ?.getBackStackEntryAt(i)
                ?.id

            mFragmentManager?.popBackStack(backStackId!!, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }
    }

    fun navigateBack(baseActivity: Activity) {
        if (mFragmentManager?.backStackEntryCount == 1) {
            // we can finish the base activity since we have no other fragments
            baseActivity.finish()
        } else {
            mFragmentManager?.popBackStackImmediate()
        }
    }

    fun navigateBackToRoot() {
        for (i in 0 until mFragmentManager?.backStackEntryCount!! - 1) {
            mFragmentManager?.popBackStackImmediate()
        }
    }

    fun getVisibleFragment(): Fragment? {
        val fragments = mFragmentManager?.fragments

        if (fragments != null) {
            for (fragment in fragments) {
                if (fragment != null && fragment.isVisible)
                    return fragment
            }
        }

        return null
    }

    fun startZoneListFragment() {
        openAsRoot(ZoneListFragment())
    }

    fun startZoneFragment(id: Int) {
        open(ZoneFragment.newInstance(id))
    }

    fun startZoneLocationFragment(id: Int,
                                  name: String,
                                  lat: Double,
                                  long: Double,
                                  radius: Int,
                                  message: String,
                                  active: Boolean,
                                  direction: Direction
    ) {
        open(ZoneLocationFragment.newInstance(id, name, lat, long, radius, message, active, direction))
    }
}