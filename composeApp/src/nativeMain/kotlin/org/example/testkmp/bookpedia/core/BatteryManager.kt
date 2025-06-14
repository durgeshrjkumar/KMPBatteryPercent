package org.example.testkmp.bookpedia.core

actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        println("Name: inside native")
        return 11
    }
}