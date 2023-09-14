package com.example.tempconverterstopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var isRunning: Boolean = false
    private var startTime: Long? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickStart(view: View) {
        startTime = System.currentTimeMillis()    // avoids creating a Calendar
    }

    fun onClickStop(view: View) {
        startTime = null
    }

    fun elapsedTime(): Long {
        val t: Long = System.currentTimeMillis()
        val clock = t - (startTime?: t)
        return clock    // will be 0 if startTime is null
    }
}