package com.book.store.service;

import com.book.store.entity.Book;

import java.util.List;

public interface BookService {

    Book save(Book book);
    Book findById(int id);
    List<Book> findAll();
    void deleteById(int id);
}
