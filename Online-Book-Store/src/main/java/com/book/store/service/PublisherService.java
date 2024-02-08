package com.book.store.service;

import com.book.store.entity.Publisher;

import java.util.List;

public interface PublisherService {
    Publisher save(Publisher publisher);
    Publisher findById(int id);
    List<Publisher> findAll();
    void deleteById(int id);
}
