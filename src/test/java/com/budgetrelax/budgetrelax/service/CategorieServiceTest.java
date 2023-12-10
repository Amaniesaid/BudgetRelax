package com.budgetrelax.budgetrelax.service;

import com.budgetrelax.budgetrelax.model.Category;
import com.budgetrelax.budgetrelax.repository.CategoryRepo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.budgetrelax.budgetrelax.DTO.SaveCategoryDTO;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class CategorieServiceTest {

    private SaveCategoryDTO saveCat = new SaveCategoryDTO("test", 500);
    @Test
    public void shouldSaveCategoryWithSuccess(){

        CategoryRepo mockCatRepo = mock(CategoryRepo.class);
        Category newCat = new Category(saveCat.getName(), saveCat.getBudget());

        // Définir le comportement simulé du mock pour la méthode save()
        when(mockCatRepo.save(any(Category.class))).thenReturn(newCat);

        CategoryService catService = new CategoryService(mockCatRepo);

        // Appel de la méthode à tester
        int resultId = catService.addCat(saveCat);

        // Vérification
        verify(mockCatRepo).save(any(Category.class)); // Vérifier si la méthode save() a été appelée avec un objet de type Categorie
        assertEquals(newCat.getIdCat(), resultId); // Vérifier si l'ID retourné est celui attendu
    }
}