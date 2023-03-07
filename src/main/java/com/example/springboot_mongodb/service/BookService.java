package com.example.springboot_mongodb.service;

import com.example.springboot_mongodb.entity.Book;

public interface BookService {

    Book addBook(Book book);

    long getBookCount();

}
