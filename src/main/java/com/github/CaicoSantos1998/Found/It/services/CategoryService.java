package com.github.CaicoSantos1998.Found.It.services;

import com.github.CaicoSantos1998.Found.It.entities.Category;
import com.github.CaicoSantos1998.Found.It.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> optional = repository.findById(id);
        return optional.get();
    }
}
