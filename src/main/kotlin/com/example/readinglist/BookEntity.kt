package com.example.readinglist

import javax.persistence.*

@Entity
class BookEntity (
        @Id @GeneratedValue val id: Long?,
        @Column var reader: String?,
        @Column var isbn: String?,
        @Column var title: String?,
        @Column var author: String?,
        @Column var description: String?
) {
    fun toModel(): Book = Book(
            id = this.id,
            reader = this.reader,
            isbn = this.isbn,
            title = this.title,
            author = this.author,
            description = this.description
    )
}

fun Book.toEntity(): BookEntity {
    val entity = BookEntity (
            id = this.id,
            reader = this.reader,
            isbn = this.isbn,
            title = this.title,
            author = this.author,
            description = this.description
    )

    return entity
}