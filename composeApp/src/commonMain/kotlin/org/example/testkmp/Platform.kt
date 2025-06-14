package org.example.testkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform