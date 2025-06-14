package org.example.testkmp

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
            println("isCharging: ${ps.remainingCapacityPercent}")
            println("Max Capacity: ${ps.maxCapacity}")
            println("Remaining %: ${ps.remainingCapacityPercent}")
            println("Is Charging: ${ps.isCharging}")
            println("Time Remaining: ${ps.timeRemainingInstant}")
            println("------")
        }
        return battery?.remainingCapacityPercent?.times(100)?.roundToInt() ?: -1
    }
}