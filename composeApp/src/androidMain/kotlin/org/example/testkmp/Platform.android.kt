package org.example.testkmp

import android.os.Build
import org.example.testkmp.bookpedia.Platform

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()