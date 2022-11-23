package com.emre.relations.business;

import com.emre.relations.dataAccess.BookRepository;
import com.emre.relations.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAll(){
        return bookRepository.findAll();
    }
}



