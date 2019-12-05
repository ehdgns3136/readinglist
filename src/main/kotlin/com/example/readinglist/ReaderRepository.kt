package com.example.readinglist

import org.springframework.data.jpa.repository.JpaRepository

interface ReaderRepository: JpaRepository<ReaderEntity, String> {

}