package com.example.readinglist

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class ReaderEntity (
        @Id val username: String,
        val fullname: String,
        val password: String
) {
    fun toModel(): Reader = Reader(
            username = this.username,
            fullname = this.fullname,
            password = this.password
    )
}

fun Reader.toEntity(): ReaderEntity {
    var entity = ReaderEntity (
            username = this.username,
            fullname = this.getFullname(),
            password = this.password
    )

    return entity
}