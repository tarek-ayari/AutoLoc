package tn.esprit.tpautoloc.domain;

import jakarta.persistence.*;


@Entity
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String ville;

    private String adresse;

    private String telephone;

}
