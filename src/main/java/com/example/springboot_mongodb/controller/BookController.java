package com.example.springboot_mongodb.controller;

import com.example.springboot_mongodb.entity.Book;
import com.example.springboot_mongodb.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Slf4j
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public Book addBook(@RequestBody Book book) {

        log.info("name===" + book.getName());

        book.setCreateTime(new Date());
        Book resultBook = bookService.addBook(book);

        return resultBook;
    }

    @RequestMapping(value = "/getBookCount", method = RequestMethod.GET)
    public long getBookCount() {

        long totalBook = bookService.getBookCount();

        log.info("book number is ===" + totalBook);

        return totalBook;
    }

}
