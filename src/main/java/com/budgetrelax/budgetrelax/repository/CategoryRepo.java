package com.budgetrelax.budgetrelax.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.budgetrelax.budgetrelax.model.Category;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {
}
