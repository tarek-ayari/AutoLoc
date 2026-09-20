package tn.esprit.tpautoloc.domain;

import jakarta.persistence.*;
import tn.esprit.tpautoloc.domain.enums.*;

import java.math.*;
import java.time.LocalDate;

@Entity
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String immatriculation;

    private String marque;

    private String modele;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;
}
