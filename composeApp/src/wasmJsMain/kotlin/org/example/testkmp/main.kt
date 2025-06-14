package org.example.testkmp

import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import org.example.testkmp.bookpedia.App
import org.example.testkmp.bookpedia.core.BatteryManager

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        App(
            batteryManager = remember { BatteryManager() }
        )
    }
}