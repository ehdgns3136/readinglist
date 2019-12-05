package com.example.readinglist

data class Book (
    val id: Long?,
    var reader: String?,
    var isbn: String?,
    var title: String?,
    var author: String?,
    var description: String?
)