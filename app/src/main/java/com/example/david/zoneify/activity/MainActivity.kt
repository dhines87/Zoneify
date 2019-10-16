package com.example.david.zoneify.activity

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.david.zoneify.util.FragmentViewEnum
import com.example.david.zoneify.zoneView.ZoneFragment
import com.example.david.zoneify.zoneView.ZoneLocationFragment
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.david.zoneify.BuildConfig
import com.example.david.zoneify.R
import com.example.david.zoneify.util.NavigationManager
import com.example.david.zoneify.util.OnBoardingHelper
import com.example.david.zoneify.zoneListView.ZoneListFragment
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), ActivityCompat.OnRequestPermissionsResultCallback {

    lateinit var navigationManager: NavigationManager
    private var hideMenuItems = true
    private val PERMISSION_REQUEST_LOCATION = 329

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        navigationManager = NavigationManager.newInstance()
        navigationManager.init(supportFragmentManager, this)

        addZoneFab.setOnClickListener {
            navigationManager.startZoneFragment(-1)
        }

        if (savedInstanceState == null) {


            checkPermission()
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val fragment = navigationManager.getVisibleFragment()
        setToolbar(fragment is ZoneListFragment)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (requestCode == PERMISSION_REQUEST_LOCATION) {
            if (grantResults.size == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                navigationManager.startZoneListFragment()
            } else {
                // Permission request was denied.
                Snackbar.make(
                    coordinatorLayout, R.string.location_permission_denied,
                    Snackbar.LENGTH_SHORT
                ).show()

                this.finish()
            }
        }
    }

    private fun checkPermission() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                PERMISSION_REQUEST_LOCATION)
        }
        else {
            navigationManager.startZoneListFragment()
        }
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            navigationManager.navigateBack(this)
        }
    }

    fun setToolbar(isZoneList: Boolean) {
        collapsingToolbar.title = if (!isZoneList) "Edit Zone" else getString(R.string.app_name)
        appBarLayout.setExpanded(isZoneList)
        if (!isZoneList) addZoneFab.hide() else addZoneFab.show()
        hideMenuItems = isZoneList
        invalidateOptionsMenu()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main_menu, menu)

        if (hideMenuItems) {
            for (i in 0 until menu.size())
                menu.getItem(i).isVisible = false
        }

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val fragment = navigationManager.getVisibleFragment()

        return when (item.itemId) {
            R.id.saveZoneButton -> {
                var success = false
                if (fragment is ZoneFragment) {
                    success = fragment.updateZone()
                }
                else if (fragment is ZoneLocationFragment) {
                    success = fragment.updateZone()
                }

                Snackbar.make(coordinatorLayout, if (success)"Zone Saved!" else "Error - Zone not Valid.", Snackbar.LENGTH_LONG).show()
                true
            }
            R.id.deleteZoneButton -> {

                val dialog = AlertDialog.Builder(this)
                dialog.setMessage("Are you sure you want to delete this Zone?")
                dialog.setTitle("Delete Zone")
                dialog.setPositiveButton("YES"
                ) { _, _ ->

                    if (fragment is ZoneFragment) {
                        fragment.deleteZone()
                    }

                    if (fragment is ZoneLocationFragment) {
                        fragment.deleteZone()
                    }

                    Snackbar.make(coordinatorLayout, "Zone Deleted!", Snackbar.LENGTH_LONG).show()
                }
                dialog.setNegativeButton("CANCEL") { _, _ -> }
                val alertDialog = dialog.create()
                alertDialog.show()

                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}