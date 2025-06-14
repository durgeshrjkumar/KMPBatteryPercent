package org.example.testkmp

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import org.example.testkmp.bookpedia.App
import org.example.testkmp.bookpedia.core.BatteryManager

fun MainViewController() = ComposeUIViewController { App(batteryManager = remember { BatteryManager() }) }