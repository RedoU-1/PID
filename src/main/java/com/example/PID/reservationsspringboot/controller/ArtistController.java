/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PID.reservationsspringboot.controller;

/**
 *
 * @author redou
 */
import com.example.PID.reservationsspringboot.model.Artist;
import com.example.PID.reservationsspringboot.service.ArtistService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller // Nous utiliserons @Controller plus tard avec Thymeleaf
public class ArtistController {

    @Autowired
    ArtistService service;

    @GetMapping("/artists") // L'opération 'index'
    public String index(Model model) {
        List<Artist> artists = service.getAllArtists();
        model.addAttribute("artists", artists); // Ajoute la liste des artistes au modèle
        model.addAttribute("title", "Liste des artistes"); // Ajoute un titre

        return "artist/index"; // Retourne le chemin vers le template Thymeleaf
    }
    
    @GetMapping("/artists/{id}") // Capture l'ID dans l'URL
    public String show(Model model, @PathVariable("id") long id) {
        // 1. Récupère l'artiste via le Service
        Artist artist = service.getArtist(id); 

        // 2. Ajoute l'artiste au modèle pour la vue
        model.addAttribute("artist", artist);
        model.addAttribute("title", "Fiche d'un artiste");

        // 3. Renvoie le nom du template (doit être créé)
        return "artist/show";
    }
}
