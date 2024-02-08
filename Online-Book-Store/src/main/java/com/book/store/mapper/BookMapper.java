package com.book.store.mapper;

import com.book.store.entity.Book;
import com.book.store.entity.BookDTO;

public class BookMapper {

    public static BookDTO toBookDTO(Book book){
        BookDTO bookDTO = new BookDTO(book.getId(), book.getGenre(), book.getPrice(), book.getQuantityAvailable(), book.getDescription(), book.getPublicationDate(), book.getPublisher().getId());

        return bookDTO;
    }


}
