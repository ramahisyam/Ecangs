package com.example.ecangs.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ecangs.R

class MainActivity : AppCompatActivity() {
    private var TIME_OUT:Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}