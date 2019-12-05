package com.example.readinglist

import org.springframework.data.jpa.repository.JpaRepository

interface ReadingListRepository: JpaRepository<BookEntity, Long> {
    fun findByReader(reader: String): List<BookEntity>
}