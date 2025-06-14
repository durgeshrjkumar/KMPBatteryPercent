package org.example.testkmp.bookpedia.core

actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        println("Name: inside wasm")
        return 20
    }
}