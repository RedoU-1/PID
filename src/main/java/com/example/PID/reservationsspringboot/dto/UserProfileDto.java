/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PID.reservationsspringboot.dto;

/**
 *
 * @author redou
 */
import com.example.PID.reservationsspringboot.validation.PasswordMatches;
import com.example.PID.reservationsspringboot.validation.StrongPassword;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@PasswordMatches(message = "Les mots de passe ne correspondent pas")
public class UserProfileDto {

    private Long id;

    @NotBlank(message = "Le prénom est obligatoire")
    private String firstname;

    @NotBlank(message = "Le nom est obligatoire")
    private String lastname;

    @NotBlank(message = "L'email est obligatoire")
    @Email(message = "L'email doit être valide")
    private String email;

    @NotBlank(message = "La langue est obligatoire")
    private String langue;

    private String login; // visible mais non modifiable
    private String role;  // visible mais non modifiable

    @StrongPassword
    private String password; // nouveau mot de passe (optionnel)

    private String confirmPassword; // confirmation du mot de passe
}
