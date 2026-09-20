package tn.esprit.tpautoloc.domain;

import jakarta.persistence.*;
import tn.esprit.tpautoloc.domain.enums.*;
import java.time.LocalDate;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;

}
