package com.book.store.dao;

import com.book.store.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDAO extends JpaRepository<Book, Integer> {
}
