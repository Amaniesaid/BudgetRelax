package com.budgetrelax.budgetrelax.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    private int idCat;

    public Category(String nom) {
        this.nom = nom;
    }

    public Category(){}
    @Column(nullable = false)
    private String nom;

    public Category(String nom, float budgetInitial) {
        this.nom = nom;
        this.budgetInitial = budgetInitial;
    }

    @Column(name="budget_initial")
    private float budgetInitial;

    private float depenses;

    private float restant;


    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "idUser", referencedColumnName = "idUser"),
        @JoinColumn(name = "mois", referencedColumnName = "mois")
    })
    private BilanMensuel bilanMensuel;
}
