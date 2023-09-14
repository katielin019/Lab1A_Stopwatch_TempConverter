package com.example.tempconverterstopwatch

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var clockTextView: TextView? = null
    private val stopwatch: Stopwatch = Stopwatch()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clockTextView = findViewById(R.id.clockTextView)

        val mainHandler = Handler(Looper.getMainLooper())
        mainHandler.post(object: Runnable {
            override fun run() {
                if (stopwatch.getRunning())
                    updateClockUI()
                mainHandler.postDelayed(this, 10)
            }
        })
    }

    fun onClickStart(view: View) {
        stopwatch.start()
        updateClockUI()
    }

    fun onClickStop(view: View) {
        stopwatch.stop()
    }

    fun updateClockUI() {
        clockTextView?.text = stopwatch.elapsedTimeAsString()
    }
}