package com.budgetrelax.budgetrelax.service;

import com.budgetrelax.budgetrelax.DTO.SaveCategoryDTO;
import com.budgetrelax.budgetrelax.model.Category;
import com.budgetrelax.budgetrelax.repository.CategoryRepo;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private CategoryRepo catRepo;
    public CategoryService(CategoryRepo catRepo) {
        this.catRepo = catRepo;
    }
    public int addCat(SaveCategoryDTO saveCategoryDTO) {
        Category newCat = new Category(saveCategoryDTO.getName(), saveCategoryDTO.getBudget());
        Category cat =catRepo.save(newCat);
        return cat.getIdCat();
    }

}
