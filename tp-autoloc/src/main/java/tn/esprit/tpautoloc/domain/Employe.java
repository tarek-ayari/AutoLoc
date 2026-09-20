package tn.esprit.tpautoloc.domain;
import jakarta.persistence.*;
import tn.esprit.tpautoloc.domain.enums.*;

import java.time.LocalDate;

@Entity
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String prenom;

    @Enumerated(EnumType.STRING)
    private RoleEmploye role;
}
