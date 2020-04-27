package com.example.springbootdemo.service;

import com.example.springbootdemo.model.BookModel;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class BookService {

    private ArrayList<BookModel> bookList = new ArrayList<>();


    public BookModel addBook(BookModel book){

        bookList.add(book);
        return book;
    }

    public BookModel returnBook(String id){

        for(BookModel book : bookList){
            if(book.getId().equals(id)){
                return book;
            }
        }
        return null;
    }
}
