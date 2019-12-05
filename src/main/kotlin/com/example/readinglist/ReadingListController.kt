package com.example.readinglist

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping("/")
class ReadingListController (
        @Autowired private val readingListRepository: ReadingListRepository
) {

    companion object {
        private val reader: String = "craig"
    }

    @RequestMapping(method=[RequestMethod.GET])
    fun readersBooks(model: Model): String {
        val readingList = readingListRepository.findByReader(reader)
        model.addAttribute("books", readingList)
        return "readingList"
    }

    @RequestMapping(method=[RequestMethod.POST])
    fun addToReadingList(book: Book): String {
        book.reader = reader
        readingListRepository.save(book.toEntity())
        return "redirect:/"
    }
}