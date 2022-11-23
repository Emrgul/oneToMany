package com.emre.relations.business;

import com.emre.relations.dataAccess.AuthorRepository;
import com.emre.relations.dataAccess.BookRepository;
import com.emre.relations.entities.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAll(){
        return authorRepository.findAll();
    }

}

