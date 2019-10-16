package com.example.david.zoneify.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.david.zoneify.R
import com.example.david.zoneify.onBoardingView.OnBoardingStepOneFragment
import com.example.david.zoneify.onBoardingView.OnBoardingStepThreeFragment
import com.example.david.zoneify.onBoardingView.OnBoardingStepTwoFragment
import com.example.david.zoneify.onBoardingView.OnBoardingViewPagerAdapter
import com.example.david.zoneify.util.OnBoardingHelper
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnBoardingActivity : AppCompatActivity() {

    private val fragments = ArrayList<Fragment>()
    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val adapter = OnBoardingViewPagerAdapter(supportFragmentManager)
        fragments.add(OnBoardingStepOneFragment())
        fragments.add(OnBoardingStepTwoFragment())
        fragments.add(OnBoardingStepThreeFragment())
        adapter.addFragments(fragments)
        viewPager = findViewById(R.id.view_pager)
        viewPager.adapter = adapter

        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageSelected(position: Int) {
                handlePageChange()
            }
        })

        viewPager.setCurrentItem(0, true)

        onBoarding_skip_btn.setOnClickListener{
            if (viewPager.currentItem == 0) {
                returnActivityResult()
            }

            viewPager.setCurrentItem(viewPager.currentItem - 1, true)
        }

        onBoarding_next_btn.setOnClickListener{
            if (viewPager.currentItem == fragments.size - 1) {
                returnActivityResult()
            }

            viewPager.setCurrentItem(viewPager.currentItem + 1, true)
        }
    }

    private fun handlePageChange() {
        onBoarding_next_btn.text = if (viewPager.currentItem == 2) "Got it" else "Next"
        onBoarding_skip_btn.text = if (viewPager.currentItem == 0) "Skip" else "Prev"
        onBoarding_indicator_0.setImageResource(if (viewPager.currentItem == 0) R.drawable.indicator_selected else R.drawable.indicator_unselected)
        onBoarding_indicator_1.setImageResource(if (viewPager.currentItem == 1) R.drawable.indicator_selected else R.drawable.indicator_unselected)
        onBoarding_indicator_2.setImageResource(if (viewPager.currentItem == 2) R.drawable.indicator_selected else R.drawable.indicator_unselected)
    }

    private fun returnActivityResult() {
        OnBoardingHelper.getInstance(applicationContext).setOnBoardingComplete()
        val resultIntent = Intent(this, SplashActivity::class.java)
        setResult(RESULT_OK, resultIntent)
        finish()
    }
}