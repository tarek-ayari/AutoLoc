package tn.esprit.tpautoloc.domain;

import jakarta.persistence.*;
import tn.esprit.tpautoloc.domain.enums.*;

import java.math.*;
import java.time.LocalDate;

@Entity
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal montant;

    private LocalDate datePaiement;

    @Enumerated(EnumType.STRING)
    private ModePaiement modePaiement;

}