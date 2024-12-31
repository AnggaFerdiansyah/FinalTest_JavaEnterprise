package com.example.bookstore_service.repository;

import com.example.bookstore_service.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    com.example.bookstore_service.entity.Category save(com.example.bookstore_service.entity.Category category);
}
