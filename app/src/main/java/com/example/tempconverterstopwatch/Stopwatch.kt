package com.example.tempconverterstopwatch

class Stopwatch {
    private var isRunning: Boolean = false
    private var startTime: Long? = null

    fun getRunning(): Boolean {
        return isRunning
    }

    fun start() {
        isRunning = true
        startTime = startTime?: System.currentMillis()    // only update startTime when null
    }

    fun stop() {
        isRunning = false
        startTime = null
    }
}