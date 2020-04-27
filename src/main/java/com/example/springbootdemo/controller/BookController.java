package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.BookModel;
import com.example.springbootdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public BookModel getBook(@RequestParam(name="id") String id){
        return bookService.returnBook(id);
    }

    @PostMapping(value="/post", produces = MediaType.APPLICATION_JSON_VALUE)
    public BookModel postBook(@RequestBody BookModel book){
        return bookService.addBook(book);
    }
}