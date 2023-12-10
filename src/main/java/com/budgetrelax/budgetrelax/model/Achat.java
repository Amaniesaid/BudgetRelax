package com.budgetrelax.budgetrelax.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "achats")
public class Achat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAchat;

    @Column(nullable = false)
    private String nom;

    public Achat() {

    }

    public Achat(String nom, float prix, Category idCat) {
        this.nom = nom;
        this.prix = prix;
        this.idCat = idCat;
    }

    @Column(nullable = false)
    private float prix;

    private String frequence;

    @ManyToOne
    @JoinColumn(name = "idCat") //cela veut dire que la colonne idCat d'achat est relié by many to one a cat
    private Category idCat;


}
