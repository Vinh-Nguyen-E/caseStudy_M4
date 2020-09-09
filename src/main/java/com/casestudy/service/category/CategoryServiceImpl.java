package com.casestudy.service.category;

import com.casestudy.model.Category;
import com.casestudy.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findByCategoryId(Long categoryId) {
        return categoryRepository.findById(categoryId);
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void remove(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
