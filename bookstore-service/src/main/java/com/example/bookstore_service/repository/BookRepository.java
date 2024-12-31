package com.example.bookstore_service.repository;

import com.example.bookstore_service.entity.Book; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    com.example.bookstore_service.model.Book save(com.example.bookstore_service.model.Book book);
    
}