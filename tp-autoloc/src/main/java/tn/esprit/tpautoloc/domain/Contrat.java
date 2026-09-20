package tn.esprit.tpautoloc.domain;

import jakarta.persistence.*;

import java.math.*;
import java.time.LocalDate;

@Entity
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateSignature;

    private BigDecimal montantTotal;

    private boolean valide = false;

}
