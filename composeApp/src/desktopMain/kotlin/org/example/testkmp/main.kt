package org.example.testkmp

import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.example.testkmp.bookpedia.App
import org.example.testkmp.bookpedia.core.BatteryManager

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KotlinProject",
    ) {
        App(
            batteryManager = remember { BatteryManager() }
        )
    }
}