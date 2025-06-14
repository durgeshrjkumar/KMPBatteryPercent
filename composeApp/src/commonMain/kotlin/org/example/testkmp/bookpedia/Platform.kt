package org.example.testkmp.bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform