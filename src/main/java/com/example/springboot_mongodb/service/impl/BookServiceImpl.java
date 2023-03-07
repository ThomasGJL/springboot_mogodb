package com.example.springboot_mongodb.service.impl;

import com.example.springboot_mongodb.entity.Book;
import com.example.springboot_mongodb.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class BookServiceImpl implements BookService {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public Book addBook(Book book) {

        book.setCreateTime(new Date());
        Book resultBook = mongoTemplate.save(book);

        return resultBook;
    }

    @Override
    public long getBookCount() {

        Query query = new Query();

        long totalBook = mongoTemplate.count(query, Book.class);

        return totalBook;
    }
}
