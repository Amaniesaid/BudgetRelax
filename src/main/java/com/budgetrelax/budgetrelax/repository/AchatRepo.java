package com.budgetrelax.budgetrelax.repository;

import com.budgetrelax.budgetrelax.model.Achat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchatRepo extends CrudRepository<Achat, Integer> {

}
