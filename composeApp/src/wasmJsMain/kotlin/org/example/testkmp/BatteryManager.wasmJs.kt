package org.example.testkmp

import kotlin.math.roundToInt

actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        println("Name: inside wasm")
        return 20
    }
}