/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PID.reservationsspringboot.model;

/**
 *
 * @author redou
 */
public enum Language {
    EN("Anglais"),
    FR("Français"),
    NL("Néerlandais");

    private String description;

    private Language(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
