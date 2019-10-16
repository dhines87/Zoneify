package com.example.david.zoneify.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.david.zoneify.BuildConfig
import com.example.david.zoneify.R
import com.example.david.zoneify.util.OnBoardingHelper

class SplashActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT  :Long = 3000 // 3 sec
    private var started = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({

            if (!started && BuildConfig.DEBUG) {
                started = true
                OnBoardingHelper.getInstance(applicationContext).resetOnBoardingComplete()
            }

            if (!OnBoardingHelper.getInstance(applicationContext).isOnBoardingComplete()) {
                startActivityForResult(Intent(this, OnBoardingActivity::class.java), 0)
            }
            else {
                startMainActivity()
            }

        }, SPLASH_TIME_OUT)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        startMainActivity()
    }

    private fun startMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}