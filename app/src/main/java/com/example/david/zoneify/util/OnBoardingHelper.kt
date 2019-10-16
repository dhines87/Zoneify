package com.example.david.zoneify.util

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class OnBoardingHelper private constructor() {

    fun setOnBoardingComplete() {
        editor!!.putBoolean(ONBOARDING_COMPLETE, true)
        editor!!.commit()
    }

    fun resetOnBoardingComplete() {
        editor!!.putBoolean(ONBOARDING_COMPLETE, false)
        editor!!.commit()
    }

    fun isOnBoardingComplete() : Boolean {
        return sharedPreferences!!.getBoolean(ONBOARDING_COMPLETE, true)
    }

    companion object {
        private val onBoardingHelper = OnBoardingHelper()
        private var sharedPreferences: SharedPreferences? = null
        private var editor: SharedPreferences.Editor? = null
        private val ONBOARDING_COMPLETE = "ONBOARDING_COMPLETE"

        @Synchronized
        fun getInstance(context: Context): OnBoardingHelper {

            if (sharedPreferences == null) {
                sharedPreferences = context.getSharedPreferences(context.packageName, Activity.MODE_PRIVATE)
                editor = sharedPreferences!!.edit()
            }

            return onBoardingHelper
        }
    }
}