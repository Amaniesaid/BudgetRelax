package com.budgetrelax.budgetrelax.controller;

import com.budgetrelax.budgetrelax.DTO.AddAchatDTO;
import com.budgetrelax.budgetrelax.DTO.SaveCategoryDTO;
import com.budgetrelax.budgetrelax.service.AchatService;
import com.budgetrelax.budgetrelax.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin //Without the attributes origin inside it means that I allow requests from any origin
@RequestMapping("api/category")
public class CategoryController {

    @Autowired
    private CategoryService categorieService;

    @Autowired
    private AchatService achatService;

    @PostMapping("/add")
    public int addCat(@RequestBody SaveCategoryDTO saveCat){
        int idCat = categorieService.addCat(saveCat);
        return idCat;
    }

    @GetMapping("/achat{idCat}")
    public int addAchat(@RequestBody AddAchatDTO addAchat){
        int idAchat = achatService.addAchat(addAchat);
        return idAchat;
    }

}
