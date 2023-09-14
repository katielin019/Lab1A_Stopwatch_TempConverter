package com.example.tempconverterstopwatch

class Stopwatch {
    private var isRunning: Boolean = false
    private var startTime: Long? = null

    fun getRunning(): Boolean {
        return isRunning
    }

    fun start() {
        isRunning = true
        startTime = startTime?: System.currentTimeMillis()    // only update startTime when null
    }

    fun stop() {
        isRunning = false
        startTime = null
    }

    fun elapsedTimeAsString(): String {
        val t: Long = System.currentTimeMillis()
        val clock = t - (startTime?: t)
        val minute = clock / 60000
        val seconds = (clock / 1000) % 60
        val micro = clock % 1000
        return "$minute:".plus(String.format("%02d", seconds)).plus(".").plus(String.format("%03d", micro))
    }
}