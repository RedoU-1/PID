/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PID.reservationsspringboot.validation;

/**
 *
 * @author redou
 */
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StrongPasswordValidator implements ConstraintValidator<StrongPassword, String> {

    private static final String PASSWORD_PATTERN
            = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&._-])[A-Za-z\\d@$!%*?&._-]{8,}$";

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        // Si vide → considéré comme valide (changement ignoré)
        if (password == null || password.isBlank()) {
            return true;
        }
        return password.matches(PASSWORD_PATTERN);
    }
}
