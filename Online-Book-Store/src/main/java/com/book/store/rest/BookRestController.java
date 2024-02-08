package com.book.store.rest;

import com.book.store.entity.Book;
import com.book.store.entity.BookDTO;
import com.book.store.mapper.BookMapper;
import com.book.store.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookRestController {

    private BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDTO> findAll(){
        List<Book> books = bookService.findAll();
        List<BookDTO> out_books = books.stream().map(book -> BookMapper.toBookDTO(book)).collect(Collectors.toList());

        return out_books;
    }

    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable int id){
        Book book = bookService.findById(id);
        BookDTO bookDTO = BookMapper.toBookDTO(book);

        return bookDTO;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return bookService.save(book);
    }
}
