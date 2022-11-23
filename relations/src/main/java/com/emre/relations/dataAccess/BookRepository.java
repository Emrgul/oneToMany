package com.emre.relations.dataAccess;

import com.emre.relations.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BookRepository extends JpaRepository<Book,Integer> {
}
