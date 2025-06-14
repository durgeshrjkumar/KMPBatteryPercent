package org.example.testkmp.bookpedia.book.domain

data class Book(
    val id: String,
    val title: String,
    val author: String,
    val description: String?,
    val imageUrl: String,
    val languages: List<String>,
    val authors: List<String>,
    val firstPublisher: String?,
    val averageRating: Double?,
    val ratingCount: Int?,
    val numPages: Int?,
    val numEditions: Int
)
