package com.budgetrelax.budgetrelax.model;

import jakarta.persistence.*;

import java.util.Date;

import lombok.Data;

@Data
@Entity
@Table(name = "bilan_mensuel")
@IdClass(BilanMensuelPk.class)
public class BilanMensuel {

    @Id
    private Date mois;
    @ManyToOne
    @JoinColumn(name = "idUser")
    @Id
    private User idUser;

    private float revenu;

    @Column(name= "epargne_initiale")
    private float epargneInitiale;

    @Column(name= "epargne_ajoutée")
    private float epargneAjoutée;

    @Column(name= "epargne_actuelle")
    private float epargneActuelle;

    @Column(name= "taux_epargne")
    private float tauxEpargne;

    private float depenses;

    private float restant;

}
