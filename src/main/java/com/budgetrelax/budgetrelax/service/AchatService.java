package com.budgetrelax.budgetrelax.service;

import com.budgetrelax.budgetrelax.DTO.AddAchatDTO;
import com.budgetrelax.budgetrelax.model.Achat;
import com.budgetrelax.budgetrelax.repository.AchatRepo;
import org.springframework.stereotype.Service;

@Service
public class AchatService {
    private AchatRepo achatRepo;
    public AchatService(AchatRepo repo) {
        this.achatRepo = repo;
    }

    public int addAchat(AddAchatDTO addAchat){
        Achat newAchat = new Achat(addAchat.getNom(), addAchat.getPrix(), addAchat.getIdCat() );
        Achat achat = achatRepo.save(newAchat);
        return achat.getIdAchat();
    }


}
