package com.example.tempconverterstopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var startTime: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickStart(view: View) {
        startTime = System.currentTimeMillis()    // avoids creating a Calendar
    }

    fun onClickStop(view: View) {
    }
}