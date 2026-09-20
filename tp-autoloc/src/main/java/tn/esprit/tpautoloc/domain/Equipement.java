package tn.esprit.tpautoloc.domain;
import jakarta.persistence.*;

@Entity
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libelle;
}