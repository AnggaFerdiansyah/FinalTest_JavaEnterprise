package com.example.bookstore_service.service;

import com.example.bookstore_service.entity.Category; 
import com.example.bookstore_service.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<com.example.bookstore_service.model.Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Optional<com.example.bookstore_service.model.Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
