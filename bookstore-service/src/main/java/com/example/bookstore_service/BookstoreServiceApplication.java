package com.example.bookstore_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.bookstore_service.repository")  // Sesuaikan dengan package repository Anda
public class BookstoreServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreServiceApplication.class, args);
    }
}
