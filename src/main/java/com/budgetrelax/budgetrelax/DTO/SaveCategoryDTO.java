package com.budgetrelax.budgetrelax.DTO;

import lombok.Data;

@Data
public class SaveCategoryDTO {
    private String name;
    private float budget;
    public SaveCategoryDTO(String name, float budget) {
        this.name = name;
        this.budget = budget;
        //this.bilanMensuel = bilanMensuel;
    }



    /*public SaveCategorieDTO(BilanMensuel bilanMensuel) {
        this.bilanMensuel = bilanMensuel;
    }

    private BilanMensuel bilanMensuel;*/

    @Override
    public String toString() {
        return "CategorieSaveDTO{" +
                "name='" + name + '\'' +
                ", budget='" + budget +
                '}';
    }


}
