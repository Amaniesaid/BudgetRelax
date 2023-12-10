package com.budgetrelax.budgetrelax.DTO;


import com.budgetrelax.budgetrelax.model.Category;
import lombok.Data;


@Data
public class AddAchatDTO {

    private String nom;
    private Category idCat;
    private float prix;
    public AddAchatDTO(String nom, float prix,  Category idCat) {
        this.nom = nom;
        this.prix = prix;
        this.idCat = idCat;
    }

    @Override
    public String toString() {
        return "AddAchatDTO{" +
                "name='" + nom + '\'' +
                ", prix=" + prix +'\'' +
                ", idcat= '" + idCat+
                '}';
    }


}
