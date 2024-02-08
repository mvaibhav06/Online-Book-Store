package com.book.store.dao;

import com.book.store.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherDAO extends JpaRepository<Publisher, Integer> {
}
