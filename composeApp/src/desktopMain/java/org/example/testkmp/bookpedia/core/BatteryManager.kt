package org.example.testkmp.bookpedia.core

import oshi.SystemInfo
import kotlin.math.roundToInt

actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        val systemInfo = SystemInfo()
        val powerSources = systemInfo.hardware.powerSources
        val battery = powerSources.firstOrNull()
        for (ps in powerSources) {
            println("Name: ${ps.name}")
            println("deviceName: ${ps.deviceName}")
            println("isCharging: ${ps.isCharging}")
            println("currentCapacity: ${ps.currentCapacity}")
            println("Max Capacity: ${ps.maxCapacity}")
            println("Remaining %: ${ps.remainingCapacityPercent}")
            println("Is Charging: ${ps.isCharging}")
            println("Time Remaining: ${ps.timeRemainingInstant}")
            println("------")
        }
       // val battery = SystemInfo().hardware.powerSources.firstOrNull()
        val powerSource = SystemInfo().hardware.powerSources.firstOrNull() ?: return -1

        val currentCapacity = powerSource.currentCapacity
        val maxCapacity = powerSource.maxCapacity

        return if (maxCapacity > 0) {
            (currentCapacity.toDouble() / maxCapacity.toDouble() * 100).roundToInt()
        } else {
            -1 // unknown or invalid
        }
    }
}