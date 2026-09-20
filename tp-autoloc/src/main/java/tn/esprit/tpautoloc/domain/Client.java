package tn.esprit.tpautoloc.domain;
import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String prenom;

   private String email;

    private String telephone;

    private String numPermis;

    private LocalDate dateInscription;

    }
