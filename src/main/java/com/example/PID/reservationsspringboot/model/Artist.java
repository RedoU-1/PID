/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PID.reservationsspringboot.model;

/**
 *
 * @author redou
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Data              // Remplace @ToString, @Getter, @Setter, etc. (Lombok) [cite: 468]
@NoArgsConstructor // Constructeur par défaut (nécessaire pour JPA) [cite: 469]
@Entity            // Marque la classe comme une entité JPA 
@Table(name = "artists") // Spécifie le nom de la table dans la base de données [cite: 464, 482]
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // La clé primaire auto-incrémentée [cite: 465, 485]

    @NotBlank(message = "The firstname must not be empty.")
    @Size(min = 2, max = 60, message = "The firstname must be between 2 and 60 characters long.")
    private String firstname;

    @NotBlank(message = "The lastname must not be empty.")
    @Size(min = 2, max = 60, message = "The firstname must be between 2 and 60 characters long.")
    private String lastname;

    

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }
}
