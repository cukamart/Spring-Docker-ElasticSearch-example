package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo/book")
public class SearchRestController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book insertBook(@RequestBody Book book) {
        return bookService.save(book);
    }

    @GetMapping(value = "/{id}")
    public Book findBook(@PathVariable Long id) {
        return bookService.findOne(id);
    }
}
