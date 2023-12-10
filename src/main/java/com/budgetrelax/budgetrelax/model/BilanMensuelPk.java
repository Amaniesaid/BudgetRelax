package com.budgetrelax.budgetrelax.model;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Date;

public class BilanMensuelPk implements Serializable {
    private Date mois;
    private User idUser;

}
