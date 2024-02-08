package com.book.store.service;

import com.book.store.dao.PublisherDAO;
import com.book.store.entity.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService{

    PublisherDAO publisherDAO;

    @Autowired
    public PublisherServiceImpl(PublisherDAO publisherDAO) {
        this.publisherDAO = publisherDAO;
    }

    @Override
    public Publisher save(Publisher publisher) {
        return publisherDAO.save(publisher);
    }

    @Override
    public Publisher findById(int id) {
        return publisherDAO.findById(id).orElseThrow(() -> new RuntimeException("Publisher with given id not found: " + id));
    }

    @Override
    public List<Publisher> findAll() {
        return publisherDAO.findAll();
    }

    @Override
    public void deleteById(int id) {
        publisherDAO.deleteById(id);
    }
}
