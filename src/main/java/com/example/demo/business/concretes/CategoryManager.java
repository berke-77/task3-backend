package com.example.demo.business.concretes;

import com.example.demo.business.abstracts.CategoryService;
import com.example.demo.dataAccess.abstracts.CategoryDao;
import com.example.demo.entities.concretes.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements CategoryService {

    private final CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.findAll();
    }
}