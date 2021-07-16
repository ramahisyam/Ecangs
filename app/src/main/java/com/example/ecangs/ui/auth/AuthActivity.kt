package com.example.ecangs.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.ecangs.R
import com.example.ecangs.ui.PagerAdapter
import com.google.android.material.tabs.TabLayout

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val viewPager = findViewById<ViewPager>(R.id.view_pager_auth)
        viewPager.adapter = PagerAdapter(supportFragmentManager)

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout_auth)
        tabLayout.setupWithViewPager(viewPager)
    }
}