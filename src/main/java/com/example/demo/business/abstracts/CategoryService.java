package com.example.demo.business.abstracts;

import com.example.demo.entities.concretes.Category;
import java.util.List;

public interface CategoryService {
    List<Category> getAll();
}