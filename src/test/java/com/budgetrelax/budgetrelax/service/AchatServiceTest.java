package com.budgetrelax.budgetrelax.service;

import com.budgetrelax.budgetrelax.DTO.AddAchatDTO;

import com.budgetrelax.budgetrelax.model.Achat;
import com.budgetrelax.budgetrelax.model.Category;
import com.budgetrelax.budgetrelax.service.AchatService;
import com.budgetrelax.budgetrelax.repository.AchatRepo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class AchatServiceTest {

    Category cat = new Category();


    private AddAchatDTO addAchat = new AddAchatDTO("achat1", 20, cat);
    @Test
    public void shouldSaveCategoryWithSuccess(){

        AchatRepo mockCatRepo = mock(AchatRepo.class);
        Achat achat = new Achat(addAchat.getNom(), addAchat.getPrix(), addAchat.getIdCat());

        // Définir le comportement simulé du mock pour la méthode save()
        when(mockCatRepo.save(any(Achat.class))).thenReturn(achat);

        AchatService achatService = new AchatService(mockCatRepo);

        // Appel de la méthode à tester
        int resultId = achatService.addAchat(addAchat);

        // Vérification
        verify(mockCatRepo).save(any(Achat.class)); // Vérifier si la méthode save() a été appelée avec un objet de type Categorie
        assertEquals(achat.getIdAchat(), resultId); // Vérifier si l'ID retourné est celui attendu
    }
}