/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PID.reservationsspringboot.model;

/**
 *
 * @author redou
 */
public enum UserRole {	
	  ADMIN("Administrateur"),
	  MEMBER("Membre"),
	  AFFILIATE("Affilié"),
	  PRESS("Critique de presse"),
	  PRODUCER("Producteur");

	  private String role;

	  UserRole(String role) {
	    this.role = role;
	  }

	  public String getValue() {
	    return role;
	  }
}

